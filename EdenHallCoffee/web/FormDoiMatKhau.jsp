<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Title Page</title>

        <!-- Bootstrap CSS -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.3/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <!-- jQuery -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <!-- Bootstrap JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        
        <%@page import="Entity.ThanhVien"%>
        <!-- jQuery -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <!-- Bootstrap JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        
        <div class="row">
            
            <nav class="navbar navbar-inverse">
                <ul class="nav navbar-nav">
                    <li style="font-family: 'Times New Roman', Times, serif; padding-top: 10px; color: white; font-weight: bold; padding-left: 50px; font-size: 20px;">
                        Trang chủ
                    </li>
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/QuanLiKho.jsp">Quản lí Kho</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/QuanLiNhanVien.jsp">Quản lí Nhân viên</a>
                    </li>
                </ul>
            </nav>
            
        </div>
        
        <div class="row">
            <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3" style="height: 700px; border: 2px solid dimgray">
                <img src="Logo.png" style="width: 320px; height: 320px;" >
            </div>
            <%
                ThanhVien tv = (ThanhVien) request.getAttribute("thanhVien");
                request.setAttribute("thanhVien",tv);
            %>
            <div class="col-xs-9 col-sm-9 col-md-9 col-lg-9" style="height: 700px; border: 2px solid dimgray">
                
                <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                    <form action="" method="POST" role="form">
                        <legend style="font-size: 20px">Đổi mật khẩu</legend>
                    
                        <div class="form-group">
                            <label >Mật khẩu cũ</label>
                            <input type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label >Mật khẩu mới</label>
                            <input type="password" class="form-control">
                        </div>
                        
                        <button type="submit" class="btn btn-primary">Lưu thay đổi</button>
                    </form>    
                </div>
        
            </div>
            
        </div>
        
    </body>
</html>
