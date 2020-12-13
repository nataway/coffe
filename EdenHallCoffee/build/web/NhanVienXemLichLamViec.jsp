

<%@page import="Entity.ChamCong"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entity.LichLamViec"%>
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
            #noidung{
                height: 500px;
                overflow: auto;
            }
        </style>
    </head>
    <body>
        <%
            ThanhVien tv = (ThanhVien) session.getAttribute("tv"); 
            Calendar cal = Calendar.getInstance();
            int month = cal.get(Calendar.MONTH)+1; 
            int year = cal.get(Calendar.YEAR);
            
            long millis=System.currentTimeMillis();  
            java.sql.Date date=new java.sql.Date(millis);
        %>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <div class="row">
            <nav class="navbar navbar-inverse">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/NhanVienHome.jsp">Home</a>
                    </li>
                    <li class="active">
                        <a href="http://localhost:8080/EdenHallCoffee/NhanVienXemLichLamViec.jsp">Schedule</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/NhanVienXemCongViec.jsp">Mission</a>
                    </li>
                    <li>
                        <a href="http://localhost:8080/EdenHallCoffee/NhanVienDangKiLichLamViec.jsp">Registration</a>
                    </li>
                </ul>
            </nav>
        </div>
        
        <div class="row">
            <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                <img src="Img/Logo.png" style="width: 320px; height: 320px;" >
            </div>

            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4" id="noidung">
                
                <div class="panel panel-default">
                      <div class="panel-heading">
                            <h3 class="panel-title">Lịch làm việc tháng <%= month %> của <%= tv.getTen()  %></h3>
                      </div>
                      <div class="panel-body">
                          <table class="table-bordered">
                              <tr style="height: 35px;">
                                    <th>Ngày</th>
                                    <th>Ca</th>
                                    <th>Trạng thái</th>
                                    <th></th>
                                </tr>
                                <%
                                    ArrayList<LichLamViec> listLLV = DAO.getLichLamViecByIdAndMonth(tv.getId(), month, year);
                                    ArrayList<ChamCong> listCC = DAO.getChamCongByIdAndMonth(tv.getId(), month, year);
                                    int stt = 1;
                                    for(LichLamViec l : listLLV){
                                        String ca="";
                                        if(l.getCaLamViec()==1) ca = "Sáng";
                                        else ca = "Chiều";
                                        String codeColor_1 = "#8ceff8";
                                        String codeColor_2 = "#f88c8c";
                                %>
                                <tr style="height: 50px; background-color: <% if(stt%2 == 1){ %> <%= codeColor_1 %> <% }else{ %> <%= codeColor_2 %> <% } %>">
                                    <td style="width: 100px"><%= l.getNgay() %></td>
                                    <td style="width: 50px"><%= ca %></td>
                                    <%
                                        boolean checkDaDiLam = false;
                                        for(ChamCong c : listCC){
                                            if((c.getNgay().equals(l.getNgay())) && (c.getCaLamViec()==l.getCaLamViec())){
                                                checkDaDiLam = true;
                                            }
                                        }
                                        if((checkDaDiLam == true)&&(l.getNgay().before(date))){
                                    %>
                                    <td style="width: 80px; padding-left: 20px;">
                                        <img src="Img/yes.png" style="width: 30px; height: 30px;">
                                    </td>
                                    <td style="width: 150px">
                                        <a href="#">View history</a>
                                    </td>
                                    <%
                                            }else if(l.getNgay().before(date)){
                                    %>
                                    <td style="width: 80px; padding-left: 20px;">
                                        <img src="Img/no.png" style="width: 30px; height: 30px;" >
                                    </td>
                                    <td style="width: 150px"><a href="#">View history</a></td>
                                    <%
                                                  }else{           
                                    %>
                                    <td style="width: 80px;"></td>
                                    <td style="width: 150px"></td>
                                    <%
                                                    }
                                    %>
                                </tr>
                                <%
                                        stt++;
                                    }
                                %>
                            </table>    
                      </div>
                </div>
            </div>
            <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
                
            </div>
        </div>
    </body>
</html>
