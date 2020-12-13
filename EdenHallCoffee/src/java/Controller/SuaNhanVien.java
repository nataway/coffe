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

/**
 *
 * @author Custom
 */
public class SuaNhanVien extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("idNV"));
        String ten = req.getParameter("ten");
        String gioiTinh = req.getParameter("gioiTinh");
        String diaChi = req.getParameter("diaChi");
        String soDienThoai = req.getParameter("soDienThoai");
        String tenDangNhap = req.getParameter("tenDangNhap");
        String matKhau = req.getParameter("matKhau");
        ThanhVien client = new ThanhVien();
        client.setId(id);
        client.setTen(ten);
        client.setGioiTinh(gioiTinh);
        client.setDiaChi(diaChi);
        client.setSoDienThoai(soDienThoai);
        client.setTenDangNhap(tenDangNhap);
        client.setMatKhau(matKhau);
        try {
            DAO.suaNhanVien(client);
        } catch (Exception ex) {
            Logger.getLogger(AddKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String url = "/QuanLiNhanVien.jsp?";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(req, resp);
    }
    
}
