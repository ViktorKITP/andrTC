
package com.teamcenter.schemas.soa._2006_03.base;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The XJPropertyValue represents the value(s) of a single property on a
 *                 ModelObject.
 *             
 * 
 * <p>Java class for XJPropertyValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XJPropertyValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dbValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="uiValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isNulls" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modifiable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XJPropertyValue", propOrder = {
    "dbValues",
    "uiValues",
    "isNulls"
})
public class XJPropertyValue {

    protected List<String> dbValues;
    protected List<String> uiValues;
    @XmlElement(type = Boolean.class)
    protected List<Boolean> isNulls;
    @XmlAttribute(name = "modifiable")
    protected Boolean modifiable;

    /**
     * Gets the value of the dbValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dbValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDbValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDbValues() {
        if (dbValues == null) {
            dbValues = new ArrayList<String>();
        }
        return this.dbValues;
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
     * Gets the value of the isNulls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isNulls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsNulls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getIsNulls() {
        if (isNulls == null) {
            isNulls = new ArrayList<Boolean>();
        }
        return this.isNulls;
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
