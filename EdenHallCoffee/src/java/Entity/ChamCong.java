/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Custom
 */
import java.sql.Date;
public class ChamCong {
    private int id;
    private int idNhanVien;
    private Date ngay;
    private int caLamViec;
    private float gioDen;
    private float gioVe;

    public ChamCong() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public int getCaLamViec() {
        return caLamViec;
    }

    public void setCaLamViec(int caLamViec) {
        this.caLamViec = caLamViec;
    }

    public float getGioDen() {
        return gioDen;
    }

    public void setGioDen(float gioDen) {
        this.gioDen = gioDen;
    }

    public float getGioVe() {
        return gioVe;
    }

    public void setGioVe(float gioVe) {
        this.gioVe = gioVe;
    }
    
    
}
