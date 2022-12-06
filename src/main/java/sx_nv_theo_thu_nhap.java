/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class thuNhapNhanVien{
    String ma;
    private String ten,chuc;
    private long lcb,nc;

    public thuNhapNhanVien(int i,String ten, String chuc, long lcb, long nc) {
        this.ma="NV"+String.format("%02d", i);
        this.ten = ten;
        this.chuc = chuc;
        this.lcb = lcb;
        this.nc = nc;
    }

    public String getMa() {
        return ma;
    }
    
    public long Luong1() {
        return lcb*nc;
    }
    
    public long PhucCap() {
        if(chuc.equals("GD")) return 500;
        else if(chuc.equals("PGD")) return 400;
        else if(chuc.equals("TP")) return 300;
        else if(chuc.equals("KT")) return 250; 
        return 100;
    }

    public long TamUng() {
        if((double)((Luong1()+PhucCap())*2/3)<(double)(25000))
            return (long)(Math.round(((double)(Luong1()+PhucCap())*2/3)/1000)*1000);
        else 
            return 25000;
    }
    public long ConLai() {
        return Luong1()+PhucCap()-TamUng();
    }

    public long getsapXep() {
        return Luong1()+PhucCap();
    }
    
    @Override
    public String toString() {
        return ma+" "+ten+" "+PhucCap()+" "+Luong1()+" "+TamUng()+" "+ConLai();
    }
    
}
public class sx_nv_theo_thu_nhap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<thuNhapNhanVien>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(new thuNhapNhanVien(i, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(list, Comparator.comparingLong(thuNhapNhanVien::getsapXep).reversed().thenComparing(thuNhapNhanVien::getMa));
        for(thuNhapNhanVien x:list){
            System.out.println(x);
        }
    }
}
