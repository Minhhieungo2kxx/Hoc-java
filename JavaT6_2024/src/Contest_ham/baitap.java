package Contest_ham;

import java.util.*;

public class baitap {
//    public static long sumchuso(long n){
//        long sum=0;
//        while(n!=0){
//            sum+=n%10;
//            n/=10;
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        long n=sc.nextLong();
//      System.out.println(sumchuso(n));
//       
//    }

    //kiem tra chan le am duong ko can viet ham int lam gi dung boolean check thoi
//    public static boolean check(long n) {
//        long sum = 0;
//        while (n > 0) {
//            sum += n % 10;
//            n /= 10;
//        }
//        if (sum % 10 == 8) {
//            return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//        if (check(n) == true) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
    //ham goi ham kiem cha so dep
//    public static boolean chanle(int n){
//        int chan=0,le=0;
//        while(n!=0){
//            if(n%10%2==0){
//                chan++;
//            }else{
//                le++;
//            }
//            n/=10;
//        }
//        
//        if(chan>le){
//            return true;
//        }
//        return false;
//    }
//    public static boolean check(int n){
//        int sum=0;
//        while(n!=0){
//            sum+=n%10;
//            n/=10;
//    }
//        return chanle(sum);
//    }
//    
//      public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            if(check(i)){
//                System.out.print(i+" ");
//            }
//        }
//    }
    //liet ke ra day so tang
//    public static boolean daytang(int n) {
//        while (n >= 10) {
//            int sau = n % 10;
//            int truoc = (n / 10) % 10;
//            n /= 10;
//            if (truoc>=sau) {
//                return false;
//            }
//            
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        for(int i=a;i<=b;i++){
//            if(daytang(i)){
//                System.out.print(i+ " ");
//            }
//        }
//        
//
//    }
    //in lat nguoc so
//    public static long lat(long n){
//        long res=0;
//        while(n>0){
//            res=res*10+n%10;
//            n/=10;
//        }
//        return res;
//    }
//    
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         long n=sc.nextLong();
//         System.out.println(lat(n));
//    }
    //so thuan nghich 
//    public static boolean check(int n) {
//        int res = 0;
//        int temp = n;
//        while (n > 0) {
//            res = res * 10 + n % 10;
//            n /= 10;
//        }
//        if (res == temp) {
//            return true;
//        }
//        return false;
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//
//        for(int i=a;i<=b;i++){
//            if(check(i)){
//                System.out.print(i+" ");
//            }
//        }
//    }
    //so chinh phuong
//    public static boolean chinhphuong(long n) {
//        long can = (long) Math.sqrt(n);
//        if (can * can == n) {
//            return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        for (int i = a; i <= b; i++) {
//            if (chinhphuong(i)) {
//                System.out.print(i + " ");
//            }
//        }
//    }
    //dem uoc va tinh tong cac uoc cua 1 so
//    public static int tonguoc(int n) {
//        int sum = 0;
//        for (int i = 1; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                sum += i;
//                if (i != n / i) {
//                    sum += n / i;
//                }
//            }
//
//        }
//        return sum;
//    }
//
//    public static int demuoc(int n) {
//        int dem = 0;
//        for (int i = 1; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                dem++;
//                if (i != n / i) {
//                    dem++;
//                }
//            }
//
//        }
//        return dem;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(demuoc(n));
//        System.out.println(tonguoc(n));
//
//    }
 
     
    
    
    
                //so nguyen to
//    public static boolean nt(int n){
//        if(n<=1){
//            return false;
//        }
//        for(int i=2;i<=Math.sqrt(n);i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//           
//    }
//       public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        for (int i = a; i <= b; i++) {
//            if (nt(i)) {
//                System.out.print(i + " ");
//            }
//        }
//    }
    
     
}

