
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

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


/**
 * A free-form field for your own use, such as a tracking number or other value you want returned to you in IPN.
 * Optional
 * Character length and limitations: 256 single-byte alphanumeric characters
 */
public class DoMobileCheckoutPaymentResponseDetailsType {

	/**
A free-form field for your own use, such as a tracking number or other value you want returned to you in IPN.
	 * Optional
	 * Character length and limitations: 256 single-byte alphanumeric characters
	 */
	private String Custom;
	public String getCustom() {
		return Custom;
	}
	public void setCustom(String value) {
		this.Custom = value;
	}

	/**
Your own unique invoice or tracking number.
	 * Optional
	 * Character length and limitations: 127 single-byte alphanumeric characters
	 */
	private String InvoiceID;
	public String getInvoiceID() {
		return InvoiceID;
	}
	public void setInvoiceID(String value) {
		this.InvoiceID = value;
	}

	/**
Information about the payer	 */
	private PayerInfoType PayerInfo;
	public PayerInfoType getPayerInfo() {
		return PayerInfo;
	}
	public void setPayerInfo(PayerInfoType value) {
		this.PayerInfo = value;
	}

	/**
Information about the transaction	 */
	private PaymentInfoType PaymentInfo;
	public PaymentInfoType getPaymentInfo() {
		return PaymentInfo;
	}
	public void setPaymentInfo(PaymentInfoType value) {
		this.PaymentInfo = value;
	}


	public DoMobileCheckoutPaymentResponseDetailsType() {
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
	 public DoMobileCheckoutPaymentResponseDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("Custom").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Custom").item(0))){ 
		 this.Custom =(String)document.getElementsByTagName("Custom").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("InvoiceID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("InvoiceID").item(0))){ 
		 this.InvoiceID =(String)document.getElementsByTagName("InvoiceID").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("PayerInfo").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PayerInfo").item(0))){ 
		 nodeList = document.getElementsByTagName("PayerInfo");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.PayerInfo =  new PayerInfoType(xmlString);

}
	}
		 if(document.getElementsByTagName("PaymentInfo").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PaymentInfo").item(0))){ 
		 nodeList = document.getElementsByTagName("PaymentInfo");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.PaymentInfo =  new PaymentInfoType(xmlString);

}
	}
	}
}
