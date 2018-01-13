
package com.teamcenter.schemas.core._2006_03.session;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.teamcenter.schemas.soa._2006_03.base.ModelObject;
import com.teamcenter.schemas.soa._2006_03.base.ServiceData;


/**
 * 
 *                 The  <b>User</b> and <b>GroupMember</b> objects for the user of this session. Partial errors are returned in the <font face="courier" height="10">ServiceData</font> when the authentication is successful but requested role is not supported.
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
 *         &lt;element name="user" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}ModelObject"/>
 *         &lt;element name="groupMember" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}ModelObject"/>
 *         &lt;element ref="{http://teamcenter.com/Schemas/Soa/2006-03/Base}ServiceData"/>
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
    "user",
    "groupMember",
    "serviceData"
})
@XmlRootElement(name = "LoginResponse")
public class LoginResponse {

    @XmlElement(required = true)
    protected ModelObject user;
    @XmlElement(required = true)
    protected ModelObject groupMember;
    @XmlElement(name = "ServiceData", namespace = "http://teamcenter.com/Schemas/Soa/2006-03/Base", required = true)
    protected ServiceData serviceData;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link ModelObject }
     *     
     */
    public ModelObject getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelObject }
     *     
     */
    public void setUser(ModelObject value) {
        this.user = value;
    }

    /**
     * Gets the value of the groupMember property.
     * 
     * @return
     *     possible object is
     *     {@link ModelObject }
     *     
     */
    public ModelObject getGroupMember() {
        return groupMember;
    }

    /**
     * Sets the value of the groupMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelObject }
     *     
     */
    public void setGroupMember(ModelObject value) {
        this.groupMember = value;
    }

    /**
     * 
     *                         The <b>GroupMember</b> and <b>User</b> are added to the plain object list.
     *                     
     * 
     * @return
     *     possible object is
     *     {@link ServiceData }
     *     
     */
    public ServiceData getServiceData() {
        return serviceData;
    }

    /**
     * Sets the value of the serviceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceData }
     *     
     */
    public void setServiceData(ServiceData value) {
        this.serviceData = value;
    }

}
