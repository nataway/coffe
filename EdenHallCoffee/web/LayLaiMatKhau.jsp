
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>EdenHall home</title>
        
        <!-- Bootstrap CSS -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
        
    </head>
    <body>
        <%
            String mes1 = "";
            mes1 = request.getParameter("mes1");
        %>
        
        <!-- jQuery -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <!-- Bootstrap JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <div class="row">
            <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
                <img src="Img/Logo.png" width="500px" height="500px"/>
                
            </div>
            
            <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5" style="padding-top: 120px ">
                <form action="QuenMatKhau" method="post" role="form">
                    <legend style="font-size: 40px">Welcome to EdenHall!</legend>
                    <div class="form-group">
                        <label> Nhập Email của bạn </label>
                        <input type="email" class="form-control" placeholder="your_email@gmail.com" name="email" required/>
                    </div>
                    <button type="submit" class="btn btn-primary">Nhận mật khẩu</button>
                </form>
                <br/>
                <!--Thông báo-->
                <%
                    if(mes1.length()!=0){
                %>
                <div class="alert alert-warning">
                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                    <strong>Note :</strong> <%= mes1 %>
                </div>
                <%
                    }
                %>
            </div>
    </body>
</html
