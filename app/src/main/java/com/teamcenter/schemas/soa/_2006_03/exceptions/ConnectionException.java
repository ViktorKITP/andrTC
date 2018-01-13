
package com.teamcenter.schemas.soa._2006_03.exceptions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                The Connection exception is used to catch any network or I/O
 *                errors while marshalling a service request. These exception
 *                usually be recovered from, that is after the problem with the 
 *                network has been fixed, the last service request can be retried.            
 *             
 * 
 * <p>Java class for ConnectionException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionException">
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
@XmlType(name = "ConnectionException")
public class ConnectionException
    extends InternalServerException
{


}
