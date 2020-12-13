package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"col-xs-4 col-sm-4 col-md-4 col-lg-4\">\n");
      out.write("    <form action=\"\" method=\"POST\" role=\"form\">\n");
      out.write("        <legend>Contact with us</legend>\n");
      out.write("        <i class=\"fa fa-map-marker\" style=\"width:30px\"></i> Hanoi, VN<br>\n");
      out.write("        <i class=\"fa fa-phone\" style=\"width:30px\"></i> Phone: +98 969 344 172<br>\n");
      out.write("        <i class=\"fa fa-envelope\" style=\"width:30px\"> </i> Email: tienthuat280798@mail.com<br/><br/>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-6 col-sm-6 col-md-6 col-lg-6\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"\" placeholder=\"Name\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-6 col-sm-6 col-md-6 col-lg-6\">\n");
      out.write("                <input type=\"email\" class=\"form-control\" id=\"\" placeholder=\"Email\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br/>\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"\" placeholder=\"Message\" style=\"height: 10em;\">\n");
      out.write("        <br/>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">Send</button>\n");
      out.write("    </form>    \n");
      out.write("</div>\n");
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
