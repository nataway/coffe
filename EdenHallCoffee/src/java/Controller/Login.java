/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Data.DAO;
import Entity.ThanhVien;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nguyen Tien Thuat
 */
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");
        ThanhVien client = DAO.checkThanhVien(user, pass);
        String mes = "";
        
        
        
        if(client.getViTri()==3){
            
            HttpSession session = req.getSession();
            session.setAttribute("tv", client);
            String url = "/index.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(req, resp);
        }
        else if(client.getViTri()==1){ 
                HttpSession session = req.getSession();
                session.setAttribute("tv", client);
                String url = "/QuanLiHome.jsp";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
                dispatcher.forward(req, resp);
            }
        else if(client.getViTri()==2){
                HttpSession session = req.getSession();
                session.setAttribute("tv", client);
                String url = "/NhanVienHome.jsp";
                RequestDispatcher dis = getServletContext().getRequestDispatcher(url);
                dis.forward(req, resp);
            }
        else{
            mes = "You have entered the wrong information! Please enter again.";
            String url = "/Login.jsp?mes="+mes;
            RequestDispatcher dis = getServletContext().getRequestDispatcher(url);
            dis.forward(req, resp);
        }
             
    }

    
}
