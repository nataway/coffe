/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Data.DAO;
import Entity.SanPham;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Custom
 */
public class SuaSanPham extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int idSP = Integer.parseInt(req.getParameter("idSP"));
        String name = req.getParameter("name");
        int price = Integer.parseInt(req.getParameter("price"));
        String type = req.getParameter("type");
        String url = req.getParameter("url");
        
        SanPham sp = new SanPham();
        sp.setId(idSP);
        sp.setName(name);
        sp.setPrice(price);
        sp.setUrl(url);
        sp.setType(type);
        
        DAO.suaSanPham(sp);
        
        String urlPage = "/QuanLiXemSanPham.jsp";
        RequestDispatcher dis = getServletContext().getRequestDispatcher(urlPage);
        dis.forward(req, resp);
    }
    
}
