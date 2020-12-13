/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Data.DAO;
import Entity.ChiTietHoaDon;
import Entity.HoaDon;
import Entity.SanPham;
import Entity.ThanhVien;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
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
public class DatHang extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Calendar cal = Calendar.getInstance();
        java.sql.Date ngay = new java.sql.Date(cal.getTime().getTime());
        
        HttpSession session = req.getSession();
        ThanhVien kh = (ThanhVien) session.getAttribute("tv");
        ArrayList<ChiTietHoaDon> gioHang = (ArrayList<ChiTietHoaDon>) session.getAttribute("gioHang");
        
        if(kh.getId()==0) try {
            kh.setTen(req.getParameter("ten"));
            kh.setDiaChi(req.getParameter("diaChi"));
            kh.setSoDienThoai(req.getParameter("soDienThoai"));
            kh.setTenDangNhap(req.getParameter("email"));
            DAO.addKhachHang(kh);
            kh.setId(DAO.searchThanhVienBySDT(kh.getSoDienThoai()).getId());
        } catch (Exception ex) {
            Logger.getLogger(DatHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
                
        int tongTien = 0;
        for(ChiTietHoaDon cthd : gioHang){
            SanPham sp = DAO.getSanPhamById(cthd.getIdSanPham());
            tongTien += sp.getPrice()*cthd.getSoLuong();
        }
        
        HoaDon hd = new HoaDon();
        hd.setIdKhachHang(DAO.searchThanhVienBySDT(kh.getSoDienThoai()).getId());
        hd.setIdNhanVien(-1);
        hd.setNgay(ngay);
        hd.setTongTien(tongTien);
        hd.setTrangThai("ChuaThanhToan");
        int idHoaDon = DAO.themHoaDon(hd);
        
        for(ChiTietHoaDon cthd : gioHang){
            cthd.setIdHoaDon(idHoaDon);
            DAO.themChiTietHoaDon(cthd);
        }
        
        gioHang.clear();
        
        String url = "/GioHang.jsp?";
        RequestDispatcher dis = getServletContext().getRequestDispatcher(url);
        dis.forward(req, resp);
    }
    
}
