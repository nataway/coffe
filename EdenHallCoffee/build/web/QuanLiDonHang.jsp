

<%@page import="Entity.HoaDon"%>
<%@page import="java.util.Calendar"%>
<%@page import="Entity.ThanhVien"%>
<%@page import="Data.DAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Calendar"%>
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
        <!-- jQuery -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <!-- Bootstrap JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <%
           ThanhVien tv = (ThanhVien)session.getAttribute("tv");
           
           long millis=System.currentTimeMillis();  
           java.sql.Date date = new java.sql.Date(millis); 
           
           int caLamViec;
           Calendar cal = Calendar.getInstance();
           if(cal.get(Calendar.HOUR_OF_DAY ) <12){
               caLamViec = 1;
           }
           else caLamViec = 2;
           ArrayList<ThanhVien> listNV = DAO.getNhanVienByDateAndCa(date, caLamViec);

        %>
        
        <div class="row">
            <nav class="navbar navbar-inverse">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/QuanLiHome.jsp">Home</a>
                    </li>
                    <li class="active">
                        <a href="http://localhost:8080/EdenHallCoffee/QuanLiDonHang.jsp">Booking</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/QuanLiNhanVien.jsp">Staff</a>
                    </li>
                    <li>
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
                <div class="panel panel-default">
                    <!-- Default panel contents -->
                    <div class="panel-heading">Phân công công việc</div>
                        <div class="panel-body">
                            <p>Danh sách đơn hàng</p>
                        </div>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>ID đơn hàng</th>
                                    <th>Ngày</th>
                                    <th>Tên khách hàng</th>
                                    <th>Địa chỉ</th>
                                    <th>Số Điện Thoại</th>
                                    <th>Tổng tiền</th>
                                    <th>Chọn nhân viên</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    ArrayList<HoaDon> listHD = DAO.getDonHangChuaXuLi();
                                    for(HoaDon hd : listHD){
                                        ThanhVien kh = DAO.searchThanhVienById(hd.getIdKhachHang());
                                %>
                            <form action="PhanCong" method="post">
                                <tr>
                                    <td><%= hd.getId() %></td>
                                    <td><%= hd.getNgay() %></td>
                                    <td><%= kh.getTen() %></td>
                                    <td><%= kh.getDiaChi() %></td>
                                    <td><%= kh.getSoDienThoai() %></td>
                                    <td><%= hd.getTongTien() %> VNĐ</td>
                                    <td>
                                        <select name="idNhanVien" id="input" class="form-control" required="required">
                                            <%
                                                for(ThanhVien nv : listNV){
                                            %>
                                            <option value="<%= nv.getId() %>"><%= nv.getTen() %></option>
                                            <%
                                                }
                                            %>
                                        </select>
                                    </td>
                                    <td>
                                        <input type="hidden" name="idDonHang" value="<%= hd.getId() %>"/> 
                                        <button type="submit" class="btn btn-success">Phân công</button>
                                    </td>
                                </tr>
                            </form>
                                
                                <%
                                    }
                                %>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
