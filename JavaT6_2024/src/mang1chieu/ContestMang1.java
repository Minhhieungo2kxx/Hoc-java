package mang1chieu;

import java.util.*;

public class ContestMang1 {
    //liet ke so fibonaci trong mang co n phan tu

//    public static long fibo[] = new long[94]; // Kích thước đủ lớn để chứa 93 số Fibonacci
//
//    public static void xuly() {
//        fibo[0] = 0;
//        fibo[1] = 1;
//        for (int i = 2; i < 94; i++) {
//            fibo[i] = fibo[i - 1] + fibo[i - 2];
//        }
//    }
//
//    public static boolean check(long n) {
//        if (n < 0) {
//            return false;
//        }
//        for (int i = 0; i < 94; i++) {
//            if (fibo[i] == n) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        xuly();
//        int n = sc.nextInt();
//        long a[] = new long[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextLong();
//        }
//        int dem = 0;
//        for (int i = 0; i < n; i++) {
//            if (check(a[i])) {
//                dem++;
//                System.out.print(a[i] + " ");
//            }
//        }
//        if (dem == 0) {
//            System.out.println("None");
//        }
//    }
    //tim vi tri cuoi cung cua pt min nhat trong mang
    //va tim vi tri dau tien cua pt max nhat trong mang
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        int indexmin = 0, min = Integer.MAX_VALUE, indexmax = 0, max = Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//           if(a[i]<=min){   
//               min=a[i];
//               indexmin=i;
//           }
//           if(a[i]>max){    
//               max=a[i];
//               indexmax=i;
//           }
//        }
//        System.out.print(indexmin+" "+indexmax);
//    }
    //kiem tra so nguyen to trong day
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
//    //kiem tra so thuan nghich
//    public static boolean tn(int n) {
//        int res = 0, temp = n;
//        while (n > 0) {
//            res = res * 10 + n % 10;
//            n /= 10;
//        }
//        return res == temp;
//    }
//
//    //kiem tra so chinh phuong
//    public static boolean cp(int n) {
//        int can = (int) Math.sqrt(n);
//        return can * can == n;
//
//    }
//
//    //tong chu so la so nguyen to
//    public static boolean tcs(int n) {
//        int sum = 0;
//        while (n > 0) {
//            sum += n % 10;
//            n /= 10;
//        }
//        return nt(sum);
//    }
//    //so fibonaci
//    public static boolean fibonaci(int n){  
//        int fibo[]=new int[300];
//        fibo[0]=0;
//        fibo[1]=1;
//        for(int i=2;i<=92;i++){ 
//            fibo[i]=fibo[i-1]+fibo[i-2];
//        }
//       for(int i=0;i<=92;i++){
//           if(fibo[i]==n){  
//               return true;
//           }
//    }
//       return false;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
////        int dem1 = 0, dem2 = 0, dem3 = 0, dem4 = 0;
////        for (int x : a) {
////            if (nt(x)) {
////                dem1++;
////            }
////            if (tn(x)) {
////                dem2++;
////            }
////            if (cp(x)) {
////                dem3++;
////            }
////            if (tcs(x)) {
////                dem4++;
////            }
////
////        }
////        System.out.println(dem1);
////        System.out.println(dem2);
////        System.out.println(dem3);
////        System.out.println(dem4);
//        for(int x:a){   
//            if(fibonaci(x)){    
//                System.out.print(x+" ");
//            }
//        }
//    }
    //liet ke theo thu tu xuat hien cac so co it nhat 2 so trai dau dung canh no
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        for(int i=1;i<n-1;i++){   
//            if(a[i]>a[i-1]&&a[i]>a[i+1]){   
//                System.out.print(a[i]+" ");
//            }
//        }
//    }
    //mang cong don:ap dung vao bai toan truy van tong va tich
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        int F[]=new int[n];
//        for(int i=0;i<n;i++){   
//            if(i==0){   
//                F[i]=a[i];
//            }
//            else{   
//                F[i]=F[i-1]+a[i];
//            }
//            System.out.print(F[i]+" ");
//        }
//    }
    //tong day so k lien tiep voi k la so phan tu can tinh
    //vd:7 5 -> n=7 ,k=5 ->co 3 day con so tong k=5
    //5 9 4 5 5 8 7
    //28 31 29
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k=sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//       for(int i=0;i<=n-k;i++){
//           int sum=0;
//          for(int j=0;j<k;j++){
//              sum+=a[i+j];
//          }
//           System.out.print(sum+" ");    
//       }
//    }
    //cho 2 mang a,b ,chen mang b vao mang a theo chi so k
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m=sc.nextInt();
//        int k=sc.nextInt();
//        int a[]=new int[n];
//        int b[]=new int[m];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//         for (int i = 0; i < m; i++) {
//            b[i] = sc.nextInt();
//        }
//        
//    for(int i=0;i<k;i++){   
//        System.out.print(a[i]+" ");
//    }
//    for(int i=0;i<m;i++){   
//        System.out.print(b[i]+" ");
//    }
//    for(int i=k;i<n;i++){   
//        System.out.print(a[i]+" ");
//    }
//        
//    }
    //xoa nhung phan tu lien ke giong nhau
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int a[]=new int[n];
//      for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//      for(int i=0;i<n;i++){ 
//          if(i==0||a[i]!=a[i-1]){   
//              System.out.print(a[i]+" ");
//          }
//      }
//                
//    }
    //tinh tong cong tru 2 mang
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        int b[]=new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n-1; i++) {
//            b[i] = sc.nextInt();
//        }
//        int res=a[0];
//        for(int i=1;i<n;i++){   
//            if(b[i-1]==1){  
//                res+=a[i];
//            }
//            else{   
//                res-=a[i];
//            }
//        }
//        System.out.println(res);
//    }
    //tinh tong k pt day con lien tuc
    //cach 1:O(n) gan bang n^2
//    public static void sumklt(int n,int a[],int k) {
//
//        for (int i = 0; i <= n - k; i++) {
//            int sum = 0;
//            for (int j = 0; j < k; j++) {
//                sum += a[i + j];
//            }
//            System.out.print(sum + " ");
//        }
//
//    }
//    //canh 2:cua so truot O(n)=n
//    public static void sumklt1(int a[],int n,int k){    
//       // Tính tổng của k phần tử đầu tiên
//        int sum=0;
//        for(int i=0;i<k;i++){   
//            sum+=a[i];
//        }
//         // In tổng của k phần tử đầu tiên
//        System.out.print(sum+" ");
//         // Sử dụng kỹ thuật cửa sổ trượt để tính tổng các cửa sổ tiếp theo
//        for(int i=k;i<n;i++){   
//            sum=sum+a[i]-a[i-k];
//         System.out.print(sum+" ");
//        }
//        System.out.println("");
//    }
//
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        sumklt1(a,n, 2);
//        
//        sumklt(n,a, 4);
//    }
    //dem so lan xuat hien cac pt 1 va 0
//    public static ArrayList<Integer> dem (int a[],int n,int k){ 
//        ArrayList<Integer> arr=new ArrayList<>();
//        int count=0;
//        for(int i=0;i<n;i++){   
//            if(a[i]==k){    
//                count++;
//            }else{  
//                if(count>0){    
//                    arr.add(count);
//                }
//              count=0;
//            }
//          
//        }
//        if(count>0){    
//            arr.add(count);
//        }
//        return arr;
//    }
//       public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//         ArrayList<Integer> arr1=dem(a, n, 1);
//         ArrayList<Integer> arr2=dem(a, n, 0);
//         for(int x:arr1){  
//             System.out.print(x+" ");
//         }
//         for(int y:arr2){  
//             System.out.print(y+" ");
//         }
//
//       
//    }
    //bai 42:next greater element
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            int res=-1;
//            for (int j = i + 1; j < n; j++) {
//                if (a[j] > a[i]) {
//                    res=a[j];
//                    break;
//                }
//
//            }
//
//            System.out.print(res + " ");
//        }
//        System.out.println("");
//    }
    //bai 43:Tint tong moi day con trong mang a
//    public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        for(int i=0;i<n;i++){   
//            int sum=0;
//            for(int j=i;j<n;j++){   
//                sum+=a[j];
//                System.out.print(sum+" ");
//            }
//        }               
//    }
    //bai 44:dem so luong day con lien tiep so luong chan==so luong le
    
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        int dem=0;
//        for(int i=0;i<n;i++){   
//            int chan=0,le=0;
//            for(int j=i;j<n;j++){   
//                if(a[j]%2==0){  
//                    chan++;
//                }
//                else{   
//                    le++;
//                }
//             if(chan==le){  
//                 dem++;
//             }
//            }
//        }
//         System.out.println(dem);
//    }
   //bai 45:In ra chu 28tech o vi tri chan
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char a[]=new char[n];
        for(int i=0;i<n;i++){   
            a[i]=sc.next().charAt(0);
        }
        String kq="28tech";
        int i=0,j=0;
        while(i<n&&j<6){
            if(a[i]==kq.charAt(j)){ 
                j++;
            }
            i+=2;
            
        }
        if(j==6){   
            System.out.println("28TECH");
        }else{  
            System.out.println("HCET28");
        }
        
        
    }
}
