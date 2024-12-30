package Contest_ham;

import java.util.*;

public class baitapham2 {

//    //kiem tra xem co la so nguyen to khong
//    public static boolean nt(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//
//        }
//        return true;
//    }
//
//    //tong chu so chan cua so n
//    public static int tongchuso(int n) {
//        int sum = 0;
//        while (n > 0) {
//            if (n % 10 % 2 == 0) {
//                sum += n % 10;
//            }
//            n /= 10;
//        }
//        return sum;
//    }
//    //in ra tong chu so la so nguyen to
//
//    public static int sumnt(int n) {
//        int sum = 0;
//        while (n > 0) {
//            if (n % 10 == 2 || n % 10 == 3 || n % 10 == 5 || n % 10 == 7) {
//                sum += n % 10;
//            }
//            n /= 10;
//        }
//        return sum;
//    }
//
//    //in lat nguoc so
//    public static int latnguoc(int n) {
//        int res = 0;
//        while (n > 0) {
//            res = res * 10 + n % 10;
//            n /= 10;
//        }
//        return res;
//    }
//
//    //tinh tong uoc cua n la so nguyen to
//    public static int demuocnt(int n) {
//        int count = 0;
//
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                count++;
//                while (n % i == 0) {
//                    n /= i;
//                }
//            }
//            if (n != 1) {
//                count++;
//            }
//
//        }
//        return count;
//    }
//
//    //in ra uoc max nhat cua n la so nguyen to
//    public static int maxuocnt(int n) {
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                max = i;
//                while (n % i == 0) {
//                    n /= i;
//                }
//            }
//            if (n != 1) {
//                max = n;
//            }
//
//        }
//        return max;
//    }
//
//    //kiem tra xem co cac chu so con ton tai it nhat 1 so 6 khong
//    public static boolean check6(int n) {
//        while (n > 0) {
//            if (n % 10 == 6) {
//                return true;
//            }
//            n /= 10;
//        }
//        return false;
//    }
//
//    //ham tinh giai thua
//    public static int gt(int n) {
//        int gt = 1;
//        for (int i = 1; i <= n; i++) {
//            gt = gt * i;
//        }
//        return gt;
//
//    }
//
//    //ham tinh tong giai thua chu so
//    public static int sumgiathua(int n) {
//        int sum = 0;
//        while (n > 0) {
//            sum += gt(n % 10);
//            n /= 10;
//        }
//
//        return sum;
//
//    }
//    //kiem tra xem n co duoc tao boi 1 so duy nhat hay khong 666,777
//
//    public static boolean chusogiong(int n) {
//        int lastDigit = n % 10;
//        while (n > 0) {
//            if (n % 10 != lastDigit) {
//                return false;
//            }
//            n /= 10;
//        }
//        return true;
//    }
//
//    //kiem tra xem chu so cuoi cung co la so max nhat khong
//    public static boolean maxchusocuoi(int n) {
//        int lastdigit = n % 10;
//        n = n / 10;
//        while (n > 0) {
//            if ((n % 10) < lastdigit) {
//                return true;
//            }
//            n /= 10;
//        }
//        return false;
//    }
//
//    //tinh tong luu thua chu so voi so mu la so chu so 123 ->n=3 (mu)
//    public static int demmu(int n) {
//        int dem = 0;
//        while (n > 0) {
//            dem++;
//            n /= 10;
//        }
//        return dem;
//    }
//
//    public static int tongmu(int n) {
//        int sum = 0;
//        int mu = demmu(n);
//        while (n > 0) {
//            sum += Math.pow(n % 10, mu);
//            n /= 10;
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//
//    }
    //so fibonaci chi so 93 so thoi
//    public static boolean fibo(int n) {
//
//        if (n <= 1) {
//            return true;
//        }
//        int f1 = 0, f2 = 1;
//        for (int i = 1; i <= 93; i++) {
//            int fn = f1 + f2;
//            if (n == fn) {
//                return true;
//            }
//            f1 = f2;
//            f2 = fn;
//
//        }
//        return false;
//    }
//
//    public static int tcn(int n) {
//        int sum = 0;
//        while (n > 0) {
//
//            sum += (n % 10);
//            n /= 10;
//        }
//        return sum;
//    }
//
//    public static boolean checkfibo(int n) {
//        return fibo(tcn(n));
//    }
    //    //so thuan nguyen to(la so nguyen to,all chu so la nguyen to,sum chu so cung la nguyen to)
//  
//
//
//    // Phương thức kiểm tra số nguyên tố
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
//    // Phương thức kiểm tra các chữ số của một số có phải là số nguyên tố không
//    public static boolean chusont(int n) {
//        while (n > 0) {
//            if (!nt(n % 10)) { // Kiểm tra từng chữ số, nếu không phải số nguyên tố thì trả về false
//                return false;
//            }
//            n /= 10;
//        }
//        return true;
//    }
//
//    // Phương thức kiểm tra tổng các chữ số của một số có phải là số nguyên tố không
//    public static boolean sumchuso(int n) {
//        int sum = 0;
//        while (n > 0) {
//            sum += n % 10;
//            n /= 10;
//        }
//        return nt(sum); // Trả về kết quả kiểm tra tổng các chữ số có phải số nguyên tố không
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int dem = 0;
//        for (int i = a; i <= b; i++) {
//            if (nt(i) && chusont(i) && sumchuso(i)) { // Kiểm tra cả ba điều kiện
//                dem++;
//            }
//        }
//        System.out.println(dem); // In ra số lượng các số thỏa mãn điều kiện
//    }
    //uoc so nguyen to nho nhat
//    public static int uocnt(int n){
//        for(int i=2;i<=Math.sqrt(n);i++){
//            if(n%i==0){
//                return i;
//            }
//            }
//        
//            return n;
//}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            System.out.println(uocnt(i)+" ");
//        }
//        
//        
//    }
    //so phenic
//    public static boolean phenic(long n) {
//        int count = 0;
//
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                int mu = 0;
//                count++;
//                while (n % i == 0) {
//                    mu++;
//
//                    n /= i;
//                }
//                if (mu > 1) {
//                    return false;
//                }
//            }
//
//        }
//        if (n != 1) {
//            count++;
//        }
//        return count == 3;
//
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        long n=sc.nextLong();
//        if(phenic(n)){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }
//    }
    //so Smith
//    public static int tcs(int n) {
//        int sum = 0;
//        while (n > 0) {
//            sum += n % 10;
//            n /= 10;
//        }
//        return sum;
//
//    }
//Một số Smith là số hợp (không phải là số nguyên tố) có tính chất sau: tổng các chữ số của nó bằng
    //tổng các chữ số của tất cả các thừa số nguyên tố của nó (bao gồm cả bội số).
//    public static boolean checkSmith(int n) {
//        int sum1 = 0, sum2 = tcs(n), temp = n;
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                while (n % i == 0) {
//                    sum1 += tcs(i);
//                    n /= i;
//                }
//            }
//        }
//        if (n == temp) {
//            return false;
//        }
//        if (n != 1) {
//            sum1+=tcs(n);
//        }
//        return sum1 == sum2;
//
//    }
//
//    public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         if(checkSmith(n)){ 
//             System.out.println("Yes");
//         }else{ 
//             System.out.println("No");
//         }
//    }
    //check so dep 1:neu no chia het cho 1 so thi no cung chia het cho so^2;
//    public static boolean sodep(int n) {
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                int mu = 0;
//                while (n % i == 0) {
//                    mu++;
//                    n /= i;
//                }
//                if (mu > 1) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//    //check so dep 2:
//
//    public static boolean sodep2(int n) {
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                int mu = 0;
//                while (n % i == 0) {
//                    mu++;
//                    n /= i;
//                }
//                if (mu < 1) {
//                    return false;
//                }
//            }
//        }
//        if(n!=1){   
//            return false;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        for (int i = a; i <= b; i++) {
//            if (sodep2(i)) {
//                System.out.print(i + " ");
//            }
//        }
//    }
    //so thuan nghich co 3 uoc nguyen to
    
//   public static boolean tn(int n){ 
//       int res=0,temp=n;
//       while(n>0){  
//           res=res*10+n%10;
//           n/=10;
//       }
//       if(res==temp){
//           return true;
//       }
//       return false;
//   }
//   public static boolean checkuocnt(int n){ 
//       int dem=0;
//       for(int i=2;i<=Math.sqrt(n);i++){    
//           if(n%i==0){  
//             dem++;
//             while(n%i==0){ 
//                 n/=i;
//             }
//           }
//       }
//       if(n!=1){    
//           dem++;
//       }
//       return dem>=3;
//   }
//    public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         for(int i=a;i<=b;i++){ 
//             if(tn(i)&&checkuocnt(i)){ 
//                 System.out.print(i+" ");
//             }
//         }
//    }
    //chu so cuoi cung lon nhat la so nguyen to
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
//    public static boolean checktm(int n){   
//        int lastDigit=n%10;
//        while(n>0){ 
//            int r=n%10;
//            if(r>lastDigit){    
//                return false;
//            }
//            n/=10;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int dem=0;
//        for(int i=0;i<n;i++){   
//            if(nt(i)&&checktm(i)){  
//                dem++;
//                System.out.print(i+" ");
//            }
//            
//        }
//        System.out.println("");
//        System.out.println(dem);
//    }
    
   //so fibonaci >=n nhap vao

//   public static long fibo(long n){ 
//       long fibo[]=new long[1000001];
//       fibo[1]=0;
//       fibo[2]=1;
//       for(int i=3;i<=93;i++){  
//           fibo[i]=fibo[i-1]+fibo[i-2];
//           if(fibo[i]>=n){  
//               return fibo[i];
//           }
//       }
//       return -1;
//   }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long n=sc.nextLong();
//        System.out.println(fibo(n));
//    }
           
   //kiem tra xem so vua nhap vao co chu so dau tien lon hon all cac chu so con lai hay khong
    public static boolean check(int n){ 
        int max=Integer.MIN_VALUE;
       
        while(n>=10){   
            if(n%10>max){   
                max=n%10;
            }
            n/=10;
        }
        return n>max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){   
            
            if(check(i)){   
                System.out.print(i+" ");
            }
        }
    }
}
