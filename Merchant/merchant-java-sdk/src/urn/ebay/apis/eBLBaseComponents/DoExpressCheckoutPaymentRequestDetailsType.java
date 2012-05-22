
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.util.ArrayList;
import java.util.List;

import urn.ebay.apis.CoreComponentTypes.BasicAmountType;


/**
 * How you want to obtain payment. 
 * Required
 * Authorization indicates that this payment is a basic authorization subject to settlement with PayPal Authorization and Capture.
 * Order indicates that this payment is is an order authorization subject to settlement with PayPal Authorization and Capture.
 * Sale indicates that this is a final sale for which you are requesting payment.
 * IMPORTANT: You cannot set PaymentAction to Sale on SetExpressCheckoutRequest and then change PaymentAction to Authorization on the final Express Checkout API, DoExpressCheckoutPaymentRequest.
 * Character length and limit: Up to 13 single-byte alphabetic characters
 */
public class DoExpressCheckoutPaymentRequestDetailsType {

	/**
	 * How you want to obtain payment. 
	 * Required
	 * Authorization indicates that this payment is a basic authorization subject to settlement with PayPal Authorization and Capture.
	 * Order indicates that this payment is is an order authorization subject to settlement with PayPal Authorization and Capture.
	 * Sale indicates that this is a final sale for which you are requesting payment.
	 * IMPORTANT: You cannot set PaymentAction to Sale on SetExpressCheckoutRequest and then change PaymentAction to Authorization on the final Express Checkout API, DoExpressCheckoutPaymentRequest.
	 * Character length and limit: Up to 13 single-byte alphabetic characters
	 */
	private PaymentActionCodeType PaymentAction;
	public PaymentActionCodeType getPaymentAction() {
		return PaymentAction;
	}
	public void setPaymentAction(PaymentActionCodeType value) {
		this.PaymentAction = value;
	}

	/**
	 * The timestamped token value that was returned by SetExpressCheckoutResponse and passed on GetExpressCheckoutDetailsRequest. 
	 * Required
	 * Character length and limitations: 20 single-byte characters	 */
	private String Token;
	public String getToken() {
		return Token;
	}
	public void setToken(String value) {
		this.Token = value;
	}

	/**
	 * Encrypted PayPal customer account identification number as returned by GetExpressCheckoutDetailsResponse. 
	 * Required
	 * Character length and limitations: 127 single-byte characters.
	 */
	private String PayerID;
	public String getPayerID() {
		return PayerID;
	}
	public void setPayerID(String value) {
		this.PayerID = value;
	}

	/**
	 * URL on Merchant site pertaining to this invoice. 
	 * Optional
	 */
	private String OrderURL;
	public String getOrderURL() {
		return OrderURL;
	}
	public void setOrderURL(String value) {
		this.OrderURL = value;
	}

	/**
	 * Information about the payment 
	 * Required
	 */
	private List<PaymentDetailsType> PaymentDetails = new ArrayList<PaymentDetailsType>();
	public List<PaymentDetailsType> getPaymentDetails() {
		return PaymentDetails;
	}
	public void setPaymentDetails(List<PaymentDetailsType> value) {
		this.PaymentDetails = value;
	}

	/**
	 * Flag to indicate if previously set promoCode shall be overriden. Value 1 indicates overriding.
	 */
	private String PromoOverrideFlag;
	public String getPromoOverrideFlag() {
		return PromoOverrideFlag;
	}
	public void setPromoOverrideFlag(String value) {
		this.PromoOverrideFlag = value;
	}

	/**
	 * Promotional financing code for item. Overrides any previous PromoCode setting.
	 */
	private String PromoCode;
	public String getPromoCode() {
		return PromoCode;
	}
	public void setPromoCode(String value) {
		this.PromoCode = value;
	}

	/**
	 * Contains data for enhanced data like Airline Itinerary Data.
	 */
	private EnhancedDataType EnhancedData;
	public EnhancedDataType getEnhancedData() {
		return EnhancedData;
	}
	public void setEnhancedData(EnhancedDataType value) {
		this.EnhancedData = value;
	}

	/**
	 * Soft Descriptor supported for Sale and Auth in DEC only. For Order this will be ignored.
	 */
	private String SoftDescriptor;
	public String getSoftDescriptor() {
		return SoftDescriptor;
	}
	public void setSoftDescriptor(String value) {
		this.SoftDescriptor = value;
	}

	/**
	 * Information about the user selected options.
	 */
	private UserSelectedOptionType UserSelectedOptions;
	public UserSelectedOptionType getUserSelectedOptions() {
		return UserSelectedOptions;
	}
	public void setUserSelectedOptions(UserSelectedOptionType value) {
		this.UserSelectedOptions = value;
	}

	/**
	 * Information about the Gift message.
	 */
	private String GiftMessage;
	public String getGiftMessage() {
		return GiftMessage;
	}
	public void setGiftMessage(String value) {
		this.GiftMessage = value;
	}

	/**
	 * Information about the Gift receipt enable.
	 */
	private String GiftReceiptEnable;
	public String getGiftReceiptEnable() {
		return GiftReceiptEnable;
	}
	public void setGiftReceiptEnable(String value) {
		this.GiftReceiptEnable = value;
	}

	/**
	 * Information about the Gift Wrap name.
	 */
	private String GiftWrapName;
	public String getGiftWrapName() {
		return GiftWrapName;
	}
	public void setGiftWrapName(String value) {
		this.GiftWrapName = value;
	}

