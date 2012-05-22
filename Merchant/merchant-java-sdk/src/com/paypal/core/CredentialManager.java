package com.paypal.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.paypal.exception.InvalidCredentialException;
import com.paypal.exception.MissingCredentialException;

public class CredentialManager {
	private static CredentialManager instance = null;

	private Map<String, ICredential> credentialMap = new HashMap<String, ICredential>();
	private String defaultAcctName = null;

	private CredentialManager() throws MissingCredentialException {
		this.initCredential();
	}

	public static CredentialManager getInstance()
			throws MissingCredentialException {

		if (instance == null) {
			synchronized (CredentialManager.class) {
				instance = new CredentialManager();
			}
		}
		return instance;
	}

	/**
	 * loads credentials for multiple accounts from property file.
	 * 
	 * @throws MissingCredentialException
	 */
	private void initCredential() throws MissingCredentialException {
		ConfigManager conf = ConfigManager.getInstance();
		int suffix = 1;
		String prefix = Constants.ACCOUNT_PREFIX;
		Map<String, String> credMap = conf.getValuesByCategory(prefix);
		Set<String> acctSet = conf.getNumOfAcct();
		if (acctSet.size() == 0) {
			throw new MissingCredentialException(
					"No valid API accounts have been configured");
		}
		while (suffix <= acctSet.size()) {
			String userName = (String) credMap.get(prefix + suffix
					+ ".UserName");
			String password = (String) credMap.get(prefix + suffix
					+ ".Password");
			String appId = (String) credMap.get(prefix + suffix + ".AppId");
			if (credMap.get(prefix + suffix + ".Signature") != null) {
				String signature = (String) credMap.get(prefix + suffix
						+ ".Signature");
				credentialMap.put(userName, new SignatureCredential(userName,
						password, signature, appId));
			} else if (credMap.get(prefix + suffix + ".CertPath") != null) {
				String certPath = (String) credMap.get(prefix + suffix
						+ ".CertPath");
				String certKey = (String) credMap.get(prefix + suffix
						+ ".CertKey");
				credentialMap.put(userName, new CertificateCredential(userName,
						password, certPath, certKey, appId));
			}
			if (defaultAcctName == null) {
				defaultAcctName = (String) credMap.get(prefix + suffix
						+ ".UserName");
			}
			suffix++;
		}

	}

	/**
	 * Obtain credential object based on userId
	 * 
	 * @param userId
	 * @return ICredential object
	 * @throws InvalidCredentialException
	 */
	public ICredential getCredentialObject(String userId) 
			throws InvalidCredentialException, MissingCredentialException {
		ICredential credObj = null;
		if (userId == null) {
			LoggingManager.debug(CredentialManager.class, "Returning cred for " + defaultAcctName);
			credObj = (ICredential) credentialMap.get(defaultAcctName);
		}
		else if (credentialMap.containsKey(userId)) {
			LoggingManager.debug(CredentialManager.class, "Returning cred for " + userId);
			credObj = (ICredential) credentialMap.get(userId);
		}
		// get from the request (what a concept)
		else {
			LoggingManager.debug(CredentialManager.class, "trying to add new credential");
			ConfigManager conf = ConfigManager.getInstance();
			int suffix = 1;
			String prefix = Constants.ACCOUNT_PREFIX;
			Map<String, String> credMap = conf.getValuesByCategory(prefix);
			Set<String> acctSet = conf.getNumOfAcct();
			if (acctSet.size() == 0) {
				throw new MissingCredentialException(
						"No valid API accounts have been configured");
			}
			while (suffix <= acctSet.size()) {
				String userName = (String) credMap.get(prefix + suffix
						+ ".UserName");
				String password = (String) credMap.get(prefix + suffix
						+ ".Password");
				String appId = (String) credMap.get(prefix + suffix + ".AppId");
				if (credMap.get(prefix + suffix + ".Signature") != null) {
					String signature = (String) credMap.get(prefix + suffix
							+ ".Signature");
					credentialMap.put(userName, new SignatureCredential(userName,
							password, signature, appId));
				} else if (credMap.get(prefix + suffix + ".CertPath") != null) {
					String certPath = (String) credMap.get(prefix + suffix
							+ ".CertPath");
					String certKey = (String) credMap.get(prefix + suffix
							+ ".CertKey");
					credentialMap.put(userName, new CertificateCredential(userName,
							password, certPath, certKey, appId));
				}
				if (defaultAcctName == null) {
					defaultAcctName = (String) credMap.get(prefix + suffix
							+ ".UserName");
				}
				suffix++;
			}
			credObj = (ICredential) credentialMap.get(userId);
		}
		if (credObj == null) {
			throw new InvalidCredentialException("Invalid userId " + userId);
		}
		return credObj;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
