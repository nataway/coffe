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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nguyen Tien Thuat
 */
public class XoaThanhVien extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id1 = Integer.parseInt(req.getParameter("idNV"));
        DAO.XoaThanhVien(id1);
        String url = "/QuanLiNhanVien.jsp";
        RequestDispatcher dis = getServletContext().getRequestDispatcher(url);
        dis.forward(req, resp);
    }
    
}
