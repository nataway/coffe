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
public class ThemSanPhamVaoMenu extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        int price = Integer.parseInt(req.getParameter("price"));
        String url = req.getParameter("url");
        String type = req.getParameter("type");
        
        SanPham sp = new SanPham();
        sp.setName(name);
        sp.setPrice(price);
        sp.setType(type);
        sp.setUrl(url);
        
        DAO.themSanPhamVaoMenu(sp);
        
        String urlPage = "/QuanLiSanPham.jsp";
        RequestDispatcher dis = getServletContext().getRequestDispatcher(urlPage);
        dis.forward(req, resp);
    }
    
}
