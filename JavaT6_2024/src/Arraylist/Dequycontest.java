
package Arraylist;

import java.util.*;
public class Dequycontest {
    
    //bai 4:tong de quy dan so -1+2-3+4+...+n
//    public static int sum(int n){ 
//        if(n==0){   
//            return 0;
//        }
//        if(n%2==0){ 
//            return sum(n-1)+n;
//        }
//        else{
//            return sum(n-1)-n;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(sum(n));
//    }
    
        //de quy:uoc chung lon nhat +boi chung nho nhat
//    public static long gcd(long a,long b){  
//        if(b==0){   
//            return a;
//        }
//        return gcd(b,a%b);
//    }
//    public static long lcm(long a,long b){  
//        return a/gcd(a, b)*b;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        long a=sc.nextInt();
//        long b=sc.nextInt();
//        System.out.print(gcd(a, b)+ " "+lcm(a, b));
//    }
    
      // chuyen tu he 10 sang he 2
//   public static void nhiphan(int n){   
//       if(n==0){    
//           return;
//       }
//       nhiphan(n/2);
//       System.out.print(n%2+" ");
//       
//   }
//        
//    
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        nhiphan(n);
//    }
     //A:10 F:15 (0->15) he 16
//    public static void he16(long n){    
//        if(n==0){   
//            return;
//        }
//        he16(n/16);
//        if(n%16<10){    
//          System.out.print(n%16);
//
//        }
//        else{   
//            System.out.print((char)((n%16-10)+'A'));
//        }
//    }
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        long n=sc.nextLong();
//        he16(n);
//    }
    
        //de quy tinh tong chu so va dem so luong chu so
//   public static int tcn(int n){    
//       if(n==0){    
//           return 0;
//       }
//       return tcn(n/10)+n%10;
//   }
//   
//   public static int chuso(int n) {   
//       if(n==0){    
//           return 0;
//       }
//       return chuso(n/10)+1;
//       
//   }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(tcn(n));
//        System.out.println(chuso(n));
//    }
    
       //chu o dau tien cua so nguyen
//    public static long chusodau(long n){  
//        if(n<10){   
//            return n;
//        }
//        return chusodau(n/10);
//    }
//   public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        long n=sc.nextInt();
//        System.out.println(chusodau(n));
//    }
    
    //de quy in ra trai va phai cua 1 so
//    public static void phaisangtrai(int n){ 
//        if(n<10){   
//            System.out.print(n);
//            return;
//        }
//        System.out.print(n%10+" ");
//        phaisangtrai(n/10);
//    }
//    public static void traiphaisang(int n){ 
//        if(n<10){   
//            System.out.print(n+" ");
//            return;
//        }
//        traiphaisang(n/10);
//        System.out.print(n%10+" ");
//        
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        phaisangtrai(n);
//        System.out.println("");
//        traiphaisang(n);
//        
//    }
          
}
