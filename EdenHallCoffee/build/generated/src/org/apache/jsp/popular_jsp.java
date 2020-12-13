package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class popular_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <!-- Google Fonts -->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>\n");
      out.write("    \n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/bootstrap.min.css\">\n");
      out.write("    \n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/font-awesome.min.css\">\n");
      out.write("    \n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/owl.carousel.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/responsive.css\">\n");
      out.write("    \n");
      out.write("    <!-- Latest jQuery form server -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- Bootstrap JS form CDN -->\n");
      out.write("    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- jQuery sticky menu -->\n");
      out.write("    <script src=\"JavaScript/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"JavaScript/jquery.sticky.js\"></script>\n");
      out.write("    <!-- Main Script -->\n");
      out.write("    <script src=\"JavaScript/main.js\"></script>\n");
      out.write("    <div class=\"maincontent-area\">\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"latest-product\">\n");
      out.write("                        <h2 class=\"section-title\">Most popular</h2>\n");
      out.write("                        <div class=\"product-carousel\">\n");
      out.write("                            <div class=\"single-product\">\n");
      out.write("                                <div class=\"product-f-image\">\n");
      out.write("                                    <img src=\"Img/bacxuu.jpg\" alt=\"\">\n");
      out.write("                                    <div class=\"product-hover\">\n");
      out.write("                                        <a href=\"#\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>\n");
      out.write("                                        <a href=\"single-product.html\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <h2><a href=\"single-product.html\">Samsung Galaxy s5- 2015</a></h2>\n");
      out.write("                                \n");
      out.write("                                <div class=\"product-carousel-price\">\n");
      out.write("                                    <ins>$700.00</ins> <del>$100.00</del>\n");
      out.write("                                </div> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"single-product\">\n");
      out.write("                                <div class=\"product-f-image\">\n");
      out.write("                                    <img src=\"Img/bacxuu.jpg\" alt=\"\">\n");
      out.write("                                    <div class=\"product-hover\">\n");
      out.write("                                        <a href=\"#\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>\n");
      out.write("                                        <a href=\"single-product.html\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <h2>Nokia Lumia 1320</h2>\n");
      out.write("                                <div class=\"product-carousel-price\">\n");
      out.write("                                    <ins>$899.00</ins> <del>$999.00</del>\n");
      out.write("                                </div> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"single-product\">\n");
      out.write("                                <div class=\"product-f-image\">\n");
      out.write("                                    <img src=\"Img/bacxuu.jpg\" alt=\"\">\n");
      out.write("                                    <div class=\"product-hover\">\n");
      out.write("                                        <a href=\"#\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>\n");
      out.write("                                        <a href=\"single-product.html\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <h2>LG Leon 2015</h2>\n");
      out.write("\n");
      out.write("                                <div class=\"product-carousel-price\">\n");
      out.write("                                    <ins>$400.00</ins> <del>$425.00</del>\n");
      out.write("                                </div>                                 \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"single-product\">\n");
      out.write("                                <div class=\"product-f-image\">\n");
      out.write("                                    <img src=\"Img/bacxuu.jpg\" alt=\"\">\n");
      out.write("                                    <div class=\"product-hover\">\n");
      out.write("                                        <a href=\"#\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>\n");
      out.write("                                        <a href=\"single-product.html\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <h2><a href=\"single-product.html\">Sony microsoft</a></h2>\n");
      out.write("\n");
      out.write("                                <div class=\"product-carousel-price\">\n");
      out.write("                                    <ins>$200.00</ins> <del>$225.00</del>\n");
      out.write("                                </div>                            \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"single-product\">\n");
      out.write("                                <div class=\"product-f-image\">\n");
      out.write("                                    <img src=\"Img/bacxuu.jpg\" alt=\"\">\n");
      out.write("                                    <div class=\"product-hover\">\n");
      out.write("                                        <a href=\"#\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>\n");
      out.write("                                        <a href=\"single-product.html\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <h2>iPhone 6</h2>\n");
      out.write("\n");
      out.write("                                <div class=\"product-carousel-price\">\n");
      out.write("                                    <ins>$1200.00</ins> <del>$1355.00</del>\n");
      out.write("                                </div>                                 \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"single-product\">\n");
      out.write("                                <div class=\"product-f-image\">\n");
      out.write("                                    <img src=\"Img/bacxuu.jpg\" alt=\"\">\n");
      out.write("                                    <div class=\"product-hover\">\n");
      out.write("                                        <a href=\"#\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>\n");
      out.write("                                        <a href=\"single-product.html\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <h2><a href=\"single-product.html\">Samsung gallaxy note 4</a></h2>\n");
      out.write("\n");
      out.write("                                <div class=\"product-carousel-price\">\n");
      out.write("                                    <ins>$400.00</ins>\n");
      out.write("                                </div>                            \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End main content area -->\n");
      out.write("\n");
      out.write("    ");
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
