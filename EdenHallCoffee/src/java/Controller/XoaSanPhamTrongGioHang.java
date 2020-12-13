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
public class XoaSanPhamTrongGioHang extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        ArrayList<ChiTietHoaDon> gioHang = (ArrayList<ChiTietHoaDon>) session.getAttribute("gioHang");
        int idSanPham = Integer.parseInt(req.getParameter("idSanPham"));
        ChiTietHoaDon sanPhamXoa = null;
        for(ChiTietHoaDon cthd : gioHang){
            if(cthd.getIdSanPham() == idSanPham) sanPhamXoa = cthd;
        }    
        gioHang.remove(sanPhamXoa);
        String url = "/GioHang.jsp";
        RequestDispatcher dis = getServletContext().getRequestDispatcher(url);
        dis.forward(req, resp);
    }
    
}
