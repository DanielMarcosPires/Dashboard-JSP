<%-- 
    Document   : index
    Created on : 30 de out. de 2025, 20:25:26
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
                <form class="form" action="LoginServlet" method="POST">
                    <header class="header">
                        <h2 class="title">Branch Login</h2>
                        <p class="text">Enter your email and password to log in!</p>
                    </header>
                    <section class="formSection">
                        <div class="input">
                            <label for="branch">Branch*</label>
                            <select id="branch" class="select" name="branch">
                                <option>Select your Branch</option>
                                <option>Main</option>
                                <option>Develop</option>
                            </select>
                        </div>
                        <div class="input">
                            <label for="email">Email*</label>
                            <input required id="email" type="email" name="email" placeholder="mail@simmple.com" />
                        </div>
                        <div class="input">
                            <label for="password">Password*</label>
                            <input min="8" required id="password" type="password" name="password" placeholder="Min. 8 characters" />
                        </div>
                        <a href="./register.jsp">Forget password?</a>
                        <label>
                            <input required type="checkbox" name="logged" value="ON" />
                            Keep me logged in
                        </label>

                        <% if (request.getAttribute("loginError") != null) {%>
                        <p style="color:red;"><%= request.getAttribute("loginError")%></p>
                        <% }%>

                        <button type="submit" class="button">Login</button>
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
