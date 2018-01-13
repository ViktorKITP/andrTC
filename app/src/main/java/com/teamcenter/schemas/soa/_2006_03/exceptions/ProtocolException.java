
package com.teamcenter.schemas.soa._2006_03.exceptions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                The Protocol excetpion is used to catch and errors in the content
 *                of a service request. These errors are generally a result of a 
 *                programming error and can not be recovered from.  
 *             
 * 
 * <p>Java class for ProtocolException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProtocolException">
 *   &lt;complexContent>
 *     &lt;extension base="{http://teamcenter.com/Schemas/Soa/2006-03/Exceptions}InternalServerException">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtocolException")
public class ProtocolException
    extends InternalServerException
{


}
