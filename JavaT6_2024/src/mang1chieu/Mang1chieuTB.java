package mang1chieu;

import java.util.*;

public class Mang1chieuTB {
    //bai 19:Day con lon nhat + cac phan tu cua no
    // tìm chuỗi con dài nhất của các số khác nhau liên tiếp và tính tổng của chuỗi đó. 
    //Nếu có nhiều chuỗi con có cùng độ dài, chuỗi con có tổng lớn hơn sẽ được chọn.
    //Cuối cùng, đoạn code in ra độ dài của chuỗi con đó và các phần tử của nó

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//
//        }
//        int cntpt = 1, maxcntpt = 1, curpt = 0, sumpt = a[0], maxsumpt = Integer.MIN_VALUE;
//        for (int i = 1; i < n; i++) {
//            // Nếu phần tử hiện tại khác phần tử trước đó
//            if (a[i] != a[i - 1]) {
//                cntpt++; // Tăng biến đếm độ dài chuỗi hiện tại
//                sumpt += a[i]; // Cộng giá trị phần tử hiện tại vào tổng
//            } else {
//                cntpt = 1; // Đặt lại biến đếm độ dài chuỗi hiện tại
//                sumpt = a[i]; // Đặt lại tổng của chuỗi hiện tại
//            }
//
//            // Cập nhật các giá trị maxcntpt, maxpt và curpt nếu cần thiết
//            if (cntpt > maxcntpt || sumpt > maxsumpt || cntpt == maxcntpt) {
//                maxcntpt = cntpt; // Cập nhật độ dài chuỗi dài nhất
//                maxsumpt = sumpt; // Cập nhật tổng lớn nhất của chuỗi dài nhất
//                curpt = i - maxcntpt + 1; // Cập nhật vị trí bắt đầu của chuỗi dài nhất
//            }
//        }
//        //// In ra độ dài chuỗi dài nhất
//        System.out.println(maxcntpt);
//        System.out.println(maxsumpt);
//        // In ra các phần tử của chuỗi dài nhất
//        for (int i = curpt; i < curpt + maxcntpt; i++) {
//            System.out.print(a[i] + " ");
//
//        }
//    }
    //bai 1:
//    public static boolean snt(int n) {        
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
//    public static boolean dx(int a[], int n) {        
//        for (int i = 0; i <= n / 2; i++) {            
//            if (a[i] != a[n - 1 - i]) {                
//                return false;
//            }
//        }
//        return true;
//    }
//    chia du cho mod=10^9+7
//    public static int tich(int a[]) {        
//        int res = 1;
//        int mod = (int) (1e9 + 7);
//        for (int x : a) {            
//            res = (int) ((long) res * x % mod);
//        }
//        return res;        
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {            
//            a[i] = sc.nextInt();
//        }
//        //tim gia tri max va min +index
//        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
//        int posmax = 0, posmin = 0, cnt = 0;
//        long maxtich = Long.MIN_VALUE;
//        for (int i = 0; i < n; i++) {            
//            if (a[i] > max) {                
//                max = a[i];
//                posmax = i;
//            }
//            if (a[i] <= min) {                
//                min = a[i];
//                posmin = i;
//            }
//            //dem so nguyen to trong day
//            if (snt(a[i])) {                
//                cnt++;
//            }
//            
//        }
//        for (int i = 0; i < n - 1; i++) {            
//            maxtich = Math.max(maxtich, a[i] * a[i + 1]);
//        }
//        
//        System.out.println(max + " " + posmax);
//        System.out.println(min + " " + posmin);
//        System.out.println(cnt);
//        System.out.println(maxtich);
//        if (dx(a, n)) {
//            System.out.println("Yes");
//            
//        } else {            
//            System.out.println("No");
//        }
//        System.out.println(tich(a));
//    }
    //bai 2:kiem tra mang tang dan
//    public static boolean check(int a[],int n){ 
//        for(int i=1;i<n;i++ ){  
//            if(a[i]<=a[i-1]){    
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {            
//            a[i] = sc.nextInt();
//        }
//       if(check(a, n)){ 
//           System.out.println("Yes");
//       }
//       else{    
//           System.out.println("No");
//       }
//        
//    }
    //so lon hon all so con lai
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {            
//            a[i] = sc.nextInt();
//        }
//        int max=Integer.MIN_VALUE;
//        for(int x:a){   
//           if(x>max) {  
//               System.out.print(x+" ");
//               max=x;
//           }
//        }
//        }
    //bai toan 'Die hard' tra tien ban dau no khong co tien
//    public static boolean check(int a[]){ 
//        int d[]=new int[101];
//        for(int x:a){   
//            if(x==25){  
//                d[25]++;
//            }
//            else if(x==50){ 
//                if(d[25]==0){   
//                    return false;
//                }
//                else{   
//                    d[25]--;
//                    d[50]++;
//                }
//            }
//            //x=100
//            else{   
//               if(d[50]>=1&&d[25]>=1){    
//                   d[50]--;
//                   d[25]++;
//                   d[100]++;
//               }else if(d[25]>=3){  
//                   d[25]-=3;
//               }
//               else{    
//                   return false;
//               }
//            }
//        }
//        return true;
//    }
//                
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {            
//            a[i] = sc.nextInt();
//        }
//        if(check(a)){   
//            System.out.println("Yes");
//        }
//        else{   
//            System.out.println("No");
//        }
//        
//    }
    //bai toan thanh pho Lineland
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        System.out.println((a[1] - a[0]) + " " + (a[n - 1] - a[0]));
//        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
//        for (int i = 1; i < n - 1; i++) {
//            
//            min = Math.min(a[i] - a[i - 1], a[i + 1] - a[i]);
//            max = Math.max(a[i] - a[0], a[n - 1] - a[i]);
//            System.out.println(min + " " + max);
//        }
//
//        System.out.println((a[n - 1] - a[n - 2]) + " " + (a[n - 1] - a[0]));
//    }
      //cap nguyen to cung nhau:Khi UCLN cua no la 1 vi du: 3 8
//    public static int gcd(int a,int b){ 
//        if(b==0){   
//            return a;
//        }
//        return gcd(b, a%b);
//    }
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        int dem=0;
//        for(int i=0;i<n;i++){   
//            for(int j=i+1;j<n;j++){ 
//                if(gcd(a[i],a[j])==1){ 
//                    
//                    dem++;
//                }
//            }
//        }
//        System.out.println(dem);
//    }
    
      //sap xep chu so le ,chan
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Integer a[] = new Integer[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a,new Comparator<Integer>(){    
//             @Override
//             public int compare(Integer o1, Integer o2) {
//                 
//                if(o1%2!=0&&o2%2!=0){   
//                    return o2-o1;
//                }
//                if(o1%2==0&&o2%2==0){   
//                    return o1-o2;
//                }
//                if(o1%2!=0&&o2%2==0){   
//                    return -1;
//                }
//              return 1; 
//             }
//            
//        });
//        for(int x:a){   
//            System.out.print(x+" ");
//        }
//    }
       //ky thuat 2 con tro hop mang
//   public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[] a = new int[n];
//        int[] b = new int[m];
//
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < m; i++) {
//            b[i] = sc.nextInt();
//        }
//
//        int i = 0, j = 0;
//        while (i < n && j < m) {
//            if (a[i] <= b[j]) {
//                System.out.print(a[i] + " ");
//                i++;
//            } else {
//                System.out.print(b[j] + " ");
//                j++;
//            }
//        }
//
//        // Print remaining elements of array a
//        while (i < n) {
//            System.out.print(a[i] + " ");
//            i++;
//        }
//
//        // Print remaining elements of array b
//        while (j < m) {
//            System.out.print(b[j] + " ");
//            j++;
//        }
//
//        sc.close();
//    }
    
       //in ra cac so +tan xuat cua no
//    public static void tx(Map<Integer,Integer> map,int x){    
//        if(map.containsKey(x)){ 
//            map.put(x,map.get(x)+1);
//        }
//        else{
//            map.put(x,1);
//        }
//    }
//    public static void in(Map<Integer,Integer> map){    
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey()+" "+entry.getValue());
//            
//        }
//    }
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//       
//        int[] a = new int[n];
//        TreeMap<Integer,Integer> map1=new TreeMap<>();
//        LinkedHashMap<Integer,Integer> map2=new LinkedHashMap<>();
//     
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//            tx(map1, a[i]);
//            tx(map2,a[i]);
//        }
//        in(map1);
//        System.out.println("");
//        in(map2);
//        
//    }
      
        //bai toan doi tien tham lam
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int money[]={1000,500,200,100,50,20,10,5,1};
//        long n=sc.nextLong();
//        int index=0;
//        int cnt=0;
//        while(n!=0){    
//            cnt+=n/money[index];
//            n=n%money[index];
//            index++;
//        }
//        System.out.println(cnt);
//    }
      //dem cac so +tax xuat ko cu du lieu dau vao 123 467
    //kiem tra cac so tang dan
//    public static boolean check(int n){ 
//        while(n>=10){    
//            int s1=n%10;
//            int s2=n/10%10;
//           if(s1<s2){   
//               return false;
//           }
//           n/=10;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        HashMap<Integer,Integer> map=new HashMap<>();
//        while(sc.hasNext()){    
//            int t=sc.nextInt();
//            if(t==-1) break;
//            if(check(t)){   
//                if(map.containsKey(t)){ 
//                map.put(t,map.get(t)+1);
//            }else{  
//                map.put(t,1);
//            }
//            }
//            
//        }
//        ArrayList<Integer> arr=new ArrayList<>();
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            arr.add(entry.getKey());
//            
//        }
//        Collections.sort(arr,new Comparator<Integer>(){ 
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                 if(map.get(o1)!=map.get(o2)){  
//                     return map.get(o2)-map.get(o1);
//                 }
//                 else{  
//                     return o1-o2;
//                 }
//            }
//            
//        });
//        for(int x:arr){ 
//            System.out.println(x+" "+map.get(x));
//        }
//    }
      //bai toan BRT
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int a[]=new int[n];
//        for(int i=0;i<n;i++){   
//            a[i]=sc.nextInt();
//            
//        }
//        Arrays.sort(a);
//        int min=Integer.MAX_VALUE;
//        int dem=0;
//        for(int i=1;i<n;i++){   
//            min=Math.min(min,Math.abs(a[i]-a[i-1]));
//        }
//        for(int i=1;i<n;i++){   
//            if(min==(a[i]-a[i-1])){ 
//               dem++;
//            }
//        }
//        System.out.println(min+" "+dem);
//    }
        //bai 16:Pytogo:Ap dung three sum:ba so b^2+a^2=c^2;
//    public static  boolean check(Integer a[],int n){   
//        for(int c=0;c<n;c++){   
//            int l=c+1,r=n-1;
//            long target=(long)a[c]*a[c];
//            while(l<r){ 
//                long res=(long)a[l]*a[l]+(long)a[r]*a[r];
//                if(res==target){    
//                    return true;
//                }else if(res<target){   
//                    r--;
//                }else{  
//                    l++;
//                }
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        Integer a[]=new Integer[n];
//        for(int i=0;i<n;i++){   
//            a[i]=sc.nextInt();
//            
//        }
//        Arrays.sort(a,new Comparator<Integer>(){ 
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//            
//        });
//        if(check(a, n)){    
//            System.out.println("Yes");
//        }else{  
//            System.out.println("No");
//        }
//    }
     //dem cac cap phan tu giong nhau trong mang
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int a[]=new int[n];
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<n;i++){   
//            a[i]=sc.nextInt();
//            if(map.containsKey(a[i])){  
//                map.put(a[i],map.get(a[i])+1);
//            }else{
//                map.put(a[i],1);
//            }
//        }
//        int dem=0;
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            dem+=(long)entry.getValue()*(entry.getValue()-1)/2;
//            
//        }
//        System.out.println(dem);
//    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        long a[]=new long[n];
        long b[]=new long[m];
        for(int i=0;i<n;i++){   
            a[i]=sc.nextLong();
        }
        for(int i=0;i<m;i++){   
            b[i]=sc.nextLong();
        }
        int i=0,j=0;
        int dem=0;
        Arrays.sort(a);
        Arrays.sort(b);
        while(i<n){    
            while(j<m){ 
                if(Math.pow(a[i],b[j])>Math.pow(b[j],a[i])){    
                    dem++;         
                }
                j++;
            }
            j=0;
            i++;
        }
         System.out.println(dem); 
    }
}
