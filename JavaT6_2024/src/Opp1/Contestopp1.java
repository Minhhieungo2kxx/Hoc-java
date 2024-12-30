package Opp1;

import java.io.*;
import java.util.*;

class SV {

    private String hoten, ngaysinh;
    private double d1, d2, d3;

    public SV(String hoten, String ngaysinh, double d1, double d2, double d3) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public double sumdiem() {
        return d1 + d2 + d3;
    }

    @Override
    public String toString() {
        return hoten + " " + ngaysinh + " " + sumdiem();
    }
}

public class Contestopp1 {

    public static void main(String[] args) {
        // Thử sử dụng đường dẫn tương đối
//        String inputFilePath = "input.txt";
//        String outputFilePath = "output.txt";

        // Hoặc sử dụng đường dẫn tuyệt đối (hãy chắc chắn thay thế đường dẫn đúng)
         String inputFilePath = "D:\\HOC JAVA\\file\\input.txt";
//         String outputFilePath = "D:\\HOC JAVA\\file\\output.txt";
         
         
        
        // Đọc dữ liệu từ file input.txt
        try {
            Scanner sc = new Scanner(new File(inputFilePath));
            String hoten = sc.nextLine();
            String ngaysinh = sc.nextLine();
            
            double d1 =Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            double d3 = Double.parseDouble(sc.nextLine());
            sc.close();

            // Tạo đối tượng sinh viên
            SV t = new SV(hoten, ngaysinh, d1, d2, d3);

//            // Ghi dữ liệu ra file output.txt
//            PrintWriter out = new PrintWriter(new FileWriter(outputFilePath));
//            out.println(t);
//            out.close();
              System.out.println(t);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + inputFilePath + " (" + e.getMessage() + ")");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
        
    }
}



