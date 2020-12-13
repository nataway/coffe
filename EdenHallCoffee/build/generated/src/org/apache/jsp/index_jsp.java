package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entity.ChiTietHoaDon;
import Entity.HoaDon;
import Entity.ThanhVien;
import java.util.ArrayList;
import Entity.SanPham;
import Data.DAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Customer</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            #noidung{\n");
      out.write("                height: 550px;\n");
      out.write("                overflow: auto;\n");
      out.write("                background-color: #B4EEB4;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        ");

            String mes = "";
            
            ThanhVien tv = (ThanhVien)session.getAttribute("tv");
            if(tv == null){
                tv = new ThanhVien();
                tv.setId(0);
            }
            
            ArrayList<ChiTietHoaDon> gioHang = (ArrayList<ChiTietHoaDon>) session.getAttribute("gioHang");
            if(gioHang == null){
                gioHang = new ArrayList<ChiTietHoaDon>();
            }
        
      out.write("\n");
      out.write("        <div class=\"row\" style=\"background-color: #B4EEB4;\">\n");
      out.write("            \n");
      out.write("            <nav class=\"navbar navbar-default\" role=\"navigation\" style=\"background-color: #FFD700\">\n");
      out.write("                \n");
      out.write("                <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"\">Trang chủ</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <form class=\"navbar-form navbar-left\" role=\"search\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\">Tìm kiếm</button>\n");
      out.write("                    </form>\n");
      out.write("                    \n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"http://localhost:8080/EdenHallCoffee/Login.jsp?mes=");
      out.print( mes );
      out.write("\">\n");
      out.write("                                <img src=\"acc1.png\" style=\"width: 25px; height: 25px;\"/>\n");
      out.write("                                Đăng nhập\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><img src=\"giohang1.png\" style=\"width: 30px; height: 20px;\"/></a></li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Loại mặt hàng<b class=\"caret\"></b></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"http://localhost:8080/EdenHallCoffee/KhachHangOrderCafe.jsp?id=0\">Cà phê</a></li>\n");
      out.write("                                <li><a href=\"http://localhost:8080/EdenHallCoffee/KhachHangOrderBanhNgot.jsp?id=0\">Bánh ngọt</a></li>\n");
      out.write("                                <li><a href=\"http://localhost:8080/EdenHallCoffee/KhachHangOrderCockTail.jsp?id=0\">Cocktail</a></li>\n");
      out.write("                                <li><a href=\"http://localhost:8080/EdenHallCoffee/KhachHangOrderNuocEp.jsp?id=0\">Nước ép</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div><!-- /.navbar-collapse -->\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("            <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3\" style=\"height:550px; border-right: 2px solid black;\">\n");
      out.write("                <img src=\"coffeebeans.png\" style=\"width: 335px;\">\n");
      out.write("                <img src=\"Logo.png\" style=\"width: 320px; height: 320px;\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-xs-9 col-sm-9 col-md-9 col-lg-9\" id=\"noidung\">\n");
      out.write("                ");

                    ArrayList<SanPham> list = DAO.getAllSanPham(); 
                   
                        for( SanPham i : list) {
                
      out.write("\n");
      out.write("                \n");
      out.write("                    <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3\">\n");
      out.write("                        <form action=\"ThemSanPhamVaoGioHang\" method=\"post\">\n");
      out.write("                            <div class=\"thumbnail\">\n");
      out.write("                                <img src=\"");
      out.print( i.getUrl() );
      out.write("\" alt=\"\">\n");
      out.write("                                <div class=\"caption\">\n");
      out.write("                                    <h3>");
      out.print( i.getName() );
      out.write("</h3>\n");
      out.write("                                    <p>\n");
      out.write("                                        ");
      out.print( i.getPrice() );
      out.write(" VNĐ\n");
      out.write("                                    </p>\n");
      out.write("                                    <p>\n");
      out.write("                                        <label>Số lượng</label>\n");
      out.write("                                        <input type=\"number\" class=\"form-control\" name=\"soLuong\" placeholder=\"0\" style=\"width: 30%\"/>\n");
      out.write("                                        <input type=\"hidden\" name=\"idSanPham\" value=\"");
      out.print( i.getId() );
      out.write("\"/>\n");
      out.write("                                        <input type=\"hidden\" name=\"idKhachHang\" value=\"");
      out.print( tv.getId() );
      out.write("\"/>\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary\">Thêm vào giỏ hàng</button>\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>            \n");
      out.write("                ");

                        }    
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
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
