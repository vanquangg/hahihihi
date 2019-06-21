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
public class CanBoQuanLy extends NhanVien {
  private String chucVu;
  private double phuCapChucVu;

    public CanBoQuanLy(String chucVu, double phuCapChucVu, String maNV, String hoTen, double heSoLuong, Date ngayVaoLam, boolean phai) {
        super(maNV, hoTen, heSoLuong, ngayVaoLam, phai);
        this.chucVu = chucVu;
        this.phuCapChucVu = phuCapChucVu;
    }
    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getPhuCapChucVu() {
        return phuCapChucVu;
    }

    public void setPhuCapChucVu(double phuCapChucVu) {
        this.phuCapChucVu = phuCapChucVu;
    }

    @Override
    public String toString() {
        return "CanBoQuanLy{" +super.toString()+ "chucVu=" + chucVu + ", phuCapChucVu=" + phuCapChucVu + '}';
    }
  @Override
    public double tinhLuong(){
    return (this.heSoLuong*105000+this.phuCapThamNien()+this.phuCapChucVu);
}
  @Override
  public double thuong(){
    return this.soNam()*100000;
}
    }
