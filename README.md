# Aplicação Java Front-End com SOAP

Este repositório contém uma aplicação **front-end em Java** desenvolvida utilizando **Servlets**, que se comunica com um **serviço web SOAP** por meio de um WSDL. A aplicação roda em um **servidor Apache Tomcat** e permite o envio de dados de produtos para o serviço remoto.

## Tecnologias Utilizadas

- **Java EE (Servlets)**
- **Apache Tomcat**
- **SOAP (via WSDL)**
- **HTTP (requisições POST via formulário)**
- **JAX-WS (consumo do serviço SOAP)**

## Sobre

- Interface web para envio de dados de produtos (nome, quantidade, preço, data).

## Estrutura

- `ProdutoSEI.java` – Interface que define os métodos expostos pelo serviço SOAP.
- `Conexao.java` – Classe utilitária que realiza a conexão com o serviço remoto via WSDL.
- `ProdutoSIB.java` – Classe Service Implementation Bean (SIB), que implementa a lógica do serviço SOAP no lado do servidor.

