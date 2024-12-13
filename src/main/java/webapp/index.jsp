<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Inserir Produto</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
    <h2>Inserir Produto</h2>
    <form id="produto-form">
        <label for="nome">Nome:</label>
        <input type="text" id="nome" name="nome" required /><br />

        <label for="quantidade">Quantidade:</label>
        <input type="number" id="quantidade" name="quantidade" min="0" required /><br />

        <label for="preco">Preço Unitário:</label>
        <input type="number" id="preco" name="preco" min="0" step="0.01" required /><br />

        <label for="data">Data de Cadastro:</label>
        <input type="datetime-local" id="data" name="data" required /><br />

        <input type="submit" value="Inserir Produto" />
    </form>

    <div id="resposta"></div>

    <script>
        // Quando o formulário for enviado
        $("#produto-form").submit(function (event) {
            event.preventDefault(); // Evita o envio padrão do formulário

            // Obtém os valores dos campos
            var nome = $("#nome").val();
            var quantidade = $("#quantidade").val();
            var preco = $("#preco").val();
            var data = $("#data").val();

            // Envia os dados para o Servlet via AJAX
            $.ajax({
                type: "POST",
                url: "/Estoque",
                data: {
                    nome: nome,
                    quantidade: quantidade,
                    preco: preco,
                    data: data
                },
                success: function (response) {
                    // Exibe a resposta no frontend
                    $("#resposta").html(response);
                    // Limpa o formulário
                    $("#produto-form")[0].reset();
                },
                error: function () {
                    $("#resposta").html("Erro ao inserir produto.");
                }
            });
        });
    </script>
</body>
</html>
