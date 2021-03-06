
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;


/**
 * Unique PayPal customer account number, the value of which was returned by GetAuthDetails Response.
 * Required
 * Character length and limitations: 20 single-byte characters
 */
public class UpdateAccessPermissionsRequestType extends AbstractRequestType{

	/**
Unique PayPal customer account number, the value of which was returned by GetAuthDetails Response.
	 * Required
	 * Character length and limitations: 20 single-byte characters
	 *
	 * @Required
	 */
	private String PayerID;
	public String getPayerID() {
		return PayerID;
	}
	public void setPayerID(String value) {
		this.PayerID = value;
	}


	public UpdateAccessPermissionsRequestType(String PayerID) {
		this.PayerID = PayerID;
	}
	public UpdateAccessPermissionsRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( PayerID != null ) {
			sb.append("<urn:PayerID>").append(PayerID);
			sb.append("</urn:PayerID>");
		}
		return sb.toString();
	}

}