//bai tiep:
//   class PS{  
//      int tu,mau;
//
//    public PS() {
//    }
//
//    public PS(int tu, int mau) {
//        this.tu = tu;
//        this.mau = mau;
//    }
//    public void nhap(){ 
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Nhap tu so:");
//        tu=sc.nextInt();
//        do{ 
//            System.out.println("Nhap mau so:");
//            mau=sc.nextInt();
//        }while(mau==0);
//        
//    }
//    
//    public void xuat(){ 
//        System.out.println(tu+"/"+mau);
//    }
//    public static int UCLN(int a,int b){    
//        if(b==0){   
//            return a;
//        }
//        return UCLN(b,a%b);
//    }
//    public void toigian(){ 
//        int tg=UCLN(mau, tu);
//        tu/=tg;
//        mau/=tg;
//        
//    }
//    
//      
//  }
//public class Contestopp1{    
//    public static void main(String[] args) {
//        PS p1=new PS();
//        p1.nhap();
//        p1.toigian();
//        System.out.println("Phan so rut gon la:");
//        p1.xuat();
//        
//        
//    }
//}
//bai 4:Lop nhan vien
//class Nhanvien {
//
//    String manv, hoten, gt, ngaysinh, address, mathue, ngayhd;
//
//    public Nhanvien() {
//    }
//
//    public Nhanvien(String manv, String hoten, String gt, String ngaysinh, String address, String mathue, String ngayhd) {
//        this.manv = manv;
//        this.hoten = hoten;
//        this.gt = gt;
//        this.ngaysinh = ngaysinh;
//        this.address = address;
//        this.mathue = mathue;
//        this.ngayhd = ngayhd;
//    }
//
//    public void nhap() {
//        Scanner sc = new Scanner(System.in);
//        manv = "NV001";
//        System.out.println("Nhap ho ten:");
//        hoten = sc.nextLine();
//        System.out.println("Nhap Gioi tinh:");
//        gt = sc.nextLine();
//        System.out.println("Nhap Ngay sinh:");
//        ngaysinh = sc.nextLine();
//        System.out.println("Nhap dia chi:");
//        address = sc.nextLine();
//        System.out.println("Nhap ma thue:");
//        mathue = sc.nextLine();
//        System.out.println("Nhap ngay hop dong:");
//        ngayhd = sc.nextLine();
//    }
//
//    public static String chuan(String date) {
//        String res = "";
//        String arr[] = date.split("/");
//        int day = Integer.parseInt(arr[0]);
//        int moth = Integer.parseInt(arr[1]);
//        int years = Integer.parseInt(arr[2]);
//        res = String.format("%02d/%02d/%d", day, moth, years);
//        return res;
//    }
//    public static String chuanten(String name){    
//        StringBuilder bd=new StringBuilder();
//        String arr[]=name.split("\\s+");
//        for(String x:arr){  
//            bd.append(Character.toUpperCase(x.charAt(0)));
//            for(int i=1;i<x.length();i++){  
//                bd.append(Character.toLowerCase(x.charAt(i)));
//            }
//            bd.append(" ");
//        }
//        bd.deleteCharAt(bd.length()-1);
//        return bd.toString();
//    }
//
//    public void in() {
//        System.out.print(manv + " " + chuanten(hoten) + " " + gt + " " + chuan(ngaysinh) + " " + address + " " + mathue + " " + chuan(ngayhd));
//    }
//
//}
//
//public class Contestopp1 {
//
//    public static void main(String[] args) {
//        Nhanvien t = new Nhanvien();
//        t.nhap();
//        t.in();
//        System.out.println("");
//    }
//}
//lop hcn
//class HCN {
//
//    int with, height;
//    String color;
//
//    public HCN() {
//    }
//
//    public HCN(int with, int height, String color) {
//        this.with = with;
//        this.height = height;
//        this.color = color;
//    }
//
//    public void nhap() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap chieu dai:");
//        with = sc.nextInt();
//        System.out.println("Nhap chieu rong:");
//        height = sc.nextInt();
//        System.out.println("Nhap mau:");
//        sc.nextLine();
//        color = sc.nextLine();
//
//    }
//
//    public static String chuanmau(String color) {
//        StringBuilder bd = new StringBuilder();
//        bd.append(Character.toUpperCase(color.charAt(0)));
//        for (int i = 1; i < color.length(); i++) {
//            bd.append(Character.toLowerCase(color.charAt(i)));
//        }
//      
//        return bd.toString();
//    }
//
//    public int findPremeter() {
//        return  (with + height) * 2;
//    }
//
//    public int findArea() {
//        return  (with * height);
//    }
//
//    public void in() {
//        if (with > 0 && height > 0) {
//            System.out.println(findPremeter()+" "+findArea()+" "+chuanmau(color));
//        }
//        else{
//            System.out.println("Not Found");
//        }
//    }
//
//}
//
//public class Contestopp1 {
//
//    public static void main(String[] args) {
//         HCN t=new HCN();
//         t.nhap();
//         t.in();
//    }
//}
//bai 9:thu nhap giao vien
//class Salary {
//
//    String ma, hoten;
//    int luong;
//
//    public Salary() {
//    }
//
//    public Salary(String ma, String hoten, int luong) {
//        this.ma = ma;
//        this.hoten = hoten;
//        this.luong = luong;
//    }
//
//    public void nhap() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap ma ngach:");
//        ma = sc.nextLine();
//        System.out.println("Nhap Ho ten:");
//        hoten = sc.nextLine();
//       
//        System.out.println("Nhap luong co ban:");
//        
//        luong = sc.nextInt();
//    }
//
//    public String chucvu(String ma) {
//        String res = "";
//        for (char x : ma.toCharArray()) {
//            if (Character.isAlphabetic(x)) {
//                res += x;
//            }
//        }
//        return res;
//    }
//
//    public String hsl(String ma) {
//        String res = "";
//        for (char x : ma.toCharArray()) {
//            if (Character.isDigit(x)) {
//                res += x;
//            }
//        }
//        return res;
//    }
//
//    public long tienluong() {
//        long sotien = 0;
//        if (chucvu(ma).equals("HT")) {
//            sotien = Integer.parseInt(hsl(ma)) * luong + 2000000;
//        } else if (chucvu(ma).equals("HP")) {
//            sotien = Integer.parseInt(hsl(ma)) * luong + 900000;
//        } else {
//            sotien = Integer.parseInt(hsl(ma)) * luong + 500000;
//        }
//        return sotien;
//    }
//
//    public void in() {
//        System.out.println(ma + " " + hoten + " " + Integer.parseInt(hsl(ma)) + " " + tienluong());
//    }
//
//}
//
//public class Contestopp1 {
//
//    public static void main(String[] args) {
//        Salary t = new Salary();
//        t.nhap();
//        t.in();
//    }
//}
//bai tiep:Tinh luong nhan vien
//class Nhanvien {
//
//    String mvn, hoten, chucvu;
//    int luong, snc;
//
//    public Nhanvien() {
//    }
//
//    public Nhanvien(String mvn, String hoten, String chucvu, int luong, int snc) {
//        this.mvn = mvn;
//        this.hoten = hoten;
//        this.chucvu = chucvu;
//        this.luong = luong;
//        this.snc = snc;
//    }
//
//    public void nhap() {
//        Scanner sc = new Scanner(System.in);
//        mvn = "NV01";
//        System.out.println("Nhap ho ten:");
//        hoten = sc.nextLine();
//        System.out.println("Nhap luong co ban:");
//        luong = sc.nextInt();
//        System.out.println("Nhap so ngay cong:");
//        snc = sc.nextInt();
//        System.out.println("Nhap chuc vu:");
//        sc.nextLine();
//        chucvu = sc.nextLine();
//
//    }
//
//    public int tienluongthang() {
//        return snc * luong;
//    }
//
//    public int tienthuong() {
//        int money = 0;
//        if (snc >= 25) {
//            money = (tienluongthang() * 20 / 100);
//        } else if (snc >= 22 & snc < 25) {
//            money = (tienluongthang() * 10 / 100);
//        } else if (snc < 22) {
//            money = 0;
//        }
//        return money;
//    }
//
//    public int phucap() {
//        int phu = 0;
//        if (chucvu.equals("GD")) {
//            phu = 250000;
//        } else if (chucvu.equals("PGD")) {
//            phu = 200000;
//        } else if (chucvu.equals("TP")) {
//            phu = 180000;
//        } else {
//            phu = 150000;
//        }
//        return phu;
//    }
//
//    public int sumtien() {
//        return tienluongthang() + tienthuong() + phucap();
//    }
//
//    public void in() {
//        System.out.println(mvn + " " + hoten + " " + tienluongthang() + " " + tienthuong() + " " + phucap() + " " + sumtien());
//    }
//
//}
//
//public class Contestopp1 {
//
//    public static void main(String[] args) {
//        Nhanvien t = new Nhanvien();
//        t.nhap();
//        t.in();
//
//    }
//}
//bai 12:Tuyen sinh
//class SV{   
//    String ma,hoten;
//    float t,l,h;
//
//    public SV() {
//    }
//
//    public SV(String ma, String hoten, float t, float l, float h) {
//        this.ma = ma;
//        this.hoten = hoten;
//        this.t = t;
//        this.l = l;
//        this.h = h;
//    }
//
//    public void nhap(){ 
//        Scanner sc=new Scanner(System.in).useLocale(Locale.US);
//        System.out.println("Nhap ma:");
//        ma=sc.nextLine();
//        System.out.println("Nhap ho ten:");
//        hoten=sc.nextLine();
//        System.out.println("Nhap Toan:");
//        t=sc.nextFloat();
//        sc.nextLine();
//        System.out.println("Nhap Ly:");
//        l=sc.nextFloat();
//        System.out.println("Nhap Hoa:");
//        h=sc.nextFloat();
//        
//    }
//    public String makv(){   
//        String res="";
//        res=ma.substring(0,3);
//        return res;
//    }
//    
//    public String kvso(){   
//        String res="";
//        res=ma.substring(2,3);
//        return res;
//    }
//    public float ut(){  
//        float cong=0;
//        if(makv().equals("KV1")){   
//            cong=(float) 0.5;
//        }
//       else if(makv().equals("KV2")){   
//            cong=(float) 1.0;
//        }
//       else if(makv().equals("KV3")){   
//            cong=(float) 2.5;
//        }
//        return cong;
//    }
//    public float sumdiem(){ 
//        return t+l+h+ut();
//    }
//    public String tt(){ 
//        String res="";
//        if(sumdiem()>=24){  
//            res="TRUNG TUYEN";
//        }
//        else{   
//            res="TRUOT";
//        }
//        return res;
//    }
//    public void in(){   
//        System.out.println(ma+" "+hoten+" "+kvso()+" "+String.format("%.1f",sumdiem())+" "+tt());
//    }
//
//    
//    
//}
// 
// public class Contestopp1 {
//     public static void main(String[] args) {
//         SV t=new SV();
//         t.nhap();
//         t.in();
//     }
// 
//bai 13:Lop phan so
//class PS {
//
//    int tu, mau;
//
//    public PS() {
//    }
//
//    public PS(int tu, int mau) {
//        this.tu = tu;
//        this.mau = mau;
//    }
//
//    public void nhap() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap tu so:");
//        tu = sc.nextInt();
//        System.out.println("Nhap mau so:");
//        mau = sc.nextInt();
//
//    }
//
//    public static int UCLN(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return UCLN(b, a % b);
//    }
//
//    public void toigian() {
//        int tg = UCLN(tu, mau);
//        tu /= tg;
//        mau /= tg;
//    }
//    public static PS cong(PS a,PS b){
//        PS c=new PS();
//        c.tu=a.tu*b.mau+b.tu*a.mau;
//        c.mau=a.mau*b.mau;
//        c.toigian();
//        return c;     
//      
//}
//    public static PS nhan(PS a,PS b){  
//        PS c=new PS();
//        c.tu=a.tu*b.tu;
//        c.mau=a.mau*b.mau;
//        c.toigian();
//        return c;
//    }
//
//    @Override
//    public String toString() {
//        return tu+"/"+mau;
//    }
//    
//}
//
//public class Contestopp1 {
//    public static void main(String[] args) {
//        PS p1= new PS(4, 6);
//        PS p2= new PS(5,25);
//        p1.toigian();
//        p2.toigian();
//        PS pow=PS.nhan(PS.cong(p1, p2),PS.cong(p1, p2));
//        PS tich=PS.nhan(PS.nhan(p1, p2),pow);
//        System.out.println(pow);
//        System.out.println(tich);
//      
//    }
//}
//lop Set 1:
// class InSet{   
//     TreeSet<Integer> set;
//
//    public InSet() {
//        set=new TreeSet<>();
//    }
//
//    public InSet(int a[]) {
//       set=new TreeSet<>();
//       for(int x:a){    
//           set.add(x);
//       }   
//    }
//    public  InSet intersection(InSet x){ 
//        InSet c=new InSet();
//        for(int t:this.set){    
//            if(x.set.contains(t)){  
//                c.set.add(t);
//            }
//        }
//        return c;
//    }
//
//    @Override
//    public String toString() {
//        String res="";
//        for(int x:set){ 
//            res+=x+" ";
//        }
//        return res;
//    }
//    
//    
//     
// }
//
//public class Contestopp1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        int a[]=new int[n];
//        int b[]=new int[m];
//        for(int i=0;i<n;i++){   
//            a[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++){   
//            b[i]=sc.nextInt();
//        }
//        InSet s1=new InSet(a);
//        InSet s2=new InSet(b);
//        InSet s3=s1.intersection(s2);
//        System.out.println(s3);
//        
//    }
//}
//lop Set 2:Hop 2 mang
//class InSet {
//
//    TreeSet<Integer> set;
//
//    public InSet() {
//        this.set = new TreeSet<>();
//    }
//
//    public InSet(int a[]) {
//        this.set = new TreeSet<>();
//        for (int x : a) {
//            this.set.add(x);
//        }
//    }
//
//    public InSet union(InSet p) {
//        InSet c = new InSet();
//        for (int t : this.set) {
//            c.set.add(t);
//        }
//        for (int g : p.set) {
//            c.set.add(g);
//        }
//        return c;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder bd = new StringBuilder();
//        for (int r : set) {
//            bd.append(r).append(" ");
//        }
//        return bd.toString().trim();
//    }
//
//}
//
//public class Contestopp1 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int a[] = new int[n];
//        int b[] = new int[m];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < m; i++) {
//            b[i] = sc.nextInt();
//        }
//        InSet s1 = new InSet(a);
//        InSet s2 = new InSet(b);
//        InSet s3 = s1.union(s2);
//        System.out.println(s3);
//    }
//}
//lop Set 3:
//  class WordSet{    
//      TreeSet<Character> set;
//
//    public WordSet() {
//        this.set=new TreeSet<>();
//        
//    }
//
//    public WordSet(String s) {
//        String h=s.toLowerCase();
//        this.set=new TreeSet<>();
//        for(char x:h.toCharArray()){    
//            this.set.add(x);
//        }
//    }
//    //hop
//    public WordSet union(WordSet p){    
//        WordSet c=new WordSet();
//        for(char t:this.set){   
//            c.set.add(t);
//        }
//        for(char t:p.set){   
//            c.set.add(t);
//        }
//        return c;
//    }
//    //giao
//    public WordSet intersection(WordSet p){    
//        WordSet c=new WordSet();
//        for(char t:this.set){   
//           if(p.set.contains(t)){   
//               c.set.add(t);
//           }
//        }
//        
//        return c;
//    }
//
//    @Override
//    public String toString() {
//        String res="";
//        for(char x:this.set){   
//            res+=x;
//        }
//        return res;
//    }
//    
//    
//    
//    
//    
//  }
//  
//public class Contestopp1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        WordSet s1=new WordSet(sc.nextLine());
//        WordSet s2=new WordSet(sc.nextLine());
//        System.out.println(s1.union(s2));
//        System.out.println(s1.intersection(s2));
//        
//    }
//}
//lop ma tran:
// class Matrix{  
//     int [][]mt;
//     int row,col;
//
//    public Matrix() {
//    }
//
//    public Matrix(int row, int col) {
//        
//        this.row = row;
//        this.col = col;
//        this.mt=new int[row][col];
//    }
//    public void nextMatrix(Scanner sc){ 
//        for(int i=0;i<row;i++){ 
//            for(int j=0;j<col;j++){ 
//                mt[i][j]=sc.nextInt();
//            }
//        }
//    }
//    public Matrix mul(Matrix b){    
//        Matrix c=new Matrix(this.row,b.col);
//        for(int i=0;i<this.row;i++){    
//            for(int j=0;j<b.col;j++){   
//                c.mt[i][j]=0;
//            for(int k=0;k<this.col;k++){    
//                c.mt[i][j]+=this.mt[i][k]*b.mt[k][j];
//            }
//            }
//            
//        }
//        return c;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder bd=new StringBuilder();
//        for(int i=0;i<this.row;i++){    
//            for(int j=0;j<this.col;j++){    
//                bd.append(this.mt[i][j]).append(" ");
//            }
//            bd.append("\n");
//        }
//        return bd.toString().trim();
//    }
//    
//    
//     
// }
// 
//public class Contestopp1 {
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int p = sc.nextInt();
//        
//        Matrix a = new Matrix(n, m);
//        a.nextMatrix(sc);
//        
//        Matrix b = new Matrix(m, p);
//        b.nextMatrix(sc);
//        
//        System.out.println(a.mul(b));
//    }
//}
//lop ma tran 2:
//  class Matrix{ 
//      int a[][];
//      int row,col;
//
//    public Matrix( int row, int col) {
//        this.row = row;
//        this.col = col;
//        this.a=new int[row][col];
//        
//    }
//    public void nextMatrix(Scanner sc){ 
//        for(int i=0;i<row;i++){ 
//            for(int j=0;j<col;j++){ 
//                this.a[i][j]=sc.nextInt();
//            }
//        }
//    }
//    public Matrix trans(){    
//        Matrix c=new Matrix(this.row, this.col);
//        for(int i=0;i<row;i++){ 
//            for(int j=0;j<col;j++){ 
//                c.a[j][i]=this.a[i][j];
//            }
//        }
//        return c;
//    }
//    public Matrix mul(Matrix b){    
//        Matrix c=new Matrix(this.row,b.col);
//        for(int i=0;i<this.row;i++){    
//            for(int j=0;j<b.col;j++){   
//                c.a[i][j]=0;
//             for(int k=0;k<this.col;k++){   
//                 c.a[i][j]+=this.a[i][k]*b.a[k][j];
//             }
//            }
//        }
//        return c;
//    }
//    
//    public String toString() {
//        StringBuilder bd=new StringBuilder();
//        for(int i=0;i<this.row;i++){    
//            for(int j=0;j<this.col;j++){    
//                bd.append(this.a[i][j]).append(" ");
//            }
//            bd.append("\n");
//        }
//        return bd.toString().trim();
//    }
//     
//      
//  }
//public class Contestopp1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt(),m=sc.nextInt();
//        Matrix a=new Matrix(n,m);
//        a.nextMatrix(sc);
//        Matrix b=a.trans();
//        System.out.println(b);
//        System.out.println(a.mul(b));
//        
//    }
//}
//bai 20:Lop time
//class Time {
//
//    String hour, minute, second;
//
//    public Time() {
//    }
//
//    public Time(String hour, String minute, String second) {
//        this.hour = hour;
//        this.minute = minute;
//        this.second = second;
//    }
//
//    public int giay() {
//        return Integer.parseInt(hour) * 60 * 60 + Integer.parseInt(minute) * 60 + Integer.parseInt(second);
//    }
//    
//    public String toString(){   
//        return hour+" "+minute+" "+second;
//    }
//}
//
//public class Contestopp1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=Integer.parseInt(sc.nextLine());
//        Time tt[]=new Time[n];
//        for(int i=0;i<n;i++){   
//            String gio,phut,giay;
//            gio=sc.nextLine();
//            phut=sc.nextLine();
//            giay=sc.nextLine();
//            tt[i]=new Time(gio,phut,giay);
//        }
//        Arrays.sort(tt,new Comparator<Time>(){  
//            @Override
//            public int compare(Time o1, Time o2) {
//                return o1.giay()-o2.giay();
//            }
//            
//        });
//        for(int i=0;i<n;i++){   
//            System.out.println(tt[i]);
//        }
//    }
//}
//bai 21:Danh sach mat hang
//  class MH{ 
//      String ma,ten,dvt;
//      double giamua,giaban;
//
//    public MH() {
//    }
//
//    public MH(String ma, String ten, String dvt, double giamua, double giaban) {
//        this.ma = ma;
//        this.ten = ten;
//        this.dvt = dvt;
//        this.giamua = giamua;
//        this.giaban = giaban;
//    }
//     public String toString(){  
//         return ma+" "+ten+" "+dvt+" "+giamua+" "+giaban+" "+profit();
//     }
//     public double profit(){    
//         return giaban-giamua;
//     }
//     public String getma(){ 
//         return ma;
//     }
//  }
// public class Contestopp1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=Integer.parseInt(sc.nextLine());
//         MH tt[]=new MH[n];
//         for(int i=0;i<n;i++){  
//             String ma,ten,dvt;
//             double ban,mua;
//             ma="MH"+String.format("%04d",i+1);
//             ten=sc.nextLine();
//             dvt=sc.nextLine();
//             ban=Double.parseDouble(sc.nextLine());
//             mua=Double.parseDouble(sc.nextLine());
//             tt[i]=new MH(ma, ten, dvt, mua, ban);
//         }
//         Arrays.sort(tt,new Comparator<MH>(){   
//             @Override
//             public int compare(MH o1, MH o2) {
//                int temp=Double.compare(o2.profit(),o1.profit());
//                if(temp!=0){    
//                    return temp;
//                }
//                return o1.getma().compareTo(o2.getma());
//             }
//             
//         });
//         for(MH t:tt){  
//             System.out.println(t);
//         }
//         
//        
//     }
// }
//bai 28:Bang diem:
//class Bangdiem {
//
//    String ma, hoten;
//    double diem[];
//
//    public Bangdiem() {
//    }
//
//    public Bangdiem(String ma, String hoten, double[] diem) {
//        this.ma = ma;
//        this.hoten = hoten;
//        this.diem = new double[10];
//        for(int i=0;i<10;i++){  
//            this.diem[i]=diem[i];
//        }
//
//    }
//
//    public double dtb() {
//       
//        double sum = 0;
//        for (int i = 0; i < 10; i++) {
//            sum += diem[i];
//        }
//        return sum / 10;
//    }
//
//    public String pl() {
//        String res = "";
//        if (dtb() >= 9) {
//            res = "XUAT XAC";
//        } else if (dtb() >= 8 && dtb() <= 8.9) {
//            res = "GIOI";
//        } else if (dtb() >= 7 && dtb() <= 7.9) {
//            res = "KHA";
//        } else if (dtb() >= 5 && dtb() <= 6.9) {
//            res = "TB";
//        } else if (dtb() < 5) {
//            res = "YEU";
//        }
//        return res;
//    }
//    public String toString(){   
//        return ma+" "+hoten+" "+String.format("%.1f",dtb())+" "+pl();
//    
//    }
//    public String getma(){  
//        return ma;
//    }
//    
//
//}
//
//public class Contestopp1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=Integer.parseInt(sc.nextLine());
//        Bangdiem tt[]=new Bangdiem[n];
//        for(int i=0;i<n;i++){   
//            String ma,hoten;
//            double diem[]=new double[10];
//            ma="HS"+String.format("%02d",i+1);
//            hoten=sc.nextLine();
//            for(int t=0;t<10;t++){  
//                diem[t]=Double.parseDouble(sc.nextLine());
//            }
//            tt[i]=new Bangdiem(ma, hoten, diem);
//        }
//       Arrays.sort(tt,new Comparator<Bangdiem>(){   
//            @Override
//            public int compare(Bangdiem o1, Bangdiem o2) {
//               int temp=Double.compare(o2.dtb(),o1.dtb());
//               if(temp!=0){ 
//                   return temp;
//               }
//               
//               return o1.getma().compareTo(o2.getma());
//            }
//           
//       });
//       for(Bangdiem t:tt){  
//           System.out.println(t);
//       }
//    }
//}

    
 
