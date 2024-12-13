package com.ifam.estoqueweb.servico.util;

import com.ifam.estoqueweb.servico.ProdutoSEI;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import jakarta.xml.ws.Service;

public class Conexao {

    private static final String WSDL = "http://localhost:8088/produtos?wsdl";
    private static final String TARGET = "http://servico.jaxwscrudservice.fourcatsdev.com/";
    private static final String NAME = "ProdutoSIBService";

    private static final ProdutoSEI produtoSEI= conexao();

    private static ProdutoSEI conexao() {
        try {
            URL url = new URL(WSDL);
            QName qname = new QName(TARGET, NAME);
            Service service = Service.create(url, qname);
            return service.getPort(ProdutoSEI.class);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ProdutoSEI getServicoEstoque() {
        return produtoSEI;
    }


}
