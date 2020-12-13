package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Data.DAO;
import java.util.ArrayList;
import Entity.ThanhVien;

public final class QuanLiNhanVien_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>EdenHall QL nhân viên</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.3/html5shiv.js\"></script>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("            <nav class=\"navbar navbar-inverse\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"http://localhost:8080/EdenHallCoffee/QuanLiHome.jsp\" style=\"padding-left: 50px;\">Trang chủ</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"http://localhost:8080/EdenHallCoffee/QuanLiKho.jsp\">Quản lí Kho</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li style=\"font-family: 'Times New Roman', Times, serif; padding-top: 10px; color: white; font-weight: bold; font-size: 20px;\">\n");
      out.write("                        Quản lí nhân viên\n");
      out.write("                    </li>    \n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3\" style=\"height: 700px; border: 2px solid dimgray\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <form class=\"navbar-form navbar-left\" role=\"search\" action=\"SearchNVByName\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Nguyen Tien Thuat\" name=\"ten\">\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\">Search</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\"><li><a href=\"http://localhost:8080/EdenHallCoffee/FormDienThongTinNhanVien.jsp\" style=\"font-size: 18px; font-family: 'Times New Roman';\">Thêm nhân viên</a></li></div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" style=\"font-size: 18px; font-family: 'Times New Roman';\">Thống kê<b class=\"caret\"></b></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#\" style=\"font-size: 16px; font-family: 'Times New Roman';\">Thống kê theo doanh số</a></li>\n");
      out.write("                            <li><a href=\"#\" style=\"font-size: 16px; font-family: 'Times New Roman';\">Thống kê theo số lần phục vụ</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <img src=\"Logo.png\" style=\"width: 320px; height: 320px;\" >\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-xs-9 col-sm-9 col-md-9 col-lg-9\" style=\"height: 700px; border: 2px solid dimgray;\">\n");
      out.write("                ");

                    ArrayList<ThanhVien> list = DAO.getAllThanhVien();
                
      out.write("\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <!-- Default panel contents -->\n");
      out.write("                    <div class=\"panel-heading\">Danh sách nhân viên</div>\n");
      out.write("                        <!-- Table -->\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>STT</th>\n");
      out.write("                                    <th>Tên nhân viên</th>\n");
      out.write("                                    <th>Giới tính</th>\n");
      out.write("                                    <th>Địa chỉ</th>\n");
      out.write("                                    <th>Số điện thoại</th>\n");
      out.write("                                    <th>Vị trí</th>\n");
      out.write("                                    <th></th>\n");
      out.write("                                    <th></th>\n");
      out.write("                                    <th></th>\n");
      out.write("                                    <th></th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");

                                    int stt = 1;
                                    for(ThanhVien tv : list){
                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>");
      out.print( stt );
      out.write("</th>\n");
      out.write("                                    <th>");
      out.print( tv.getTen() );
      out.write("</th>\n");
      out.write("                                    <th>");
      out.print( tv.getGioiTinh() );
      out.write("</th>\n");
      out.write("                                    <th>");
      out.print( tv.getDiaChi() );
      out.write("</th>\n");
      out.write("                                    <th>");
      out.print( tv.getSoDienThoai() );
      out.write("</th>\n");
      out.write("                                    <th>");
      out.print( tv.getViTri() );
      out.write("</th>\n");
      out.write("                                    <th>\n");
      out.write("                                        <form><button type=\"button\" class=\"btn btn-primary\">Edit</button></form>\n");
      out.write("                                    </th>\n");
      out.write("                                    <th>\n");
      out.write("                                        <form action=\"XoaThanhVien\" method=\"post\"><button type=\"button\" class=\"btn btn-danger\">Delete</button></form>\n");
      out.write("                                    </th>\n");
      out.write("                                    <th>\n");
      out.write("                                        <form><button type=\"button\" class=\"btn btn-large btn-block btn-warning\">Chấm công</button></form>\n");
      out.write("                                    </th>\n");
      out.write("                                    <th>\n");
      out.write("                                        <form><button type=\"button\" class=\"btn btn-success\">Trả lương</button></form>\n");
      out.write("                                    </th>\n");
      out.write("                                </tr>\n");
      out.write("                                ");

                                    stt++;
                                    }
                                
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
