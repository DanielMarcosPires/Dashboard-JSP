<%-- 
    Document   : register
    Created on : 5 de nov. de 2025, 07:59:43
    Author     : DanielMarcos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./css/style.css?=v=2"/>
    </head>
    <body>
        <div class="container">
            <section class="section">
                <form class="form" action="RegisterServlet" method="POST">
                    <header class="header">
                        <h2 class="title">Branch Register</h2>
                        <p class="text">Regist your email and password to log in!</p>
                    </header>
                    <section class="formSection">
                        <div class="input">
                            <label for="name">Name*</label>
                            <input id="name" type="text" name="name" placeholder="What is your name?" />
                        </div>
                        <div class="input">
                            <label for="email">Email *</label>
                            <input id="email" type="email" name="email" placeholder="mail@simmmple.com" />
                        </div>
                        <div class="input">
                            <label for="password">Password*</label>
                            <input id="password" type="password" name="password" placeholder="Insert your password..." />
                        </div>
                        <label>
                            <input required type="checkbox" name="acceptTerms" value="ON" />
                            Accept terms of use.
                        </label>
                        <button class="button">Register</button>
                    </section>
                </form>
            </section>
            <section class="section">
                <img src="./images/lamp.png" alt="alt"/>
                <h2 class="title">Projeto Dashboard <br/>com JSP</h2> 
            </section>
        </div>
    </body>
</html>
