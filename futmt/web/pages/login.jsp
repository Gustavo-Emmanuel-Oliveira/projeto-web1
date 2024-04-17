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
            <form method="GET" class="formLogin" action="logar" enctype="multipart/form-data">
                <h1>Login</h1>
                <p>Crie por aqui sua conta.</p>
                <label for="email">E-mail</label>
                <input type="email" name="email"  />
                <label for="password">Senha</label>
                <input type="password" name="senha" />
                <a href="/">Esqueci minha senha</a>
                <input type="submit" value="Acessar" class="btn" />
                <p>Caso não tenha uma conta: <a href="./CadastroCotroller">Cadastrar</a></p>
            </form>
        </div>
    </body>
</html>