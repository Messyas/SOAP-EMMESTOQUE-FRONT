
package com.ifam.estoqueweb.servico;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ProdutoSEI", targetNamespace = "http://servico.jaxwscrudservice.fourcatsdev.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProdutoSEI {


    /**
     * 
     * @param arg0
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "adicionar", targetNamespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", className = "com.ifam.estoqueweb.servico.Adicionar")
    @ResponseWrapper(localName = "adicionarResponse", targetNamespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", className = "com.ifam.estoqueweb.servico.AdicionarResponse")
    @Action(input = "http://servico.jaxwscrudservice.fourcatsdev.com/ProdutoSEI/adicionarRequest", output = "http://servico.jaxwscrudservice.fourcatsdev.com/ProdutoSEI/adicionarResponse")
    public long adicionar(
        @WebParam(name = "arg0", targetNamespace = "")
        Produto arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.ifam.estoqueweb.servico.Produto
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "alterar", targetNamespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", className = "com.ifam.estoqueweb.servico.Alterar")
    @ResponseWrapper(localName = "alterarResponse", targetNamespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", className = "com.ifam.estoqueweb.servico.AlterarResponse")
    @Action(input = "http://servico.jaxwscrudservice.fourcatsdev.com/ProdutoSEI/alterarRequest", output = "http://servico.jaxwscrudservice.fourcatsdev.com/ProdutoSEI/alterarResponse")
    public Produto alterar(
        @WebParam(name = "arg0", targetNamespace = "")
        Produto arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.ifam.estoqueweb.servico.Produto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listar", targetNamespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", className = "com.ifam.estoqueweb.servico.Listar")
    @ResponseWrapper(localName = "listarResponse", targetNamespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", className = "com.ifam.estoqueweb.servico.ListarResponse")
    @Action(input = "http://servico.jaxwscrudservice.fourcatsdev.com/ProdutoSEI/listarRequest", output = "http://servico.jaxwscrudservice.fourcatsdev.com/ProdutoSEI/listarResponse")
    public List<Produto> listar();

    /**
     * 
     * @param arg0
     * @return
     *     returns com.ifam.estoqueweb.servico.Produto
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ler", targetNamespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", className = "com.ifam.estoqueweb.servico.Ler")
    @ResponseWrapper(localName = "lerResponse", targetNamespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", className = "com.ifam.estoqueweb.servico.LerResponse")
    @Action(input = "http://servico.jaxwscrudservice.fourcatsdev.com/ProdutoSEI/lerRequest", output = "http://servico.jaxwscrudservice.fourcatsdev.com/ProdutoSEI/lerResponse")
    public Produto ler(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "apagar", targetNamespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", className = "com.ifam.estoqueweb.servico.Apagar")
    @ResponseWrapper(localName = "apagarResponse", targetNamespace = "http://servico.jaxwscrudservice.fourcatsdev.com/", className = "com.ifam.estoqueweb.servico.ApagarResponse")
    @Action(input = "http://servico.jaxwscrudservice.fourcatsdev.com/ProdutoSEI/apagarRequest", output = "http://servico.jaxwscrudservice.fourcatsdev.com/ProdutoSEI/apagarResponse")
    public boolean apagar(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

}
