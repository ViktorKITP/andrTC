
package com.teamcenter.schemas.core._2006_03.session;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.teamcenter.schemas.soa._2006_03.base.ModelObject;
import com.teamcenter.schemas.soa._2006_03.base.ServiceData;


/**
 * 
 *                 Info from <font face=&quot;courier&quot; height=&quot;10&quot;>getGroupMembership</font> operation.
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
 *         &lt;element name="groupMembers" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}ModelObject" maxOccurs="unbounded" minOccurs="0"/>
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
    "groupMembers",
    "serviceData"
})
@XmlRootElement(name = "GetGroupMembershipResponse")
public class GetGroupMembershipResponse {

    protected List<ModelObject> groupMembers;
    @XmlElement(name = "ServiceData", namespace = "http://teamcenter.com/Schemas/Soa/2006-03/Base", required = true)
    protected ServiceData serviceData;

    /**
     * Gets the value of the groupMembers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupMembers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupMembers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelObject }
     * 
     * 
     */
    public List<ModelObject> getGroupMembers() {
        if (groupMembers == null) {
            groupMembers = new ArrayList<ModelObject>();
        }
        return this.groupMembers;
    }

    /**
     * 
     *                         The plain list has all the <b>GroupMembers</b>, <b>Groups</b> and <b>Roles</b> for this <b>User</b>
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
