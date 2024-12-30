package mang1chieu;

import java.util.*;

public class Mangdanhdau {

//    public static void main(String[] args) {
//        //mang danh dau 1:
//        //nhuoc diem:ko danh dau dc cho so am va so phan tu qua lon >10^6 tro len
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
//        int[] cnt = new int[1000001];
//        for (int i = 0; i < n; i++) {
//            cnt[a[i]] = 1;
//        }
//        int dem=0;
//       for(int index=0;index<=1000000;index++){
//           if(cnt[index]==1){
//               dem++;
//           }
//       }
//        System.out.println(dem);
    //mang danh dau 2:in ra them tan xuat cua no
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int[] a = new int[n];
//    for(int i=0;i<n;i++){
//        a[i]=sc.nextInt();
//    }
//    int []cnt=new int[1000001];
//    for(int i=0;i<n;i++){   
//       cnt[a[i]]++;
//    }
//    for(int index=0;index<=1000000;index++){
//        if(cnt[index]!=0){
//            System.out.println(index+" "+cnt[index]);
//        }
//    }
//  
//}
//   // mang danh dau 3:in ra thu tu xuat hien cua no +tan xuat
//    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int[] a = new int[n];
//    for(int i=0;i<n;i++){
//        a[i]=sc.nextInt();
//    }
//    int []cnt=new int[1000001];
//    for(int i=0;i<n;i++){   
//       cnt[a[i]]++;
//    }
//    for(int i=0;i<n;i++){
//        if(cnt[a[i]]!=0){
//            System.out.println(a[i]+" "+cnt[a[i]]);
//            cnt[a[i]]=0;
//        }
//    }
//    }
//  
//}
    //mang danh dau 4:in ra so lan gia tri xuat hien nhieu nhat trong mang
    //neu co nhieu pt cung gia tri lay gia tri nho nhat
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int[] a = new int[n];
//    for(int i=0;i<n;i++){
//        a[i]=sc.nextInt();
//    }
//    int []cnt=new int[1000001];
//    for(int i=0;i<n;i++){   
//       cnt[a[i]]++;
//    }
//    int ans=0,max=0;
//    for(int index=0;index<=1000000;index++){
//        if(cnt[index]>max){
//            ans=index;
//            max=cnt[index];
//        }
//        
//    }
//    System.out.println(ans+" "+max);
//    
//    }
//  
//}
    //mang danh dau 5:in ra so lan gia tri xuat hien nhieu nhat trong mang
    //neu co nhieu pt cung gia tri lay gia tri max nhat
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        int[] cnt = new int[1000001];
//        for (int i = 0; i < n; i++) {
//            cnt[a[i]]++;
//        }
//        int ans = 0, max = 0;
//        for (int index = 0; index <= 1000000; index++) {
//            if (cnt[index] >= max) {
//                ans = index;
//                max = cnt[index];
//            }
//
//        }
//        System.out.println(ans + " " + max);
//
//    }
    //chen 1 phan tu vi tri k gia tri a[k] vao mang
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        // Đọc số phần tử của mảng
//        int n = sc.nextInt();
//        
//        // Tạo mảng có kích thước n + 1 để chứa phần tử mới
//        int[] a = new int[n + 1];
//        
//        // Đọc các phần tử của mảng
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        
//        // Đọc vị trí k nơi sẽ chèn phần tử mới
//        int k = sc.nextInt();
//        
//       
//        
//        // Di chuyển các phần tử từ vị trí k trở đi sang phải một vị trí
//        for (int i = n; i > k; i--) {
//            a[i] = a[i - 1];
//        }
//        
//        // Chèn phần tử mới tại vị trí k
//        a[k] = sc.nextInt();
//        
//        // Tăng số phần tử của mảng lên 1
//        n++;
//        
//        // In ra mảng sau khi chèn phần tử mới
//        for (int i = 0; i < n; i++) {
//            System.out.print(a[i] + " ");
//        }
//    }
    //xoa 1 phan tu trong mang dua vao chi so
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        // Đọc số phần tử của mảng
//        int n = sc.nextInt();
//        
//        // Tạo mảng có kích thước n + 1 để chứa phần tử mới
//        int[] a = new int[n + 1];
//        
//        // Đọc các phần tử của mảng
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        int k=sc.nextInt();
//        for(int i=k;i<n-1;i++){
//            a[i]=a[i+1];
//        }
//        n--;
//        for(int i=0;i<n;i++){
//            System.out.print(a[i]+" ");
//        }
//    }
    //xoay phai mang voi k lan xoay
//    public static void rightrotate(int[] a, int n) {
//        int temp = a[n - 1]; // Lưu giá trị cuối cùng
//        for (int i = n - 1; i > 0; i--) {
//            a[i] = a[i - 1]; // Di chuyển các phần tử sang phải
//        }
//        a[0] = temp; // Đặt giá trị cuối cùng vào vị trí đầu tiên
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        k %= n;
//        for (int i = 1; i <= k; i++) {
//            rightrotate(a, n);
//        }
//        for (int x : a) {
//            System.out.print(x + " ");
//        }
//    }
    //xoay trai voi k lan xoay
//    public static void leftrotate(int[] a, int n) {
//        int temp = a[0]; // Lưu giá trị phan tu dau
//        for (int i = 0; i <n-1; i++) {
//            a[i] = a[i +1]; // Di chuyển các phần tử sang trai
//        }
//        a[n-1]=temp; // Đặt giá trị dau tien vào vị trí cuoi
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        k %= n;// Đảm bảo k không lớn hơn n
//        for (int i = 1; i <= k; i++) { // Thực hiện quay vòng k lần
//            leftrotate(a, n);
//        }
//        for (int x : a) {
//            System.out.print(x + " ");
//        }
//    }
    //bai toan tim uoc chung lon nhat 2 so
//    public static int gcd(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return gcd(b, a % b);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        int res = 0;
//        for (int i = 0; i < n - 1; i++) {
//            res = gcd(a[i], a[i + 1]);
//        }
//        System.out.println(res);
//    }
    
    //bai toan tim so lon thu nhat va lon thu 2 trong mang
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){   
//            if(a[i]>max1){
//                max2=max1;
//                max1=a[i];
//                
//            }
//            else if(a[i]>max2&&a[i]!=max1){
//             
//                max2=a[i];
//            }
//            
//        }
//        System.out.print(max1+" "+max2);
//    }
    
     
}
