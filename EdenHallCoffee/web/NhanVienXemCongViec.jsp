

<%@page import="Entity.SanPham"%>
<%@page import="Entity.ChiTietHoaDon"%>
<%@page import="Entity.HoaDon"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Data.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Member</title>

        <!-- Bootstrap CSS -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

        <style>
            #noidung{
                height: 550px;
                overflow: auto;
            }
            th, td{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <%@page import="Entity.ThanhVien"%>
        <%
            ThanhVien tv = (ThanhVien) session.getAttribute("tv"); 
            
            ArrayList<HoaDon> listDH = DAO.getDonHangByIdNhanVien(tv.getId()); 
        %>
        <!-- jQuery -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <!-- Bootstrap JavaScript -->
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
                    <li  class="active">
                        <a href="http://localhost:8080/EdenHallCoffee/NhanVienXemCongViec.jsp">Mission</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/NhanVienDangKiLichLamViec.jsp">Registration</a>
                    </li>
                </ul>
            </nav>
        </div>
        
        <div class="row">
            <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3" style="height: 550px;" >
                <img src="Img/Logo.png" style="width: 320px; height: 320px;" >
            </div>
            
            <div class="col-xs-9 col-sm-9 col-md-9 col-lg-9" id="noidung">
                <div class="panel panel-default">
                    <!-- Default panel contents -->
                    <div class="panel-heading">Danh sách đơn hàng</div>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>STT</th>
                                    <th>Ngày</th>
                                    <th>Tên khách hàng</th>
                                    <th>Số điện thoại</th>
                                    <th>Địa chỉ</th>
                                    <th>Tổng tiền</th>
                                    <th>Chi Tiết</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    int stt = 1;
                                    for(HoaDon dh : listDH){
                                        ThanhVien kh = DAO.searchThanhVienById(dh.getIdKhachHang());
                                %>
                                <form action="ThanhToan" method="post">
                                    <tr>
                                        <td><%= stt %></td>
                                        <td><%= dh.getNgay() %></td>
                                        <td><%= kh.getTen() %></td>
                                        <td><%= kh.getSoDienThoai() %></td>
                                        <td><%= kh.getDiaChi() %></td>
                                        <td><%= dh.getTongTien() %> VNĐ</td>
                                        <td>
                                            <table class="table table-bordered table-hover">
                                                <thead>
                                                    <tr>
                                                        <th>STT</th>
                                                        <th>Tên sản phẩm</th>
                                                        <th>Giá</th>
                                                        <th>Số lượng</th> 
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                <%
                                                    ArrayList<ChiTietHoaDon> listSP = DAO.getCTHDByID(dh.getId());
                                                    int stt1 = 1;
                                                    for(ChiTietHoaDon cthd : listSP){
                                                        SanPham sp = DAO.getSanPhamById(cthd.getIdSanPham());
                                                    
                                                %>
                                                    <tr>
                                                        <td><%= stt1 %></td>
                                                        <td><%= sp.getName() %></td>
                                                        <td><%= sp.getPrice() %></td>
                                                        <td><%= cthd.getSoLuong() %></td>  
                                                    </tr>
                                                    
                                                <%
                                                        stt1++;
                                                    }
                                                %>    
                                                </tbody>
                                            </table>
                                        </td>
                                        <td>
                                            <input type="hidden" name="idDonHang" value="<%= dh.getId() %>"/>
                                            <button type="submit" class="btn btn-success">Thanh toán</button>
                                        </td>
                                    </tr>
                                </form>
                                
                                <%
                                    stt++;
                                    }
                                %>
                            </tbody>
                        </table>
                    </div>
            </div>    
        </div>
        
        
    </body>
</html>


