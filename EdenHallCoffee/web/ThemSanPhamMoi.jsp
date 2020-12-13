

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
            #file{
                width: 0.1px;
                height: 0.1px;
                opacity: 0;
                overflow: hidden;
                position: absolute;
                z-index: -1;
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
                <img src="Img/Logo.png" style="width: 320px; height: 320px;" >
            </div>
            
            <div id="noidung" class="col-xs-9 col-sm-9 col-md-9 col-lg-9" >
                <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6" >
                    <form action="ThemSanPhamVaoMenu" method="post" role="form" style="padding-top: 20px;">
                        <legend style="color: rgb(255, 81, 0)">New Product</legend>

                        <div class="form-group">
                            <label for="" >Tên sản phẩm</label>
                            <input type="text" class="form-control" name="name" required>
                        </div>
                        <div class="form-group">
                            <label for="" >Giá sản phẩm</label>
                            <input type="number" class="form-control" name="price" required>
                        </div>
                        <div class="form-group">
                            <label for="" >Kiểu</label>
                            <select name="type" id="input" class="form-control" required>
                                <option value="cafe">Cafe</option>
                                <option value="banhngot">Bánh Ngọt</option>
                                <option value="cocktail">Cocktail</option>
                                <option value="nuocep">Nước ép</option>
                            </select>
                        </div>
                        <input type="hidden" id="src" value="" name="url"/>
                        <button type="submit" class="btn btn-primary" >Add Product</button>
                    </form>
                </div>
                <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6" >
                    <div class="form-group">
                        <input type="file" id="file" name="file" onchange="show()" required/>
                        <div class="thumbnail" style="width: 300px; height: 300px;">
                            <img id = "hinhanh" alt=""/>
                        </div>
                        <label for="file" class="btn btn-default" >
                            Picture
                        </label>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript">
            function show(){
                var ima = document.getElementById("file").value;
                var path = "Img/"+ima.substring(12,ima.length);
                document.getElementById("hinhanh").src = path;
                document.getElementById("src").value = path;
            }
        </script>
    </body>
</html>
