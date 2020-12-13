

<%@page import="Entity.SanPham"%>
<%@page import="Data.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
        
    </head>
    
    <body>
        
        <!-- jQuery -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <!-- Bootstrap JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
        <%
            int idSP = Integer.parseInt(request.getParameter("idSP"));
            SanPham sp = DAO.getSanPhamById(idSP);
        %>
        <div class="row">
            
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4" style="background-color: rgb(146, 145, 145); height: 700px;">
            </div>
            
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                
                <form action="SuaSanPham" method="post" role="form" style="padding-top: 20px;">
                    <legend style="color: rgb(255, 81, 0)">Edit Product</legend>
                
                    <div class="form-group">
                        <label for="" >Tên sản phẩm</label>
                        <input type="text" class="form-control" name="name" value="<%= sp.getName() %>"/>
                    </div>
                    <div class="form-group">
                        <label for="" >Gía sản phẩm</label>
                        <input type="text" class="form-control" name="price" value="<%= sp.getPrice() %>" />
                    </div>
                    <div class="form-group">
                        <label for="" >Kiểu</label>
                            <select name="type" id="input" class="form-control">
                                <option value="cafe">Cafe</option>
                                <option value="banhngot">Bánh Ngọt</option>
                                <option value="cocktail">Cocktail</option>
                                <option value="nuocep">Nước ép</option>
                            </select>
                    </div>
                    <div class="form-group">
                        <label>Hình ảnh</label>
                        <input type="file" id="file" onchange="show()"/>
                            <div class="thumbnail" style="width: 300px; height: 300px;">
                                <img id = "hinhanh" alt="" src="<%= sp.getUrl() %>" />
                            </div>        
                    </div>
                    <input type="hidden" name="idSP" value="<%= sp.getId() %>"/>
                    <input type="hidden" id="src"  value="<%= sp.getUrl() %>" name="url"/>
                    <button type="submit" class="btn btn-primary">Lưu thay đổi</button>
                    <a href="QuanLiSanPham.jsp" class="btn btn-primary">Trở về</a>
                </form>
                
            </div>
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4" style="background-color: rgb(146, 145, 145); height: 700px;">
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
