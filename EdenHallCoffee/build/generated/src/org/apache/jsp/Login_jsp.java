package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>EdenHall home</title>\n");
      out.write("        \n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.3/html5shiv.js\"></script>\n");
      out.write("            <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        ");

            String mes = request.getParameter("mes");
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-5 col-sm-5 col-md-5 col-lg-5\">\n");
      out.write("                <img src=\"Logo.png\" width=\"500px\" height=\"500px\"/>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-xs-5 col-sm-5 col-md-5 col-lg-5\" style=\"padding-top: 120px \">\n");
      out.write("                <form action=\"Login\" method=\"post\" role=\"form\">\n");
      out.write("                    <legend style=\"font-size: 40px\">Welcome to EdenHall!</legend>\n");
      out.write("                \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label >UserName</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"SunChinsusu@gmail.com\" name=\"user\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label >PassWord</label>\n");
      out.write("                        <input type=\"password\" class=\"form-control\" placeholder=\"12345678\" name=\"pass\">\n");
      out.write("                        \n");
      out.write("<!--                        Cảnh báo nhập sai tài khoản-->\n");
      out.write("                        ");

                            if(mes.length()!=0){
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-warning\">\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                            <strong>Sorry </strong> ");
      out.print( mes );
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Login</button>\n");
      out.write("                </form>\n");
      out.write("                <a href=\"#\">Quên mật khẩu?</a>\n");
      out.write("                <a href=\"http://localhost:8080/EdenHallCoffee/FormDienThongTinKhachHang.jsp\" target=\"_top\">Tạo tài khoản mới.</a>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html\n");
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
