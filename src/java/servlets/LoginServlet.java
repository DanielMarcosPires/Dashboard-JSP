/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlets;

import Classes.User;
import database.DBConnection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author DanielMarcos
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
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
//        bool  ean auth = emailRegistred == email && passwordRegistred == password;
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

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        DBConnection connection = new DBConnection();
        try {
            List<User> users = connection.getData();
            User loggedUser = null;

            for (User u : users) {
                System.out.println(u.getEmail());

                if (u.getEmail().equals(email)) {
                    if (u.getPassword().equals(password)) {
                        loggedUser = u;
                    }
                    break;
                }
            }

            if (loggedUser != null) {
                // LOGIN CORRETO
                System.out.println("Login autorizado: " + loggedUser.getName());

                // enviar o dado para o JSP
                request.setAttribute("user", loggedUser);

                request.getRequestDispatcher("dashboard.jsp").forward(request, response);
            } else {
                // LOGIN FALHOU
                String loginError = "Email ou senha incorretos!";
                request.setAttribute("loginError", loginError);

                request.getRequestDispatcher("index.jsp").forward(request, response);
            }

        } catch (SQLException ex) {
            System.getLogger(LoginServlet.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }
}
