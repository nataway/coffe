package Data;

import Entity.ChamCong;
import Entity.ChiTietHoaDon;
import Entity.HoaDon;
import Entity.LichLamViec;
import Entity.SanPham;
import Entity.ThanhVien;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Nguyen Tien Thuat
 */
public class DAO {  

    public static Connection getConnect() throws ClassNotFoundException, SQLException{
        String connectionURL = "jdbc:mysql://localhost:3306/cf?autoReconnect=true&useSSL=false";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(connectionURL,"root","root");
        return connection;
    }
    
    public static void addNhanVien(ThanhVien client) throws Exception{
        String sql = "INSERT INTO tblthanhvien(ten,gioiTinh,diaChi,soDienThoai,tenDangNhap,matKhau,viTri) "
                        +"VALUES ('"+client.getTen()+"','"+client.getGioiTinh()+"','"+client.getDiaChi()+"','"
                                    +client.getSoDienThoai()+"','"+client.getTenDangNhap()+"','"+client.getMatKhau()+"', "+2+")";
        try{ 
            Connection connection = getConnect();
            Statement st = connection.createStatement();
            st.executeUpdate(sql);
            connection.close();
        } catch (Exception e) {
        }
    }
    
    public static int addKhachHang(ThanhVien client) throws Exception {
        int id = -1;
        String sql = "INSERT INTO tblthanhvien(ten,gioiTinh,diaChi,soDienThoai,tenDangNhap,matKhau,viTri) "
                        +"VALUES ('"+client.getTen()+"','"+client.getGioiTinh()+"','"+client.getDiaChi()+"','"
                                    +client.getSoDienThoai()+"','"+client.getTenDangNhap()+"','"+client.getMatKhau()+"', "+3+")";
        String sql1 = "SELECT id FROM tblthanhvien WHERE soDienThoai='"+client.getSoDienThoai()+"'";
        try {
            Connection connection = getConnect();
            Statement st = connection.createStatement();
            st.executeUpdate(sql);
            ResultSet rs = st.executeQuery(sql1);
            while(rs.next()){
                id = rs.getInt(1);
            }
            connection.close();
        } catch (Exception e) {
        }
        return id;
    }
    
