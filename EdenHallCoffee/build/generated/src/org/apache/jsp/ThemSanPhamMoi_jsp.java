package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ThemSanPhamMoi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Admin</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            #noidung{\n");
      out.write("                height: 550px;\n");
      out.write("                overflow: auto;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("            <nav class=\"navbar navbar-inverse\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"http://localhost:8080/EdenHallCoffee/QuanLiHome.jsp\" style=\"padding-left: 50px;\">Trang chủ</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li style=\"padding-top: 15px; color: white;font-size: 16px;\">\n");
      out.write("                        Quản lí kho\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"http://localhost:8080/EdenHallCoffee/QuanLiNhanVien.jsp\">Quản lí nhân viên</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"http://localhost:8080/EdenHallCoffee/QuanLiThongKe.jsp\">Thống kê</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3\" style=\"height: 550px;\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <form class=\"navbar-form navbar-left\" role=\"search\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Nguyen Tien Thuat\">\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\">Search</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" style=\"font-size: 18px; font-family: 'Times New Roman';\">Sản phẩm<b class=\"caret\"></b></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"http://localhost:8080/EdenHallCoffee/QuanLiXemSanPham.jsp\" style=\"font-size: 16px; font-family: 'Times New Roman';\">Xem sản phẩm</a></li>\n");
      out.write("                            <li><a href=\"#\" style=\"font-size: 16px; font-family: 'Times New Roman';\">Thêm sản phẩm mới</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </div>\n");
      out.write("                <img src=\"Logo.png\" style=\"width: 320px; height: 320px;\" >\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div id=\"noidung\" class=\"col-xs-9 col-sm-9 col-md-9 col-lg-9\" >\n");
      out.write("                <div class=\"col-xs-6 col-sm-6 col-md-6 col-lg-6\" >\n");
      out.write("                    <form action=\"ThemSanPhamVaoMenu\" method=\"post\" role=\"form\" style=\"padding-top: 20px;\">\n");
      out.write("                        <legend style=\"color: rgb(255, 81, 0)\">New Product</legend>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"\" >Tên sản phẩm</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"name\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"\" >Giá sản phẩm</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"price\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"\" >Kiểu</label>\n");
      out.write("                            <select name=\"type\" id=\"input\" class=\"form-control\" required>\n");
      out.write("                                <option value=\"cafe\">Cafe</option>\n");
      out.write("                                <option value=\"banhngot\">Bánh Ngọt</option>\n");
      out.write("                                <option value=\"cocktail\">Cocktail</option>\n");
      out.write("                                <option value=\"nuocep\">Nước ép</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"hidden\" id=\"src\" value=\"\" name=\"url\"/>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\" >Add Product</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-6 col-sm-6 col-md-6 col-lg-6\" >\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Hình ảnh</label>\n");
      out.write("                        <input type=\"file\" id=\"file\" onchange=\"show()\" required/>\n");
      out.write("                            <div class=\"thumbnail\" style=\"width: 300px; height: 300px;\">\n");
      out.write("                                <img id = \"hinhanh\" alt=\"\"/>\n");
      out.write("                            </div>        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function show(){\n");
      out.write("                var ima = document.getElementById(\"file\").value;\n");
      out.write("                var path = ima.substring(12,ima.length);\n");
      out.write("                document.getElementById(\"hinhanh\").src = path;\n");
      out.write("                document.getElementById(\"src\").value = path;\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
