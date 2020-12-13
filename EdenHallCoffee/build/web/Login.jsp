

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>EdenHall Login</title>
        
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
            String mes = request.getParameter("mes");
            String mes1 = ""; 
        %>
        
        <div class="row">
            <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
                <img src="Img/Logo.png" width="500px" height="500px"/>
                
            </div>
            
            <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5" style="padding-top: 120px ">
                <form action="Login" method="post" role="form">
                    <legend style="font-size: 40px">Welcome to EdenHall!</legend>
                    
                
                    <div class="form-group">
                        <label >UserName</label>
                        <input type="text" class="form-control" placeholder="SunChinsusu@gmail.com" name="user" required>
                    </div>
                    <div class="form-group">
                        <label >PassWord</label>
                        <input type="password" class="form-control" placeholder="12345678" name="pass" required>
                    </div>
                    <button type="submit" class="btn btn-primary">Login</button>
                </form>
                <a href="http://localhost:8080/EdenHallCoffee/LayLaiMatKhau.jsp?mes1=<%= mes1 %>">Quên mật khẩu?</a>
                <a href="http://localhost:8080/EdenHallCoffee/FormDienThongTinKhachHang.jsp" target="_top">Tạo tài khoản mới.</a>
                <br/>
                <!--Thông báo-->
                <%
                    if(mes.length()!=0){
                %>
                <div class="alert alert-warning">
                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                    <strong>Note :</strong> <%= mes %>
                </div>
                <%
                    }
                %>
            </div>
    </body>
</html
