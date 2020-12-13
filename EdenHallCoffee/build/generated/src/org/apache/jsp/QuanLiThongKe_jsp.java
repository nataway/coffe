package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entity.ThanhVien;
import Data.DAO;

public final class QuanLiThongKe_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html lang=\"\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>EdenHall QuanLi</title>\n");
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
      out.write("        ");

            int id = Integer.parseInt(request.getParameter("id"));
            ThanhVien tv = DAO.searchThanhVienById(id);
        
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("            <nav class=\"navbar navbar-inverse\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"http://localhost:8080/EdenHallCoffee/QuanLiHome.jsp?id=");
      out.print( id );
      out.write("\" style=\"padding-left: 50px;\">Trang chủ</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"http://localhost:8080/EdenHallCoffee/QuanLiKho.jsp?id=");
      out.print( id );
      out.write("\">Quản lí kho</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"http://localhost:8080/EdenHallCoffee/QuanLiNhanVien.jsp?id=");
      out.print( id );
      out.write("\">Quản lí nhân viên</a>\n");
      out.write("                    </li>  \n");
      out.write("                    <li style=\"padding-top: 15px; color: white;font-size: 16px;\">\n");
      out.write("                        Thống kê\n");
      out.write("                    </li>  \n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3\">\n");
      out.write("                <img src=\"Logo.png\" style=\"width: 320px; height: 320px;\" >\n");
      out.write("        </div>\n");
      out.write("            <div id=\"noidung\" class=\"col-xs-9 col-sm-9 col-md-9 col-lg-9\" >\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("                        \n");
      out.write("                        <label for=\"input-id\" class=\"col-sm-2\">StartDate</label>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"input\" class=\"col-sm-2 control-label\">Ngày</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <select name=\"\" id=\"input\" class=\"form-control\">\n");
      out.write("                                    <option value=\"\">1</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"input\" class=\"col-sm-2 control-label\">Tháng</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <select name=\"\" id=\"input\" class=\"form-control\">\n");
      out.write("                                    <option value=\"\">1</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"input\" class=\"col-sm-2 control-label\">Năm</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <select name=\"\" id=\"input\" class=\"form-control\">\n");
      out.write("                                    <option value=\"\">2019</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("                        \n");
      out.write("                        <label for=\"input-id\" class=\"col-sm-2\">EndDate</label>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"input\" class=\"col-sm-2 control-label\">Ngày</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <select name=\"\" id=\"input\" class=\"form-control\">\n");
      out.write("                                    <option value=\"\">1</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"input\" class=\"col-sm-2 control-label\">Tháng</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <select name=\"\" id=\"input\" class=\"form-control\">\n");
      out.write("                                    <option value=\"\">1</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"input\" class=\"col-sm-2 control-label\">Năm</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <select name=\"\" id=\"input\" class=\"form-control\">\n");
      out.write("                                    <option value=\"\">2019</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br/>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-2 col-sm-2 col-md-2 col-lg-2\">\n");
      out.write("                        <label for=\"input-id\" class=\"col-sm-2\">Kiểu</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xs-5 col-sm-5 col-md-5 col-lg-5\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <select name=\"type\" id=\"input\" class=\"form-control\">\n");
      out.write("                                    <option value=\"1\">Thống kê nhân viên theo số lần phục vụ</option>\n");
      out.write("                                    <option value=\"2\">Thống kê nhân viên theo doanh thu</option>\n");
      out.write("                                    <option value=\"3\">Thống kê sản phẩm theo số lượng</option>\n");
      out.write("                                    <option value=\"4\">Thống kê sản phẩm theo doanh thu</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br/>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3\">\n");
      out.write("                        <form action=\"\" method=\"POST\" role=\"form\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Thống kê</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
