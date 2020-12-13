


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

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.3/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
        <style>
            #noidung{
                height: 550px;
                overflow: auto;
            }
        </style>
    </head>
    <body>
        <%@page import="Data.DAO"%>
        <%@page import="java.util.ArrayList"%>
        <%@page import="Entity.ThanhVien"%>
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
                    <li class="active">
                        <a href="http://localhost:8080/EdenHallCoffee/QuanLiNhanVien.jsp">Staff</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/QuanLiSanPham.jsp">Product</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/QuanLiThongKe.jsp">Report</a>
                    </li>
                </ul>
            </nav>
        </div>
        
        <div class="row">
            <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3" >
<!--                <div class="row">
                    <form class="navbar-form navbar-left" role="search" action="SearchNVByName">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Nguyen Tien Thuat" name="ten">
                        </div>
                        <button type="submit" class="btn btn-default">Search</button>
                    </form>
                </div>-->
                <div class="row"><li><a href="http://localhost:8080/EdenHallCoffee/FormDienThongTinNhanVien.jsp" style="font-size: 18px; font-family: 'Times New Roman';">Thêm nhân viên</a></li></div>
                
                <img src="Img/Logo.png" style="width: 320px; height: 320px;" >
            </div>
            
                <div class="col-xs-9 col-sm-9 col-md-9 col-lg-9" id="noidung">
                <%
                    ArrayList<ThanhVien> list = DAO.getAllNhanVien();
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
                                    <th>Tên nhân viên</th>
                                    <th>Giới tính</th>
                                    <th>Địa chỉ</th>
                                    <th>Số điện thoại</th>
                                    <th>Vị trí</th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    int stt = 1;
                                    for(ThanhVien nv : list){
                                %>
                                <tr>
                                    <th><%= stt %></th>
                                    <th><%= nv.getId() %></th>
                                    <th><%= nv.getTen() %></th>
                                    <th><%= nv.getGioiTinh() %></th>
                                    <th><%= nv.getDiaChi() %></th>
                                    <th><%= nv.getSoDienThoai() %></th>
                                    <%
                                        if(nv.getViTri()==2){
                                    %>
                                    <th>Nhân viên</th>
                                    <th>
                                        <a href="http://localhost:8080/EdenHallCoffee/SuaNhanVien.jsp?idNV=<%= nv.getId() %>" class="btn btn-primary">Edit</a>
                                    </th>
                                    <th>
                                        <form action="XoaThanhVien" method="Post">
                                            <input type="hidden" name="idNV" value="<%= nv.getId() %>"/>
                                            <button type="submit" class="btn btn-danger">Delete</button>
                                        </form>
                                    </th>
                                    <th>
                                        <form action="ChamCong" method="post">
                                            <input type="hidden" name="idNV" value="<%= nv.getId() %>"/>
                                            <button type="submit" class="btn btn-large btn-block btn-warning">Chấm công</button>
                                        </form>
                                    </th>
                                    <th>
                                        <form action="TraLuong" method="post">
                                            <input type="hidden" name="idNV" value="<%= nv.getId() %>"/>
                                            <button type="submit" class="btn btn-success">Trả lương</button>
                                        </form>
                                    </th>
                                    <%
                                        }
                                        else{
                                    %>
                                    <th>Quản lí</th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <th></th>
                                    <%
                                        }
                                    %>
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
        
        
    </body>
</html>
