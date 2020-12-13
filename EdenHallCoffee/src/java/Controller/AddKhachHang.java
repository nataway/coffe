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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nguyen Tien Thuat
 */
public class AddKhachHang extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
        String ten = req.getParameter("ten");
        String gioiTinh = req.getParameter("gioiTinh");
        String diaChi = req.getParameter("diaChi");
        String soDienThoai = req.getParameter("soDienThoai");
        String tenDangNhap = req.getParameter("tenDangNhap");
        String matKhau = req.getParameter("matKhau");
        
        ThanhVien client = new ThanhVien(ten, gioiTinh, diaChi, soDienThoai, tenDangNhap, matKhau, 3);
        
        try {
            DAO.addKhachHang(client);
        } catch (Exception ex) {
            Logger.getLogger(AddKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        ThanhVien tv = DAO.searchThanhVienBySDT(soDienThoai);
        HttpSession session = req.getSession();
        session.setAttribute("tv", tv);
        String url = "/index.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(req, resp);
    }
}
