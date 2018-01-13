
package com.teamcenter.schemas.core._2006_03.session;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.teamcenter.schemas.soa._2006_03.base.Preferences;
import com.teamcenter.schemas.soa._2006_03.base.ServiceData;


/**
 * 
 *                 Info from get/setPreferences
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
 *         &lt;element ref="{http://teamcenter.com/Schemas/Soa/2006-03/Base}Preferences"/>
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
    "preferences",
    "serviceData"
})
@XmlRootElement(name = "PreferencesResponse")
public class PreferencesResponse {

    @XmlElement(name = "Preferences", namespace = "http://teamcenter.com/Schemas/Soa/2006-03/Base", required = true)
    protected Preferences preferences;
    @XmlElement(name = "ServiceData", namespace = "http://teamcenter.com/Schemas/Soa/2006-03/Base", required = true)
    protected ServiceData serviceData;

    /**
     * 
     *                         The requested preference name/values.
     *                     
     * 
     * @return
     *     possible object is
     *     {@link Preferences }
     *     
     */
    public Preferences getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the preferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preferences }
     *     
     */
    public void setPreferences(Preferences value) {
        this.preferences = value;
    }

    /**
     * 
     *                         Any partial errors that may occur when filling this request.
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
