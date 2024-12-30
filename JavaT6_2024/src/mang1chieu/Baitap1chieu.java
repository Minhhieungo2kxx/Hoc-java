package mang1chieu;

import java.util.*;

public class Baitap1chieu {
//    //trung binh cong cac so nguyen to trong mang
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
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int []a=new int[n];
//        double sum=0;
//        int dem=0;
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//            
//        }
//        for(int i=0;i<n;i++){
//            if(nt(a[i])){
//                sum+=a[i];
//                dem++;
//            }
//        }
//        if(dem>0){
//            System.out.printf("Tong la: %.3f",(double)(sum/dem));
//        }
//        else{
//            System.out.println("Khong co so nao ca");
//        }
//    }

    //in ra cac so la so chan cung nhu chi so cua no cung la chan thi in ra
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int []a=new int[n];
//        int dem=0;
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//            if(i%2==0&&a[i]%2==0){
//                dem++;
//                System.out.print(a[i]+" ");
//            }
//        }
//        if(dem==0){
//            System.out.println("None");
//        }
//      
//    }
    //dem so cap sao cho a[i]+a[j]==k
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//       
//        int []a=new int[n];
//        
//        
//        for(int i=0;i<n;i++){
//           a[i]=sc.nextInt();
//        
//    }
//        int k=sc.nextInt();
//        int dem=0;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(a[i]+a[j]==k){
//                    dem++;
//                }
//            }
//        }
//        System.out.println(dem);
//}
    //tim do chenh lech nho nhat giua 2 so trong mang
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//       
//        int []a=new int[n];
//        
//        
//        for(int i=0;i<n;i++){
//           a[i]=sc.nextInt();
//        
//    }
//       int min=Integer.MAX_VALUE;
//        int dem=0;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//               if(Math.abs(a[i]-a[j])<min){
//                   min=Math.abs(a[i]-a[j]);
//               }
//            }
//        }
//        System.out.println(min);
//}
    //liet ke cac gia tri khac nhau trong mang hoac dem
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//
//        }
//        int dem=0;
//
//        for (int i = 0; i < n; i++) {
//            boolean found = false;
//            for (int j = 0; j < i; j++) {
//                if (a[i] == a[j]) {
//                    found = true;
//                    break;
//                }
//            }
//        if(!found){
//            dem++;
//            System.out.print(a[i]+" ");
//        }
//        }
//        System.out.println(dem);
//    }
    //liet ke cac gia tri khac nhau +tan suat co cua
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//
//        }
//        for (int i = 0; i < n; i++) {
//            boolean found = false;
//            for (int j = 0; j < i; j++) {
//                if (a[i] == a[j]) {
//                    found = true;
//                    break;
//                }
//            }
//            if (!found) {
//                int dem = 1;
//                for (int j = i + 1; j < n; j++) {
//                    if (a[i] == a[j]) {
//                        dem++;
//                    }
//                }
//                System.out.println(a[i] + " " + dem);
//            }
//
//        }
//    }
    //liet ke chi so i trong mang thoa man:tong phan tu trai i
    // va sum phan tu phai i la so nguyen to
    //bai toan can bang mang nguyen to
//    public static boolean nt(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            int right = 0, left = 0;
//            for (int j = 0; j < i; j++) {
//                left += a[j];
//            }
//            for (int j = i + 1; j < n; j++) {
//                right += a[j];
//            }
//            if (nt(left) && nt(right)) {
//                System.out.println(i + " ");
//            }
//        }
//    }
                         //mang doi xung
//    public static boolean dx(int[] a, int n) {
//        for (int i = 0; i <= n / 2; i++) {
//            if (a[i] != a[n - 1 - i]) {
//                return false;
//            }
//        }
//        return true;
//    }
                        //dao nguoc mang
//    public static void daonguoc(int[] a, int n) {
//        for (int i = 0; i <= n / 2; i++) {
//            int temp = a[i];
//            a[i] = a[n - 1 - i];
//            a[n - 1 - i] = temp;
//
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//
//        }
//        daonguoc(a, n);
//        for(int i=0;i<n;i++){
//            System.out.print(a[i]+" ");
//        }
//
////        if (dx(a, n)==true) {
////            System.out.println("Yes");
////        } else {
////            System.out.println("No");
////        }
//    }
    
      
}
