
package com.ifam.estoqueweb.servico;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ifam.estoqueweb.servico package. 
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

    private final static QName _Adicionar_QNAME = new QName("http://servico.jaxwscrudservice.fourcatsdev.com/", "adicionar");
    private final static QName _AdicionarResponse_QNAME = new QName("http://servico.jaxwscrudservice.fourcatsdev.com/", "adicionarResponse");
    private final static QName _Alterar_QNAME = new QName("http://servico.jaxwscrudservice.fourcatsdev.com/", "alterar");
    private final static QName _AlterarResponse_QNAME = new QName("http://servico.jaxwscrudservice.fourcatsdev.com/", "alterarResponse");
    private final static QName _Apagar_QNAME = new QName("http://servico.jaxwscrudservice.fourcatsdev.com/", "apagar");
    private final static QName _ApagarResponse_QNAME = new QName("http://servico.jaxwscrudservice.fourcatsdev.com/", "apagarResponse");
    private final static QName _Ler_QNAME = new QName("http://servico.jaxwscrudservice.fourcatsdev.com/", "ler");
    private final static QName _LerResponse_QNAME = new QName("http://servico.jaxwscrudservice.fourcatsdev.com/", "lerResponse");
    private final static QName _Listar_QNAME = new QName("http://servico.jaxwscrudservice.fourcatsdev.com/", "listar");
    private final static QName _ListarResponse_QNAME = new QName("http://servico.jaxwscrudservice.fourcatsdev.com/", "listarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ifam.estoqueweb.servico
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Adicionar }
     * 
     */
    public Adicionar createAdicionar() {
        return new Adicionar();
    }

    /**
     * Create an instance of {@link AdicionarResponse }
     * 
     */
    public AdicionarResponse createAdicionarResponse() {
        return new AdicionarResponse();
    }

    /**
     * Create an instance of {@link Alterar }
     * 
     */
    public Alterar createAlterar() {
        return new Alterar();
    }

    /**
     * Create an instance of {@link AlterarResponse }
     * 
     */
    public AlterarResponse createAlterarResponse() {
        return new AlterarResponse();
    }

    /**
     * Create an instance of {@link Apagar }
     * 
     */
    public Apagar createApagar() {
        return new Apagar();
    }

    /**
     * Create an instance of {@link ApagarResponse }
     * 
     */
    public ApagarResponse createApagarResponse() {
        return new ApagarResponse();
    }

    /**
     * Create an instance of {@link Ler }
     * 
     */
    public Ler createLer() {
        return new Ler();
    }

    /**
     * Create an instance of {@link LerResponse }
     * 
     */
    public LerResponse createLerResponse() {
        return new LerResponse();
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link Produto }
     * 
     */
    public Produto createProduto() {
        return new Produto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Adicionar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Adicionar }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", name = "adicionar")
    public JAXBElement<Adicionar> createAdicionar(Adicionar value) {
        return new JAXBElement<Adicionar>(_Adicionar_QNAME, Adicionar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdicionarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdicionarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", name = "adicionarResponse")
    public JAXBElement<AdicionarResponse> createAdicionarResponse(AdicionarResponse value) {
        return new JAXBElement<AdicionarResponse>(_AdicionarResponse_QNAME, AdicionarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Alterar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Alterar }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", name = "alterar")
    public JAXBElement<Alterar> createAlterar(Alterar value) {
        return new JAXBElement<Alterar>(_Alterar_QNAME, Alterar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", name = "alterarResponse")
    public JAXBElement<AlterarResponse> createAlterarResponse(AlterarResponse value) {
        return new JAXBElement<AlterarResponse>(_AlterarResponse_QNAME, AlterarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Apagar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Apagar }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", name = "apagar")
    public JAXBElement<Apagar> createApagar(Apagar value) {
        return new JAXBElement<Apagar>(_Apagar_QNAME, Apagar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApagarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApagarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", name = "apagarResponse")
    public JAXBElement<ApagarResponse> createApagarResponse(ApagarResponse value) {
        return new JAXBElement<ApagarResponse>(_ApagarResponse_QNAME, ApagarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ler }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Ler }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", name = "ler")
    public JAXBElement<Ler> createLer(Ler value) {
        return new JAXBElement<Ler>(_Ler_QNAME, Ler.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", name = "lerResponse")
    public JAXBElement<LerResponse> createLerResponse(LerResponse value) {
        return new JAXBElement<LerResponse>(_LerResponse_QNAME, LerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", name = "listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", name = "listarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

}
