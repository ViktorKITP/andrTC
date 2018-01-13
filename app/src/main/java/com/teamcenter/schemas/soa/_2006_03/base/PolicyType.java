
package com.teamcenter.schemas.soa._2006_03.base;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modifiers" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}Modifiers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}PolicyProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyType", propOrder = {
    "modifiers",
    "properties"
})
public class PolicyType {

    protected List<Modifiers> modifiers;
    protected List<PolicyProperty> properties;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the modifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Modifiers }
     * 
     * 
     */
    public List<Modifiers> getModifiers() {
        if (modifiers == null) {
            modifiers = new ArrayList<Modifiers>();
        }
        return this.modifiers;
    }

    /**
     * Gets the value of the properties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the properties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyProperty }
     * 
     * 
     */
    public List<PolicyProperty> getProperties() {
        if (properties == null) {
            properties = new ArrayList<PolicyProperty>();
        }
        return this.properties;
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

}
