/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlets;

import com.sun.jdi.connect.spi.Connection;
import database.DBConnection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import model.Login;

/**
 *
 * @author DanielMarcos
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String termsUse = request.getParameter("acceptTerms");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        System.out.println("Entrada de dados: \n" + request);
        System.out.println("************Login Registrado no Banco!***************");

        if (termsUse.contains("ON")) {
            Login login = new Login(name, email, password);
            DBConnection dbCon = new DBConnection(
                    "jdbc:postgresql://localhost:5432/UsersRegister",
                    "postgres",
                    "1234"
            );

            try {
                dbCon.getData();
            } catch (SQLException ex) {
                System.getLogger(RegisterServlet.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            } catch (ClassNotFoundException ex) {
                System.getLogger(RegisterServlet.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
    }
}
