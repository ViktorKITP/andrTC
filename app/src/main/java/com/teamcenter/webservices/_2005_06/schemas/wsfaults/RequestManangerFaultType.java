
package com.teamcenter.webservices._2005_06.schemas.wsfaults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *       		The RequestManangerFault element is used to map any exception thrown 
 *       		in the Presentation Tier or Enterprise Tier during the processing
 *       		of a Web Service request
 *       
 * 			Elements:
 *       		RootException: The exception class that was orgininaly thrown
 *       					   i.e. "java.io.IOException"
 *  
 * 			Message:	  The localized error message that is suiteable for
 * 						  display to the user.
 *       		
 * 
 * <p>Java class for RequestManangerFaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestManangerFaultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RootException" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestManangerFaultType", propOrder = {
    "rootException",
    "message"
})
public class RequestManangerFaultType {

    @XmlElement(name = "RootException", required = true)
    protected String rootException;
    @XmlElement(name = "Message", required = true)
    protected String message;

    /**
     * Gets the value of the rootException property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootException() {
        return rootException;
    }

    /**
     * Sets the value of the rootException property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootException(String value) {
        this.rootException = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
