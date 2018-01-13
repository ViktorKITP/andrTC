
package com.teamcenter.schemas.core._2006_03.session;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Info for setting preferences
 *             
 * 
 * <p>Java class for PrefSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrefSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prefValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="prefScope" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prefName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrefSetting", propOrder = {
    "prefValues"
})
public class PrefSetting {

    protected List<String> prefValues;
    @XmlAttribute(name = "prefScope", required = true)
    protected String prefScope;
    @XmlAttribute(name = "prefName", required = true)
    protected String prefName;

    /**
     * Gets the value of the prefValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPrefValues() {
        if (prefValues == null) {
            prefValues = new ArrayList<String>();
        }
        return this.prefValues;
    }

    /**
     * Gets the value of the prefScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefScope() {
        return prefScope;
    }

    /**
     * Sets the value of the prefScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefScope(String value) {
        this.prefScope = value;
    }

    /**
     * Gets the value of the prefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefName() {
        return prefName;
    }

    /**
     * Sets the value of the prefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefName(String value) {
        this.prefName = value;
    }

}
