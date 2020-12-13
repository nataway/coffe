

<%@page import="Entity.ChiTietHoaDon"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>EdenHall đăng kí</title>

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
        
        <%
            ArrayList<ChiTietHoaDon> gioHang = (ArrayList<ChiTietHoaDon>)session.getAttribute("gioHang");
        %>
        <div class="row">
            
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4" style="background-color: rgb(146, 145, 145); height: 700px;">
            </div>
            
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                
                <form action="DatHang" method="post" role="form" style="padding-top: 20px;">
                    <legend style="color: rgb(255, 81, 0)">Bạn vui lòng điền thông tin để giao hàng</legend>
                
                    <div class="form-group">
                        <label for="" >Họ và tên</label>
                        <input type="text" class="form-control" name="ten" placeholder="Nguyễn Văn A" required>
                    </div>
                    <div class="form-group">
                        <label for="" >Địa chỉ</label>
                        <input type="text" class="form-control" name="diaChi" placeholder="Nam Định" required>
                    </div>
                    <div class="form-group">
                        <label for="" >Số điện thoại</label>
                        <input type="text" class="form-control" name="soDienThoai" placeholder="0123456789" required>
                    </div>                    
                    <div class="form-group">
                        <label for="" >Email</label>
                        <input type="email" class="form-control" name="email" placeholder="SunChinsusu@gmail.com" required>
                    </div>
                    <button type="submit" class="btn btn-primary" <% if(gioHang.isEmpty()){ %>disabled<%}%>>Đặt hàng</button>
                </form>
                
            </div>
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4" style="background-color: rgb(146, 145, 145); height: 700px;">
            </div>
            
        </div>
    </body>
</html>

