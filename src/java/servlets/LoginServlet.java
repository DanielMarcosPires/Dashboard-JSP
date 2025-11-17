/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import model.Login;

/**
 *
 * @author DanielMarcos
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpSession session = request.getSession();
//        String email = request.getParameter("email");
//        String password = request.getParameter("password");
//
//        String emailRegistred = (String) session.getAttribute("emailRegistred");
//        String passwordRegistred = (String) session.getAttribute("passwordRegistred");
//        String nameRegistred = (String) session.getAttribute("nameRegistred");
//
//        System.out.println("Senha: " + passwordRegistred);
//
//        boolean auth = emailRegistred == email && passwordRegistred == password;
//        if (auth) {
//
//            // envia o objeto login para o JSP
//            request.setAttribute("user", login);
//            request.getRequestDispatcher("dashboard.jsp").forward(request, response);
//        } else {
//            String loginError = "Email ou senha incorretos!";
//            request.setAttribute("loginError", loginError);
//
//            request.getRequestDispatcher("index.jsp").forward(request, response);
//        };
    }
}