    public static ArrayList<SanPham> getCafe() throws Exception{
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        String sql = "SELECT id,name, price, url, type FROM tblsanpham WHERE type = 'cafe'";
        
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setId(rs.getInt(1));
                sp.setName(rs.getString(2));
                sp.setPrice(rs.getInt(3));
                sp.setUrl(rs.getString(4));
                sp.setType(rs.getString(5));
                list.add(sp);
            }
            con.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public static ArrayList<SanPham> getBanhNgot() throws Exception{
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        String sql = "SELECT id,name, price, url, type FROM tblsanpham WHERE type = 'banhngot'";
        
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setId(rs.getInt(1));
                sp.setName(rs.getString(2));
                sp.setPrice(rs.getInt(3));
                sp.setUrl(rs.getString(4));
                sp.setType(rs.getString(5));
                list.add(sp);
            }
            con.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public static ArrayList<SanPham> getCockTail() throws Exception{
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        String sql = "SELECT id,name, price, url, type FROM tblsanpham WHERE type = 'cocktail'";
        
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setId(rs.getInt(1));
                sp.setName(rs.getString(2));
                sp.setPrice(rs.getInt(3));
                sp.setUrl(rs.getString(4));
                sp.setType(rs.getString(5));
                list.add(sp);
            }
            con.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public static ArrayList<SanPham> getNuocEp() throws Exception{
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        String sql = "SELECT id,name, price, url, type FROM tblsanpham WHERE type = 'nuocep'";
        
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setId(rs.getInt(1));
                sp.setName(rs.getString(2));
                sp.setPrice(rs.getInt(3));
                sp.setUrl(rs.getString(4));
                sp.setType(rs.getString(5));
                list.add(sp);
            }
            con.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public static ArrayList<SanPham> getAllSanPham() throws Exception{
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        String sql = "SELECT id,name, price, url, type FROM tblsanpham";
        
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setId(rs.getInt(1));
                sp.setName(rs.getString(2));
                sp.setPrice(rs.getInt(3));
                sp.setUrl(rs.getString(4));
                sp.setType(rs.getString(5));
                list.add(sp);
            }
            con.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public static void themSanPhamVaoMenu(SanPham sp){
        String sql = "INSERT INTO tblsanpham(name,url,price,type) VALUES (?,?,?,?)";
        try {
            Connection con = getConnect();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sp.getName());
            ps.setString(2, sp.getUrl());
            ps.setInt(3, sp.getPrice());
            ps.setString(4, sp.getType());
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
        }
    }
    
    public static SanPham getSanPhamById(int id){
        String sql = "SELECT id, name, price, url, type FROM tblsanpham WHERE id ='"+id+"'";
        SanPham sp = new SanPham();
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                sp.setId(rs.getInt(1));
                sp.setName(rs.getString(2));
                sp.setPrice(rs.getInt(3));
                sp.setUrl(rs.getString(4));
                sp.setType(rs.getString(5));
            }
            con.close();
        } catch (Exception e) {
        }
        return sp;
    }
    
    public static ArrayList<ThanhVien> getAllNhanVien(){
        ArrayList<ThanhVien> list = new ArrayList<ThanhVien>();
        String sql = "SELECT id,ten, gioiTinh, diaChi, soDienThoai, viTri FROM tblthanhvien WHERE viTri != 3";
        
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                ThanhVien tv = new ThanhVien();
                tv.setId(rs.getInt(1));
                tv.setTen(rs.getString(2));
                tv.setGioiTinh(rs.getString(3));
                tv.setDiaChi(rs.getString(4));
                tv.setSoDienThoai(rs.getString(5));
                tv.setViTri(rs.getInt(6));
                list.add(tv);
            }
            con.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public static ThanhVien checkThanhVien(String user, String pass){
        String sql = "SELECT * FROM tblthanhvien WHERE tenDangNhap = '"+user+"' AND matKhau ='"+pass+"'";
        try {
            Connection con = getConnect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ThanhVien client = new ThanhVien();
            while(rs.next()){
                client.setId(rs.getInt(1));
                client.setTen(rs.getString(2));
                client.setGioiTinh(rs.getString(3));
                client.setDiaChi(rs.getString(4));
                client.setSoDienThoai(rs.getString(5));
                client.setTenDangNhap(rs.getString(6));
                client.setMatKhau(rs.getString(7));
                client.setViTri(rs.getInt(8));
            }
            return client;
            
        } catch (Exception e) {
        }
        return null;
    }
    
    public static ThanhVien doiPass(ThanhVien tv, String pass){
        int id = tv.getId();
        String sql = "UPDATE tblthanhvien SET matKhau = '"+pass+"' WHERE id = "+id+"";
        String turnOffSafe = "SET SQL_SAFE_UPDATES = 0";
        String turnOnSafe = "SET SQL_SAFE_UPDATES = 1";
        try {
            Connection con = getConnect();
            //Tat SafeMode
            Statement st = con.createStatement();
            st.executeUpdate(turnOffSafe);
            
            st.executeUpdate(sql);
            
            //Bat SafeMoode
            st.executeUpdate(turnOnSafe);
            con.close();
        } catch (Exception e) {
        }
        return DAO.searchThanhVienById(id);
    }
    
    public static ThanhVien searchThanhVienByName(String ten){
        String sql = "SELECT id,ten, gioiTinh, diaChi, soDienThoai, viTri FROM tblthanhvien WHERE viTri != 3 AND ten ='"+ten+"'";
        ThanhVien tv = new ThanhVien();
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                tv.setId(rs.getInt(1));
                tv.setTen(rs.getString(2));
                tv.setGioiTinh(rs.getString(3));
                tv.setDiaChi(rs.getString(4));
                tv.setSoDienThoai(rs.getString(5));
                tv.setViTri(rs.getInt(6));
            }
            con.close();
        } catch (Exception e) {
        }
        return tv;
    }
    
     public static ThanhVien searchThanhVienByEmail(String email){
        String sql = "SELECT id,ten, gioiTinh, diaChi, soDienThoai, viTri, tenDangNhap FROM tblthanhvien WHERE tenDangNhap ='"+email+"'";
        ThanhVien tv = new ThanhVien();
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                tv.setId(rs.getInt(1));
                tv.setTen(rs.getString(2));
                tv.setGioiTinh(rs.getString(3));
                tv.setDiaChi(rs.getString(4));
                tv.setSoDienThoai(rs.getString(5));
                tv.setViTri(rs.getInt(6));
                tv.setTenDangNhap(rs.getString(7));
            }
            con.close();
        } catch (Exception e) {
        }
        return tv;
    }
    
    public static ThanhVien searchThanhVienById(int id){
        String sql = "SELECT id,ten, gioiTinh, diaChi, soDienThoai, viTri, tenDangNhap FROM tblthanhvien WHERE id ='"+id+"'";
        ThanhVien tv = new ThanhVien();
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                tv.setId(rs.getInt(1));
                tv.setTen(rs.getString(2));
                tv.setGioiTinh(rs.getString(3));
                tv.setDiaChi(rs.getString(4));
                tv.setSoDienThoai(rs.getString(5));
                tv.setViTri(rs.getInt(6));
                tv.setTenDangNhap(rs.getString(7));
            }
            con.close();
        } catch (Exception e) {
        }
        return tv;
    }
    
    public static ThanhVien searchThanhVienBySDT(String sdt){
        String sql = "SELECT id,ten, gioiTinh, diaChi, soDienThoai, viTri, tenDangNhap FROM tblthanhvien WHERE soDienThoai ='"+sdt+"'";
        ThanhVien tv = new ThanhVien();
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                tv.setId(rs.getInt(1));
                tv.setTen(rs.getString(2));
                tv.setGioiTinh(rs.getString(3));
                tv.setDiaChi(rs.getString(4));
                tv.setSoDienThoai(rs.getString(5));
                tv.setViTri(rs.getInt(6));
                tv.setTenDangNhap(rs.getString(7));
            }
            con.close();
        } catch (Exception e) {
        }
        return tv;
    }
    
    public static void XoaThanhVien(int id){
        String sql = "DELETE FROM tblthanhvien WHERE id = "+id;
        try {
            Connection connection = getConnect();
            Statement st = connection.createStatement();
            st.executeUpdate(sql);
            connection.close();
        } catch (Exception e) {
        }
    }
    
    public static void themLichLamViec(LichLamViec llv){
        String sql = "INSERT INTO tbllichlamviec(idNhanVien,tenNhanVien,ngay,caLamViec) "
                        +"VALUES (?,?,?,?)";
        try {
            Connection connection = getConnect();
        
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, llv.getIdNhanVien());
            ps.setString(2, llv.getTenNhanVien());
            ps.setDate(3, llv.getNgay());
            ps.setInt(4, llv.getCaLamViec());
            ps.executeUpdate();
            connection.close();
        } catch (Exception e) {
        }
    }
    
    public static boolean checkDaDangKiLLV(int id){
        
        Calendar cal0 = Calendar.getInstance();        
        cal0.set(Calendar.MONTH, Calendar.OCTOBER);
        cal0.set(Calendar.DATE, 14);
        cal0.set(Calendar.YEAR, 2019);
        java.util.Date date0 = cal0.getTime();

        Calendar cal = Calendar.getInstance();
        java.util.Date date = cal.getTime();

        long hieu = (date.getTime()-date0.getTime())/ (24 * 3600 * 1000)%7;

        Calendar cal1 = Calendar.getInstance();
        cal1.add(Calendar.DATE, (int)(7-hieu));
        
        Date thuHai = new Date(cal1.getTime().getTime());
        
        String sql = "SELECT id FROM tbllichlamviec WHERE idNhanVien= " + id + " AND ngay >= '"+thuHai+"'";
        
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()) return true;
            con.close();
        } catch (Exception e) {
        }
        
        return false;
    }
    
    public static ArrayList<HoaDon> getDonHangChuaXuLi(){
        ArrayList<HoaDon> list = new ArrayList<HoaDon>();
        String sql = "SELECT id, idNhanVien, idKhachHang,ngay,tongTien,trangThai FROM tblhoadon WHERE idNhanVien=-1";
        
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                HoaDon hd = new HoaDon();
                hd.setId(rs.getInt(1));
                hd.setIdNhanVien(rs.getInt(2));
                hd.setIdKhachHang(rs.getInt(3));
                hd.setNgay(rs.getDate(4));
                hd.setTongTien(rs.getInt(5));
                hd.setTrangThai(rs.getString(6));
                list.add(hd);
            }
            con.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public static ArrayList<HoaDon> getDonHangByIdNhanVien(int id){
        ArrayList<HoaDon> list = new ArrayList<HoaDon>();
        String sql = "SELECT id, idNhanVien, idKhachHang,ngay,tongTien,trangThai FROM tblhoadon WHERE idNhanVien= " + id+" AND trangThai = 'ChuaThanhToan'";
        
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                HoaDon hd = new HoaDon();
                hd.setId(rs.getInt(1));
                hd.setIdNhanVien(rs.getInt(2));
                hd.setIdKhachHang(rs.getInt(3));
                hd.setNgay(rs.getDate(4));
                hd.setTongTien(rs.getInt(5));
                hd.setTrangThai(rs.getString(6));
                list.add(hd);
            }
            con.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public static ArrayList<ThanhVien> getNhanVienByDateAndCa(Date date, int caLamViec){
        ArrayList<ThanhVien> list = new ArrayList<ThanhVien>();
        String sql = "SELECT idNhanVien FROM tbllichlamviec WHERE ngay = '"+date+"' AND caLamViec = "+caLamViec;
        
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt(1);
                ThanhVien nv = DAO.searchThanhVienById(id);
                list.add(nv);
            }
            con.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public static void thanhToanByIdHoaDon(int id){
        String sql = "UPDATE tblhoadon SET trangThai = 'DaThanhToan' WHERE id = ?";
        String turnOffSafe = "SET SQL_SAFE_UPDATES = 0";
        String turnOnSafe = "SET SQL_SAFE_UPDATES = 1";
        try {
            Connection con = getConnect();
            
            //Tat SafeMode
            Statement st = con.createStatement();
            st.executeUpdate(turnOffSafe);
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            
            //Bat SafeMoode
            st.executeUpdate(turnOnSafe);
            con.close();
        } catch (Exception ex) {
        }
    }
    
    public static ArrayList<LichLamViec> getLichLamViecByIdAndMonth(int idNhanVien, int month, int year){
        ArrayList<LichLamViec> list = new ArrayList<>();
        
        String startDate = year+"-"+month+"-01";
        int nextMonth;
        int nextYear = year;
        if(month == 12){
            nextMonth = 1;
            nextYear = year + 1;
        }
        else{
            nextMonth = month+1;
            nextYear = year;
        }
        
        String endDate = nextYear+"-"+nextMonth+"-1";
        
        String sql = "SELECT * FROM tbllichlamviec WHERE idNhanVien ="+idNhanVien + " AND ngay >= '" + startDate + "' AND ngay < '"+endDate +"'";
        
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                LichLamViec lich = new LichLamViec();
                lich.setId(rs.getInt(1));
                lich.setIdNhanVien(rs.getInt(2));
                lich.setTenNhanVien(rs.getString(3));
                lich.setNgay(rs.getDate(4));
                lich.setCaLamViec(rs.getInt(5));
                list.add(lich);
            }
            con.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public static ArrayList<LichLamViec> getLichLamViecTuanById(int idNhanVien){
        ArrayList<LichLamViec> list = new ArrayList<>();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK, 1);
        int ngay = cal.getTime().getDay();
        int thang = cal.getTime().getMonth();
        int nam = cal.getTime().getYear();
        
        String startDate = nam+"-"+thang+"-"+ngay;
        cal.set(Calendar.DAY_OF_WEEK, 7);
        ngay = cal.getTime().getDay();
        thang = cal.getTime().getMonth();
        nam = cal.getTime().getYear();
        String endDate = nam+"-"+thang+"-"+ngay;
        
        String sql = "SELECT * FROM tbllichlamviec WHERE idNhanVien ="+idNhanVien + " AND ngay >= '" + startDate + "' AND ngay <= '"+endDate +"'";
        
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                LichLamViec lich = new LichLamViec();
                lich.setId(rs.getInt(1));
                lich.setIdNhanVien(rs.getInt(2));
                lich.setTenNhanVien(rs.getString(3));
                lich.setNgay(rs.getDate(4));
                lich.setCaLamViec(rs.getInt(5));
                list.add(lich);
            }
            con.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public static ArrayList<ChamCong> getChamCongByIdAndMonth(int idNhanVien, int month, int year){
        ArrayList<ChamCong> list = new ArrayList<>();
        
        String startDate = year+"-"+month+"-01";
        String endDate = year+"-"+month+"-31";
        
        String sql = "SELECT * FROM tblchamcong WHERE idNhanVien ="+idNhanVien + " AND ngay >= '" + startDate + "' AND ngay <= '"+endDate +"'";
        
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                ChamCong c = new ChamCong();
                c.setId(rs.getInt(1));
                c.setIdNhanVien(rs.getInt(2));
                c.setNgay(rs.getDate(3));
                c.setCaLamViec(rs.getInt(4));
                c.setGioDen(rs.getFloat(5));
                c.setGioVe(rs.getFloat(6));
                list.add(c);
            }
            con.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public static void themChiTietHoaDon(ChiTietHoaDon cthd){
        String sql = "INSERT INTO tblchitiethoadon(idSanPham,soLuong,idHoaDon) "
                        +"VALUES (?,?,?)";
        try {
            Connection connection = getConnect();
        
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, cthd.getIdSanPham());
            ps.setInt(2, cthd.getSoLuong());
            ps.setInt(3, cthd.getIdHoaDon());
        
            ps.executeUpdate();
            connection.close();
        } catch (Exception e) {
        }
    }
    
    public static ArrayList<ChiTietHoaDon> getCTHDByID(int id){
        ArrayList<ChiTietHoaDon> list = new ArrayList<ChiTietHoaDon>();
        String sql = "SELECT idSanPham, soLuong FROM tblchitiethoadon WHERE idHoaDon= "+id;
        
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                ChiTietHoaDon cthd = new ChiTietHoaDon();
                cthd.setIdSanPham(rs.getInt(1));
                cthd.setSoLuong(rs.getInt(2));
                
                list.add(cthd);
            }
            con.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public static int themHoaDon(HoaDon hd){
        String sql = "INSERT INTO tblhoadon(idNhanVien, idKhachHang, ngay, tongTien, trangThai) "
                        +"VALUES (?,?,?,?,?)";
        String sql1 = "SELECT id FROM tblhoadon WHERE idNhanVien=? AND idKhachHang=? AND ngay=? AND tongTien=? AND trangThai=?";
        
        try {
            Connection connection = getConnect();
        
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, hd.getIdNhanVien());
            ps.setInt(2, hd.getIdKhachHang());
            ps.setDate(3, hd.getNgay());
            ps.setInt(4, hd.getTongTien());
            ps.setString(5, hd.getTrangThai());
            
            ps.executeUpdate();
            
            
            int id = -1;
            PreparedStatement ps1 = connection.prepareStatement(sql1);
            ps1.setInt(1, hd.getIdNhanVien());
            ps1.setInt(2, hd.getIdKhachHang());
            ps1.setDate(3, hd.getNgay());
            ps1.setInt(4, hd.getTongTien());
            ps1.setString(5, hd.getTrangThai());
            ResultSet rs = ps1.executeQuery();
            while(rs.next()){
                id = rs.getInt(1);
            }
            connection.close();
            return id;
        } catch (Exception e) {
        }
        return -1;
    }
    
    public static void phanCong(int idHoaDon, int idNhanVien){
        String sql = "UPDATE tblhoadon SET idNhanVien = ? WHERE id = ?";
        try {
            Connection connection = getConnect();
        
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idNhanVien);
            ps.setInt(2, idHoaDon);
            ps.executeUpdate();
            connection.close();
        } catch (Exception e) {
        }
    }
    
    public static ArrayList<HoaDon> getDonHangByIdKhachHang(int id){
        ArrayList<HoaDon> list = new ArrayList<HoaDon>();
        String sql = "SELECT id, idNhanVien, idKhachHang,ngay,tongTien,trangThai FROM tblhoadon WHERE idKhachHang= " + id;
        
        try {
            Connection con = getConnect();
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                HoaDon hd = new HoaDon();
                hd.setId(rs.getInt(1));
                hd.setIdNhanVien(rs.getInt(2));
                hd.setIdKhachHang(rs.getInt(3));
                hd.setNgay(rs.getDate(4));
                hd.setTongTien(rs.getInt(5));
                hd.setTrangThai(rs.getString(6));
                list.add(hd);
            }
            con.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public static ArrayList<SanPham> locSanPhamByName(String key, ArrayList<SanPham> list){
        key = key.toLowerCase();
        ArrayList<SanPham> listNew = new ArrayList<>();
        for(SanPham sp : list){
            String name = sp.getName();
            name = name.toLowerCase();
            if(name.indexOf(key) != -1){
                listNew.add(sp);
            }
        }
        return listNew;
    }
    
    public static void suaSanPham(SanPham sp){
        String sql = "UPDATE tblsanpham SET name = ?, price = ?, url = ?, type = ? WHERE id = ?";
        String turnOffSafe = "SET SQL_SAFE_UPDATES = 0";
        String turnOnSafe = "SET SQL_SAFE_UPDATES = 1";
        try {
            Connection con = getConnect();
            
            //Tat SafeMode
            Statement st = con.createStatement();
            st.executeUpdate(turnOffSafe);
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sp.getName());
            ps.setInt(2, sp.getPrice());
            ps.setString(3, sp.getUrl());
            ps.setString(4, sp.getType());
            ps.setInt(5, sp.getId());
            ps.executeUpdate();
            
            //Bat SafeMoode
            st.executeUpdate(turnOnSafe);
            con.close();
        } catch (Exception ex) {
        }
    }
    
    public static void xoaSanPhamById(int id){
        String sql = "DELETE FROM tblsanpham WHERE id = "+id;
        try {
            Connection connection = getConnect();
            Statement st = connection.createStatement();
            st.executeUpdate(sql);
            connection.close();
        } catch (Exception e) {
        }
    }
    
    public static void suaNhanVien(ThanhVien nv){
        String sql = "UPDATE tblthanhvien SET ten = ?, gioiTinh = ?, diaChi = ?, soDienThoai = ?, tenDangNhap = ?, matKhau = ? WHERE id = ?";
        String turnOffSafe = "SET SQL_SAFE_UPDATES = 0";
        String turnOnSafe = "SET SQL_SAFE_UPDATES = 1";
        try {
            Connection con = getConnect();
            
            //Tat SafeMode
            Statement st = con.createStatement();
            st.executeUpdate(turnOffSafe);
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nv.getTen());
            ps.setString(2, nv.getGioiTinh());
            ps.setString(3, nv.getDiaChi());
            ps.setString(4, nv.getSoDienThoai());
            ps.setString(5, nv.getTenDangNhap());
            ps.setString(6, nv.getMatKhau());
            ps.setInt(7, nv.getId());
            ps.executeUpdate();
            
            //Bat SafeMoode
            st.executeUpdate(turnOnSafe);
            con.close();
        } catch (Exception ex) {
        }
    }
}    