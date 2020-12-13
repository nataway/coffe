

<%@page import="Entity.ThanhVien"%>
<%@page import="Data.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/QuanLiSanPham.jsp">Product</a>
                    </li>
                    <li class="active">
                        <a href="http://localhost:8080/EdenHallCoffee/QuanLiThongKe.jsp">Report</a>
                    </li>
                </ul>
            </nav>
        </div>
        
        <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                <img src="Img/Logo.png" style="width: 320px; height: 320px;" >
        </div>
            <div id="noidung" class="col-xs-9 col-sm-9 col-md-9 col-lg-9" >
                <form action="QuanLiThongKe" method="post">
                    <div class="row">
                        <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                            <label for="input-id" class="col-sm-2">StartDate</label>
                        </div>

                        <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                            <div class="form-group">
                                <label for="input" class="col-sm-2 control-label">Ngày</label>
                                <div class="col-sm-10">
                                    <select name="startDay" id="input" class="form-control">
                                        <%
                                            for(int i = 1; i <= 31; i++){
                                        %>
                                        <option value="<%= i %>"><%= i %></option>
                                        <%
                                            }
                                        %>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                            <div class="form-group">
                                <label for="input" class="col-sm-2 control-label">Tháng</label>
                                <div class="col-sm-10">
                                    <select name="startMonth" id="input" class="form-control">
                                        <%
                                            for(int i = 1; i <= 12; i++){
                                        %>
                                        <option value="<%= i %>"><%= i %></option>
                                        <%
                                            }
                                        %>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                            <div class="form-group">
                                <label for="input" class="col-sm-2 control-label">Năm</label>
                                <div class="col-sm-10">
                                    <select name="startYear" id="input" class="form-control">
                                        <%
                                            for(int i = 2019; i <= 2030; i++){
                                        %>
                                        <option value="<%= i %>"><%= i %></option>
                                        <%
                                            }
                                        %>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">

                        <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">

                            <label for="input-id" class="col-sm-2">EndDate</label>

                        </div>

                        <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                            <div class="form-group">
                                <label for="input" class="col-sm-2 control-label">Ngày</label>
                                <div class="col-sm-10">
                                    <select name="endDay" id="input" class="form-control">\
                                        <%
                                            for(int i = 1; i <= 31; i++){
                                        %>
                                        <option value="<%= i %>"><%= i %></option>
                                        <%
                                            }
                                        %>
                                    </select>
                                </div>
                            </div>
                        </div>

                        <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                            <div class="form-group">
                                <label for="input" class="col-sm-2 control-label">Tháng</label>
                                <div class="col-sm-10">
                                    <select name="endMonth" id="input" class="form-control">
                                        <%
                                            for(int i = 1; i <= 12; i++){
                                        %>
                                        <option value="<%= i %>"><%= i %></option>
                                        <%
                                            }
                                        %>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                            <div class="form-group">
                                <label for="input" class="col-sm-2 control-label">Năm</label>
                                <div class="col-sm-10">
                                    <select name="endYear" id="input" class="form-control">
                                        <%
                                            for(int i = 2019; i <= 2030; i++){
                                        %>
                                        <option value="<%= i %>"><%= i %></option>
                                        <%
                                            }
                                        %>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>
                <br/>
                <div class="row">
                    <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                        <label for="input-id" class="col-sm-2">Kiểu</label>
                    </div>
                    <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
                        <div class="form-group">
                            <div class="col-sm-10">
                                    <select name="type" id="input" class="form-control">
                                        <option value="1">Thống kê nhân viên theo số lần phục vụ</option>
                                        <option value="2">Thống kê nhân viên theo doanh thu</option>
                                        <option value="3">Thống kê sản phẩm theo số lượng</option>
                                        <option value="4">Thống kê sản phẩm theo doanh thu</option>
                                    </select>
                                    <br/>
                                    <button type="submit" class="btn btn-primary" disabled>Thống kê</button>
                            </div>
                        </div>
                    </div>
                </div>
                </form>
            </div>
        </div>
    </body>
</html>

