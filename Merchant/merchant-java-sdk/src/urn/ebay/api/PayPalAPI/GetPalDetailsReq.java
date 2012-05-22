
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;



/**
 */
public class GetPalDetailsReq {

	/**
	 */
	private GetPalDetailsRequestType GetPalDetailsRequest;
	public GetPalDetailsRequestType getGetPalDetailsRequest() {
		return GetPalDetailsRequest;
	}
	public void setGetPalDetailsRequest(GetPalDetailsRequestType value) {
		this.GetPalDetailsRequest = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append("<urn:GetPalDetailsReq>");
		if( GetPalDetailsRequest != null ) {
			sb.append("<urn:GetPalDetailsRequest>");
			sb.append(GetPalDetailsRequest.toXMLString());
			sb.append("</urn:GetPalDetailsRequest>");
		}
sb.append("</urn:GetPalDetailsReq>");
		return sb.toString();
	}

}
