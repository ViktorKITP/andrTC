
package com.teamcenter.webservices._2005_06.schemas.wsfaults;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.teamcenter.webservices._2005_06.schemas.wsfaults package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RequestManangerFault_QNAME = new QName("http://teamcenter.com/webservices/2005-06/schemas/WSFaults", "RequestManangerFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.teamcenter.webservices._2005_06.schemas.wsfaults
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestManangerFaultType }
     * 
     */
    public RequestManangerFaultType createRequestManangerFaultType() {
        return new RequestManangerFaultType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestManangerFaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://teamcenter.com/webservices/2005-06/schemas/WSFaults", name = "RequestManangerFault")
    public JAXBElement<RequestManangerFaultType> createRequestManangerFault(RequestManangerFaultType value) {
        return new JAXBElement<RequestManangerFaultType>(_RequestManangerFault_QNAME, RequestManangerFaultType.class, null, value);
    }

}
