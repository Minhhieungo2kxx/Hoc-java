package Sapxepvstimkiem;

import java.util.*;

public class sapxepvstimkiem1 {
//    public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//           //vi du 1:distinct pt khac nhau trong mang O(n)=nlogn
//        int n=sc.nextInt();
//        int a[]=new int[n];
//        for(int i=0;i<n;i++){   
//            a[i]=sc.nextInt();
//        }
//        Arrays.sort(a);
//        int count=1;
//        for(int i=1;i<n;i++){   
//            if(a[i]!=a[i-1]){   
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//    
    //bai toan do chenh lech nho nhat giua 2 phan tu
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//          //vi du 1:distinct pt khac nhau trong mang O(n)=nlogn
//        int n=sc.nextInt();
//        int a[]=new int[n];
//        for(int i=0;i<n;i++){   
//            a[i]=sc.nextInt();
//        }
//        Arrays.sort(a);
//        int min=Integer.MAX_VALUE;
//        for(int i=1;i<n;i++){   
//            min=Math.min(min,a[i]-a[i-1]);
//        }
//        int dem=0;
//        for(int i=1;i<n;i++){   
//            if(min==(a[i]-a[i-1])){ 
//                dem++;
//            }
//        }
//        System.out.println(min+" "+dem);
//    }

    //su dung Cocmparator so sanh cac pt
    //sap xep theo nhieu tieu chi khac nhau
    //stable==on dinh theo thu tu cac phan tu an dau
//    public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         
//        int n=sc.nextInt();
//        Integer a[]=new Integer[n];
//        for(int i=0;i<n;i++){   
//            a[i]=sc.nextInt();
//        }
//        Arrays.sort(a,new Comparator<Integer>(){    
//             @Override
//             public int compare(Integer o1, Integer o2) {
//                 if(o1<o2){ 
//                     return -1;
//                 }else{ 
//                     return  1;
//                 }
//             }
//            
//        });
//        for(int x:a){   
//            System.out.print(x+ " ");
//        }
//    }
    //vi du sap xep cac so sao cho tong chu so tang dan ,neu tong= nhau
    //thi so be dung truoc so lon
//    public static int tong(int n){  
//        
//        int sum=0;
//        while(n>0){ 
//            sum+=n%10;
//            n/=10;
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        Integer a[]={111999,40002,6,223,1000,203,105,49002,119200,10006,7};
//        Arrays.sort(a,new Comparator<Integer>(){    
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(tong(o1)!=tong(o2)){ 
//                    return tong(o1)-tong(o2);
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
//    }
    //sap xep chu so le
//     public static int le(int n){    
//        int dem=0;
//        while(n>0){ 
//            if(n%2==1){ 
//                dem++;
//            }
//            n/=10;
//        }
//        return dem;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        Integer a[]=new Integer[n];
//        for(int i=0;i<n;i++){   
//            a[i]=sc.nextInt();
//        }
//        Arrays.sort(a,new Comparator<Integer>(){    
//             @Override
//             public int compare(Integer o1, Integer o2) {
//                 if(le(o1)!=le(o2)){    
//                     return le(o1)-le(o2);
//                 }
//                 else{  
//                     return o1-o2;
//                 }
//             }
//            
//        });
//        for(int x:a){   
//            System.out.print(x+" ");
//        }
//    }
    //bai 11:Frist position va Lasts position:bien the cua binary search
//    public static int binary(int a[], int n, int x) {
//        int l = 0, r = n - 1;
//        int res = -1;
//        while (l <= r) {
//            int mid = (l + r) / 2;
//            if (a[mid] == x) {
//                res = mid; //cap nhat chi so
//               r = mid - 1;//tim tiep dap an tot hon vi tri truoc
//         //neu la vi tri cuoi cung: l=mid+1
//            } else if (a[mid] > x) {
//                 r = mid - 1;
//            } else {
//                l = mid + 1;
//            }
//        }
//        return res;
//
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int k=sc.nextInt();
//        int a[]=new int[n];
//        for(int i=0;i<n;i++){   
//            a[i]=sc.nextInt();
//        }
//        Arrays.sort(a);
//        System.out.println(binary(a, n, k));
//    }
    //bai toan twosum:Ky thuat gap nhau o giua
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int k=sc.nextInt();
//        int a[]=new int[n];
//        for(int i=0;i<n;i++){   
//            a[i]=sc.nextInt();
//        }
//        Arrays.sort(a);
//        int l=0,r=n-1;
//        while(l<r){ 
//            if(a[l]+a[r]==k){   
//                System.out.println("Yes");
//                return;
//            }
//            else if(a[l]+a[r]<k){   
//                l++;
//            }
//            else{   
//                r--;
//            }
//        }
//        System.out.println("No");
//    }
             //Threesum:tong 3 so bang=so k nao do
//    public static boolean check(int a[], int n, int target) {
//        for (int k = 0; k < n; k++) {
//            int l = k + 1, r = n - 1;
//            while (l < r) {
//                int res = a[l] + a[r] + a[k];
//                if (res == target) {
//                    return true;
//                } else if (res < target) {
//                    l++;
//                } else {
//                    r--;
//                }
//            }
//
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//           Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//       
//        int a[]=new int[n];
//        for(int i=0;i<n;i++){   
//            a[i]=sc.nextInt();
//        }
//        int k=sc.nextInt();
//        Arrays.sort(a);
//        if(check(a, n, k)){ 
//            System.out.println("Yes");
//        }else{  
//            System.out.println("No");
//        }
//    }
}
