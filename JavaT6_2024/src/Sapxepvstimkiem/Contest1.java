package Sapxepvstimkiem;

import java.util.*;

public class Contest1 {
    //sap xep chu so chan va chu so le

//    public static int chan(int n) {
//        int dem = 0;
//        if (n == 0) {
//            return 1;
//        }
//        while (n > 0) {
//            if (n % 10 % 2 == 0) {
//                dem++;
//            }
//            n /= 10;
//        }
//        return dem;
//    }
//
//    public static int le(int n) {
//        int dem = 0;
//        if (n == 0) {
//            return 1;
//        }
//        while (n > 0) {
//            if (n % 10 % 2 != 0) {
//                dem++;
//            }
//            n /= 10;
//        }
//        return dem;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Integer a[] = new Integer[n];
//        Integer b[] = new Integer[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//            b[i] = a[i];
//        }
//        Arrays.sort(a, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(chan(o1)!=chan(o2)){ 
//                    return chan(o1)-chan(o2);
//                }
//                else{   
//                    return o1-o2;
//                }
//            }
//
//        });
//        for(int x:a){   
//            System.out.print(x+" ");
//        }
//        
//         Arrays.sort(b, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                 
//                    return le(o1)-le(o2);
//                
//            }
//        });
//         System.out.println("");
//         for(int x:b){  
//             System.out.print(x+" ");
//         }
//
//    }
    //bai 2:
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int x = sc.nextInt();
//        Integer a[] = new Integer[n];
//        Integer b[] = new Integer[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//            b[i] = a[i];
//        }
//        //soor cai dau
//        Arrays.sort(a, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (Math.abs(o1 - x) != Math.abs(o2 - x)) {
//                    return Math.abs(o1 - x) - Math.abs(o2 - x);
//                } else {
//                    return o1 - o2;
//                }
//            }
//
//        });
//
//        for (int t : a) {
//            System.out.print(t + " ");
//        }
//
//        //sort cai sau
//        Arrays.sort(b, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                int r1 = o1 % 2;
//                int r2 = o2 % 2;
//                //chan chan
//                if (r1 == 0 && r2 == 0) {
//                    return o1 - o2;
//                }
//                //le le
//                if (r1 != 0 && r2 != 0) {
//                    return o2 - o1;
//                }
//                //chan le
//                if (r1 == 0 && r2 != 0) {
//                    return -1;
//                }
//                //le chan
//                else {
//                    return 1;
//                }
//
//            }
//
//        });
//        System.out.println("");
//        for (int t : b) {
//            System.out.print(t + " ");
//        }
//
//    }
    //bai :sap xep chu so 0 6 8
//    public static int count068(int n){  
//        int dem=0;
//        while(n>0){ 
//            if(n%10==0||n%10==6||n%10==8){  
//                dem++;
//            }
//            n/=10;
//        }
//        return dem;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        
//        Integer a[] = new Integer[n];
//        
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//            
//        }
//        Arrays.sort(a,new Comparator<Integer>(){    
//            @Override
//            public int compare(Integer o1, Integer o2) {
//               if(count068(o1)!=count068(o2)){  
//                   return count068(o2)-count068(o1);
//               }
//               else{
//                   return o1-o2;
//               }
//            }
//            
//        });
//        for(int x:a){   
//            System.out.print(x+" ");
//        }
//    }
    //bai 4:
//    public static int demsnt(int n) {
//        int dem = 0;
//        while (n > 0) {
//            int r = n % 10;
//            if (r == 2 || r == 3 || r == 5 || r == 7) {
//                dem++;
//            }
//            n /= 10;
//        }
//        return dem;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Integer a[] = new Integer[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//
//        }
//        Arrays.sort(a, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//
//                return demsnt(o2) - demsnt(o1);
//            }
//        });
//        for (int x : a) {
//            System.out.print(x + " ");
//        }
//    }
    //bai tap:4 bien the cua tim kiem nhi phan
    //in ra chi so dau tien >=x
//    public static int ham1(int a[], int n, int x) {
//        int l = 0, r = n - 1, res = -1;
//        while (l <= r) {
//            int mid = (l + r) / 2;
//            if (a[mid] >= x) {
//                res = mid;
//                r = mid - 1;
//            } else {
//                l = mid + 1;
//            }
//        }
//        return res;
//    }
//   //in ra chi so dau tien >x
//    public static int ham2(int a[], int n, int x) {
//        int l = 0, r = n - 1, res = -1;
//        while (l <= r) {
//            int mid = (l + r) / 2;
//            if (a[mid] > x) {
//                res = mid;
//                r = mid - 1;
//            } else {
//                l = mid + 1;
//            }
//        }
//        return res;
//    }
//   //in ra chi so dau tien cua x
//    public static int ham3(int a[], int n, int x) {
//        int l = 0, r = n - 1, res = -1;
//        while (l <= r) {
//            int mid = (l + r) / 2;
//            if (a[mid] == x) {
//                res = mid;
//                r = mid - 1;
//            } else if (a[mid] < x) {
//                l = mid + 1;
//            } else {
//                r = mid - 1;
//            }
//        }
//        return res;
//    }
//  //in ra chi so cuoi cung cua x
//    public static int ham4(int a[], int n, int x) {
//        int l = 0, r = n - 1, res = -1;
//        while (l <= r) {
//            int mid = (l + r) / 2;
//            if (a[mid] == x) {
//                res = mid;
//                l = mid + 1;
//            } else if (a[mid] < x) {
//                l = mid + 1;
//            } else {
//                r = mid - 1;
//            }
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//
//        }
//        Arrays.sort(a);
//        System.out.println(ham1(a, n, k));
//        System.out.println(ham2(a, n, k));
//        int kq3 = ham3(a, n, k);
//        int kq4 = ham4(a, n, k);
//        
//        System.out.println(kq3);
//        System.out.println(kq4);
//        if(kq3==-1){    
//            System.out.println("0");
//        }
//        else{   
//            System.out.println(kq4-kq3+1);
//        }
//
//    }
    //tim va in ra so lon nhat <=x
//     public static int hamcheck(int a[],int n,int x){ 
//         int l=0,r=n-1,res=-1;
//         while(l<=r){   
//             int mid=(l+r)/2;
//           if(a[mid]<=x){   
//               res=mid;
//               l=mid+1;
//           }
//           else{    
//               r=mid-1;
//           }
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//
//        }
//        Arrays.sort(a);
//        int res=hamcheck(a, n, k);
//        if(res==-1){    
//            System.out.println("Not Found");
//        }
//        else{   
//            System.out.println(a[res]);
//        }
//}
    //so lon hon x
//    public static int hamcheck(int a[],int n,int x){    
//        int l=0,r=n-1,res=-1;
//        while(l<=r){    
//            int mid=(l+r)/2;
//            if(a[mid]>x){   
//                res=mid;
//                r=mid-1;
//            }
//            else{   
//                l=mid+1;
//            }
//        }
//        return res;
//    }
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int a[] = new int[n];
//        int b[]=new int[m];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//
//        }
//        for (int i = 0; i < m; i++) {
//            b[i] = sc.nextInt();
//
//        }
//        Arrays.sort(b);
//        
//        for(int x:a){   
//            int pos=hamcheck(b,m, x);
//            if(pos==-1){    
//                System.out.print("0"+" ");
//            }
//            else{
//                System.out.print(m-pos+" ");
//            }
//        }
//    }
    //so xuat hien nhieu nhat trong mang
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//       
//        int a[] = new int[n];
//        TreeMap<Integer,Integer> map=new TreeMap<>();
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//            if(map.containsKey(a[i])){  
//                map.put(a[i],map.get(a[i])+1);
//            }else{  
//                map.put(a[i],1);
//            }
//
//        }
//        int max=map.firstKey();
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if(entry.getValue()>map.get(max)){  
//                max=entry.getKey();
//            }
//            
//        }
//        System.out.println(max+" "+map.get(max));
//    }
    //bai toan kieu vu
//   public static void giamdan(Integer a[],int n){  
//       Arrays.sort(a,new Comparator<Integer>(){  
//           @Override
//           public int compare(Integer o1, Integer o2) {
//              return o2-o1;
//           }
//           
//       });
//   }
//   public static void nhapmang(Integer a[],int n){  
//       Scanner sc = new Scanner(System.in);
//       for(int i=0;i<n;i++){    
//           a[i]=sc.nextInt();
//       }
//   }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m=sc.nextInt();
//        Integer a[] = new Integer[n];
//        Integer b[] = new Integer[m];
//        nhapmang(a, n);
//        nhapmang(b,m);
//        giamdan(a, n);
//        giamdan(b,m);
//        int i=0,j=0,dem=0;
//        
//        while(i<n&&j<m){    
//           if(a[i]>b[j]){   
//               dem++;
//               i++;
//               j++;
//           }else{   
//               j++;
//           } 
//        }
//        System.out.println(dem);
//        
//    }
    //bai toan xep gach
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//       
//        Integer a[] = new Integer[n];
//        for(int i=0;i<n;i++){   
//            a[i]=sc.nextInt();
//            
//        }
//        Arrays.sort(a,new Comparator<Integer>(){    
//             @Override
//             public int compare(Integer o1, Integer o2) {
//                  return o2-o1;
//             }
//            
//        });
//        int gh=Integer.MAX_VALUE;
//        int dem=0;
//        for(int x:a){   
//            if(gh==0){  
//                break;
//            }
//            dem++;
//            gh=Math.min(gh-1, x);
//        }
//        System.out.println(dem);
//    }
    //bai toan vat sua bo sau moi lan vat giam di 1 lit
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//       
//        Integer a[] = new Integer[n];
//        for(int i=0;i<n;i++){   
//            a[i]=sc.nextInt();
//            
//        }
    //uu tien sap xep giam dan de lap ra lit nhieu nhieu nhau co the
//        Arrays.sort(a,new Comparator<Integer>(){    
//             @Override
//             public int compare(Integer o1, Integer o2) {
//                  return o2-o1;
//             }     
//        });
//        long sum=0;
//        for(int i=0;i<n;i++){   
//            if((a[i]-i)>0){ 
//                sum+=a[i]-i;
//            }else{
//                break;
//            }
//        }
//         System.out.print(sum);
//        
//}
    //the 2014 ACM phan tich phan chia nhom
//    public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k=sc.nextInt();
//        Integer a[] = new Integer[n];
//        for(int i=0;i<n;i++){   
//            a[i]=sc.nextInt();
//            
//        }
//        Arrays.sort(a);
//        int dem=1;
//        for(int i=1;i<n;i++){   
//            if(a[i]-a[i-1]>k){  
//                dem++;
//            }
//        }
//        System.out.println(dem);
//    }
    //bai 17:cap so co tong =k
//    public static int first(int a[], int n, int l, int r, int x) {
//
//        int res = -1;
//        while (l <= r) {
//            int mid = (l + r) / 2;
//            if (a[mid] == x) {
//                res = mid; //cap nhat chi so
//                r = mid - 1;//tim tiep dap an tot hon vi tri truoc
//               
//            } else if (a[mid] > x) {
//                r = mid - 1;
//            } else {
//                l = mid + 1;
//            }
//        }
//        return res;
//
//    }
//
//    public static int lasts(int a[], int n, int l, int r, int x) {
//
//        int res = -1;
//        while (l <= r) {
//            int mid = (l + r) / 2;
//            if (a[mid] == x) {
//                res = mid; //cap nhat chi so
//
//                l = mid + 1;
//            } else if (a[mid] > x) {
//                r = mid - 1;
//            } else {
//                l = mid + 1;
//            }
//        }
//        return res;
//
//    }
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k=sc.nextInt();
//        int a[] = new int[n];
//        for(int i=0;i<n;i++){   
//            a[i]=sc.nextInt();
//            
//        }
//        Arrays.sort(a);
//        int dem=0;
//        for(int i=0;i<n;i++){   
//            int t1=first(a, n, i+1,n-1,k-a[i] );
//            int t2=lasts(a, n, i+1,n-1,k-a[i]);
//            if(t1!=-1){ 
//                dem+=t2-t1+1;
//            }
//            
//        }
//        System.out.println(dem);
//        
//    }
    //cap so co tong nho hon  a[i]+a[j]<k
//    public static int last(int a[],int l,int r,int x){ 
//        int res=-1;
//        while(l<=r){ 
//            int mid=(l+r)/2;
//            if(a[mid]<x){   
//                res=mid;
//                l=mid+1;
//            }
//            else{
//                r=mid-1;
//            }
//        }
//        return res;
//    }
//    public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k=sc.nextInt();
//        int a[] = new int[n];
//        for(int i=0;i<n;i++){   
//            a[i]=sc.nextInt();
//            
//        }
//        Arrays.sort(a);
//        long dem=0;
//        for(int i=0;i<n;i++){   
//            
//            int t2=last(a, i+1, n-1, k-a[i]);
//          if(t2!=-1){   
//              dem+=(t2-i);
//          }  
//        }
//        System.out.println(dem);
//    }
    //dem cap so co tong lon hon a[i]+a[j]>x
//    public static int first(int a[], int l, int r, int x) {
//        int res = -1;
//        while (l <= r) {
//            int mid = (l + r) / 2;
//            if (a[mid] > x) {
//                res = mid;
//                r = mid - 1;
//            } else {
//
//                l = mid + 1;
//            }
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//
//        }
//        Arrays.sort(a);
//        long dem = 0;
//        for (int i = 0; i < n; i++) {
//
//            int t2 = first(a, i + 1, n - 1, k - a[i]);
//            if (t2 != -1) {
//                dem += (n - 1) - t2 + 1;
//            }
//        }
//        System.out.println(dem);
//    }
    //bai 20: dem so con thieu vao cho trong
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//       
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//
//        }
//        Arrays.sort(a);
//        int dem=0;
//        for(int i=1;i<n;i++){   
//            if(a[i]-a[i-1]!=1){ 
//                dem++;
//            }
//        }
//        System.out.println(dem);
//    }
    //bai 21:sap xep chu so: a[]={110,111,112,113,114}
    //->cac chu so xuat hien trong cac so tang dan la:0,1,2,3,4
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        TreeSet<Integer> set = new TreeSet<>();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        for (int x : a) {
//            while (x > 0) {
//                set.add(x % 10);
//                x /= 10;
//            }
//        }
//        for (int x : set) {
//            System.out.print(x + " ");
//        }
//    }
    //bai 22:Bieu thuc co value lon nhat
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k=sc.nextInt();
//        Integer a[] = new Integer[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        Arrays.sort(a,1,n,new Comparator<Integer>(){    
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//            
//        });
//       long sum=a[0]; //mac dinh so ban dau trong day luon la dau'+' nen o can xet lam gi
//       for(int i=1;i<n;i++){    
//           if(k>0){ 
//               sum+=a[i];
//               k--;
//           }else{   
//               sum-=a[i];
//           }
//       }
//        System.out.println(sum);
//    }
    //xep lich san bay
    //sao cho nguoi cuoi cung len may bay coi nhu la xong
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        Integer a[][] = new Integer[n][2];
//        for (int i = 0; i < n; i++) {
//            a[i][0] = sc.nextInt();
//            a[i][1] = sc.nextInt();
//        }
//        Arrays.sort(a, new Comparator<Integer[]>() {
//            @Override
//            public int compare(Integer[] o1, Integer[] o2) {
//                return o1[0] - o2[0];
//            }
//
//        });
//        int res=0;
//        for(int i=0;i<n;i++){   
//            if(a[i][0]>res){    
//                res=a[i][0]+a[i][1];
//            }else{  
//                res=res+a[i][1];
//            }
//        }
//        System.out.println(res);
//    }
//    //kiem tra xem co ton tai cap a[i]-a[j]=k hay khong
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int a[] = new int[n];
//        int dx[] = new int[1000001];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//            dx[a[i]]++;
//        }
//        Arrays.sort(a);
//        int dem=0;
//        for(int i=0;i<n;i++){    
//            if(k==0){   
//               if(dx[a[i]+k]>=2) {   
//                  dem++;
//                   System.out.println("1");
//                  break;
//               }
//            }
//            else{   
//                if(dx[a[i]+k]>=1){  
//                    dem++;
//                    System.out.println("1");
//                    break;
//                }
//            }
//    }
//        if(dem==0){ 
//            System.out.println("-1");
//        }
//}
    //          bai toan den long phu kien ca 1 con duong chieu dai L
    // n bong den long,L chieu dai quang duong
    // a[i]...a[n] tuong ung voi distace cac den long thu 1,2,3,...n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int a[] = new int[n];
       
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            
        }
        //sap xep distace tang dan
        Arrays.sort(a);
        //ban kinh max nhat de phu toan bo cac doan duong
        double res=Double.MIN_VALUE;
        for(int i=1;i<n-1;i++){   
            res=Math.max(res,(double)(a[i+1]-a[i])/2);
        }
        //tim max r so voi vi tri dau tien
        res=Math.max(res,a[0]-0);
        //tim max r so voi vi tri cuoi cung
        res=Math.max(res,l-a[n-1]);
        System.out.printf("\n%.10f",res);
    }
    
}
