/**
 * PayPalAPIInterfaceServiceService wrapper class
 * Auto generated code
 */
package urn.ebay.api.PayPalAPI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;

import com.paypal.core.BaseService;
import com.paypal.exception.ClientActionRequiredException;
import com.paypal.exception.HttpErrorException;
import com.paypal.exception.InvalidCredentialException;
import com.paypal.exception.InvalidResponseDataException;
import com.paypal.exception.MissingCredentialException;
import com.paypal.exception.SSLConfigurationException;
import com.paypal.sdk.exceptions.OAuthException;


public class PayPalAPIInterfaceServiceService extends BaseService {
	
	private static Logger logger=Logger.getLogger(PayPalAPIInterfaceServiceService.class.toString());

	private static final String SERVICE_VERSION = "86.0";
	private static final String SERVICE_NAME = "PayPalAPIInterfaceService";

	public PayPalAPIInterfaceServiceService(File configFile) throws IOException, FileNotFoundException {
		super(SERVICE_NAME, SERVICE_VERSION);
		initConfig(configFile);
	}
	public PayPalAPIInterfaceServiceService(InputStream config) throws IOException, FileNotFoundException {
		super(SERVICE_NAME, SERVICE_VERSION);
		initConfig(config);
	}
	public PayPalAPIInterfaceServiceService(String configFilePath) throws IOException, FileNotFoundException {
		super(SERVICE_NAME, SERVICE_VERSION);
		initConfig(configFilePath);
		
	}

private void setStandardParams(AbstractRequestType request) {
	if (request.getVersion() == null) {
	request.setVersion(SERVICE_VERSION);
}
}
	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public RefundTransactionResponseType refundTransaction (RefundTransactionReq RefundTransactionReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(RefundTransactionReq.getRefundTransactionRequest());
		String response = call("RefundTransaction", RefundTransactionReq.toXMLString(), apiUsername);
		return new RefundTransactionResponseType(response);
	}

