
package com.teamcenter.schemas.soa._2006_03.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bo" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}ModelObject"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectMap", propOrder = {
    "bo"
})
public class ObjectMap {

    @XmlElement(required = true)
    protected ModelObject bo;
    @XmlAttribute(name = "uid", required = true)
    protected String uid;

    /**
     * Gets the value of the bo property.
     * 
     * @return
     *     possible object is
     *     {@link ModelObject }
     *     
     */
    public ModelObject getBo() {
        return bo;
    }

    /**
     * Sets the value of the bo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelObject }
     *     
     */
    public void setBo(ModelObject value) {
        this.bo = value;
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

}
