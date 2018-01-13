
package com.teamcenter.services.core._2006_03;

import javax.xml.ws.WebFault;
import com.teamcenter.schemas.soa._2006_03.exceptions.InvalidCredentialsException;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InvalidCredentialsFault", targetNamespace = "http://teamcenter.com/Schemas/Soa/2006-03/Exceptions")
public class InvalidCredentialsFaultFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidCredentialsException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InvalidCredentialsFaultFault(String message, InvalidCredentialsException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public InvalidCredentialsFaultFault(String message, InvalidCredentialsException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.teamcenter.schemas.soa._2006_03.exceptions.InvalidCredentialsException
     */
    public InvalidCredentialsException getFaultInfo() {
        return faultInfo;
    }

}
