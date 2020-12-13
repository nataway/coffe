

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entity.ThanhVien"%>
<%@page import="Data.DAO"%>
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
        </style>
    </head>
    <body>
        <%
            int id = Integer.parseInt(request.getParameter("id"));
        %>
        <!-- jQuery -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <!-- Bootstrap JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <div class="row">
            
            <nav class="navbar navbar-inverse">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/QuanLiHome.jsp" style="padding-left: 50px;">Trang chủ</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/QuanLiKho.jsp">Quản lí kho</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/QuanLiNhanVien.jsp">Quản lí nhân viên</a>
                    </li>  
                    <li style="padding-top: 15px; color: white;font-size: 16px;">Thống kê</li>  
                </ul>
            </nav>
            
        </div>
        
        <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                <img src="Logo.png" style="width: 320px; height: 320px;" >
        </div>
        <div id="noidung" class="col-xs-7 col-sm-7 col-md-7 col-lg-7" >
            <div class="panel panel-default">
                <!-- Default panel contents -->
                <div class="panel-heading">Thống kê sản phẩm theo số lượng</div>
                <!-- Table -->
                <table class="table">
                    <thead>
                        <tr>
                            <th>STT</th>
                            <th>ID</th>
                            <th>Tên Sản Phẩm</th>
                            <th>Số lượng</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            int stt = 1;
                            String startDate = (String)request.getAttribute("startDate");
                            String endDate = (String)request.getAttribute("endDate");
                            String connectionURL = "jdbc:mysql://localhost:3306/edenhallcoffee?autoReconnect=true&useSSL=false";
                            String sql = "  select tbl.Id, tbl.Ten, count(tbl.Id) as SoLuong "+
                                         "  FROM(SELECT tblsanpham.id as Id, tblsanpham.name as Ten "+
                                                    " FROM tblsanpham,tbldonhang "+ 
                                                    " WHERE tblsanpham.id = tbldonhang.idSanPham "+
                                                            " AND tbldonhang.ngay >= '"+startDate+"' "+ 
                                                            " AND tbldonhang.ngay <= '"+endDate+"') AS tbl "+        
                                            " group by tbl.Id "+   
                                            " order by SoLuong desc "; 
                            try {
                                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                                Connection con = DriverManager.getConnection(connectionURL,"root","12345678");

                                Statement st = con.createStatement();
                                ResultSet rs = st.executeQuery(sql);
                                while(rs.next()){
                                %>
                                    <tr>
                                        <td><%= stt %></td>
                                        <% int idSanPham = rs.getInt(1); %>
                                        <td><%= idSanPham %></td>
                                        <td><%= rs.getString(2) %></td>
                                        <td><%= rs.getInt(3) %></td>
                                    </tr>
                                <%    
                                }
                                con.close();
                            } catch (Exception e) {
                            }
                        %>
                    </tbody>
                </table>
            </div> 
        </div>
    </body>
</html>

