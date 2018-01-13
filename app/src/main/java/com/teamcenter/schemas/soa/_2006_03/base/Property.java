
package com.teamcenter.schemas.soa._2006_03.base;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The Property represents a single property on ModelObject.
 *             The property data inclues the name of the property, the value(s) and UI or 
 *             display value(s). The modifiable flag overrides the modifiable flag on the
 *             coresponding Property Descriptor for this single instnace of the Property.
 *             
 * 
 * <p>Java class for Property complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Property">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="values" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}PropertyValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="uiValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uiValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="modifiable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Property", propOrder = {
    "values",
    "uiValues"
})
public class Property {

    protected List<PropertyValue> values;
    protected List<String> uiValues;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "uiValue")
    protected String uiValue;
    @XmlAttribute(name = "modifiable")
    protected Boolean modifiable;

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyValue }
     * 
     * 
     */
    public List<PropertyValue> getValues() {
        if (values == null) {
            values = new ArrayList<PropertyValue>();
        }
        return this.values;
    }

    /**
     * Gets the value of the uiValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uiValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUiValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUiValues() {
        if (uiValues == null) {
            uiValues = new ArrayList<String>();
        }
        return this.uiValues;
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
     * Gets the value of the uiValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUiValue() {
        return uiValue;
    }

    /**
     * Sets the value of the uiValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUiValue(String value) {
        this.uiValue = value;
    }

    /**
     * Gets the value of the modifiable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModifiable() {
        return modifiable;
    }

    /**
     * Sets the value of the modifiable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModifiable(Boolean value) {
        this.modifiable = value;
    }

}