	@Deprecated
	public RefundTransactionResponseType refundTransaction (RefundTransactionReq RefundTransactionReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return refundTransaction(RefundTransactionReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public InitiateRecoupResponseType initiateRecoup (InitiateRecoupReq InitiateRecoupReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(InitiateRecoupReq.getInitiateRecoupRequest());
		String response = call("InitiateRecoup", InitiateRecoupReq.toXMLString(), apiUsername);
		return new InitiateRecoupResponseType(response);
	}

	@Deprecated
	public InitiateRecoupResponseType initiateRecoup (InitiateRecoupReq InitiateRecoupReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return initiateRecoup(InitiateRecoupReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public CompleteRecoupResponseType completeRecoup (CompleteRecoupReq CompleteRecoupReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(CompleteRecoupReq.getCompleteRecoupRequest());
		String response = call("CompleteRecoup", CompleteRecoupReq.toXMLString(), apiUsername);
		return new CompleteRecoupResponseType(response);
	}

	@Deprecated
	public CompleteRecoupResponseType completeRecoup (CompleteRecoupReq CompleteRecoupReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return completeRecoup(CompleteRecoupReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public CancelRecoupResponseType cancelRecoup (CancelRecoupReq CancelRecoupReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(CancelRecoupReq.getCancelRecoupRequest());
		String response = call("CancelRecoup", CancelRecoupReq.toXMLString(), apiUsername);
		return new CancelRecoupResponseType(response);
	}

	@Deprecated
	public CancelRecoupResponseType cancelRecoup (CancelRecoupReq CancelRecoupReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return cancelRecoup(CancelRecoupReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public GetTransactionDetailsResponseType getTransactionDetails (GetTransactionDetailsReq GetTransactionDetailsReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(GetTransactionDetailsReq.getGetTransactionDetailsRequest());
		String response = call("GetTransactionDetails", GetTransactionDetailsReq.toXMLString(), apiUsername);
		return new GetTransactionDetailsResponseType(response);
	}

	@Deprecated
	public GetTransactionDetailsResponseType getTransactionDetails (GetTransactionDetailsReq GetTransactionDetailsReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return getTransactionDetails(GetTransactionDetailsReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public BillUserResponseType billUser (BillUserReq BillUserReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(BillUserReq.getBillUserRequest());
		String response = call("BillUser", BillUserReq.toXMLString(), apiUsername);
		return new BillUserResponseType(response);
	}

	@Deprecated
	public BillUserResponseType billUser (BillUserReq BillUserReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return billUser(BillUserReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public TransactionSearchResponseType transactionSearch (TransactionSearchReq TransactionSearchReq,  String apiUsername) 
			throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, 
			ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		logger.entering("PayPalAPIInterfaceServiceService", "transactionSearch");
		setStandardParams(TransactionSearchReq.getTransactionSearchRequest());
		logger.log(Level.INFO, TransactionSearchReq.toString());
		String response = call("TransactionSearch", TransactionSearchReq.toXMLString(), apiUsername);
		return new TransactionSearchResponseType(response);
	}

	@Deprecated
	public TransactionSearchResponseType transactionSearch (TransactionSearchReq TransactionSearchReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return transactionSearch(TransactionSearchReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public MassPayResponseType massPay (MassPayReq MassPayReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(MassPayReq.getMassPayRequest());
		String response = call("MassPay", MassPayReq.toXMLString(), apiUsername);
		return new MassPayResponseType(response);
	}

	@Deprecated
	public MassPayResponseType massPay (MassPayReq MassPayReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return massPay(MassPayReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public BAUpdateResponseType billAgreementUpdate (BillAgreementUpdateReq BillAgreementUpdateReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(BillAgreementUpdateReq.getBAUpdateRequest());
		String response = call("BillAgreementUpdate", BillAgreementUpdateReq.toXMLString(), apiUsername);
		return new BAUpdateResponseType(response);
	}

	@Deprecated
	public BAUpdateResponseType billAgreementUpdate (BillAgreementUpdateReq BillAgreementUpdateReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return billAgreementUpdate(BillAgreementUpdateReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public AddressVerifyResponseType addressVerify (AddressVerifyReq AddressVerifyReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(AddressVerifyReq.getAddressVerifyRequest());
		String response = call("AddressVerify", AddressVerifyReq.toXMLString(), apiUsername);
		return new AddressVerifyResponseType(response);
	}

	@Deprecated
	public AddressVerifyResponseType addressVerify (AddressVerifyReq AddressVerifyReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return addressVerify(AddressVerifyReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public EnterBoardingResponseType enterBoarding (EnterBoardingReq EnterBoardingReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(EnterBoardingReq.getEnterBoardingRequest());
		String response = call("EnterBoarding", EnterBoardingReq.toXMLString(), apiUsername);
		return new EnterBoardingResponseType(response);
	}

	@Deprecated
	public EnterBoardingResponseType enterBoarding (EnterBoardingReq EnterBoardingReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return enterBoarding(EnterBoardingReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public GetBoardingDetailsResponseType getBoardingDetails (GetBoardingDetailsReq GetBoardingDetailsReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(GetBoardingDetailsReq.getGetBoardingDetailsRequest());
		String response = call("GetBoardingDetails", GetBoardingDetailsReq.toXMLString(), apiUsername);
		return new GetBoardingDetailsResponseType(response);
	}

	@Deprecated
	public GetBoardingDetailsResponseType getBoardingDetails (GetBoardingDetailsReq GetBoardingDetailsReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return getBoardingDetails(GetBoardingDetailsReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public CreateMobilePaymentResponseType createMobilePayment (CreateMobilePaymentReq CreateMobilePaymentReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(CreateMobilePaymentReq.getCreateMobilePaymentRequest());
		String response = call("CreateMobilePayment", CreateMobilePaymentReq.toXMLString(), apiUsername);
		return new CreateMobilePaymentResponseType(response);
	}

	@Deprecated
	public CreateMobilePaymentResponseType createMobilePayment (CreateMobilePaymentReq CreateMobilePaymentReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return createMobilePayment(CreateMobilePaymentReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public GetMobileStatusResponseType getMobileStatus (GetMobileStatusReq GetMobileStatusReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(GetMobileStatusReq.getGetMobileStatusRequest());
		String response = call("GetMobileStatus", GetMobileStatusReq.toXMLString(), apiUsername);
		return new GetMobileStatusResponseType(response);
	}

	@Deprecated
	public GetMobileStatusResponseType getMobileStatus (GetMobileStatusReq GetMobileStatusReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return getMobileStatus(GetMobileStatusReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public SetMobileCheckoutResponseType setMobileCheckout (SetMobileCheckoutReq SetMobileCheckoutReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(SetMobileCheckoutReq.getSetMobileCheckoutRequest());
		String response = call("SetMobileCheckout", SetMobileCheckoutReq.toXMLString(), apiUsername);
		return new SetMobileCheckoutResponseType(response);
	}

	@Deprecated
	public SetMobileCheckoutResponseType setMobileCheckout (SetMobileCheckoutReq SetMobileCheckoutReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return setMobileCheckout(SetMobileCheckoutReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public DoMobileCheckoutPaymentResponseType doMobileCheckoutPayment (DoMobileCheckoutPaymentReq DoMobileCheckoutPaymentReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(DoMobileCheckoutPaymentReq.getDoMobileCheckoutPaymentRequest());
		String response = call("DoMobileCheckoutPayment", DoMobileCheckoutPaymentReq.toXMLString(), apiUsername);
		return new DoMobileCheckoutPaymentResponseType(response);
	}

	@Deprecated
	public DoMobileCheckoutPaymentResponseType doMobileCheckoutPayment (DoMobileCheckoutPaymentReq DoMobileCheckoutPaymentReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return doMobileCheckoutPayment(DoMobileCheckoutPaymentReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public GetBalanceResponseType getBalance (GetBalanceReq GetBalanceReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(GetBalanceReq.getGetBalanceRequest());
		String response = call("GetBalance", GetBalanceReq.toXMLString(), apiUsername);
		return new GetBalanceResponseType(response);
	}

	@Deprecated
	public GetBalanceResponseType getBalance (GetBalanceReq GetBalanceReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return getBalance(GetBalanceReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public GetPalDetailsResponseType getPalDetails (GetPalDetailsReq GetPalDetailsReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(GetPalDetailsReq.getGetPalDetailsRequest());
		String response = call("GetPalDetails", GetPalDetailsReq.toXMLString(), apiUsername);
		return new GetPalDetailsResponseType(response);
	}

	@Deprecated
	public GetPalDetailsResponseType getPalDetails (GetPalDetailsReq GetPalDetailsReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return getPalDetails(GetPalDetailsReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public DoExpressCheckoutPaymentResponseType doExpressCheckoutPayment (DoExpressCheckoutPaymentReq DoExpressCheckoutPaymentReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(DoExpressCheckoutPaymentReq.getDoExpressCheckoutPaymentRequest());
		String response = call("DoExpressCheckoutPayment", DoExpressCheckoutPaymentReq.toXMLString(), apiUsername);
		return new DoExpressCheckoutPaymentResponseType(response);
	}

	@Deprecated
	public DoExpressCheckoutPaymentResponseType doExpressCheckoutPayment (DoExpressCheckoutPaymentReq DoExpressCheckoutPaymentReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return doExpressCheckoutPayment(DoExpressCheckoutPaymentReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public DoUATPExpressCheckoutPaymentResponseType doUATPExpressCheckoutPayment (DoUATPExpressCheckoutPaymentReq DoUATPExpressCheckoutPaymentReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(DoUATPExpressCheckoutPaymentReq.getDoUATPExpressCheckoutPaymentRequest());
		String response = call("DoUATPExpressCheckoutPayment", DoUATPExpressCheckoutPaymentReq.toXMLString(), apiUsername);
		return new DoUATPExpressCheckoutPaymentResponseType(response);
	}

	@Deprecated
	public DoUATPExpressCheckoutPaymentResponseType doUATPExpressCheckoutPayment (DoUATPExpressCheckoutPaymentReq DoUATPExpressCheckoutPaymentReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return doUATPExpressCheckoutPayment(DoUATPExpressCheckoutPaymentReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public SetAuthFlowParamResponseType setAuthFlowParam (SetAuthFlowParamReq SetAuthFlowParamReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(SetAuthFlowParamReq.getSetAuthFlowParamRequest());
		String response = call("SetAuthFlowParam", SetAuthFlowParamReq.toXMLString(), apiUsername);
		return new SetAuthFlowParamResponseType(response);
	}

	@Deprecated
	public SetAuthFlowParamResponseType setAuthFlowParam (SetAuthFlowParamReq SetAuthFlowParamReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return setAuthFlowParam(SetAuthFlowParamReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public GetAuthDetailsResponseType getAuthDetails (GetAuthDetailsReq GetAuthDetailsReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(GetAuthDetailsReq.getGetAuthDetailsRequest());
		String response = call("GetAuthDetails", GetAuthDetailsReq.toXMLString(), apiUsername);
		return new GetAuthDetailsResponseType(response);
	}

	@Deprecated
	public GetAuthDetailsResponseType getAuthDetails (GetAuthDetailsReq GetAuthDetailsReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return getAuthDetails(GetAuthDetailsReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public SetAccessPermissionsResponseType setAccessPermissions (SetAccessPermissionsReq SetAccessPermissionsReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(SetAccessPermissionsReq.getSetAccessPermissionsRequest());
		String response = call("SetAccessPermissions", SetAccessPermissionsReq.toXMLString(), apiUsername);
		return new SetAccessPermissionsResponseType(response);
	}

	@Deprecated
	public SetAccessPermissionsResponseType setAccessPermissions (SetAccessPermissionsReq SetAccessPermissionsReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return setAccessPermissions(SetAccessPermissionsReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public UpdateAccessPermissionsResponseType updateAccessPermissions (UpdateAccessPermissionsReq UpdateAccessPermissionsReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(UpdateAccessPermissionsReq.getUpdateAccessPermissionsRequest());
		String response = call("UpdateAccessPermissions", UpdateAccessPermissionsReq.toXMLString(), apiUsername);
		return new UpdateAccessPermissionsResponseType(response);
	}

	@Deprecated
	public UpdateAccessPermissionsResponseType updateAccessPermissions (UpdateAccessPermissionsReq UpdateAccessPermissionsReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return updateAccessPermissions(UpdateAccessPermissionsReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public GetAccessPermissionDetailsResponseType getAccessPermissionDetails (GetAccessPermissionDetailsReq GetAccessPermissionDetailsReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(GetAccessPermissionDetailsReq.getGetAccessPermissionDetailsRequest());
		String response = call("GetAccessPermissionDetails", GetAccessPermissionDetailsReq.toXMLString(), apiUsername);
		return new GetAccessPermissionDetailsResponseType(response);
	}

	@Deprecated
	public GetAccessPermissionDetailsResponseType getAccessPermissionDetails (GetAccessPermissionDetailsReq GetAccessPermissionDetailsReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return getAccessPermissionDetails(GetAccessPermissionDetailsReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public GetIncentiveEvaluationResponseType getIncentiveEvaluation (GetIncentiveEvaluationReq GetIncentiveEvaluationReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(GetIncentiveEvaluationReq.getGetIncentiveEvaluationRequest());
		String response = call("GetIncentiveEvaluation", GetIncentiveEvaluationReq.toXMLString(), apiUsername);
		return new GetIncentiveEvaluationResponseType(response);
	}

	@Deprecated
	public GetIncentiveEvaluationResponseType getIncentiveEvaluation (GetIncentiveEvaluationReq GetIncentiveEvaluationReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return getIncentiveEvaluation(GetIncentiveEvaluationReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public SetExpressCheckoutResponseType setExpressCheckout (SetExpressCheckoutReq SetExpressCheckoutReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(SetExpressCheckoutReq.getSetExpressCheckoutRequest());
		String response = call("SetExpressCheckout", SetExpressCheckoutReq.toXMLString(), apiUsername);
		return new SetExpressCheckoutResponseType(response);
	}

	@Deprecated
	public SetExpressCheckoutResponseType setExpressCheckout (SetExpressCheckoutReq SetExpressCheckoutReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return setExpressCheckout(SetExpressCheckoutReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public ExecuteCheckoutOperationsResponseType executeCheckoutOperations (ExecuteCheckoutOperationsReq ExecuteCheckoutOperationsReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(ExecuteCheckoutOperationsReq.getExecuteCheckoutOperationsRequest());
		String response = call("ExecuteCheckoutOperations", ExecuteCheckoutOperationsReq.toXMLString(), apiUsername);
		return new ExecuteCheckoutOperationsResponseType(response);
	}

	@Deprecated
	public ExecuteCheckoutOperationsResponseType executeCheckoutOperations (ExecuteCheckoutOperationsReq ExecuteCheckoutOperationsReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return executeCheckoutOperations(ExecuteCheckoutOperationsReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public GetExpressCheckoutDetailsResponseType getExpressCheckoutDetails (GetExpressCheckoutDetailsReq GetExpressCheckoutDetailsReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(GetExpressCheckoutDetailsReq.getGetExpressCheckoutDetailsRequest());
		String response = call("GetExpressCheckoutDetails", GetExpressCheckoutDetailsReq.toXMLString(), apiUsername);
		return new GetExpressCheckoutDetailsResponseType(response);
	}

	@Deprecated
	public GetExpressCheckoutDetailsResponseType getExpressCheckoutDetails (GetExpressCheckoutDetailsReq GetExpressCheckoutDetailsReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return getExpressCheckoutDetails(GetExpressCheckoutDetailsReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public DoDirectPaymentResponseType doDirectPayment (DoDirectPaymentReq DoDirectPaymentReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(DoDirectPaymentReq.getDoDirectPaymentRequest());
		String response = call("DoDirectPayment", DoDirectPaymentReq.toXMLString(), apiUsername);
		return new DoDirectPaymentResponseType(response);
	}

	@Deprecated
	public DoDirectPaymentResponseType doDirectPayment (DoDirectPaymentReq DoDirectPaymentReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return doDirectPayment(DoDirectPaymentReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public ManagePendingTransactionStatusResponseType managePendingTransactionStatus (ManagePendingTransactionStatusReq ManagePendingTransactionStatusReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(ManagePendingTransactionStatusReq.getManagePendingTransactionStatusRequest());
		String response = call("ManagePendingTransactionStatus", ManagePendingTransactionStatusReq.toXMLString(), apiUsername);
		return new ManagePendingTransactionStatusResponseType(response);
	}

	@Deprecated
	public ManagePendingTransactionStatusResponseType managePendingTransactionStatus (ManagePendingTransactionStatusReq ManagePendingTransactionStatusReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return managePendingTransactionStatus(ManagePendingTransactionStatusReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public DoCancelResponseType doCancel (DoCancelReq DoCancelReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(DoCancelReq.getDoCancelRequest());
		String response = call("DoCancel", DoCancelReq.toXMLString(), apiUsername);
		return new DoCancelResponseType(response);
	}
	
	@Deprecated
	public DoCancelResponseType doCancel (DoCancelReq DoCancelReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return doCancel(DoCancelReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public DoCaptureResponseType doCapture (DoCaptureReq DoCaptureReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(DoCaptureReq.getDoCaptureRequest());
		String response = call("DoCapture", DoCaptureReq.toXMLString(), apiUsername);
		return new DoCaptureResponseType(response);
	}

	@Deprecated
	public DoCaptureResponseType doCapture (DoCaptureReq DoCaptureReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return doCapture(DoCaptureReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public DoReauthorizationResponseType doReauthorization (DoReauthorizationReq DoReauthorizationReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(DoReauthorizationReq.getDoReauthorizationRequest());
		String response = call("DoReauthorization", DoReauthorizationReq.toXMLString(), apiUsername);
		return new DoReauthorizationResponseType(response);
	}

	@Deprecated
	public DoReauthorizationResponseType doReauthorization (DoReauthorizationReq DoReauthorizationReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return doReauthorization(DoReauthorizationReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public DoVoidResponseType doVoid (DoVoidReq DoVoidReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(DoVoidReq.getDoVoidRequest());
		String response = call("DoVoid", DoVoidReq.toXMLString(), apiUsername);
		return new DoVoidResponseType(response);
	}

	@Deprecated
	public DoVoidResponseType doVoid (DoVoidReq DoVoidReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return doVoid(DoVoidReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public DoAuthorizationResponseType doAuthorization (DoAuthorizationReq DoAuthorizationReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(DoAuthorizationReq.getDoAuthorizationRequest());
		String response = call("DoAuthorization", DoAuthorizationReq.toXMLString(), apiUsername);
		return new DoAuthorizationResponseType(response);
	}

	@Deprecated
	public DoAuthorizationResponseType doAuthorization (DoAuthorizationReq DoAuthorizationReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return doAuthorization(DoAuthorizationReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public SetCustomerBillingAgreementResponseType setCustomerBillingAgreement (SetCustomerBillingAgreementReq SetCustomerBillingAgreementReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(SetCustomerBillingAgreementReq.getSetCustomerBillingAgreementRequest());
		String response = call("SetCustomerBillingAgreement", SetCustomerBillingAgreementReq.toXMLString(), apiUsername);
		return new SetCustomerBillingAgreementResponseType(response);
	}

	@Deprecated
	public SetCustomerBillingAgreementResponseType setCustomerBillingAgreement (SetCustomerBillingAgreementReq SetCustomerBillingAgreementReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return setCustomerBillingAgreement(SetCustomerBillingAgreementReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public GetBillingAgreementCustomerDetailsResponseType getBillingAgreementCustomerDetails (GetBillingAgreementCustomerDetailsReq GetBillingAgreementCustomerDetailsReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(GetBillingAgreementCustomerDetailsReq.getGetBillingAgreementCustomerDetailsRequest());
		String response = call("GetBillingAgreementCustomerDetails", GetBillingAgreementCustomerDetailsReq.toXMLString(), apiUsername);
		return new GetBillingAgreementCustomerDetailsResponseType(response);
	}

	@Deprecated
	public GetBillingAgreementCustomerDetailsResponseType getBillingAgreementCustomerDetails (GetBillingAgreementCustomerDetailsReq GetBillingAgreementCustomerDetailsReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return getBillingAgreementCustomerDetails(GetBillingAgreementCustomerDetailsReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public CreateBillingAgreementResponseType createBillingAgreement (CreateBillingAgreementReq CreateBillingAgreementReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(CreateBillingAgreementReq.getCreateBillingAgreementRequest());
		String response = call("CreateBillingAgreement", CreateBillingAgreementReq.toXMLString(), apiUsername);
		return new CreateBillingAgreementResponseType(response);
	}

	@Deprecated
	public CreateBillingAgreementResponseType createBillingAgreement (CreateBillingAgreementReq CreateBillingAgreementReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return createBillingAgreement(CreateBillingAgreementReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public DoReferenceTransactionResponseType doReferenceTransaction (DoReferenceTransactionReq DoReferenceTransactionReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(DoReferenceTransactionReq.getDoReferenceTransactionRequest());
		String response = call("DoReferenceTransaction", DoReferenceTransactionReq.toXMLString(), apiUsername);
		return new DoReferenceTransactionResponseType(response);
	}

	@Deprecated
	public DoReferenceTransactionResponseType doReferenceTransaction (DoReferenceTransactionReq DoReferenceTransactionReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return doReferenceTransaction(DoReferenceTransactionReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public DoNonReferencedCreditResponseType doNonReferencedCredit (DoNonReferencedCreditReq DoNonReferencedCreditReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(DoNonReferencedCreditReq.getDoNonReferencedCreditRequest());
		String response = call("DoNonReferencedCredit", DoNonReferencedCreditReq.toXMLString(), apiUsername);
		return new DoNonReferencedCreditResponseType(response);
	}

	@Deprecated
	public DoNonReferencedCreditResponseType doNonReferencedCredit (DoNonReferencedCreditReq DoNonReferencedCreditReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return doNonReferencedCredit(DoNonReferencedCreditReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public DoUATPAuthorizationResponseType doUATPAuthorization (DoUATPAuthorizationReq DoUATPAuthorizationReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(DoUATPAuthorizationReq.getDoUATPAuthorizationRequest());
		String response = call("DoUATPAuthorization", DoUATPAuthorizationReq.toXMLString(), apiUsername);
		return new DoUATPAuthorizationResponseType(response);
	}

	@Deprecated
	public DoUATPAuthorizationResponseType doUATPAuthorization (DoUATPAuthorizationReq DoUATPAuthorizationReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return doUATPAuthorization(DoUATPAuthorizationReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public CreateRecurringPaymentsProfileResponseType createRecurringPaymentsProfile (CreateRecurringPaymentsProfileReq CreateRecurringPaymentsProfileReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(CreateRecurringPaymentsProfileReq.getCreateRecurringPaymentsProfileRequest());
		String response = call("CreateRecurringPaymentsProfile", CreateRecurringPaymentsProfileReq.toXMLString(), apiUsername);
		return new CreateRecurringPaymentsProfileResponseType(response);
	}

	@Deprecated
	public CreateRecurringPaymentsProfileResponseType createRecurringPaymentsProfile (CreateRecurringPaymentsProfileReq CreateRecurringPaymentsProfileReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return createRecurringPaymentsProfile(CreateRecurringPaymentsProfileReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public GetRecurringPaymentsProfileDetailsResponseType getRecurringPaymentsProfileDetails (GetRecurringPaymentsProfileDetailsReq GetRecurringPaymentsProfileDetailsReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(GetRecurringPaymentsProfileDetailsReq.getGetRecurringPaymentsProfileDetailsRequest());
		String response = call("GetRecurringPaymentsProfileDetails", GetRecurringPaymentsProfileDetailsReq.toXMLString(), apiUsername);
		return new GetRecurringPaymentsProfileDetailsResponseType(response);
	}

	@Deprecated
	public GetRecurringPaymentsProfileDetailsResponseType getRecurringPaymentsProfileDetails (GetRecurringPaymentsProfileDetailsReq GetRecurringPaymentsProfileDetailsReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return getRecurringPaymentsProfileDetails(GetRecurringPaymentsProfileDetailsReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public ManageRecurringPaymentsProfileStatusResponseType manageRecurringPaymentsProfileStatus (ManageRecurringPaymentsProfileStatusReq ManageRecurringPaymentsProfileStatusReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(ManageRecurringPaymentsProfileStatusReq.getManageRecurringPaymentsProfileStatusRequest());
		String response = call("ManageRecurringPaymentsProfileStatus", ManageRecurringPaymentsProfileStatusReq.toXMLString(), apiUsername);
		return new ManageRecurringPaymentsProfileStatusResponseType(response);
	}

	@Deprecated
	public ManageRecurringPaymentsProfileStatusResponseType manageRecurringPaymentsProfileStatus (ManageRecurringPaymentsProfileStatusReq ManageRecurringPaymentsProfileStatusReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return manageRecurringPaymentsProfileStatus(ManageRecurringPaymentsProfileStatusReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public BillOutstandingAmountResponseType billOutstandingAmount (BillOutstandingAmountReq BillOutstandingAmountReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(BillOutstandingAmountReq.getBillOutstandingAmountRequest());
		String response = call("BillOutstandingAmount", BillOutstandingAmountReq.toXMLString(), apiUsername);
		return new BillOutstandingAmountResponseType(response);
	}

	@Deprecated
	public BillOutstandingAmountResponseType billOutstandingAmount (BillOutstandingAmountReq BillOutstandingAmountReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return billOutstandingAmount(BillOutstandingAmountReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public UpdateRecurringPaymentsProfileResponseType updateRecurringPaymentsProfile (UpdateRecurringPaymentsProfileReq UpdateRecurringPaymentsProfileReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(UpdateRecurringPaymentsProfileReq.getUpdateRecurringPaymentsProfileRequest());
		String response = call("UpdateRecurringPaymentsProfile", UpdateRecurringPaymentsProfileReq.toXMLString(), apiUsername);
		return new UpdateRecurringPaymentsProfileResponseType(response);
	}

	@Deprecated
	public UpdateRecurringPaymentsProfileResponseType updateRecurringPaymentsProfile (UpdateRecurringPaymentsProfileReq UpdateRecurringPaymentsProfileReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return updateRecurringPaymentsProfile(UpdateRecurringPaymentsProfileReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public ReverseTransactionResponseType reverseTransaction (ReverseTransactionReq ReverseTransactionReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(ReverseTransactionReq.getReverseTransactionRequest());
		String response = call("ReverseTransaction", ReverseTransactionReq.toXMLString(), apiUsername);
		return new ReverseTransactionResponseType(response);
	}

	@Deprecated
	public ReverseTransactionResponseType reverseTransaction (ReverseTransactionReq ReverseTransactionReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return reverseTransaction(ReverseTransactionReq, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public ExternalRememberMeOptOutResponseType externalRememberMeOptOut (ExternalRememberMeOptOutReq ExternalRememberMeOptOutReq,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		setStandardParams(ExternalRememberMeOptOutReq.getExternalRememberMeOptOutRequest());
		String response = call("ExternalRememberMeOptOut", ExternalRememberMeOptOutReq.toXMLString(), apiUsername);
		return new ExternalRememberMeOptOutResponseType(response);
	}

	@Deprecated
	public ExternalRememberMeOptOutResponseType externalRememberMeOptOut (ExternalRememberMeOptOutReq ExternalRememberMeOptOutReq) throws SSLConfigurationException, InvalidCredentialException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException, ParserConfigurationException, SAXException {
		return externalRememberMeOptOut(ExternalRememberMeOptOutReq, null);
	}

}
