
package com.teamcenter.schemas.soa._2006_03.base;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                     This allows the client application to set the Object property Policy.
 *                    
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modifiers" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}Modifiers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="types" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}PolicyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="useRefCount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modifiers",
    "types"
})
@XmlRootElement(name = "ObjectPropertyPolicy")
public class ObjectPropertyPolicy {

    protected List<Modifiers> modifiers;
    protected List<PolicyType> types;
    @XmlAttribute(name = "useRefCount")
    protected Boolean useRefCount;

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
     * Gets the value of the types property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the types property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyType }
     * 
     * 
     */
    public List<PolicyType> getTypes() {
        if (types == null) {
            types = new ArrayList<PolicyType>();
        }
        return this.types;
    }

    /**
     * Gets the value of the useRefCount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseRefCount() {
        return useRefCount;
    }

    /**
     * Sets the value of the useRefCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseRefCount(Boolean value) {
        this.useRefCount = value;
    }

}
