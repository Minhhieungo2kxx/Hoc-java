package Opp1;

import java.util.*;
import java.io.*;

//bai 1+2:
//class Person {
//   String name,date,address;
//
//    public Person() {
//        this.name = "";
//        this.date = "";
//        this.address ="";
//    }
//
//    public Person(String name, String date, String address) {
//        this.name = name;
//        this.date = date;
//        this.address = address;
//    }
//   @Override
//    public String toString(){   
//        return name+" "+date+" "+address;
//    }
//    public String getten(){ 
//        return name;
//    }
//
//}
//
//class Student extends Person {
//
//    String msv,lop;
//    double gpa;
//
//    public Student() {
//        super();
//    }
//
//    public Student(String msv,String name, String date, String address, String lop, double gpa ) {
//        super(name, date, address);
//        this.msv = msv;
//        this.lop = lop;
//        this.gpa = gpa;
//    }
//
//    @Override
//    public String toString() {
//        return msv+" "+super.toString()+" "+lop+" "+String.format("%.2f",gpa);
//    }
//    public void chuanhoa(){ 
//        String arr[]=name.split("\\s+");
//        StringBuilder bd=new StringBuilder();
//        for(String x:arr){  
//            bd.append(Character.toUpperCase(x.charAt(0)));
//            for(int i=1;i<x.length();i++){  
//                bd.append(Character.toLowerCase(x.charAt(i)));
//            }
//            bd.append(" ");
//        }
//        this.name=bd.toString().trim();
//        
//        String a[]=date.split("/");
//        int day=Integer.parseInt(a[0]);
//        int moth=Integer.parseInt(a[1]);
//        int year=Integer.parseInt(a[2]);
//        this.date=String.format("%02d/%02d/%d",day,moth,year);
//        
//    }
//    public String getsortname(){    
//        String arr[]=name.split("\\s+");
//        StringBuilder bd=new StringBuilder();
//        bd.append(arr[2]);
//        for(int i=0;i<arr.length-1;i++){    
//            bd.append(" ").append(arr[i]);
//        }
//        return bd.toString().trim();
//    }
//   
//
//}
//
//public class Contest2_KethuavsDahinh {
//
//    public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in).useLocale(Locale.US);
//       int n=Integer.parseInt(sc.nextLine());
//       Student tt[]=new Student[n];
//       for(int i=0;i<n;i++){    
//           String name,date,address,msv,lop;
//           double gpa;
//           msv=String.format("%04d",i+1);
//           name=sc.nextLine();
//           date=sc.nextLine();
//           address=sc.nextLine();
//           lop=sc.nextLine();
//           gpa=Double.parseDouble(sc.nextLine());
//           tt[i]=new Student(msv,name , date, address,lop,gpa);
//           tt[i].chuanhoa();
//           
//           
//       }
//       Arrays.sort(tt,new Comparator<Student>(){    
//           @Override
//           public int compare(Student o1, Student o2) {
//               return o1.getsortname().compareTo(o2.getsortname());
//           }
//           
//       });
//       for(Student t:tt){   
//           System.out.println(t);
//       }
//        
//            
//            
//    }
//}
//bai 3:Giao vien vs Student 
//class People {
//
//    String ten, date, address;
//
//    public People() {
//    }
//
//    public People(String ten, String date, String address) {
//        this.ten = ten;
//        this.date = date;
//        this.address = address;
//    }
//
//    @Override
//    public String toString() {
//        return ten + " " + date + " " + address;
//
//    }
//
//    public void chuanhoa() {
//        String arr[] = ten.split("\\s+");
//        StringBuilder bd = new StringBuilder();
//        for (String x : arr) {
//            bd.append(Character.toUpperCase(x.charAt(0)));
//            for (int i = 1; i < x.length(); i++) {
//                bd.append(Character.toLowerCase(x.charAt(i)));
//            }
//            bd.append(" ");
//        }
//        this.ten = bd.toString().trim();
//
//        String a[] = date.split("/");
//        int day = Integer.parseInt(a[0]);
//        int moth = Integer.parseInt(a[1]);
//        int year = Integer.parseInt(a[2]);
//        this.date = String.format("%02d/%02d/%d", day, moth, year);
//
//    }
//
//    public String getaddress() {
//        return address;
//    }
//}
//
//class Student extends People {
//
//    String msv, lop;
//    double gpa;
//
//    public Student() {
//    }
//
//    public Student(String msv, String ten, String date, String address, String lop, double gpa) {
//        super(ten, date, address);
//        this.msv = msv;
//        this.lop = lop;
//        this.gpa = gpa;
//    }
//
//    @Override
//    public String toString() {
//        return msv + " " + super.toString() + " " + lop + " " + String.format("%.2f", gpa);
//    }
//
//    public double getgpa() {
//        return gpa;
//    }
//
//    public String getmsv() {
//        return msv;
//    }
//
//}
//
//class Teachers extends People {
//
//    String mgv, khoa;
//    double luong;
//
//    public Teachers() {
//    }
//
//    public Teachers(String mgv, String ten, String date, String address, String khoa, double luong) {
//        super(ten, date, address);
//        this.mgv = mgv;
//        this.khoa = khoa;
//        this.luong = luong;
//    }
//
//    public String toString() {
//        return mgv + " " + super.toString() + " " + khoa + " " + String.format("%.0f", luong);
//    }
//
//    public double getluong() {
//        return luong;
//    }
//
//    public String getmgv() {
//        return mgv;
//    }
//}
//
//public class Contest2_KethuavsDahinh {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        ArrayList<Student> arr1 = new ArrayList<>();
//        ArrayList<Teachers> arr2 = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            String name, date, addrees, ma, lop, khoa;
//            double gpa, luong;
//            ma = sc.nextLine();
//            if (ma.contains("GV")) {
//                name = sc.nextLine();
//                date = sc.nextLine();
//                addrees = sc.nextLine();
//                khoa = sc.nextLine();
//                luong = Double.parseDouble(sc.nextLine());
//                Teachers tc = new Teachers(ma, name, date, addrees, khoa, luong);
//                tc.chuanhoa();
//                arr2.add(tc);
//            } else {
//                name = sc.nextLine();
//                date = sc.nextLine();
//                addrees = sc.nextLine();
//                lop = sc.nextLine();
//                gpa = Double.parseDouble(sc.nextLine());
//                Student st = new Student(ma, name, date, addrees, lop, gpa);
//                st.chuanhoa();
//                arr1.add(st);
//            }
//        }
//        //truy van giao vien co dia chi o ha noi
////        System.out.println("DANH SACH GIAO VIEN:");
////        for(Teachers x:arr2){
////            if(x.getaddress().equals("Ha Noi")){    
////                System.out.println(x);
////            }
////            
////        }
////        System.out.println("DANH SACH SINH VIEN:");
////        for(Student x:arr1){ 
////            if(x.getaddress().equals("Ha Noi")){    
////                 System.out.println(x);
////            }
////           
////        }
//        Collections.sort(arr2, new Comparator<Teachers>() {
//            @Override
//            public int compare(Teachers o1, Teachers o2) {
//                // Giảm dần theo luong
//                int luongCompare = Double.compare(o2.getluong(), o1.getluong());
//                if (luongCompare != 0) {
//                    return luongCompare;
//                }
//                // Nếu luong bằng nhau thì sắp theo tên mã giáo viên
//                return o1.getmgv().compareTo(o2.getmgv());
//            }
//        });
//
//        // Sắp xếp sinh viên theo GPA giảm dần, nếu GPA bằng nhau thì sắp theo tên mã sinh viên
//        Collections.sort(arr1, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                // Giảm dần theo GPA
//                int gpaCompare = Double.compare(o1.getgpa(), o2.getgpa());
//                if (gpaCompare != 0) {
//                    return gpaCompare;
//                }
//                // Nếu GPA bằng nhau thì sắp theo tên mã sinh viên
//                return o1.getmsv().compareTo(o2.getmsv());
//            }
//        });
//        System.out.println("DANH SACH GIAO VIEN:");
//        for (Teachers x : arr2) {
//            System.out.println(x);
//        }
//        System.out.println("DANH SACH SINH VIEN:");
//        for (Student x : arr1) {
//            System.out.println(x);
//
//        }
//
//    }
//}
       //lop circle and cylinder
 class Circle{  
     double radius;
     String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   public double getarea(){ 
       return 3.14*radius*radius;
   }
   
 }
 class Cylinder extends Circle{ 
     double height;

    public Cylinder(String color,double radius,double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double volume(){ 
        return this.height*super.getarea();
    }
    
    public String toString(){   
        return "Color:"+this.color+"\n"+"Height:"+this.height+"\n"+"Radius:"
        +this.radius+"\n"+"Volume:"+String.format("%.2f",volume())+"\n"+"----------";
    }
     
 }



public class Contest2_KethuavsDahinh {
    public static void main(String[] args) {
        String input="D:\\HOC JAVA\\file\\hinhtru.txt";
        try {
            Scanner sc=new Scanner(new File(input));
            ArrayList<Cylinder> arr=new ArrayList<>();
            int n=Integer.parseInt(sc.nextLine());
            for(int i=0;i<n;i++){   
                String color=sc.next();
                double r=Double.parseDouble(sc.next());
                double h=Double.parseDouble(sc.next());
                Cylinder t=new Cylinder(color, r, h);
                arr.add(t);
            }
            Collections.sort(arr,new Comparator<Cylinder>(){    
                @Override
                public int compare(Cylinder o1, Cylinder o2) {
                    if(o1.volume()!=o2.volume()){   
                        if(o1.volume()<o2.volume()){    
                            return 1;
                        }
                        return -1;
                    }
                    return o1.getColor().compareTo(o2.getColor());
                }
                
            });
            for(Cylinder t:arr){    
                System.out.println(t);
            }
        } catch (IOException e) {
            System.out.println("File not found"+input);
        }
    }
}