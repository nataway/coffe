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
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.mail.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Custom
 */
public class QuenMatKhau extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String emailMember = req.getParameter("email");
        ThanhVien tv = DAO.searchThanhVienByEmail(emailMember);
        String tb="";
        if(tv.getTenDangNhap()==null){
            tb = "You have entered the wrong email";
            String url = "/LayLaiMatKhau.jsp?mes1="+tb;
            RequestDispatcher dis = getServletContext().getRequestDispatcher(url);
            dis.forward(req, resp);
        }
        else{
            Random rd = new Random();
            String newPass ="" + (rd.nextInt(10000000) - rd.nextInt(1000000));
            String noiDung = "Your new PassWord for EdenHall is: "+newPass;
            
            GuiEmail sender = new GuiEmail(emailMember);
            try {
                sender.send(noiDung);
            } catch (MessagingException ex) {
                Logger.getLogger(QuenMatKhau.class.getName()).log(Level.SEVERE, null, ex);
            }
            DAO.doiPass(tv, newPass);
            tb = "New password has been sent to your email";
            String url = "/Login.jsp?mes="+tb;
            RequestDispatcher dis = getServletContext().getRequestDispatcher(url);
            dis.forward(req, resp);
        }
        
    }
    
}
