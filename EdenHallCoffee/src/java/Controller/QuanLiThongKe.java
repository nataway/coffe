/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Data.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Custom
 */
public class QuanLiThongKe extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String startDate = req.getParameter("startYear")+"-"+req.getParameter("startMonth")+"-"+req.getParameter("startDay");
        req.setAttribute("startDate", startDate);
        String endDate = req.getParameter("endYear")+"-"+req.getParameter("endMonth")+"-"+req.getParameter("endDay");
        req.setAttribute("endDate", endDate);
        String id = req.getParameter("id");
        String type = req.getParameter("type");
        String url = "";
        RequestDispatcher dis;
        switch(type){
            case "1":
                url = "/QuanLiThongKeNhanVienTheoSoLanPhucVu.jsp?id="+id;
                dis = getServletContext().getRequestDispatcher(url);
                dis.forward(req, resp);
                break;
            case "2":
                url = "/QuanLiThongKeNhanVienTheoDoanhThu.jsp?id="+id;
                dis = getServletContext().getRequestDispatcher(url);
                dis.forward(req, resp);
                break;
            case "3":
                url = "/QuanLiThongKeSanPhamTheoSoLuong.jsp?id="+id;
                dis = getServletContext().getRequestDispatcher(url);
                dis.forward(req, resp);
                break;
            case "4":
                url = "/QuanLiThongKeSanPhamTheoDoanhThu.jsp?id="+id;
                dis = getServletContext().getRequestDispatcher(url);
                dis.forward(req, resp);
                break;
        }
    }
    
}
