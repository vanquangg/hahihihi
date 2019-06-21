/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nhanvien;

/**
 *
 * @author Administrator
 */
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class DSNV{
    private final ArrayList<NhanVien> m=new ArrayList<>();
//    public ArrayList<NhanVien> getm()
//    {
//        return m;
//    }
    //them mot nhan vien 
    public void them(NhanVien nv)
    { m.add(nv);}
    //chèn
    public void chen(int i, NhanVien nv)
    { m.add(i, nv);} 
    //sua nhan vien vi tri thu i
    public void sua(int i, NhanVien v)
    { m.set(i, v);}
    //xoa nhan vien thu i trong danh sach
    public void xoaViTri(int i){
        m.remove(i);
    }
    //hien thi
    public String hienThi(){
        String s = " ";
        for(NhanVien nv: m)
            s+=nv.toString()+"\n";
        return s;
        
    }
    //Tong luong
    public double tongLuong(){
        double s=0;
        for (NhanVien nv:m)
            if(nv instanceof ChuyenVien ) 
                s=s+nv.tinhLuong();
                    return s;
    }
    //trung bình chuyen vien
    public double trungBinhLuong(){
        double s=0;
        int d=0;
        for (NhanVien nv:m)
            //if(nv instanceof ChuyenVien ) 
            {    
                s=s+nv.tinhLuong();
                d++;}
        if(d==0) return 0;
                    return s/d;
    }
    
   public NhanVien timMaxLuong(){
        int max=0;
       for(int i=1;i<m.size();i++)
        if(m.get(max).tinhLuong()<m.get(i).tinhLuong())
            max=i;
           return m.get(max);
    }
    //tim nhan vien co ma chi dinh
    public int timmanv(String ma){
        for(int i=0; i<m.size();i++)
            if(ma.equals(m.get(i).getMaNV()))
                return i;
        return -1;
    }
    public NhanVien timMa(String ma)
    { for(NhanVien v:m)
    if(ma.equals(v.getMaNV()))
        return v;
        return null; 
       
    }
    //tim nhan vien co phai chi dinh
    public String timPhai(boolean phai)
    {String s="";
     for(NhanVien v:m )
         if(phai==v.isPhai())
             s=s+v.toString()+"\n";
     return s;
    }
    //tim nhan vien co ho ten chi dinh
    public String timHoTen(String hoten){
        String s="";
        for (NhanVien v:m)
            if(hoten.equals(v.getHoTen())) 
                s=s+v.toString()+"\n";
                    return s;
    }
    //tim nhan vien co ngay vao lam sau ngay chi dinh
    public String timNgay(Date ngay )
    { String s="";
      for(NhanVien v:m)
          if(ngay==v.getNgayVaoLam())
              s=s+v.toString()+"\n"; 
      return s;
    }
    //xoa nhan vien co ngay vao lam sau ngay chi dinh
    public int[] xoangay(Date ngay)
    { int[] index = new int[50];
        int j=0;
        for(int i=0;i< m.size();i++)
            if(ngay.compareTo(m.get(i).getNgayVaoLam())>0)
            { m.remove(i);
            index[j]=i;
            j++;
            }
        return index;
        }
    //xoa nhan vien co ma chi dinh
    public int xoa( String ma){
     for(int i=0;i<m.size();i++)
        if(ma.equals(m.get(i).getMaNV()))
        {m.remove(i);
         return i;
        }
    return -1;
        }
    
    public int xoaHoTen( String hoten){
     for(int i=0;i<m.size();i++)
        if(hoten.equals(m.get(i).getHoTen()))
        {m.remove(i);
         return i;
        }
    return -1;
        }
   public static void main(String[] args)      
{ DSNV  ds = new DSNV();
Scanner k = new Scanner(System.in);
System.out.print(" Nhap so nhan vien can them: ");
int sonv=k.nextInt();
k.nextLine();
for(int i=0; i<sonv;i++)
    { System.out.print("Nhap chuyen vien (c) hay can bo quan li (b):") ;
      char s=k.nextLine().charAt(0);
      System.out.print("Ma: ");
      String maNV=k.nextLine();
      System.out.print("Ho ten: ");
      String hoTen=k.nextLine();
      System.out.print("He so luong:  ");
      double heSoLuong=Double.parseDouble(k.nextLine());
      System.out.print("Phai 1 nam, 0 nu: ");
      boolean phai=  true;
      int p =k.nextInt();
      if(p==0) phai = false;
      k.nextLine();
      System.out.print("Nhap ngay vao lam: ");
      DateFormat df=new SimpleDateFormat("yyyy/M/d");
      Date ngayVao= new Date();
      try{ ngayVao = df.parse(k.nextLine());
      } catch(ParseException e){}
  NhanVien nv ;
 if(s=='c'){
        System.out.print("Nhap cong viec: ");
        String congViec=k.nextLine();
        nv = new 
        ChuyenVien(congViec,maNV,hoTen,heSoLuong,ngayVao,phai);
    }
 else { System.out.print("Nhap chuc vu: ");
         String chucVu = k.nextLine();
         System.out.print("Phu cap chuc vu: ");
         long phuCapChucVu =  k.nextInt();
         nv  = new 
        CanBoQuanLy(chucVu,phuCapChucVu,maNV,hoTen,heSoLuong,ngayVao,phai);
 }
        ds.them(nv); 
 }
        System.out.println("Danh sach nhan vien:\n"+ ds.hienThi());
        System.out.println("Trung binh luong: "+ ds.trungBinhLuong());
        System.out.println("Nhan vien cuoi cung có luong max:\n"+ ds.timMaxLuong());
System.out.print("nhap ma can tim: "); 
String ma = k.nextLine();
NhanVien v=ds.timMa(ma);
if(v!=null) System.out.print("nhan vien tim duoc:\n "+v.toString());
k.nextLine();
System.out.print("nhap ho ten can tim: ");
String hoten=k.nextLine();
String nv = ds.timHoTen(hoten);
if(nv!=null) System.out.print(nv);
}
}

   
  
  
     
            

