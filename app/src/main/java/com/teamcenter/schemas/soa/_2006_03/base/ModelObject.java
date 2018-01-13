
package com.teamcenter.schemas.soa._2006_03.base;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The ModelObject type is used to represent any Teamcenter business object.
 *              
 * 
 * <p>Java class for ModelObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModelObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="properties" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}Property" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="uiproperties" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}DisplayProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="props" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}XJProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="classUid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="className" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updateDesc" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelObject", propOrder = {
    "properties",
    "uiproperties",
    "props"
})
public class ModelObject {

    protected List<Property> properties;
    protected List<DisplayProperty> uiproperties;
    protected List<XJProperty> props;
    @XmlAttribute(name = "uid", required = true)
    protected String uid;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "classUid")
    protected String classUid;
    @XmlAttribute(name = "className")
    protected String className;
    @XmlAttribute(name = "updateDesc")
    protected Boolean updateDesc;

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
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperties() {
        if (properties == null) {
            properties = new ArrayList<Property>();
        }
        return this.properties;
    }

    /**
     * Gets the value of the uiproperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uiproperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUiproperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayProperty }
     * 
     * 
     */
    public List<DisplayProperty> getUiproperties() {
        if (uiproperties == null) {
            uiproperties = new ArrayList<DisplayProperty>();
        }
        return this.uiproperties;
    }

    /**
     * Gets the value of the props property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the props property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XJProperty }
     * 
     * 
     */
    public List<XJProperty> getProps() {
        if (props == null) {
            props = new ArrayList<XJProperty>();
        }
        return this.props;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the classUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassUid() {
        return classUid;
    }

    /**
     * Sets the value of the classUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassUid(String value) {
        this.classUid = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the updateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdateDesc() {
        return updateDesc;
    }

    /**
     * Sets the value of the updateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateDesc(Boolean value) {
        this.updateDesc = value;
    }

}
