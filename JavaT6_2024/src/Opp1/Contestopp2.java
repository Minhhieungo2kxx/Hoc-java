package Opp1;

import java.util.*;
import java.io.*;
//    class  BankAcount{    
//    String id, customerid, stk, mapin;
//    int sodu;
//
//    public BankAcount() {
//    }
//
//    public BankAcount(String id, String customerid, String stk, String mapin, int sodu) {
//        this.id = id;
//        this.customerid = customerid;
//        this.stk = stk;
//        this.mapin = mapin;
//        this.sodu = sodu;
//    }
//
//    public void deposit(int money) {
//        this.sodu += money;
//    }
//
//    public void withdraw(int money) {
//        if (this.sodu - 50000 >= money) {
//            this.sodu -= money;
//        }
//    }
//
//    public String getstk() {
//        return stk;
//    }
//
//    public static int findpos(BankAcount tt[], int n, String stk) {
//        int pos = -1;
//        for (int i = 0; i < n; i++) {
//            if (tt[i].getstk().equals(stk)) {
//                pos = i;
//                break;
//            }
//        }
//        return pos;
//    }
//
//    public String toString() {
//        return id + "\n" + customerid + "\n" + stk + "\n" + mapin + "\n" + sodu + "\n" + "----------";
//    }
//
//    public int getsodu() {
//        return sodu;
//    }
//}
//}
//public class Contestopp2 {
//    public static void main(String[] args) {
//        // Đường dẫn tuyệt đối đến tệp input.txt
//        String inputFilePath = "D:\\HOC JAVA\\file\\nganhang1.txt";
//        // Đường dẫn tuyệt đối đến tệp output.txt (nếu cần)
//        // String outputFilePath = "C:\\path\\to\\your\\output.txt";
//
//        try {
//            Scanner sc = new Scanner(new File(inputFilePath));
//            int n = Integer.parseInt(sc.nextLine());
//            BankAcount[] acount = new BankAcount[n];
//            for (int i = 0; i < n; i++) {
//                acount[i] = new BankAcount(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
//            }
//            int t = Integer.parseInt(sc.nextLine());
//            for (int k = 0; k < t; k++) {
//                String loai = sc.nextLine();
//                if (loai.equals("deposit")) {
//                    String X = sc.nextLine();
//                    int Y = Integer.parseInt(sc.nextLine());
//                    int vitri = BankAcount.findpos(acount, n, X);
//                    acount[vitri].deposit(Y);
//                } else if (loai.equals("withdraw")) {
//                    String X = sc.nextLine();
//                    int Y = Integer.parseInt(sc.nextLine());
//                    int vitri = BankAcount.findpos(acount, n, X);
//                    acount[vitri].withdraw(Y);
//                } else {
//                    String X = sc.nextLine(), Y = sc.nextLine();
//                    int Z = Integer.parseInt(sc.nextLine());
//                    int vgui = BankAcount.findpos(acount, n, X);
//                    int vnhan = BankAcount.findpos(acount, n, Y);
//                    if (acount[vgui].getsodu() - 50000 >= Z) {
//                        acount[vgui].withdraw(Z);
//                        acount[vnhan].deposit(Z);
//                    }
//                }
//            }
//            for (BankAcount p : acount) {
//                System.out.println(p);
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found: " + inputFilePath + " (" + e.getMessage() + ")");
//        } catch (IOException e) {
//            System.out.println("An error occurred while writing to the file: " + e.getMessage());
//        }
//    }
//}
//bai toan giai cuu cong chua
//class NhanVat {
//
//    int blood, power;
//    boolean alive;
//
//    public NhanVat() {
//    }
//
//    public NhanVat(int blood, int power, boolean alive) {
//        this.blood = blood;
//        this.power = power;
//        this.alive = alive;
//    }
//
//    public void mushroom() {
//
//        if (this.power <= 0 || this.blood <= 0) {
//
//            this.alive = false;
//            this.power = 0;
//            this.blood = 0;
//            return;
//        } else {
//            this.blood -= 15;
//            this.power -= 2;
//            this.alive = true;
//        }
//    }
//
//    public void pea() {
//        if (this.power <= 0 || this.blood <= 0) {
//
//            this.alive = false;
//            this.power = 0;
//            this.blood = 0;
//            return;
//        } else {
//            this.power += 2;
//            this.blood += 10;
//            this.alive = true;
//        }
//    }
//
//    public void with(int sm) {
//        if (sm >= this.power) {
//            this.alive = false;
//            this.power = 0;
//            this.blood = 0;
//            return;
//        } else {
//            this.power += 5;
//            this.alive = true;
//        }
//    }
//    public void soldier(int sm){    
//        if (sm >= this.power) {
//            this.alive = false;
//            this.power = 0;
//            this.blood = 0;
//            return;
//        } else {
//            this.power+=7;
//            this.blood+=5;
//            this.alive = true;
//        }
//    }
//    public String toString(){   
//        String res="";
//        if(this.alive==true){   
//            res="ALIVE";
//        }
//        else{   
//            res="DEAD";
//        }
//      return "POWER:"+this.power+"\n"+"BLOOD:"+this.blood+"\n"+res+"\n"+"----------";
//    }
//}
//
//public class Contestopp2 {
//    public static void main(String[] args) {
//        String inputFilePath = "D:\\HOC JAVA\\file\\hoangtu.txt";
//        try {
//            Scanner sc=new Scanner(new File(inputFilePath));
//            int sucmanh=Integer.parseInt(sc.nextLine());
//            int mau=Integer.parseInt(sc.nextLine());
//            String tmp=sc.nextLine();
//            boolean alive=false;
//            if(tmp.equals("ALIVE")){    
//                alive=true;
//            }   
//            NhanVat t=new NhanVat(sucmanh,mau,alive);
//            int k=Integer.parseInt(sc.nextLine());
//            for(int i=0;i<k;i++){   
//                String event=sc.next();
//                if(event.equals("mushroom")){   
//                    t.mushroom();
//                }
//                else if(event.equals("pea")){   
//                    t.pea();
//                }
//                else if(event.equals("with")){  
//                    int sm1=Integer.parseInt(sc.next());
//                    t.with(sm1);
//                }
//                else{   
//                    int sm2=Integer.parseInt(sc.next());
//                    t.soldier(sm2);
//                }
//                System.out.println(t);
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found"+inputFilePath+"("+e.getMessage()+")");
//        }
//    }
//}
//bai toan discount 1
//class Customer{ 
//    int id;
//    String name;
//    int discount;
//
//   
//    public Customer(int id, String name, int discount) {
//        this.id = id;
//        this.name = name;
//        this.discount = discount;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//   
//
//    public String getName() {
//        return name;
//    }
//
//   
//    public int getDiscount() {
//        return discount;
//    }
//
//    public void setDiscount(int discount) {
//        this.discount = discount;
//    }
//    public String toString(){   
//        return "Customer id:"+this.id+"\n"+"Name:"+this.name;
//    }
//    
//}
//class Invoice{  
//    Customer cus;
//    int idInvoice;
//    double amount;
//
//    public Invoice(Customer cus, int idInvoice, double amount) {
//        this.cus = cus;
//        this.idInvoice = idInvoice;
//        this.amount = amount;
//    }
//
//    public Customer getCus() {
//        return cus;
//    }
//
//    public int getIdInvoice() {
//        return idInvoice;
//    }
//
//    public double getAmount() {
//        return amount;
//    }
//    public double getamountafterdiscount(){ 
//        return this.amount-this.amount*cus.getDiscount()/100;
//    }
//    public String toString(){   
//        return cus.toString()+"\n"+"Amount:"+String.format("%.2f",getamountafterdiscount())+" "+"&"+"\n"+"-------";
//    }
//    public int getidcus(){  
//        return cus.getId();
//    }
//    
//}
//  public class Contestopp2{ 
//      public static void main(String[] args) {
//         String inputFile="D:\\\\HOC JAVA\\\\file\\\\customer1.txt";
//          try {
//              Scanner sc=new Scanner(new File(inputFile));
//              ArrayList<Invoice> arr=new ArrayList<>();
//              int n=Integer.parseInt(sc.nextLine());
//              for(int i=0;i<n;i++){ 
//                  int idcus=Integer.parseInt(sc.nextLine());
//                  String name=sc.nextLine();
//                  int dis=Integer.parseInt(sc.nextLine());
//                  int idinvoice=Integer.parseInt(sc.nextLine());
//                  double amount=Double.parseDouble(sc.nextLine());
//                  Customer cs=new Customer(idcus, name, dis);
//                  Invoice in=new Invoice(cs, idinvoice, amount);
//                  arr.add(in);
//              }
//              Collections.sort(arr,new Comparator<Invoice>(){   
//                  @Override
//                  public int compare(Invoice o1, Invoice o2) {
//                      int temp=Double.compare(o2.getamountafterdiscount(),o1.getamountafterdiscount());
//                      if(temp!=0){  
//                          return temp;
//                      }
//                      else{ 
//                          return o1.getidcus()-o2.getidcus();
//                      } 
//                  }
//                  
//              });
//              for(Invoice t:arr){   
//                  System.out.println(t);
//              }
//              
//          } catch (IOException e) {
//              System.out.println("file not found"+inputFile);
//          }
//      }
//  } 

