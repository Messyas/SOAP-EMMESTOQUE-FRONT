package com.ifam.estoqueweb.servico.controle;

import com.ifam.estoqueweb.servico.Produto;
import com.ifam.estoqueweb.servico.ProdutoSEI;
import com.ifam.estoqueweb.servico.util.Conexao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/Estoque")
public class EstoqueControle extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private ProdutoSEI verEstoque;

    public EstoqueControle() {
        super();
        verEstoque = Conexao.getServicoEstoque();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // Obtém os parâmetros do formulário
            String nome = request.getParameter("nome");
            int quantidade = Integer.parseInt(request.getParameter("quantidade"));
            double preco = Double.parseDouble(request.getParameter("preco"));
            String dataStr = request.getParameter("data");

            // Converte a data recebida para o formato necessário
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
            Date data = sdf.parse(dataStr);

            // Cria um objeto Produto
            Produto produto = new Produto();
            produto.setNome(nome);
            produto.setQuantidade(quantidade);
            produto.setPreco(preco);
            produto.setData(data);

            // Chama o método SOAP para adicionar o produto
            long id = verEstoque.adicionar(produto);

            // Retorna uma resposta para o frontend
            response.getWriter().write("Produto inserido com sucesso! ID: " + id);
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("Erro ao inserir produto: " + e.getMessage());
        }
    }





}
