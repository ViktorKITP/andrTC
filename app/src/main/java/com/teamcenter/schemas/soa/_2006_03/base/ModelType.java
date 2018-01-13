
package com.teamcenter.schemas.soa._2006_03.base;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propDescriptor" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}PropDescriptor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uifName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="className" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="typeUid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="transientType" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="externalObject" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelType", propOrder = {
    "propDescriptor"
})
public class ModelType {

    protected List<PropDescriptor> propDescriptor;
    @XmlAttribute(name = "uid", required = true)
    protected String uid;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "uifName")
    protected String uifName;
    @XmlAttribute(name = "className", required = true)
    protected String className;
    @XmlAttribute(name = "parentTypeName")
    protected String parentTypeName;
    @XmlAttribute(name = "typeUid", required = true)
    protected String typeUid;
    @XmlAttribute(name = "transientType", required = true)
    protected boolean transientType;
    @XmlAttribute(name = "externalObject", required = true)
    protected boolean externalObject;

    /**
     * Gets the value of the propDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropDescriptor }
     * 
     * 
     */
    public List<PropDescriptor> getPropDescriptor() {
        if (propDescriptor == null) {
            propDescriptor = new ArrayList<PropDescriptor>();
        }
        return this.propDescriptor;
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
     * Gets the value of the uifName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUifName() {
        return uifName;
    }

    /**
     * Sets the value of the uifName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUifName(String value) {
        this.uifName = value;
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
     * Gets the value of the parentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentTypeName() {
        return parentTypeName;
    }

    /**
     * Sets the value of the parentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentTypeName(String value) {
        this.parentTypeName = value;
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
     * Gets the value of the transientType property.
     * 
     */
    public boolean isTransientType() {
        return transientType;
    }

    /**
     * Sets the value of the transientType property.
     * 
     */
    public void setTransientType(boolean value) {
        this.transientType = value;
    }

    /**
     * Gets the value of the externalObject property.
     * 
     */
    public boolean isExternalObject() {
        return externalObject;
    }

    /**
     * Sets the value of the externalObject property.
     * 
     */
    public void setExternalObject(boolean value) {
        this.externalObject = value;
    }

}
