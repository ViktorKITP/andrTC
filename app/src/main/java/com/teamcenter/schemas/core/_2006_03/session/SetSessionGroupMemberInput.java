
package com.teamcenter.schemas.core._2006_03.session;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.teamcenter.schemas.soa._2006_03.base.ModelObject;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupMember" type="{http://teamcenter.com/Schemas/Soa/2006-03/Base}ModelObject"/>
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
    "groupMember"
})
@XmlRootElement(name = "SetSessionGroupMemberInput")
public class SetSessionGroupMemberInput {

    @XmlElement(required = true)
    protected ModelObject groupMember;

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

}
