

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
                background-image: url("bg2.png");
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
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search">
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
                            <a href="">
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
                        <li>
                            <a href="http://localhost:8080/EdenHallCoffee/GioHang.jsp">
                                <img src="Img/giohang1.png" style="width: 30px; height: 20px;"/>
                                Giỏ Hàng
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
            
            <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3" style="height:550px; border-right: 2px solid black;">
                <img src="Logo.png" style="width: 320px; height: 320px;">
            </div>
            
            <div class="col-xs-9 col-sm-9 col-md-9 col-lg-9" >
                <span class="label label-info">Thông tin tài khoản</span>
                <div class="panel panel-default">
                        <table class="table">
                                <tr>
                                    <th>Id</th>
                                    <th><%= tv.getId() %></th>
                                </tr>
                                <tr>
                                    <th>Họ và tên</th>
                                    <th><%= tv.getTen() %></th>
                                </tr>
                                <tr>
                                    <td>Giới tính</td>
                                    <th><%= tv.getGioiTinh() %></th>
                                </tr>
                                <tr>
                                    <td>Địa chỉ</td>
                                    <th><%= tv.getDiaChi() %></th>
                                </tr>
                                <tr>
                                    <td>Số điện thoại</td>
                                    <th><%= tv.getSoDienThoai() %></th>
                                </tr>
                                <tr>
                                    <td>Email</td>
                                    <th><%= tv.getTenDangNhap() %></th>
                                </tr>
                                <tr>
                                    <td><a href="#" onclick="show()">Thay đổi mật khẩu </a></td>
                                    <td></td>
                                </tr>
                        </table>
                </div>
                <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4" style="display: none" id="doimatkhau">
                    <div class="panel panel-default">
                        <table class="table">
                            <tr>
                                <th>Mật khẩu cũ</th>
                                <th><input type="password" class="form-control" name="matKhauCu"required></th>
                            </tr>
                            <tr>
                                <th>Mật khẩu mới</th>
                                <th><input type="password" class="form-control" name="matKhauMoi"required></th>
                            </tr>
                            <tr>
                                <th>Nhập lại mật khẩu mới</th>
                                <th><input type="password" class="form-control" name="matKhauMoiRepeat"required></th>
                            </tr>
                            <tr>
                                <th></th>
                                <th><button type="submit" class="btn btn-primary" disabled>Lưu thay đổi</button></th>
                            </tr>
                        </table>
                    </div>            
                </div>                 
            </div>
        </div>
        <script>
            function show(){
                var s = document.getElementById("doimatkhau").style.display;
                if(s=='none'){
                    document.getElementById("doimatkhau").style.display = 'block';
                }
                else{
                    document.getElementById("doimatkhau").style.display = 'none';
                }
            }
        </script>     
    </body>
</html>