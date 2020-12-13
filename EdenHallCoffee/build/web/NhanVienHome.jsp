

<%@page import="Data.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Member</title>

        <!-- Bootstrap CSS -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.3/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
        <style>
            
        </style>
    </head>
    <body>
        <%@page import="Entity.ThanhVien"%>
        <%
            String mes ="";
            if(session.getAttribute("mes")!= null) mes = (String) session.getAttribute("mes"); 
            ThanhVien tv = (ThanhVien) session.getAttribute("tv"); 
        %>
        <!-- jQuery -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <!-- Bootstrap JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        
        <div class="row">
            <nav class="navbar navbar-inverse">
                <ul class="nav navbar-nav">
                    <li class="active">
                        <a href="http://localhost:8080/EdenHallCoffee/NhanVienHome.jsp">Home</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/NhanVienXemLichLamViec.jsp">Schedule</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/NhanVienXemCongViec.jsp">Mission</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/NhanVienDangKiLichLamViec.jsp">Registration</a>
                    </li>
                </ul>
            </nav>
        </div>
        
        <div class="row">
            <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3" style="height: 400px;">
                <img src="Img/Logo.png" style="width: 320px; height: 320px;" >
            </div>
            
            <div class="col-xs-9 col-sm-9 col-md-9 col-lg-9" style="height: 400px;">
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
                                <td><a href="Logout">Đăng xuất</a></td>
                            </tr>
                    </table>
                </div>
                <!--Thông báo-->
                <%
                    if(mes.length()!=0){
                %>
                <div class="alert alert-warning">
                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                    <strong>Note :</strong> <%= mes %>
                </div>
                <%
                    mes="";
                    }
                %>       
                <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4" style="display: none" id="doimatkhau">
                    <div class="panel panel-default">
                        <form action="DoiMatKhau" method="post">
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
                                    <th><input type="password" class="form-control" name="lapMatKhauMoi"required></th>
                                </tr>
                                <tr>
                                    <th><input type="hidden" name="id" value="<%= tv.getId() %>" /></th>
                                    <th><button type="submit" class="btn btn-primary">Lưu thay đổi</button></th>
                                </tr>
                            </table>
                        </form>
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

