/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.ChiTietHoaDon;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Custom
 */
public class ThemSanPhamVaoGioHang extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int soLuong = Integer.parseInt(req.getParameter("soLuong"));
        int idSanPham = Integer.parseInt(req.getParameter("idSanPham"));

        ChiTietHoaDon cthd = new ChiTietHoaDon();
        cthd.setIdSanPham(idSanPham);
        cthd.setSoLuong(soLuong);

        HttpSession session = req.getSession();
        ArrayList<ChiTietHoaDon> gioHang = (ArrayList<ChiTietHoaDon>)session.getAttribute("gioHang");

        boolean isExist = false;
        for(ChiTietHoaDon sp : gioHang){
            if(sp.getIdSanPham() == cthd.getIdSanPham()){
                sp.setSoLuong(soLuong+sp.getSoLuong());
                isExist = true;
            }
        }
        if(isExist == false) gioHang.add(cthd);
        String url = "/GioHang.jsp";
        RequestDispatcher dis = getServletContext().getRequestDispatcher(url);
        dis.forward(req, resp);
    } 
    
}
