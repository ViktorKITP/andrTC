
package com.teamcenter.schemas.soa._2006_03.exceptions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.teamcenter.schemas.soa._2006_03.exceptions package. 
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

    private final static QName _InvalidUserFault_QNAME = new QName("http://teamcenter.com/Schemas/Soa/2006-03/Exceptions", "InvalidUserFault");
    private final static QName _ServiceFault_QNAME = new QName("http://teamcenter.com/Schemas/Soa/2006-03/Exceptions", "ServiceFault");
    private final static QName _InvalidCredentialsFault_QNAME = new QName("http://teamcenter.com/Schemas/Soa/2006-03/Exceptions", "InvalidCredentialsFault");
    private final static QName _InternalServerFault_QNAME = new QName("http://teamcenter.com/Schemas/Soa/2006-03/Exceptions", "InternalServerFault");
    private final static QName _ProtocolFault_QNAME = new QName("http://teamcenter.com/Schemas/Soa/2006-03/Exceptions", "ProtocolFault");
    private final static QName _ConnectionFault_QNAME = new QName("http://teamcenter.com/Schemas/Soa/2006-03/Exceptions", "ConnectionFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.teamcenter.schemas.soa._2006_03.exceptions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InternalServerException }
     * 
     */
    public InternalServerException createInternalServerException() {
        return new InternalServerException();
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link InvalidCredentialsException }
     * 
     */
    public InvalidCredentialsException createInvalidCredentialsException() {
        return new InvalidCredentialsException();
    }

    /**
     * Create an instance of {@link InvalidUserException }
     * 
     */
    public InvalidUserException createInvalidUserException() {
        return new InvalidUserException();
    }

    /**
     * Create an instance of {@link ProtocolException }
     * 
     */
    public ProtocolException createProtocolException() {
        return new ProtocolException();
    }

    /**
     * Create an instance of {@link ConnectionException }
     * 
     */
    public ConnectionException createConnectionException() {
        return new ConnectionException();
    }

    /**
     * Create an instance of {@link InternalServerException.Messages }
     * 
     */
    public InternalServerException.Messages createInternalServerExceptionMessages() {
        return new InternalServerException.Messages();
    }

    /**
     * Create an instance of {@link ServiceException.Messages }
     * 
     */
    public ServiceException.Messages createServiceExceptionMessages() {
        return new ServiceException.Messages();
    }

    /**
     * Create an instance of {@link InvalidCredentialsException.Message }
     * 
     */
    public InvalidCredentialsException.Message createInvalidCredentialsExceptionMessage() {
        return new InvalidCredentialsException.Message();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidUserException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://teamcenter.com/Schemas/Soa/2006-03/Exceptions", name = "InvalidUserFault")
    public JAXBElement<InvalidUserException> createInvalidUserFault(InvalidUserException value) {
        return new JAXBElement<InvalidUserException>(_InvalidUserFault_QNAME, InvalidUserException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://teamcenter.com/Schemas/Soa/2006-03/Exceptions", name = "ServiceFault")
    public JAXBElement<ServiceException> createServiceFault(ServiceException value) {
        return new JAXBElement<ServiceException>(_ServiceFault_QNAME, ServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidCredentialsException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://teamcenter.com/Schemas/Soa/2006-03/Exceptions", name = "InvalidCredentialsFault")
    public JAXBElement<InvalidCredentialsException> createInvalidCredentialsFault(InvalidCredentialsException value) {
        return new JAXBElement<InvalidCredentialsException>(_InvalidCredentialsFault_QNAME, InvalidCredentialsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternalServerException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://teamcenter.com/Schemas/Soa/2006-03/Exceptions", name = "InternalServerFault")
    public JAXBElement<InternalServerException> createInternalServerFault(InternalServerException value) {
        return new JAXBElement<InternalServerException>(_InternalServerFault_QNAME, InternalServerException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtocolException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://teamcenter.com/Schemas/Soa/2006-03/Exceptions", name = "ProtocolFault")
    public JAXBElement<ProtocolException> createProtocolFault(ProtocolException value) {
        return new JAXBElement<ProtocolException>(_ProtocolFault_QNAME, ProtocolException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectionException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://teamcenter.com/Schemas/Soa/2006-03/Exceptions", name = "ConnectionFault")
    public JAXBElement<ConnectionException> createConnectionFault(ConnectionException value) {
        return new JAXBElement<ConnectionException>(_ConnectionFault_QNAME, ConnectionException.class, null, value);
    }

}
