
package org.example.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
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

    private final static QName _BadRequest_QNAME = new QName("http://example.org/", "BadRequest");
    private final static QName _RegisterVehicle_QNAME = new QName("http://example.org/", "registerVehicle");
    private final static QName _RegisterVehicleResponse_QNAME = new QName("http://example.org/", "registerVehicleResponse");
    private final static QName _RegistrationRequest_QNAME = new QName("http://example.org/", "registrationRequest");
    private final static QName _UpdateVehicle_QNAME = new QName("http://example.org/", "updateVehicle");
    private final static QName _UpdateVehicleResponse_QNAME = new QName("http://example.org/", "updateVehicleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BadRequest }
     * 
     */
    public BadRequest createBadRequest() {
        return new BadRequest();
    }

    /**
     * Create an instance of {@link RegisterVehicle }
     * 
     */
    public RegisterVehicle createRegisterVehicle() {
        return new RegisterVehicle();
    }

    /**
     * Create an instance of {@link RegisterVehicleResponse }
     * 
     */
    public RegisterVehicleResponse createRegisterVehicleResponse() {
        return new RegisterVehicleResponse();
    }

    /**
     * Create an instance of {@link RegistrationRequest }
     * 
     */
    public RegistrationRequest createRegistrationRequest() {
        return new RegistrationRequest();
    }

    /**
     * Create an instance of {@link UpdateVehicle }
     * 
     */
    public UpdateVehicle createUpdateVehicle() {
        return new UpdateVehicle();
    }

    /**
     * Create an instance of {@link UpdateVehicleResponse }
     * 
     */
    public UpdateVehicleResponse createUpdateVehicleResponse() {
        return new UpdateVehicleResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BadRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BadRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "BadRequest")
    public JAXBElement<BadRequest> createBadRequest(BadRequest value) {
        return new JAXBElement<BadRequest>(_BadRequest_QNAME, BadRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterVehicle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterVehicle }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "registerVehicle")
    public JAXBElement<RegisterVehicle> createRegisterVehicle(RegisterVehicle value) {
        return new JAXBElement<RegisterVehicle>(_RegisterVehicle_QNAME, RegisterVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterVehicleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterVehicleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "registerVehicleResponse")
    public JAXBElement<RegisterVehicleResponse> createRegisterVehicleResponse(RegisterVehicleResponse value) {
        return new JAXBElement<RegisterVehicleResponse>(_RegisterVehicleResponse_QNAME, RegisterVehicleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistrationRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "registrationRequest")
    public JAXBElement<RegistrationRequest> createRegistrationRequest(RegistrationRequest value) {
        return new JAXBElement<RegistrationRequest>(_RegistrationRequest_QNAME, RegistrationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateVehicle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateVehicle }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "updateVehicle")
    public JAXBElement<UpdateVehicle> createUpdateVehicle(UpdateVehicle value) {
        return new JAXBElement<UpdateVehicle>(_UpdateVehicle_QNAME, UpdateVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateVehicleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateVehicleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "updateVehicleResponse")
    public JAXBElement<UpdateVehicleResponse> createUpdateVehicleResponse(UpdateVehicleResponse value) {
        return new JAXBElement<UpdateVehicleResponse>(_UpdateVehicleResponse_QNAME, UpdateVehicleResponse.class, null, value);
    }

}
