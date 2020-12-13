/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Data.DAO;
import Entity.LichLamViec;
import Entity.ThanhVien;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Nguyen Tien Thuat
 */
public class DangKiLichLamViec extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        ThanhVien nv = DAO.searchThanhVienById(id);
        String list[] = req.getParameterValues("check");
        
        
        
        for(String s : list){
            
            Calendar cal0 = Calendar.getInstance();        
            cal0.set(Calendar.MONTH, Calendar.OCTOBER);
            cal0.set(Calendar.DATE, 14);
            cal0.set(Calendar.YEAR, 2019);
            java.util.Date date0 = cal0.getTime();

            Calendar cal = Calendar.getInstance();
            java.util.Date date = cal.getTime();

            long hieu = (date.getTime()-date0.getTime())/ (24 * 3600 * 1000)%7;

            Calendar cal1 = Calendar.getInstance();
            cal1.add(Calendar.DATE, (int)(7-hieu));

            Date ngay;
            
            LichLamViec lich = new LichLamViec();
            lich.setIdNhanVien(nv.getId());
            lich.setTenNhanVien(nv.getTen());
            switch(s){
                case "t2s":
                    ngay = new Date(cal1.getTime().getTime());
                    lich.setNgay(ngay);
                    lich.setCaLamViec(1);
                    break;
                case "t2c":
                    ngay = new Date(cal1.getTime().getTime());
                    lich.setNgay(ngay);
                    lich.setCaLamViec(2);
                    break;
                case "t3s":
                    cal1.add(Calendar.DAY_OF_MONTH, 1);
                    ngay = new Date(cal1.getTime().getTime());
                    lich.setNgay(ngay);
                    lich.setCaLamViec(1);
                    break;
                case "t3c":
                    cal1.add(Calendar.DAY_OF_MONTH, 1);
                    ngay = new Date(cal1.getTime().getTime());
                    lich.setNgay(ngay);
                    lich.setCaLamViec(2);
                    break;
                case "t4s":
                    cal1.add(Calendar.DAY_OF_MONTH, 2);
                    ngay = new Date(cal1.getTime().getTime());
                    lich.setNgay(ngay);
                    lich.setCaLamViec(1);
                    break;
                case "t4c":
                    cal1.add(Calendar.DAY_OF_MONTH, 2);
                    ngay = new Date(cal1.getTime().getTime());
                    lich.setNgay(ngay);
                    lich.setCaLamViec(2);
                    break;
                case "t5s":
                    cal1.add(Calendar.DAY_OF_MONTH, 3);
                    ngay = new Date(cal1.getTime().getTime());
                    lich.setNgay(ngay);
                    lich.setCaLamViec(1);
                    break;
                case "t5c":
                    cal1.add(Calendar.DAY_OF_MONTH, 3);
                    ngay = new Date(cal1.getTime().getTime());
                    lich.setNgay(ngay);
                    lich.setCaLamViec(2);
                    break;
                case "t6s":
                    cal1.add(Calendar.DAY_OF_MONTH, 4);
                    ngay = new Date(cal1.getTime().getTime());
                    lich.setNgay(ngay);
                    lich.setCaLamViec(1);
                    break;
                case "t6c":
                    cal1.add(Calendar.DAY_OF_MONTH, 4);
                    ngay = new Date(cal1.getTime().getTime());
                    lich.setNgay(ngay);
                    lich.setCaLamViec(2);
                    break;
                case "t7s":
                    cal1.add(Calendar.DAY_OF_MONTH, 5);
                    ngay = new Date(cal1.getTime().getTime());
                    lich.setNgay(ngay);
                    lich.setCaLamViec(1);
                    break;  
                case "t7c":
                    cal1.add(Calendar.DAY_OF_MONTH, 5);
                    ngay = new Date(cal1.getTime().getTime());
                    lich.setNgay(ngay);
                    lich.setCaLamViec(2);
                    break;   
                case "cns":
                    cal1.add(Calendar.DAY_OF_MONTH, 6);
                    ngay = new Date(cal1.getTime().getTime());
                    lich.setNgay(ngay);
                    lich.setCaLamViec(1);
                    break;  
                case "cnc":
                    cal1.add(Calendar.DAY_OF_MONTH, 6);
                    ngay = new Date(cal1.getTime().getTime());
                    lich.setNgay(ngay);
                    lich.setCaLamViec(2);
                    break;    
            }
            DAO.themLichLamViec(lich);
        }
        String url = "/NhanVienHome.jsp";
        RequestDispatcher dis = getServletContext().getRequestDispatcher(url);
        dis.forward(req, resp);
    }
}
    
