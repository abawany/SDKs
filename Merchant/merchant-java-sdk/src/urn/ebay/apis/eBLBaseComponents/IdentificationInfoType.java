
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;



/**
 * Mobile specific buyer identification.
 */
public class IdentificationInfoType {

	/**
Mobile specific buyer identification.	 */
	private MobileIDInfoType MobileIDInfo;
	public MobileIDInfoType getMobileIDInfo() {
		return MobileIDInfo;
	}
	public void setMobileIDInfo(MobileIDInfoType value) {
		this.MobileIDInfo = value;
	}

	/**
Contains login bypass information.	 */
	private RememberMeIDInfoType RememberMeIDInfo;
	public RememberMeIDInfoType getRememberMeIDInfo() {
		return RememberMeIDInfo;
	}
	public void setRememberMeIDInfo(RememberMeIDInfoType value) {
		this.RememberMeIDInfo = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( MobileIDInfo != null ) {
			sb.append("<ebl:MobileIDInfo>");
			sb.append(MobileIDInfo.toXMLString());
			sb.append("</ebl:MobileIDInfo>");
		}
		if( RememberMeIDInfo != null ) {
			sb.append("<ebl:RememberMeIDInfo>");
			sb.append(RememberMeIDInfo.toXMLString());
			sb.append("</ebl:RememberMeIDInfo>");
		}
		return sb.toString();
	}

}
