
package com.teamcenter.schemas.soa._2006_03.base;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propDependants" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}PropDependant" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uiname" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="typeUid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lovUid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lovTypeUid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ptype" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="attachedSpecifier" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxLength" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="displayable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="anArray" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="modifiable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="maxArraySize" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropDescriptor", propOrder = {
    "propDependants"
})
public class PropDescriptor {

    protected List<PropDependant> propDependants;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "uiname", required = true)
    protected String uiname;
    @XmlAttribute(name = "typeUid", required = true)
    protected String typeUid;
    @XmlAttribute(name = "lovUid")
    protected String lovUid;
    @XmlAttribute(name = "lovTypeUid")
    protected String lovTypeUid;
    @XmlAttribute(name = "type", required = true)
    protected BigInteger type;
    @XmlAttribute(name = "ptype", required = true)
    protected BigInteger ptype;
    @XmlAttribute(name = "attachedSpecifier")
    protected BigInteger attachedSpecifier;
    @XmlAttribute(name = "maxLength")
    protected BigInteger maxLength;
    @XmlAttribute(name = "displayable", required = true)
    protected boolean displayable;
    @XmlAttribute(name = "anArray", required = true)
    protected boolean anArray;
    @XmlAttribute(name = "required")
    protected Boolean required;
    @XmlAttribute(name = "enabled")
    protected Boolean enabled;
    @XmlAttribute(name = "modifiable", required = true)
    protected boolean modifiable;
    @XmlAttribute(name = "maxArraySize")
    protected BigInteger maxArraySize;

    /**
     * Gets the value of the propDependants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propDependants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropDependants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropDependant }
     * 
     * 
     */
    public List<PropDependant> getPropDependants() {
        if (propDependants == null) {
            propDependants = new ArrayList<PropDependant>();
        }
        return this.propDependants;
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
     * Gets the value of the uiname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUiname() {
        return uiname;
    }

    /**
     * Sets the value of the uiname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUiname(String value) {
        this.uiname = value;
    }

    /**
     * Gets the value of the typeUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeUid() {
        return typeUid;
    }

    /**
     * Sets the value of the typeUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeUid(String value) {
        this.typeUid = value;
    }

    /**
     * Gets the value of the lovUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLovUid() {
        return lovUid;
    }

    /**
     * Sets the value of the lovUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLovUid(String value) {
        this.lovUid = value;
    }

    /**
     * Gets the value of the lovTypeUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLovTypeUid() {
        return lovTypeUid;
    }

    /**
     * Sets the value of the lovTypeUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLovTypeUid(String value) {
        this.lovTypeUid = value;
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
     * Gets the value of the ptype property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPtype() {
        return ptype;
    }

    /**
     * Sets the value of the ptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPtype(BigInteger value) {
        this.ptype = value;
    }

    /**
     * Gets the value of the attachedSpecifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAttachedSpecifier() {
        return attachedSpecifier;
    }

    /**
     * Sets the value of the attachedSpecifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAttachedSpecifier(BigInteger value) {
        this.attachedSpecifier = value;
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
     * Gets the value of the displayable property.
     * 
     */
    public boolean isDisplayable() {
        return displayable;
    }

    /**
     * Sets the value of the displayable property.
     * 
     */
    public void setDisplayable(boolean value) {
        this.displayable = value;
    }

    /**
     * Gets the value of the anArray property.
     * 
     */
    public boolean isAnArray() {
        return anArray;
    }

    /**
     * Sets the value of the anArray property.
     * 
     */
    public void setAnArray(boolean value) {
        this.anArray = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the modifiable property.
     * 
     */
    public boolean isModifiable() {
        return modifiable;
    }

    /**
     * Sets the value of the modifiable property.
     * 
     */
    public void setModifiable(boolean value) {
        this.modifiable = value;
    }

    /**
     * Gets the value of the maxArraySize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxArraySize() {
        return maxArraySize;
    }

    /**
     * Sets the value of the maxArraySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxArraySize(BigInteger value) {
        this.maxArraySize = value;
    }

}
