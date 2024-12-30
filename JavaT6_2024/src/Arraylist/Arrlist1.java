package Arraylist;

import java.util.*;

public class Arrlist1 {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> arr = new ArrayList<>();
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            int t = sc.nextInt();
//            arr.add(t);
//        }
//        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
//        for (int i = 0; i < arr.size(); i++) {
//            max = Math.max(max, arr.get(i));
//            min = Math.min(min, arr.get(i));
//        }
//        System.out.println(min);
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(i) == min) {
//                System.out.println(i);
//            }
//        }
//        System.out.println(max);
//        for (int i = arr.size() - 1; i >= 0; i--) {
//            if (arr.get(i) == max) {
//                System.out.println(i);
//            }
//        }
//
//    }
         //de quy tong sum=1/1+1/2+1/3++1/n
//    public static double sum5(int n){   
//        if(n==1){   
//            return 1;
//        }
//        return sum5(n-1)+ (double)1/n;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.printf("%.3f",sum5(n));
//    }
//    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){   
            a[i]=sc.nextInt();
        }
        int cntpt=1,maxcntpt=1,sumpt=a[0],maxsumpt=Integer.MIN_VALUE,curpt=0;
        for(int i=1;i<n;i++){   
            if(a[i]!=a[i-1]){   
                cntpt++;
                sumpt+=a[i];
            }
            else{   
                cntpt=1;
                sumpt=a[i];
            }
            if(cntpt>maxcntpt||sumpt>maxsumpt||cntpt==maxcntpt){    
            maxcntpt=cntpt;
            maxsumpt=sumpt;
            curpt=i-maxcntpt+1;
        }
        }
        
         System.out.println(maxcntpt);
         System.out.println(maxsumpt);
         for(int i=curpt;i<curpt+maxcntpt;i++){ 
             System.out.print(a[i]+" "); 
         }
    }
    
}
