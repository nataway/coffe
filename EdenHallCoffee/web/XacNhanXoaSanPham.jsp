

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
            
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4" style="background-color: rgb(146, 145, 145); height: 650px;">
            </div>
            
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                <div class="form-group">
                    <br/>
                    <img id = "hinhanh" alt="" src="<%= sp.getUrl() %>" style=" width: 250px; height: 250px; display: block; margin-left: auto; margin-right: auto;"/>
                    <br/><br/>
                    <label>Name: <div style="font-size: 50px; display: inline"><%= sp.getName() %></div></label><br/><br/>
                    <label>Price: <div style="font-size: 50px; display: inline"><%= sp.getPrice() %></div> VNĐ</label><br/><br/>
                    <label>Type: <%= sp.getType() %></label><br/><br/>
                    <legend style="color: rgb(255, 81, 0)">Do you want to delete this product?</legend>
                    <table>
                        <tr>
                            <td style="width: 70%">
                                <form action="XoaSanPhamKhoiMenu" method="post" role="form">    
                                    <input type="hidden" name="idSP" value="<%= sp.getId() %>"/>
                                    <button type="submit" class="btn btn-danger">Delete</button>
                                </form>
                            </td>
                            <td style="width: 70%">
                                <a href="http://localhost:8080/EdenHallCoffee/QuanLiSanPham.jsp" type="button" class="btn btn-primary">Come Back</a>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>        
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4" style="background-color: rgb(146, 145, 145); height: 650px">
            </div>
        </div>                  
    </body>
</html>
