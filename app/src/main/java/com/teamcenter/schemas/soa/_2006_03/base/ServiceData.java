
package com.teamcenter.schemas.soa._2006_03.base;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The ServiceData type is used to return Teamcenter Model object. 
 *             Teamcenter Model objects are organized in 4 lists, 'updatedObjs', 'deletedObjs',
 *             'createdObjs', and 'plainObjs'. The ServiceData type also allows partial
 *             errors to be returned.
 *             As of Teamcenter 9.1.2 and 10.1(??) the 'updated', 'deleted', 'created', and 'plain' arrays are used
 *             with each element in the array being the UID of the object. 
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
 *         &lt;element name="updatedObjs" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}RefId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deletedObjs" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}RefId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="createdObjs" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}RefId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="childChangeObjs" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}RefId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="plainObjs" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}RefId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="updated" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deleted" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="childChange" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="plain" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dataObjects" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}ModelObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modelObjects" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}ObjectMap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partialErrors" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}ErrorStack" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updatedObjs",
    "deletedObjs",
    "createdObjs",
    "childChangeObjs",
    "plainObjs",
    "updated",
    "deleted",
    "created",
    "childChange",
    "plain",
    "dataObjects",
    "modelObjects",
    "partialErrors"
})
@XmlRootElement(name = "ServiceData")
public class ServiceData {

    protected List<RefId> updatedObjs;
    protected List<RefId> deletedObjs;
    protected List<RefId> createdObjs;
    protected List<RefId> childChangeObjs;
    protected List<RefId> plainObjs;
    protected List<String> updated;
    protected List<String> deleted;
    protected List<String> created;
    protected List<String> childChange;
    protected List<String> plain;
    protected List<ModelObject> dataObjects;
    protected List<ObjectMap> modelObjects;
    protected List<ErrorStack> partialErrors;

    /**
     * Gets the value of the updatedObjs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updatedObjs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdatedObjs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefId }
     * 
     * 
     */
    public List<RefId> getUpdatedObjs() {
        if (updatedObjs == null) {
            updatedObjs = new ArrayList<RefId>();
        }
        return this.updatedObjs;
    }

    /**
     * Gets the value of the deletedObjs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletedObjs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletedObjs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefId }
     * 
     * 
     */
    public List<RefId> getDeletedObjs() {
        if (deletedObjs == null) {
            deletedObjs = new ArrayList<RefId>();
        }
        return this.deletedObjs;
    }

    /**
     * Gets the value of the createdObjs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createdObjs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreatedObjs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefId }
     * 
     * 
     */
    public List<RefId> getCreatedObjs() {
        if (createdObjs == null) {
            createdObjs = new ArrayList<RefId>();
        }
        return this.createdObjs;
    }

    /**
     * Gets the value of the childChangeObjs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childChangeObjs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildChangeObjs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefId }
     * 
     * 
     */
    public List<RefId> getChildChangeObjs() {
        if (childChangeObjs == null) {
            childChangeObjs = new ArrayList<RefId>();
        }
        return this.childChangeObjs;
    }

    /**
     * Gets the value of the plainObjs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plainObjs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlainObjs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefId }
     * 
     * 
     */
    public List<RefId> getPlainObjs() {
        if (plainObjs == null) {
            plainObjs = new ArrayList<RefId>();
        }
        return this.plainObjs;
    }

    /**
     * Gets the value of the updated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUpdated() {
        if (updated == null) {
            updated = new ArrayList<String>();
        }
        return this.updated;
    }

    /**
     * Gets the value of the deleted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeleted() {
        if (deleted == null) {
            deleted = new ArrayList<String>();
        }
        return this.deleted;
    }

    /**
     * Gets the value of the created property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the created property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCreated() {
        if (created == null) {
            created = new ArrayList<String>();
        }
        return this.created;
    }

    /**
     * Gets the value of the childChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getChildChange() {
        if (childChange == null) {
            childChange = new ArrayList<String>();
        }
        return this.childChange;
    }

    /**
     * Gets the value of the plain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPlain() {
        if (plain == null) {
            plain = new ArrayList<String>();
        }
        return this.plain;
    }

    /**
     * Gets the value of the dataObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelObject }
     * 
     * 
     */
    public List<ModelObject> getDataObjects() {
        if (dataObjects == null) {
            dataObjects = new ArrayList<ModelObject>();
        }
        return this.dataObjects;
    }

    /**
     * Gets the value of the modelObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modelObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectMap }
     * 
     * 
     */
    public List<ObjectMap> getModelObjects() {
        if (modelObjects == null) {
            modelObjects = new ArrayList<ObjectMap>();
        }
        return this.modelObjects;
    }

    /**
     * Gets the value of the partialErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partialErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartialErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorStack }
     * 
     * 
     */
    public List<ErrorStack> getPartialErrors() {
        if (partialErrors == null) {
            partialErrors = new ArrayList<ErrorStack>();
        }
        return this.partialErrors;
    }

}