//lop book and author
//class Author {
//
//    String name, email, gender;
//
//    public Author(String name, String email, String gender) {
//        this.name = name;
//        this.email = email;
//        this.gender = gender;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public String toString() {
//        return "Name:" + this.name + "\n" + "Email:" + this.email + "\n" + "Gender:" + this.gender;
//
//    }
//}
//
//class Book {
//
//    String namek;
//    Author[] au;
//    double price;
//    int quy;
//    int counttg;
//
//    public Book(String namek, Author[] au, double price, int quy, int counttg) {
//        this.namek = namek;
//        this.au = au;
//        this.price = price;
//        this.quy = quy;
//        this.counttg = counttg;
//    }
//
//    public String getNamebook() {
//        return namek;
//    }
//
//    public Author[] getAu() {
//        return au;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public int getQuy() {
//        return quy;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setQuy(int quy) {
//        this.quy = quy;
//    }
//
//    public void setNamek(String namek) {
//        this.namek = namek;
//    }
//
//    public void setAu(Author[] au) {
//        this.au = au;
//    }
//
//    public void display() {
//        System.out.println("--------");
//        System.out.println("Book information:");
//        System.out.println("Name:" + this.namek);
//        System.out.println("Price:" + Math.round(price));
//        System.out.println("Quantity:" + this.quy);
//        System.out.println("Author information:");
//        for (int i = 0; i < this.counttg; i++) {
//            System.out.println("#" + (i + 1));
//            System.out.println(au[i]);
//        }
//    }
//
//}
//
//public class Contestopp2 {
//
//    public static void main(String[] args) {
//        String input = "D:\\HOC JAVA\\file\\book1.txt";
//        try {
//
//            Scanner sc = new Scanner(new File(input));
//            int n = Integer.parseInt(sc.nextLine());
//            ArrayList<Book> arr = new ArrayList<>();
//            for (int m = 0; m < n; m++) {
//                String tens = sc.nextLine();
//                double gia = Double.parseDouble(sc.nextLine());
//                int sl = Integer.parseInt(sc.nextLine());
//                int k = Integer.parseInt(sc.nextLine());
//                Author tt[] = new Author[k];
//                for (int i = 0; i < k; i++) {
//                    String tentg = sc.nextLine();
//                    String emai = sc.nextLine();
//                    String gt = sc.nextLine();
//                    tt[i] = new Author(tentg, emai,gt);
//                }
//                Book t = new Book(tens, tt, gia, sl, k);
//                arr.add(t);
//            }
//            Collections.sort(arr,new Comparator<Book>(){    
//                @Override
//                public int compare(Book o1, Book o2) {
//                   return o1.getNamebook().compareTo(o2.getNamebook());
//                }
//                
//            });
//            for(Book x:arr){    
//                x.display();
//            }
//
//        } catch (IOException e) {
//            System.out.println("File not found");
//        }
//    }
//}
              //My time
