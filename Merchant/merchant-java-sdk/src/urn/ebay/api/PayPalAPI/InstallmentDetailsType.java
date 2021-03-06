
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import urn.ebay.apis.eBLBaseComponents.BillingPeriodType;


/**
 * Installment Period.
 * Optional
 */
public class InstallmentDetailsType {

	/**
	 * Installment Period.
	 * Optional
	 */
	private BillingPeriodType BillingPeriod;
	public BillingPeriodType getBillingPeriod() {
		return BillingPeriod;
	}
	public void setBillingPeriod(BillingPeriodType value) {
		this.BillingPeriod = value;
	}

	/**
	 * Installment Frequency.
	 * Optional     
	 */
	private Integer BillingFrequency;
	public Integer getBillingFrequency() {
		return BillingFrequency;
	}
	public void setBillingFrequency(Integer value) {
		this.BillingFrequency = value;
	}

	/**
	 * Installment Cycles.
	 * Optional     
	 */
	private Integer TotalBillingCycles;
	public Integer getTotalBillingCycles() {
		return TotalBillingCycles;
	}
	public void setTotalBillingCycles(Integer value) {
		this.TotalBillingCycles = value;
	}

	/**
	 * Installment Amount.
	 * Optional     
	 */
	private String Amount;
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String value) {
		this.Amount = value;
	}

	/**
	 * Installment Amount.
	 * Optional     
	 */
	private String ShippingAmount;
	public String getShippingAmount() {
		return ShippingAmount;
	}
	public void setShippingAmount(String value) {
		this.ShippingAmount = value;
	}

	/**
	 * Installment Amount.
	 * Optional     
	 */
	private String TaxAmount;
	public String getTaxAmount() {
		return TaxAmount;
	}
	public void setTaxAmount(String value) {
		this.TaxAmount = value;
	}


	public InstallmentDetailsType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
		if( BillingPeriod != null ) {
			sb.append("<urn:BillingPeriod>").append( BillingPeriod.getValue());
			sb.append("</urn:BillingPeriod>");
		}
		if( BillingFrequency != null ) {
			sb.append("<urn:BillingFrequency>").append(BillingFrequency);
			sb.append("</urn:BillingFrequency>");
		}
		if( TotalBillingCycles != null ) {
			sb.append("<urn:TotalBillingCycles>").append(TotalBillingCycles);
			sb.append("</urn:TotalBillingCycles>");
		}
		if( Amount != null ) {
			sb.append("<urn:Amount>").append(Amount);
			sb.append("</urn:Amount>");
		}
		if( ShippingAmount != null ) {
			sb.append("<urn:ShippingAmount>").append(ShippingAmount);
			sb.append("</urn:ShippingAmount>");
		}
		if( TaxAmount != null ) {
			sb.append("<urn:TaxAmount>").append(TaxAmount);
			sb.append("</urn:TaxAmount>");
		}
		return sb.toString();
	}

	 private  boolean isWhitespaceNode(Node n) {
		 if (n.getNodeType() == Node.TEXT_NODE) { 
				String val = n.getNodeValue();
				return val.trim().length() == 0; 
		 } else {
				return false;
		 } 
	 } 
	 private String convertToXML(Node n){ 
		 String name = n.getNodeName();
		 short type = n.getNodeType();
		 if (Node.CDATA_SECTION_NODE == type) {
			  return "<![CDATA[" + n.getNodeValue() + "]]&gt;";
		 } 
		 if (name.startsWith("#")) {
			  return "";
		} 
		 StringBuffer sb = new StringBuffer();
		 sb.append('<').append(name);
		 NamedNodeMap attrs = n.getAttributes();
		 if (attrs != null) { 
		  for (int i = 0; i < attrs.getLength(); i++) { 
			    Node attr = attrs.item(i);
			    sb.append(' ').append(attr.getNodeName()).append("=\"").append(attr.getNodeValue()).append("\"");
		  }
		 } 
		 String textContent = null; 
		 NodeList children = n.getChildNodes(); 
		 if (children.getLength() == 0) { 
		  if ((textContent = n.getTextContent()) != null && !"".equals(textContent)) {
		    sb.append(textContent).append("</").append(name).append('>'); 
		  } else { 
		    sb.append("/>"); 
		  } 
		 } else { 
		  sb.append('>'); 
		  boolean hasValidChildren = false;
		  for (int i = 0; i < children.getLength(); i++) { 
		    String childToString = convertToXML(children.item(i));
		    if (!"".equals(childToString)) {
		      sb.append(childToString); 
		      hasValidChildren = true; 
		    } 
		  } 
		  if (!hasValidChildren && ((textContent = n.getTextContent()) != null)) { 
		    sb.append(textContent); 
		 }
		  sb.append("</").append(name).append('>');
		 }
		 return sb.toString();
	 } 
	 public InstallmentDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("BillingPeriod").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("BillingPeriod").item(0))){ 
		 this.BillingPeriod = BillingPeriodType.fromValue(document.getElementsByTagName("BillingPeriod").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("BillingFrequency").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("BillingFrequency").item(0))){ 
		 this.BillingFrequency =Integer.valueOf(document.getElementsByTagName("BillingFrequency").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("TotalBillingCycles").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TotalBillingCycles").item(0))){ 
		 this.TotalBillingCycles =Integer.valueOf(document.getElementsByTagName("TotalBillingCycles").item(0).getTextContent());

}
	}
		 if(document.getElementsByTagName("Amount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Amount").item(0))){ 
		 this.Amount =(String)document.getElementsByTagName("Amount").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("ShippingAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("ShippingAmount").item(0))){ 
		 this.ShippingAmount =(String)document.getElementsByTagName("ShippingAmount").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("TaxAmount").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("TaxAmount").item(0))){ 
		 this.TaxAmount =(String)document.getElementsByTagName("TaxAmount").item(0).getTextContent();

}
	}
	}
}
