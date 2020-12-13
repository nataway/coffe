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
public class DoiMatKhau extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        ThanhVien tv = DAO.searchThanhVienById(id);
        String matKhauCu = req.getParameter("matKhauCu");
        String matKhauMoi = req.getParameter("matKhauMoi");
        String lapMatKhauMoi = req.getParameter("lapMatKhauMoi");
        String mes;
        String url;
        HttpSession session = req.getSession();
        if((tv.getMatKhau().equals(matKhauCu)==true) && (matKhauMoi.equals(lapMatKhauMoi)==true)){
            mes = "Your password is changed!";
            session.setAttribute("mes", mes);
            if(tv.getViTri()==1){
                url = "/QuanLiHome.jsp";
                RequestDispatcher dis = getServletContext().getRequestDispatcher(url);
                dis.forward(req, resp);
            }
            else{
                if(tv.getViTri()==2){
                    url = "/NhanVienHome.jsp";
                    RequestDispatcher dis = getServletContext().getRequestDispatcher(url);
                    dis.forward(req, resp);
                }
                else{
                    url = "/ThongTinCaNhan.jsp";
                    RequestDispatcher dis = getServletContext().getRequestDispatcher(url);
                    dis.forward(req, resp);
                }
            }
        }
        else{
            mes = "Wrong!";
            session.setAttribute("mes", mes);
            if(tv.getViTri()==1){
                url = "/QuanLiHome.jsp";
                RequestDispatcher dis = getServletContext().getRequestDispatcher(url);
                dis.forward(req, resp);
            }
            else{
                if(tv.getViTri()==2){
                    url = "/NhanVienHome.jsp";
                    RequestDispatcher dis = getServletContext().getRequestDispatcher(url);
                    dis.forward(req, resp);
                }
                else{
                    url = "/ThongTinCaNhan.jsp";
                    RequestDispatcher dis = getServletContext().getRequestDispatcher(url);
                    dis.forward(req, resp);
                }
            }
        }
    }
    
}