//import java.util.Scanner;
//
//class MyTime {   
//    int hours, minute, second;
//
//    public MyTime() {
//        hours = 0;
//        minute = 0;
//        second = 0;
//    }
//
//    public MyTime(int hours, int minute, int second) {
//        this.hours = hours;
//        this.minute = minute;
//        this.second = second;
//    }
//
//    void setTime(int hours, int minute, int second) { 
//        this.hours = hours;
//        this.minute = minute;
//        this.second = second;
//    }
//
//    public int getHours() {
//        return hours;
//    }
//
//    public void setHours(int hours) {
//        this.hours = hours;
//    }
//
//    public int getMinute() {
//        return minute;
//    }
//
//    public void setMinute(int minute) {
//        this.minute = minute;
//    }
//
//    public int getSecond() {
//        return second;
//    }
//
//    public void setSecond(int second) {
//        this.second = second;
//    }
//
//    public String toString() {   
//        return String.format("%02d:%02d:%02d", hours, minute, second);
//    }
//
//    public MyTime nextSecond() {   
//        this.second++;
//        if (this.second == 60) { 
//            this.second = 0;
//            this.nextMinute();
//        }
//        return this;
//    }
//
//    public MyTime nextMinute() { 
//        this.minute++;
//        if (this.minute == 60) { 
//            this.minute = 0;
//            this.nextHour();
//        }
//        return this;
//    }
//
//    public MyTime nextHour() {   
//        this.hours++;
//        if (this.hours == 24) {  
//            this.hours = 0;
//        }
//        return this;
//    }
//
//    public MyTime previousSecond() { 
//        this.second--;
//        if (this.second == -1) { 
//            this.second = 59;
//            previousMinute();
//        }
//        return this;
//    }
//
//    public MyTime previousMinute() { 
//        this.minute--;
//        if (this.minute == -1) { 
//            this.minute = 59;
//            previousHour();
//        }
//        return this;
//    }
//
//    public MyTime previousHour() {   
//        this.hours--;
//        if (this.hours == -1) {   
//            this.hours = 23;
//        }
//        return this;
//    }
//}
//
//public class Contestopp2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] timeParts = sc.nextLine().split(":");
//        int hour = Integer.parseInt(timeParts[0]);
//        int minute = Integer.parseInt(timeParts[1]);
//        int second = Integer.parseInt(timeParts[2]);
//
//        MyTime time = new MyTime(hour, minute, second);
//
//        // Print next and previous times
//        System.out.println(time.nextSecond());
//        System.out.println(time.nextMinute());
//        System.out.println(time.nextHour());
//        System.out.println(time.previousSecond());
//        System.out.println(time.previousMinute());
//        System.out.println(time.previousHour());
//    }
//}
          //Customer and Acount
