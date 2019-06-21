/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nhanvien;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class ChuyenVien extends NhanVien {
    private String congViec;

    public ChuyenVien(String congViec, String maNV, String hoTen, double heSoLuong, Date ngayVaoLam, boolean phai) {
        super(maNV, hoTen, heSoLuong, ngayVaoLam, phai);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "ChuyenVien{" +super.toString()+ "congViec=" + congViec + '}';
    }  
    @Override
    public double tinhLuong(){
    return this.heSoLuong*105000+this.phuCapThamNien();
}
    @Override
    public double thuong(){
    return this.soNam()*50000;
}

 
}
   

