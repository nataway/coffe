package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entity.HoaDon;
import Entity.ChiTietHoaDon;
import Entity.ThanhVien;
import java.util.ArrayList;
import Entity.SanPham;
import Data.DAO;

public final class GioHang_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-image: url(\"Img/bg2.png\");\n");
      out.write("            }\n");
      out.write("            th, td{\n");
      out.write("                text-align: center;\n");
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
            ArrayList<ChiTietHoaDon> gioHang = (ArrayList<ChiTietHoaDon>)session.getAttribute("gioHang");
        
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("            <nav class=\"navbar navbar-default\" role=\"navigation\" style=\"background-color: #FFD700\">\n");
      out.write("                \n");
      out.write("                <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"http://localhost:8080/EdenHallCoffee/index.jsp\">\n");
      out.write("                                <img src=\"Img/trangchu.png\" style=\"width: 22px; height: 22px;\"/>\n");
      out.write("                                Trang chủ\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <form class=\"navbar-form navbar-left\" role=\"search\" action=\"SearchSanPham\" method=\"post\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"keyword\">\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\">Tìm kiếm</button>\n");
      out.write("                    </form>\n");
      out.write("                    \n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        ");

                            if(tv.getId()==0){
                        
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"http://localhost:8080/EdenHallCoffee/FormDienThongTinKhachHang.jsp\">\n");
      out.write("                                <img src=\"Img/taotaikhoan1.png\" style=\"width: 25px; height: 25px;\"/>\n");
      out.write("                                Tạo tài khoản mới\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"http://localhost:8080/EdenHallCoffee/Login.jsp?mes=");
      out.print( mes );
      out.write("\">\n");
      out.write("                                <img src=\"Img/acc1.png\" style=\"width: 22px; height: 22px;\"/>\n");
      out.write("                                Đăng nhập\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        ");

                            }
                            else{
                        
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"http://localhost:8080/EdenHallCoffee/ThongTinCaNhan.jsp\">\n");
      out.write("                                <img src=\"Img/hoso1.png\" style=\"width: 20px; height: 22px;\"/>\n");
      out.write("                                Thông tin cá nhân\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"Logout\">\n");
      out.write("                                <img src=\"Img/logout1.png\" style=\"width: 20px; height: 22px;\"/>\n");
      out.write("                                Đăng xuất\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                        <li\n");
      out.write("                            ><a href=\"#\"><img src=\"Img/giohang1.png\" style=\"width: 30px; height: 20px;\"/>\n");
      out.write("                            Giỏ hàng\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Loại mặt hàng<b class=\"caret\"></b></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"http://localhost:8080/EdenHallCoffee/KhachHangOrderCafe.jsp\">Cà phê</a></li>\n");
      out.write("                                <li><a href=\"http://localhost:8080/EdenHallCoffee/KhachHangOrderBanhNgot.jsp\">Bánh ngọt</a></li>\n");
      out.write("                                <li><a href=\"http://localhost:8080/EdenHallCoffee/KhachHangOrderCockTail.jsp\">Cocktail</a></li>\n");
      out.write("                                <li><a href=\"http://localhost:8080/EdenHallCoffee/KhachHangOrderNuocEp.jsp\">Nước ép</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div><!-- /.navbar-collapse -->\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("            <div class=\"col-xs-3 col-sm-3 col-md-3 col-lg-3\" >\n");
      out.write("                <img src=\"Img/Logo.png\" style=\"width: 320px; height: 320px;\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-5 col-sm-5 col-md-5 col-lg-5\">\n");
      out.write("                ");

                    ArrayList<HoaDon> listHD = DAO.getDonHangByIdKhachHang(tv.getId());
                    for(HoaDon hd : listHD){
                        String trangThai = hd.getTrangThai();
                        String status;
                        if(trangThai.equals("DaThanhToan")) status = "Đã giao hàng";
                        else status = "Đang giao hàng";
                        String chuoiSP = "";
                        ArrayList<ChiTietHoaDon> listCTHD = DAO.getCTHDByID(hd.getId());
                        for(ChiTietHoaDon ct : listCTHD){
                            chuoiSP = chuoiSP + DAO.getSanPhamById(ct.getIdSanPham()).getName()+". ";
                        }
                
      out.write("\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        Ngày ");
      out.print( hd.getNgay() );
      out.write(" Mã đơn hàng #");
      out.print( hd.getId() );
      out.write("\n");
      out.write("<!--                        <a href=\"#\" style=\"padding-left: 200px;\">View detail</a>-->\n");
      out.write("                        <div href=\"#\" style=\"padding-left: 200px;\">View detail</div>\n");
      out.write("                    </div>\n");
      out.write("                        <table class=\"table\" id=\"little\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th>");
      out.print( chuoiSP );
      out.write("</th>\n");
      out.write("                                <th style=\"text-align: right\">");
      out.print( status );
      out.write("</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                            <table class=\"table\" id=\"more\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Tên sản phẩm</th>\n");
      out.write("                                    <th>Giá tiền</th>\n");
      out.write("                                    <th>Số lượng</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");

                                    for(ChiTietHoaDon cthd : listCTHD){
                                        SanPham sp = DAO.getSanPhamById(cthd.getIdSanPham());
                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>");
      out.print( sp.getName() );
      out.write("</th>\n");
      out.write("                                    <td>");
      out.print( sp.getPrice() );
      out.write(" VNĐ</td>\n");
      out.write("                                    <td>");
      out.print( cthd.getSoLuong() );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Tổng tiền :</th>\n");
      out.write("                                    <th colspan=\"2\" style=\"font-size: 22px;\">");
      out.print( hd.getTongTien() );
      out.write(" VNĐ</th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th></th>\n");
      out.write("                                    <th></th>\n");
      out.write("                                    <th>");
      out.print( status );
      out.write("</th>\n");
      out.write("                                </tr>    \n");
      out.write("                            </tbody>    \n");
      out.write("                        </table>    \n");
      out.write("                    </div>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"noidung\" class=\"col-xs-4 col-sm-4 col-md-4 col-lg-4\" >\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <!-- Default panel contents -->\n");
      out.write("                    <div class=\"panel-heading\" style=\"font-weight: bold; font-size: 22px;\">Giỏ Hàng</div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <p>Danh sách mặt hàng</p>\n");
      out.write("                        </div>\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>STT</th>\n");
      out.write("                                    <th>Tên sản phẩm</th>\n");
      out.write("                                    <th>Giá tiền</th>\n");
      out.write("                                    <th>Số lượng</th>\n");
      out.write("                                    <th></th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");

                                    int tongTien = 0;
                                    int stt = 1;
                                    for(ChiTietHoaDon cthd : gioHang){
                                        SanPham sp = DAO.getSanPhamById(cthd.getIdSanPham());
                                        tongTien += sp.getPrice()*cthd.getSoLuong();
                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print( stt );
      out.write("</td>\n");
      out.write("                                    <th>");
      out.print( sp.getName() );
      out.write("</th>\n");
      out.write("                                    <td>");
      out.print( sp.getPrice() );
      out.write(" VNĐ</td>\n");
      out.write("                                    <td>");
      out.print( cthd.getSoLuong() );
      out.write("</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <form action=\"XoaSanPhamTrongGioHang\" method=\"post\">\n");
      out.write("                                            <input type=\"hidden\" name=\"idSanPham\" value=\"");
      out.print( sp.getId() );
      out.write("\" />\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-warning\">x</button>\n");
      out.write("                                        </form>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");

                                        stt++;
                                    }
                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <th colspan=\"2\">Tổng tiền :</th>\n");
      out.write("                                    <th colspan=\"2\" style=\"font-size: 22px;\">");
      out.print( tongTien );
      out.write(" VNĐ</th>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th></th>\n");
      out.write("                                    <th></th>\n");
      out.write("                                    <th></th>\n");
      out.write("                                    <th></th>\n");
      out.write("                                    <th>\n");
      out.write("                                        ");

                                            if(tv.getId()>0){
                                        
      out.write("\n");
      out.write("                                        <form action=\"DatHang\" method=\"post\">\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-success\" ");
 if(gioHang.isEmpty()){ 
      out.write("disabled");
}
      out.write(">\n");
      out.write("                                                Đặt hàng\n");
      out.write("                                            </button>\n");
      out.write("                                        </form>\n");
      out.write("                                        ");

                                            }
                                            else{
                                        
      out.write("\n");
      out.write("                                        <a class=\"btn btn-success\" href=\"http://localhost:8080/EdenHallCoffee/FormDienThongTinKhachVangLai.jsp\" role=\"button\" >Tiến hành đặt hàng</a>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                    </th>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>    \n");
      out.write("                    </div>    \n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
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
