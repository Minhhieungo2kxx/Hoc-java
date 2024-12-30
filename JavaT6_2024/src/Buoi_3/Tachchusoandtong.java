package Buoi_3;

import java.util.*;

public class Tachchusoandtong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = 12345;
//        int dem = 0;
//        int sum=0;
//        while (n != 0) {
//            sum+=n%10;
//            n /= 10;
//        }
//        System.out.println(sum);

        //chu so lon nhat trong cac so
//          long n=sc.nextLong();
//          long maxdigit=n%10;
//          while (n!=0) {            
//            if(n%10>maxdigit){
//                maxdigit=n%10;
//            }
//            n/=10;
//        }
//          System.out.println(maxdigit);
        //kiem tra xem chu so le lo it hon chu so chan khong
//        long n = sc.nextLong();
//        int chan = 0, le = 0;
//        while (n != 0) {
//            if (n == 0) {
//                System.out.println("No");
//
//            } else {
//                if (n % 10 % 2 == 0) {
//                    chan++;
//                } else {
//                    le++;
//                }
//            }
//          n/=10;
//        }
//        if(le<chan){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("N0");
//        }
        //chu so dau tien lon nhat
//        long n=sc.nextInt();
//        long digitmax=n%10;
//        while (n>=10) { 
//            if(n%10>digitmax){
//                digitmax=n%10;
//            }
//            n/=10;
//            
//        }
//       if(n>=digitmax){
//           System.out.println("Yes");
//       }
//       else{
//           System.err.println("No");
//       }
        //tinh tong chenh lenh giua 2 so dung canh nhau
//       long n=1234567;
//       long lech=0;
//       while(n>=10){
//           lech+=Math.abs(n%10 - (n-1)%10);
//           //cach 2 lech+=Math.abs(n%10 - (n/10)%10);
//           n/=10;
//       }
//        System.out.println("Sum do lech la:"+lech);   
        //giai thua uoc chung 2 so
//          long a=sc.nextInt();
//          long b=sc.nextInt();
//        
//          long min=Math.min(a, b);
//          long gt=1;
//          for(int i=1;i<=min;i++){
//             gt=gt*i;
//          }
//          System.out.println(gt);
        //tinh S= 1/0! +1/1!+ 1/2!+...+1/(n-1)!
//      int n=sc.nextInt();
//      double sum=0;
//      long gt=1;
//     
//      for(int i=0;i<=n-1;i++){
//          if(i==0){
//              gt=1;
//          }
//          else{
//              gt=gt*i;
//          }
//          sum+=(double)1/gt;
//          
//      }
//        System.out.printf("%.2f",sum);
//        System.out.println("");
//bai toan kiem tra xem co ton tai nghiem (x,y) hay khong cua pt ax+by=n
//y=(n-ax)>=0 ->n>=ax ->x<=n/a
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int n=sc.nextInt();
//        int dem=0;
//        System.err.println("cap nghiem (x,y) la:");
//       for(int i=0;i<=(double)n/a;i++) {
//           if((n-a*i)%b==0){
//               dem++;
//               System.out.println("("+i+","+(n-a*i)/b+")");
//           }
//       }
//       if(dem>0){
//           System.out.println("Yes");
//       }
//       else{
//           System.out.println("No");
//       }
        //bai toan tong chan
//      int n=sc.nextInt();
//      int []a=new int[n];
//      int sum=0;
//      for(int i=0;i<n;i++){
//          a[i]=sc.nextInt();
//         }
//      for(int i=0;i<n;i++){
//         if(a[i]%2==0){
//             sum+=a[i];
//         }
//      }
//        System.out.println("Tong chan la:"+sum);
        //in lap nguoc so n=123456;
//      int n=123456;
//      int res=0;
//        while (n!=0) {            
//            res=res*10+n%10;
//            n/=10;
//            
//        }
//        System.out.println(res);
        //tinh tong uoc cua 1 so
//        long n = sc.nextInt();
//        long sum = 0;
//        for (int i = 1; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                sum += i;
//                if (i != n / i) {
//                    sum += n / i;
//                }
//            }
//
//        }
//        System.out.println(sum);
        //dem chu so chinh phuong i^2
//        long n=sc.nextInt();
//        for(int i=1;i<=Math.sqrt(n);i++){
//            System.out.print(1L*i*i+" ");
//        }
        //bai toan dem chu so nguyen to
//        long n=sc.nextInt();
//        int dem=0;
//        while(n>0){
//            long res=n%10;
//            if(res==2||res==3||res==5||res==7){
//                dem++;
//            }
//            n/=10;
//        }
//        System.out.println(dem);
        //doi chai bia
        // int n = sc.nextInt();
//        int sochai = n / 28;
//        int sovo = sochai;
//        while (sovo >= 3) {
//            int biamoi = sovo / 3;
//            sochai += biamoi;
//            sovo = biamoi + sovo % 3;
//
//        }
//        System.out.println(sochai);

         //bai toan bieu dien tong cac so nguyen to
         int n=sc.nextInt();
         if(n==1){
             System.out.println("-1");
             return;
         }
         if(n%2==0){
             System.out.println(n/2);
             for(int i=1;i<=n/2;i++){
                 System.out.print("2"+" ");
             }
           
         }
         else{
             System.out.println(n/2);
             for(int i=1;i<=n/2-1;i++){
                 System.out.print("2"+" ");
             }
             System.out.println("3");
         }
        
    }

}
