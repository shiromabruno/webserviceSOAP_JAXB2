//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.04 at 11:02:23 PM BRT 
//


package service._do.info.para.namespace._do.url;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service._do.info.para.namespace._do.url package. 
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

    private final static QName _GetInfoDoSolicitante_QNAME = new QName("http://url.do.namespace.para.info.do.service/", "getInfoDoSolicitante");
    private final static QName _GetInfoDoSolicitanteBank_QNAME = new QName("http://url.do.namespace.para.info.do.service/", "getInfoDoSolicitanteBank");
    private final static QName _GetInfoDoSolicitanteBankResponse_QNAME = new QName("http://url.do.namespace.para.info.do.service/", "getInfoDoSolicitanteBankResponse");
    private final static QName _GetInfoDoSolicitanteResponse_QNAME = new QName("http://url.do.namespace.para.info.do.service/", "getInfoDoSolicitanteResponse");
    private final static QName _ResumDoClient_QNAME = new QName("http://url.do.namespace.para.info.do.service/", "resumDoClient");
    private final static QName _BKServicoException_QNAME = new QName("http://url.do.namespace.para.info.do.service/", "BKServicoException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service._do.info.para.namespace._do.url
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetInfoDoSolicitante }
     * 
     */
    public GetInfoDoSolicitante createGetInfoDoSolicitante() {
        return new GetInfoDoSolicitante();
    }

    /**
     * Create an instance of {@link GetInfoDoSolicitanteBank }
     * 
     */
    public GetInfoDoSolicitanteBank createGetInfoDoSolicitanteBank() {
        return new GetInfoDoSolicitanteBank();
    }

    /**
     * Create an instance of {@link GetInfoDoSolicitanteBankResponse }
     * 
     */
    public GetInfoDoSolicitanteBankResponse createGetInfoDoSolicitanteBankResponse() {
        return new GetInfoDoSolicitanteBankResponse();
    }

    /**
     * Create an instance of {@link GetInfoDoSolicitanteResponse }
     * 
     */
    public GetInfoDoSolicitanteResponse createGetInfoDoSolicitanteResponse() {
        return new GetInfoDoSolicitanteResponse();
    }

    /**
     * Create an instance of {@link ResumDoClient }
     * 
     */
    public ResumDoClient createResumDoClient() {
        return new ResumDoClient();
    }

    /**
     * Create an instance of {@link BKServicoException }
     * 
     */
    public BKServicoException createBKServicoException() {
        return new BKServicoException();
    }

    /**
     * Create an instance of {@link BKMsgRetorno }
     * 
     */
    public BKMsgRetorno createBKMsgRetorno() {
        return new BKMsgRetorno();
    }

    /**
     * Create an instance of {@link ResuDaOpe }
     * 
     */
    public ResuDaOpe createResuDaOpe() {
        return new ResuDaOpe();
    }

    /**
     * Create an instance of {@link ResumoDoVenc }
     * 
     */
    public ResumoDoVenc createResumoDoVenc() {
        return new ResumoDoVenc();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoDoSolicitante }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInfoDoSolicitante }{@code >}
     */
    @XmlElementDecl(namespace = "http://url.do.namespace.para.info.do.service/", name = "getInfoDoSolicitante")
    public JAXBElement<GetInfoDoSolicitante> createGetInfoDoSolicitante(GetInfoDoSolicitante value) {
        return new JAXBElement<GetInfoDoSolicitante>(_GetInfoDoSolicitante_QNAME, GetInfoDoSolicitante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoDoSolicitanteBank }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInfoDoSolicitanteBank }{@code >}
     */
    @XmlElementDecl(namespace = "http://url.do.namespace.para.info.do.service/", name = "getInfoDoSolicitanteBank")
    public JAXBElement<GetInfoDoSolicitanteBank> createGetInfoDoSolicitanteBank(GetInfoDoSolicitanteBank value) {
        return new JAXBElement<GetInfoDoSolicitanteBank>(_GetInfoDoSolicitanteBank_QNAME, GetInfoDoSolicitanteBank.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoDoSolicitanteBankResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInfoDoSolicitanteBankResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://url.do.namespace.para.info.do.service/", name = "getInfoDoSolicitanteBankResponse")
    public JAXBElement<GetInfoDoSolicitanteBankResponse> createGetInfoDoSolicitanteBankResponse(GetInfoDoSolicitanteBankResponse value) {
        return new JAXBElement<GetInfoDoSolicitanteBankResponse>(_GetInfoDoSolicitanteBankResponse_QNAME, GetInfoDoSolicitanteBankResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoDoSolicitanteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetInfoDoSolicitanteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://url.do.namespace.para.info.do.service/", name = "getInfoDoSolicitanteResponse")
    public JAXBElement<GetInfoDoSolicitanteResponse> createGetInfoDoSolicitanteResponse(GetInfoDoSolicitanteResponse value) {
        return new JAXBElement<GetInfoDoSolicitanteResponse>(_GetInfoDoSolicitanteResponse_QNAME, GetInfoDoSolicitanteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResumDoClient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResumDoClient }{@code >}
     */
    @XmlElementDecl(namespace = "http://url.do.namespace.para.info.do.service/", name = "resumDoClient")
    public JAXBElement<ResumDoClient> createResumDoClient(ResumDoClient value) {
        return new JAXBElement<ResumDoClient>(_ResumDoClient_QNAME, ResumDoClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BKServicoException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BKServicoException }{@code >}
     */
    @XmlElementDecl(namespace = "http://url.do.namespace.para.info.do.service/", name = "BKServicoException")
    public JAXBElement<BKServicoException> createBKServicoException(BKServicoException value) {
        return new JAXBElement<BKServicoException>(_BKServicoException_QNAME, BKServicoException.class, null, value);
    }

}