//  class Customer{   
//      int id;
//      String name,gender;
//
//    public Customer(int id, String name, String gender) {
//        this.id = id;
//        this.name = name;
//        this.gender = gender;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//      public String toString(){ 
//          return "Customer id:"+id+"\n"+"Full name:"+name+"\n"+"Gender:"+gender+"\n";
//      }
//  }
//  class Acount{ 
//      int acountId;
//      Customer cus;
//      double balance;
//
//    public Acount(int acountId, Customer cus, double balance) {
//        this.acountId = acountId;
//        this.cus = cus;
//        this.balance = balance;
//    }
//
//    public int getAcountId() {
//        return acountId;
//    }
//
//    public Customer getCus() {
//        return cus;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//    public Acount deposit(double amount){    
//        Acount t=new Acount(this.acountId, this.cus, this.balance);
//        t.setBalance(this.balance+amount);
//        System.out.println("Nap tien thanh cong");
//        return t;
//        
//    }
//    public Acount withdraw(double amount){    
//        Acount t=new Acount(this.acountId, this.cus, this.balance);
//        if(this.balance>=amount){   
//            t.setBalance(this.balance-amount);
//            System.out.println("Rut tien thanh cong");
//        }
//        else{   
//            System.out.println("So tien khong du de rut");
//        }
//        return t;
//        
//    }
//    public String toString(){   
//        return "Acount id:"+this.acountId+"\n"+"Balance:"+String.format("%.2f",this.balance)+" &";
//    }
//  }
//  
//  public class Contestopp2{ 
//      public static void main(String[] args) {
//          String input="D:\\HOC JAVA\\file\\bankacount.txt";
//          try {
//              Scanner sc=new Scanner(new File(input));
//              int cusid=Integer.parseInt(sc.nextLine());
//              String name=sc.nextLine();
//              String gender=sc.nextLine();
//              Customer t=new Customer(cusid,name, gender);
//              String acountid=sc.nextLine();
//              double balance=Double.parseDouble(sc.nextLine());
//              Acount a=new Acount(cusid, t, balance);
//              int n=Integer.parseInt(sc.nextLine());
//              for(int i=0;i<n;i++){ 
//                  String temp=sc.next();
//                  double tien=Double.parseDouble(sc.next());
//                  if(temp.equals("withdraw")){  
//                      a=a.withdraw(tien);
//                  }
//                  if(temp.equals("deposit")){   
//                      a=a.deposit(tien);
//                  }
//              }
//              System.out.println(t.toString()+a.toString());
//             
//              
//          } catch (IOException e) {
//              System.out.println("File not found"+input);
//          }
//      }
//  }

     
