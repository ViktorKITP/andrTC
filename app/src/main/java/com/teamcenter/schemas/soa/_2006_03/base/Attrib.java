
package com.teamcenter.schemas.soa._2006_03.base;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Attrib complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attrib">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="uid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="uiName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxLength" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="refClassUid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="descriptors" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attrib")
public class Attrib {

    @XmlAttribute(name = "uid", required = true)
    protected String uid;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "type", required = true)
    protected BigInteger type;
    @XmlAttribute(name = "uiName")
    protected String uiName;
    @XmlAttribute(name = "maxLength")
    protected BigInteger maxLength;
    @XmlAttribute(name = "refClassUid")
    protected String refClassUid;
    @XmlAttribute(name = "descriptors", required = true)
    protected BigInteger descriptors;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setType(BigInteger value) {
        this.type = value;
    }

    /**
     * Gets the value of the uiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUiName() {
        return uiName;
    }

    /**
     * Sets the value of the uiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUiName(String value) {
        this.uiName = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxLength(BigInteger value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the refClassUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefClassUid() {
        return refClassUid;
    }

    /**
     * Sets the value of the refClassUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefClassUid(String value) {
        this.refClassUid = value;
    }

    /**
     * Gets the value of the descriptors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDescriptors() {
        return descriptors;
    }

    /**
     * Sets the value of the descriptors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDescriptors(BigInteger value) {
        this.descriptors = value;
    }

}
