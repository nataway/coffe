

<%@page import="Entity.HoaDon"%>
<%@page import="Entity.ChiTietHoaDon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Customer</title>

        <!-- Bootstrap CSS -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

        <style>
            #noidung{
                height: 550px;
                overflow: auto;
            }
            body{
                background-image: url("Img/bg2.png");
            }
            th, td{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <%@page import="Entity.ThanhVien"%>
        <%@page import="java.util.ArrayList"%>
        <%@page import="Entity.SanPham"%>
        <%@page import="Data.DAO"%>
        <!-- jQuery -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <!-- Bootstrap JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <%
            String mes = "";
            ThanhVien tv = (ThanhVien)session.getAttribute("tv"); 
            ArrayList<ChiTietHoaDon> gioHang = (ArrayList<ChiTietHoaDon>)session.getAttribute("gioHang");
        %>
        <div class="row">
            
            <nav class="navbar navbar-default" role="navigation" style="background-color: #FFD700">
                
                <div class="collapse navbar-collapse navbar-ex1-collapse">
                    <ul class="nav navbar-nav">
                        <li>
                            <a href="http://localhost:8080/EdenHallCoffee/index.jsp">
                                <img src="Img/trangchu.png" style="width: 22px; height: 22px;"/>
                                Trang chủ
                            </a>
                        </li>
                    </ul>
                    <form class="navbar-form navbar-left" role="search" action="SearchSanPham" method="post">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search" name="keyword">
                        </div>
                        <button type="submit" class="btn btn-default">Tìm kiếm</button>
                    </form>
                    
                    <ul class="nav navbar-nav navbar-right">
                        <%
                            if(tv.getId()==0){
                        %>
                        <li>
                            <a href="http://localhost:8080/EdenHallCoffee/FormDienThongTinKhachHang.jsp">
                                <img src="Img/taotaikhoan1.png" style="width: 25px; height: 25px;"/>
                                Tạo tài khoản mới
                            </a>
                        </li>
                        <li>
                            <a href="http://localhost:8080/EdenHallCoffee/Login.jsp?mes=<%= mes %>">
                                <img src="Img/acc1.png" style="width: 22px; height: 22px;"/>
                                Đăng nhập
                            </a>
                        </li>
                        <%
                            }
                            else{
                        %>
                        <li>
                            <a href="http://localhost:8080/EdenHallCoffee/ThongTinCaNhan.jsp">
                                <img src="Img/hoso1.png" style="width: 20px; height: 22px;"/>
                                Thông tin cá nhân
                            </a>
                        </li>
                        <li>
                            <a href="Logout">
                                <img src="Img/logout1.png" style="width: 20px; height: 22px;"/>
                                Đăng xuất
                            </a>
                        </li>
                        <%
                            }
                        %>
                        <li
                            ><a href="#"><img src="Img/giohang1.png" style="width: 30px; height: 20px;"/>
                            Giỏ hàng
                            </a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Loại mặt hàng<b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li><a href="http://localhost:8080/EdenHallCoffee/KhachHangOrderCafe.jsp">Cà phê</a></li>
                                <li><a href="http://localhost:8080/EdenHallCoffee/KhachHangOrderBanhNgot.jsp">Bánh ngọt</a></li>
                                <li><a href="http://localhost:8080/EdenHallCoffee/KhachHangOrderCockTail.jsp">Cocktail</a></li>
                                <li><a href="http://localhost:8080/EdenHallCoffee/KhachHangOrderNuocEp.jsp">Nước ép</a></li>
                            </ul>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </nav>
        </div>
        
        <div class="row">
            <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3" >
                <img src="Img/Logo.png" style="width: 320px; height: 320px;">
            </div>
            <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
                <%
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
                %>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        Ngày <%= hd.getNgay() %> Mã đơn hàng #<%= hd.getId() %>
                        <a href="ChiTietDonHang.jsp?id=<%= hd.getId() %>" style="padding-left: 200px;">View detail</a>
                    </div>
                        <table class="table">
                            <tr class="table">
                                <th><%= chuoiSP %></th>
                                <th style="text-align: right"><%= status %></th>
                            </tr>
                        </table>   
                    </div>
                <%
                    }
                %>
            </div>
            <div id="noidung" class="col-xs-4 col-sm-4 col-md-4 col-lg-4" >
                <div class="panel panel-default">
                    <!-- Default panel contents -->
                <div class="panel-heading" style="font-weight: bold; font-size: 22px;">Giỏ Hàng</div>
                    <div class="panel-body">
                        <p>Danh sách mặt hàng</p>
                    </div>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>STT</th>
                                <th>Tên sản phẩm</th>
                                <th>Giá tiền</th>
                                <th>Số lượng</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                int tongTien = 0;
                                int stt = 1;
                                for(ChiTietHoaDon cthd : gioHang){
                                    SanPham sp = DAO.getSanPhamById(cthd.getIdSanPham());
                                    tongTien += sp.getPrice()*cthd.getSoLuong();
                            %>
                            <tr>
                                <td><%= stt %></td>
                                <th><%= sp.getName() %></th>
                                <td><%= sp.getPrice() %> VNĐ</td>
                                <td><%= cthd.getSoLuong() %></td>
                                <td>
                                    <form action="XoaSanPhamTrongGioHang" method="post">
                                        <input type="hidden" name="idSanPham" value="<%= sp.getId() %>" />
                                        <button type="submit" class="btn btn-warning">x</button>
                                    </form>
                                </td>
                            </tr>
                            <%
                                    stt++;
                                }
                            %>
                            <tr>
                                <td></td>
                                <th colspan="2">Tổng tiền :</th>
                                <th colspan="2" style="font-size: 22px;"><%= tongTien %> VNĐ</th>
                            </tr>
                            <tr>
                                <th></th>
                                <th></th>
                                <th></th>
                                <th></th>
                                <th>
                                    <%
                                        if(tv.getId()>0){
                                    %>
                                    <form action="DatHang" method="post">
                                        <button type="submit" class="btn btn-success" <% if(gioHang.isEmpty()){ %>disabled<%}%>>
                                            Đặt hàng
                                        </button>
                                    </form>
                                    <%
                                        }
                                        else{
                                    %>
                                    <a class="btn btn-success" href="http://localhost:8080/EdenHallCoffee/FormDienThongTinKhachVangLai.jsp" role="button" >Tiến hành đặt hàng</a>
                                    <%
                                        }
                                    %>
                                </th>
                            </tr>
                        </tbody>
                    </table>    
                </div>    
            </div>
        </div>              
                                    
    </body>
</html>

