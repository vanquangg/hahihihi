/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nhanvien;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public abstract class NhanVien implements INhanVien{
    protected String maNV, hoTen;
    protected double heSoLuong;
    protected Date ngayVaoLam; 
    DateFormat df = new SimpleDateFormat("yyyy/M/d");
     protected boolean phai;

    public NhanVien(String maNV, String hoTen, double heSoLuong, Date ngayVaoLam, boolean phai) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.heSoLuong = heSoLuong;
        this.ngayVaoLam = ngayVaoLam;
        this.phai = phai;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public boolean isPhai() {
        return phai;
    }

    public void setPhai(boolean phai) {
        this.phai = phai;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", hoTen=" + hoTen + ", heSoLuong=" + heSoLuong + ", ngayVaoLam=" + df.format(ngayVaoLam) + ", phai=" + phai + '}';
    }
    
     public long soNam(){
         return(Calendar.getInstance().getTime().getTime() - this.ngayVaoLam.getTime())/1000/60/60/24/365;
     }
     public long phuCapThamNien(){
         return this.soNam()*200000; 
    }
     public  abstract double thuong();
     
    /* public static  void main(String[] args)
     {
         
     }*/
}

