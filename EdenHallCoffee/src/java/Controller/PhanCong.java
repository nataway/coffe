/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Data.DAO;
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
public class PhanCong extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int idHoaDon = Integer.parseInt(req.getParameter("idDonHang"));
        int idNhanVien = Integer.parseInt(req.getParameter("idNhanVien"));
        DAO.phanCong(idHoaDon, idNhanVien);
        
        String url = "/QuanLiDonHang.jsp";
        RequestDispatcher dis = getServletContext().getRequestDispatcher(url);
        dis.forward(req, resp);
    }
}
