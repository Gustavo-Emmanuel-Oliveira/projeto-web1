<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FuteMaster</title>
        <link rel="stylesheet" href="styles/logn.css">
    </head>

    <body>
        <div class="page">
            <form method="post" class="formLogin" action="criar" enctype="multipart/form-data">
                <h1>Cadastro</h1>
  
                <label for="email">E-mail</label>
                <input type="email" name="email"/>
                <label for="nome">Nome</label>
                <input type="text" name="nome" />
                <label for="telefone">Telefone</label>
                <input type="tel" name="telefone" />
                <label for="CPF">CPF</label>
                <input type="text" name="cpf" />
                <label for="password">Senha</label>
                <input type="password" name="senha" />
                <input type="submit" value="Acessar" class="btn" />
                <p>Caso não tenha uma conta: <a href="./LoginController">Logar</a></p>
            </form>
        </div>
    </body>
</html>