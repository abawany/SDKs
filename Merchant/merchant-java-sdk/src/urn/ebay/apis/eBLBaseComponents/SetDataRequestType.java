
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.util.ArrayList;
import java.util.List;


/**
 * Details about Billing Agreements requested to be created.
 */
public class SetDataRequestType {

	/**
	 * Details about Billing Agreements requested to be created.
	 */
	private List<BillingApprovalDetailsType> BillingApprovalDetails = new ArrayList<BillingApprovalDetailsType>();
	public List<BillingApprovalDetailsType> getBillingApprovalDetails() {
		return BillingApprovalDetails;
	}
	public void setBillingApprovalDetails(List<BillingApprovalDetailsType> value) {
		this.BillingApprovalDetails = value;
	}

	/**
	 * Only needed if Auto Authorization is requested. The authentication session token will be passed in here.
	 */
	private BuyerDetailType BuyerDetail;
	public BuyerDetailType getBuyerDetail() {
		return BuyerDetail;
	}
	public void setBuyerDetail(BuyerDetailType value) {
		this.BuyerDetail = value;
	}

	/**
	 * Requests for specific buyer information like Billing Address to be returned through GetExpressCheckoutDetails should be specified under this.
	 */
	private InfoSharingDirectivesType InfoSharingDirectives;
	public InfoSharingDirectivesType getInfoSharingDirectives() {
		return InfoSharingDirectives;
	}
	public void setInfoSharingDirectives(InfoSharingDirectivesType value) {
		this.InfoSharingDirectives = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( BillingApprovalDetails != null ) {
			for(int i=0; i<BillingApprovalDetails.size(); i++) {
				sb.append("<ebl:BillingApprovalDetails>");
				sb.append(BillingApprovalDetails.get(i).toXMLString());
				sb.append("</ebl:BillingApprovalDetails>");
			}
		}
		if( BuyerDetail != null ) {
			sb.append("<ebl:BuyerDetail>");
			sb.append(BuyerDetail.toXMLString());
			sb.append("</ebl:BuyerDetail>");
		}
		if( InfoSharingDirectives != null ) {
			sb.append("<ebl:InfoSharingDirectives>");
			sb.append(InfoSharingDirectives.toXMLString());
			sb.append("</ebl:InfoSharingDirectives>");
		}
		return sb.toString();
	}

}
