

<%@page import="Data.DAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entity.SanPham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Admin</title>

        <!-- Bootstrap CSS -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

        <style>
            #noidung{
                height: 550px;
                overflow: auto;
            }
        </style>
    </head>
    <body>
        <!-- jQuery -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <!-- Bootstrap JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
        <div class="row">
            <nav class="navbar navbar-inverse">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/QuanLiHome.jsp">Home</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/QuanLiDonHang.jsp">Booking</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/QuanLiNhanVien.jsp">Staff</a>
                    </li>
                    <li class="active">
                        <a href="http://localhost:8080/EdenHallCoffee/QuanLiSanPham.jsp">Product</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/QuanLiThongKe.jsp">Report</a>
                    </li>
                </ul>
            </nav>
        </div>
        
        <div class="row">
            <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3" style="height: 550px;">
<!--                <div class="row">
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Nguyen Tien Thuat">
                        </div>
                        <button type="submit" class="btn btn-default">Search</button>
                    </form>
                </div>-->
                
                <div class="row">
                    <li><a href="http://localhost:8080/EdenHallCoffee/ThemSanPhamMoi.jsp" style="font-size: 18px; font-family: 'Times New Roman';">Thêm sản phẩm mới</a></li>
                </div>
                <img src="Img/Logo.png" style="width: 320px; height: 320px;" >
            </div>
            
            <div id="noidung" class="col-xs-9 col-sm-9 col-md-9 col-lg-9" >
                <%
                    ArrayList<SanPham> list = DAO.getAllSanPham();
                %>
                <div class="panel panel-default">
                    <!-- Default panel contents -->
                    <div class="panel-heading">Danh sách nhân viên</div>
                        <!-- Table -->
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>STT</th>
                                    <th>ID</th>
                                    <th>Tên sản phẩm</th>
                                    <th>Gía sản phẩm</th>
                                    <th>kiểu sản phẩm</th>
                                    <th>Hình ảnh</th>
                                    <th></th>
                                    <th></th>
                            </thead>
                            <tbody>
                                <%
                                    int stt = 1;
                                    for(SanPham sp : list){
                                %>
                                <tr>
                                    <th><%= stt %></th>
                                    <th>#<%= sp.getId() %></th>
                                    <th><%= sp.getName() %></th>
                                    <th><%= sp.getPrice() %> VNĐ</th>
                                    <th><%= sp.getType() %></th>
                                    <th><img src="<%= sp.getUrl() %>" style="width: 50px; height: 50px;" /></th>
                                    <th>
                                        <a href="http://localhost:8080/EdenHallCoffee/FormSanPham.jsp?idSP=<%= sp.getId() %>" type="submit" class="btn btn-primary">Edit</a>
                                    </th>
                                    <th>
                                        <a href="http://localhost:8080/EdenHallCoffee/XacNhanXoaSanPham.jsp?idSP=<%= sp.getId() %>" type="submit" class="btn btn-danger">Delete</a>
                                    </th>
                                </tr>
                                <%
                                    stt++;
                                    }
                                %>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript">
            function show(){
                var ima = document.getElementById("file").value;
                var path = ima.substring(12,ima.length);
                document.getElementById("hinhanh").src = path;
                document.getElementById("src").value = path;
            }
            function thongBao(){
                alert("Bạn đã xóa sản phẩm này khỏi menu!");
            }
        </script>
    </body>
</html>
