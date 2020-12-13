package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NhanVienXemLichLamViec_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>EdenHallNhanVien</title>\n");
      out.write("\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("            <nav class=\"navbar navbar-inverse\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"\" style=\"padding-left: 50px;\">Trang chủ</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"\">Xem thống kê</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a style=\" padding-top: 15px; color: white; font-weight: bold; font-size: 16px;\">Xem Lịch</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"\">Đăng kí lịch</a>\n");
      out.write("                    </li>    \n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3\">\n");
      out.write("                <img src=\"Logo.png\" style=\"width: 320px; height: 320px;\" >\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-xs-9 col-sm-9 col-md-9 col-lg-9\">\n");
      out.write("                \n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                      <div class=\"panel-heading\">\n");
      out.write("                            <h3 class=\"panel-title\">Lịch làm việc tháng</h3>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"panel-body\">\n");
      out.write("                            \n");
      out.write("                            <table class=\"table table-striped table-hover\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Thứ 2</th>\n");
      out.write("                                        <th>Thứ 3</th>\n");
      out.write("                                        <th>Thứ 4</th>\n");
      out.write("                                        <th>Thứ 5</th>\n");
      out.write("                                        <th>Thứ 6</th>\n");
      out.write("                                        <th>Thứ 7</th>\n");
      out.write("                                        <th>Chủ nhật</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>1</td>\n");
      out.write("                                        <th>1</th>\n");
      out.write("                                        <th>1</th>\n");
      out.write("                                        <th>1</th>\n");
      out.write("                                        <th>1</th>\n");
      out.write("                                        <th>1</th>\n");
      out.write("                                        <th>1</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>1</td>\n");
      out.write("                                        <th>1</th>\n");
      out.write("                                        <th>1</th>\n");
      out.write("                                        <th>1</th>\n");
      out.write("                                        <th>1</th>\n");
      out.write("                                        <th>1</th>\n");
      out.write("                                        <th>1</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                            \n");
      out.write("                      </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
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
