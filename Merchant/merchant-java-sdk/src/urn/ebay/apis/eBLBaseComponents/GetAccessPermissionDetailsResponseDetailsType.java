
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

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
 * The first name of the User.
 * Character length and limitations: 127 single-byte alphanumeric characters
 */
public class GetAccessPermissionDetailsResponseDetailsType {

	/**
The first name of the User.
	 * Character length and limitations: 127 single-byte alphanumeric characters	 */
	private String FirstName;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String value) {
		this.FirstName = value;
	}

	/**
The Last name of the user.
	 * Character length and limitations: 127 single-byte alphanumeric characters
	 */
	private String LastName;
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String value) {
		this.LastName = value;
	}

	/**
	 * The email address of the user.
	 * Character length and limitations: 256 single-byte alphanumeric characters.
	 */
	private String Email;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String value) {
		this.Email = value;
	}

	/**
	 * contains information about API Services
	 */
	private List<String> AccessPermissionName = new ArrayList<String>();
	public List<String> getAccessPermissionName() {
		return AccessPermissionName;
	}
	public void setAccessPermissionName(List<String> value) {
		this.AccessPermissionName = value;
	}

	/**
	 * contains information about API Services
	 */
	private List<String> AccessPermissionStatus = new ArrayList<String>();
	public List<String> getAccessPermissionStatus() {
		return AccessPermissionStatus;
	}
	public void setAccessPermissionStatus(List<String> value) {
		this.AccessPermissionStatus = value;
	}

	/**
	 * Encrypted PayPal customer account identification number.
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


	public GetAccessPermissionDetailsResponseDetailsType() {
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
	 public GetAccessPermissionDetailsResponseDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("FirstName").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("FirstName").item(0))){ 
		 this.FirstName =(String)document.getElementsByTagName("FirstName").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("LastName").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("LastName").item(0))){ 
		 this.LastName =(String)document.getElementsByTagName("LastName").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("Email").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("Email").item(0))){ 
		 this.Email =(String)document.getElementsByTagName("Email").item(0).getTextContent();

}
	}
		 if(document.getElementsByTagName("AccessPermissionName").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("AccessPermissionName").item(0))){ 
		 nodeList = document.getElementsByTagName("AccessPermissionName");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 String value = nodeList.item(i).getTextContent(); 
			 this.AccessPermissionName.add(value);
		}

}
	}
		 if(document.getElementsByTagName("AccessPermissionStatus").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("AccessPermissionStatus").item(0))){ 
		 nodeList = document.getElementsByTagName("AccessPermissionStatus");
		 for(int i=0; i<nodeList.getLength(); i++) {
			 String value = nodeList.item(i).getTextContent(); 
			 this.AccessPermissionStatus.add(value);
		}

}
	}
		 if(document.getElementsByTagName("PayerID").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("PayerID").item(0))){ 
		 this.PayerID =(String)document.getElementsByTagName("PayerID").item(0).getTextContent();

}
	}
	}
}
