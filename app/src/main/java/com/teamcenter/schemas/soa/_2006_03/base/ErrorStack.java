
package com.teamcenter.schemas.soa._2006_03.base;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The ErrorStack contains one or more ErrorValue.
 *             Where an operation may have more than one contributing reason for the
 *             errror. The ErrorStack may also have an optional UID or Client ID 
 *             associated with the error. See the service operation documentation for 
 *             specifics of if these optional fields are filled. 
 *              
 * 
 * <p>Java class for ErrorStack complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorStack">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorValues" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}ErrorValue" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="clientId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="clientIndex" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorStack", propOrder = {
    "errorValues"
})
public class ErrorStack {

    @XmlElement(required = true)
    protected List<ErrorValue> errorValues;
    @XmlAttribute(name = "uid")
    protected String uid;
    @XmlAttribute(name = "clientId")
    protected String clientId;
    @XmlAttribute(name = "clientIndex")
    protected BigInteger clientIndex;

    /**
     * Gets the value of the errorValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorValue }
     * 
     * 
     */
    public List<ErrorValue> getErrorValues() {
        if (errorValues == null) {
            errorValues = new ArrayList<ErrorValue>();
        }
        return this.errorValues;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the clientIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClientIndex() {
        return clientIndex;
    }

    /**
     * Sets the value of the clientIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClientIndex(BigInteger value) {
        this.clientIndex = value;
    }

}
