

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="Data.DAO"%>
<%@page import="Entity.ThanhVien"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Member</title>

        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

        <style>

            .checkbox{
                padding-left: 35%;
            }
        </style>
    </head>
    <body>
        <%
            ThanhVien tv = (ThanhVien) session.getAttribute("tv"); 
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
            
            Calendar cal0 = Calendar.getInstance();        
            cal0.set(Calendar.MONTH, Calendar.OCTOBER);
            cal0.set(Calendar.DATE, 14);
            cal0.set(Calendar.YEAR, 2019);
            java.util.Date date0 = cal0.getTime();

            Calendar cal = Calendar.getInstance();
            java.util.Date date = cal.getTime();

            long hieu = (date.getTime()-date0.getTime())/ (24 * 3600 * 1000) % 7;

            Calendar cal1 = Calendar.getInstance();
            cal1.add(Calendar.DAY_OF_MONTH, (int)(7-hieu));
        %>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <div class="row">
            <nav class="navbar navbar-inverse">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/NhanVienHome.jsp">Home</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/NhanVienXemLichLamViec.jsp">Schedule</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/NhanVienXemCongViec.jsp">Mission</a>
                    </li>
                    <li class="active">
                        <a href="http://localhost:8080/EdenHallCoffee/NhanVienDangKiLichLamViec.jsp">Registration</a>
                    </li>
                </ul>
            </nav>
        </div>
        
        <div class="row">
            <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                <img src="Img/Logo.png" style="width: 320px; height: 320px;" >
            </div>

            <div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
                <form action="DangKiLichLamViec" method="post">
                    <div class="panel panel-default">
                            <!-- Default panel contents -->
                            <div class="panel-heading">Đăng kí lịch làm việc tuần 
                                từ ngày <b style="font-size: 17px"><%= dateFormat.format(cal1.getTime()) %></b>
                                <% cal1.add(Calendar.DAY_OF_MONTH, 6); %>
                                đến ngày <b style="font-size: 17px"><%= dateFormat.format(cal1.getTime()) %></b></div>
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th></th>
                                            <th>Thứ 2</th>
                                            <th>Thứ 3</th>
                                            <th>Thứ 4</th>
                                            <th>Thứ 5</th>
                                            <th>Thứ 6</th>
                                            <th>Thứ 7</th>
                                            <th>Chủ nhật</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <th>Sáng<br>(Từ 7h -> 11h)</th>
                                            <td><div class="checkbox"><input type="checkbox" value="t2s" name="check"></div></td>
                                            <td><div class="checkbox"><input type="checkbox" value="t3s" name="check"></div></td>
                                            <td><div class="checkbox"><input type="checkbox" value="t4s" name="check"></div></td>
                                            <td><div class="checkbox"><input type="checkbox" value="t5s" name="check"></div></td>
                                            <td><div class="checkbox"><input type="checkbox" value="t6s" name="check"></div></td>
                                            <td><div class="checkbox"><input type="checkbox" value="t7s" name="check"></div></td>
                                            <td><div class="checkbox"><input type="checkbox" value="cns" name="check"></div></td>
                                        </tr>
                                        <tr>
                                            <th>Chiều<br>(Từ 13h -> 17h)</th>
                                            <td><div class="checkbox"><input type="checkbox" value="t2c" name="check"></div></td>
                                            <td><div class="checkbox"><input type="checkbox" value="t3c" name="check"></div></td>
                                            <td><div class="checkbox"><input type="checkbox" value="t4c" name="check"></div></td>
                                            <td><div class="checkbox"><input type="checkbox" value="t5c" name="check"></div></td>
                                            <td><div class="checkbox"><input type="checkbox" value="t6c" name="check"></div></td>
                                            <td><div class="checkbox"><input type="checkbox" value="t7c" name="check"></div></td>
                                            <td><div class="checkbox"><input type="checkbox" value="cnc" name="check"></div></td>
                                        </tr>
                                    </tbody>
                                </table>
                        </div>
                        <input type="hidden" name="id" value="<%= tv.getId() %>">
                        <button type="submit" class="btn btn-success" <% if(DAO.checkDaDangKiLLV(tv.getId())==true){ %> disabled <% } %>>Đăng kí</button>
                        
                </form>
            </div>
            
        </div>
        
        

    </body>
</html>

