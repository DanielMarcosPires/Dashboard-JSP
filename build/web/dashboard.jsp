<%-- 
    Document   : dashboard
    Created on : 4 de nov. de 2025, 23:13:21
    Author     : DanielMarcos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./css/style.css"/>
    </head>
    <body>
        <div class="dashboard">
            <aside class="sidebar">
                <header class="header">
                    <img class="logo" src="./images/lamp.png" alt="NEABILLING"/>
                    <h2 class="title">NEABILLING</n2>
                </header>
            </aside>
            <div class="container">
                <header>
                    <pre><%=request.getRequestURI()%></pre>
                    <h2>Main Dashboard</h2>
                    <p>Welcome ${user.name}</p>
                </header>
            </div>
        </div>
    </body>
</html>