	/**
	 * Information about the Gift Wrap amount.
	 */
	private BasicAmountType GiftWrapAmount;
	public BasicAmountType getGiftWrapAmount() {
		return GiftWrapAmount;
	}
	public void setGiftWrapAmount(BasicAmountType value) {
		this.GiftWrapAmount = value;
	}

	/**
	 * Information about the Buyer marketing email.
	 */
	private String BuyerMarketingEmail;
	public String getBuyerMarketingEmail() {
		return BuyerMarketingEmail;
	}
	public void setBuyerMarketingEmail(String value) {
		this.BuyerMarketingEmail = value;
	}

	/**
	 * Information about the survey question.
	 */
	private String SurveyQuestion;
	public String getSurveyQuestion() {
		return SurveyQuestion;
	}
	public void setSurveyQuestion(String value) {
		this.SurveyQuestion = value;
	}

	/**
	 * Information about the survey choice selected by the user.
	 */
	private List<String> SurveyChoiceSelected = new ArrayList<String>();
	public List<String> getSurveyChoiceSelected() {
		return SurveyChoiceSelected;
	}
	public void setSurveyChoiceSelected(List<String> value) {
		this.SurveyChoiceSelected = value;
	}

	/**
An identification code for use by third-party applications to identify transactions. 
	 * Optional
	 * Character length and limitations: 32 single-byte alphanumeric characters
	 */
	private String ButtonSource;
	public String getButtonSource() {
		return ButtonSource;
	}
	public void setButtonSource(String value) {
		this.ButtonSource = value;
	}

	/**
	 * Merchant specified flag which indicates whether to create billing agreement as part of DoEC or not.
	 * Optional
	 */
	private Boolean SkipBACreation;
	public Boolean getSkipBACreation() {
		return SkipBACreation;
	}
	public void setSkipBACreation(Boolean value) {
		this.SkipBACreation = value;
	}



	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( PaymentAction != null ) {
			sb.append("<ebl:PaymentAction>").append( PaymentAction.getValue());
			sb.append("</ebl:PaymentAction>");
		}
		if( Token != null ) {
			sb.append("<ebl:Token>").append(Token);
			sb.append("</ebl:Token>");
		}
		if( PayerID != null ) {
			sb.append("<ebl:PayerID>").append(PayerID);
			sb.append("</ebl:PayerID>");
		}
		if( OrderURL != null ) {
			sb.append("<ebl:OrderURL>").append(OrderURL);
			sb.append("</ebl:OrderURL>");
		}
		if( PaymentDetails != null ) {
			for(int i=0; i<PaymentDetails.size(); i++) {
				sb.append("<ebl:PaymentDetails>");
				sb.append(PaymentDetails.get(i).toXMLString());
				sb.append("</ebl:PaymentDetails>");
			}
		}
		if( PromoOverrideFlag != null ) {
			sb.append("<ebl:PromoOverrideFlag>").append(PromoOverrideFlag);
			sb.append("</ebl:PromoOverrideFlag>");
		}
		if( PromoCode != null ) {
			sb.append("<ebl:PromoCode>").append(PromoCode);
			sb.append("</ebl:PromoCode>");
		}
		if( EnhancedData != null ) {
			sb.append("<ebl:EnhancedData>");
			sb.append(EnhancedData.toXMLString());
			sb.append("</ebl:EnhancedData>");
		}
		if( SoftDescriptor != null ) {
			sb.append("<ebl:SoftDescriptor>").append(SoftDescriptor);
			sb.append("</ebl:SoftDescriptor>");
		}
		if( UserSelectedOptions != null ) {
			sb.append("<ebl:UserSelectedOptions>");
			sb.append(UserSelectedOptions.toXMLString());
			sb.append("</ebl:UserSelectedOptions>");
		}
		if( GiftMessage != null ) {
			sb.append("<ebl:GiftMessage>").append(GiftMessage);
			sb.append("</ebl:GiftMessage>");
		}
		if( GiftReceiptEnable != null ) {
			sb.append("<ebl:GiftReceiptEnable>").append(GiftReceiptEnable);
			sb.append("</ebl:GiftReceiptEnable>");
		}
		if( GiftWrapName != null ) {
			sb.append("<ebl:GiftWrapName>").append(GiftWrapName);
			sb.append("</ebl:GiftWrapName>");
		}
		if( GiftWrapAmount != null ) {
			sb.append("<ebl:GiftWrapAmount ");
			sb.append(GiftWrapAmount.toXMLString());
			sb.append("</ebl:GiftWrapAmount>");
		}
		if( BuyerMarketingEmail != null ) {
			sb.append("<ebl:BuyerMarketingEmail>").append(BuyerMarketingEmail);
			sb.append("</ebl:BuyerMarketingEmail>");
		}
		if( SurveyQuestion != null ) {
			sb.append("<ebl:SurveyQuestion>").append(SurveyQuestion);
			sb.append("</ebl:SurveyQuestion>");
		}
		if( SurveyChoiceSelected != null ) {
			for(int i=0; i<SurveyChoiceSelected.size(); i++) {
				sb.append("<ebl:SurveyChoiceSelected>").append(SurveyChoiceSelected.get(i));
				sb.append("</ebl:SurveyChoiceSelected>");
			}
		}
		if( ButtonSource != null ) {
			sb.append("<ebl:ButtonSource>").append(ButtonSource);
			sb.append("</ebl:ButtonSource>");
		}
		if( SkipBACreation != null ) {
			sb.append("<ebl:SkipBACreation>").append(SkipBACreation);
			sb.append("</ebl:SkipBACreation>");
		}
		return sb.toString();
	}

}
