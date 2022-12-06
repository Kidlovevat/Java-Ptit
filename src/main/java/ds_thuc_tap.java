/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS2020
 */
import java.util.*;
class dn{
    private String ma,ten,lop,email,tendn;
    private int tt;
    public dn(int i,String ma,String ten,String lop,String email,String tendn){
        this.ma = ma;
        this.ten = ten;
        this.tt = i;
        this.lop = lop;
        this.email= email;
        this.tendn = tendn;
    }
    public String getMa(){
        return ma;
    }
    public String getTendn(){
        return tendn;
    }
    public String getTen(){
        return ten;
    }
    @Override
    public String toString(){
        return tt+" "+ma+" "+ten+" "+lop+" "+email+" "+tendn;
               
    }
}
public class ds_thuc_tap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<dn> ls = new ArrayList<>();
        
        for(int i = 1; i <= t; i++){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String tendn = sc.nextLine();
           
            ls.add(new dn(i,ma,ten,lop,email,tendn));
        }
        Collections.sort(ls,Comparator.comparing(dn::getMa));
        
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String q = sc.nextLine();
            for(dn x:ls) if(x.getTendn().equals(q))System.out.println(x);
        }
        
    }
}
