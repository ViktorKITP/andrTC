
package com.teamcenter.schemas.core._2006_03.session;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *       &lt;/sequence>
 *       &lt;attribute name="username" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ssoCredentials" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="group" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="role" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sessionDiscriminator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "LoginSSOInput")
public class LoginSSOInput {

    @XmlAttribute(name = "username", required = true)
    protected String username;
    @XmlAttribute(name = "ssoCredentials", required = true)
    protected String ssoCredentials;
    @XmlAttribute(name = "group", required = true)
    protected String group;
    @XmlAttribute(name = "role", required = true)
    protected String role;
    @XmlAttribute(name = "sessionDiscriminator", required = true)
    protected String sessionDiscriminator;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the ssoCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsoCredentials() {
        return ssoCredentials;
    }

    /**
     * Sets the value of the ssoCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsoCredentials(String value) {
        this.ssoCredentials = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the sessionDiscriminator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionDiscriminator() {
        return sessionDiscriminator;
    }

    /**
     * Sets the value of the sessionDiscriminator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionDiscriminator(String value) {
        this.sessionDiscriminator = value;
    }

}
