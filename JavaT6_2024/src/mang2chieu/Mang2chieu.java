package mang2chieu;

import java.util.*;

public class Mang2chieu {
    //liet ke so nguyen to trong mang 2 chieu
//    public static boolean snt(int n){   
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
//        int m=sc.nextInt();
//        int a[][]=new int[n][m];
//        for(int i=0;i<n;i++){   
//            for(int j=0;j<m;j++){   
//                a[i][j]=sc.nextInt();
//            }
//        }
//         for(int i=0;i<n;i++){   
//            for(int j=0;j<m;j++){   
//                if(snt(a[i][j])){   
//                    System.out.print(a[i][j]+" ");
//                }
//            }
//             System.out.println("");
//        }
//    }

    //Pair sort
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int a[][]=new int[n][2];
//        for(int i=0;i<n;i++){   
//            a[i][0]=sc.nextInt(); //hd
//            a[i][1]=sc.nextInt();  //td
//        }
//        Arrays.sort(a,new Comparator<int []>(){    
//            @Override
//            public int compare(int[] o1, int[] o2) {
//               int kc1=o1[0]*o1[0]+o1[1]*o1[1];
//               int kc2=o2[0]*o2[0]+o2[1]*o2[1];
//            if(kc1!=kc2){   
//                return kc1-kc2;
//            }
//            if(o1[0]!=o2[0]){   
//                return  o1[0]-o2[0];
//            }
//            return o1[1]-o2[1];
//            }
//              
//    });
//        for(int i=0;i<n;i++){   
//            System.out.print(a[i][0]+" "+a[i][1]);
//        }
//    }
    //tong hang va cot
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        int a[][]=new int[n][m];
//        for(int i=0;i<n;i++){   
//            for(int j=0;j<m;j++){   
//                a[i][j]=sc.nextInt();
//            }
//        }
//        for(int i=0;i<n;i++){   
//            int sum1=0;
//           for(int j=0;j<m;j++){    
//               sum1+=a[i][j];
//           }
//            System.out.print(sum1+" ");
//        }
//        System.out.println("");
//        for(int j=0;j<m;j++){   
//            int sum2=0;
//           for(int i=0;i<n;i++){    
//               sum2+=a[i][j];
//           }
//            System.out.print(sum2+" ");
//        }
//        
//        
//    }
    //so lon nhat va nho nhat trong ma tran 
//     public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        int a[][]=new int[n+1][m+1];
//        for(int i=1;i<=n;i++){   
//            for(int j=1;j<=m;j++){   
//                a[i][j]=sc.nextInt();
//            }
//        }
//        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
//        
//        for(int i=1;i<=n;i++){   
//            for(int j=1;j<=m;j++){   
//              min=Math.min(min,a[i][j]);
//              max=Math.max(max,a[i][j]);
//               
//            }
//        }
//        System.out.println(min);
//        for(int i=1;i<=n;i++){   
//            for(int j=1;j<=m;j++){   
//               if(a[i][j]==min){    
//                   
//                   System.out.println(i+" "+j);
//               }
//            }
//        }
//         System.out.println(max);
//         for(int i=1;i<=n;i++){   
//            for(int j=1;j<=m;j++){   
//               if(a[i][j]==max){    
//                   
//                   System.out.println(i+" "+j);
//               }
//            }
//        }
//        
//        
//      
//}
    //bai toan snack con ran
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        int a[][]=new int[n][m];
//        for(int i=0;i<n;i++){   
//            for(int j=0;j<m;j++){   
//                a[i][j]=sc.nextInt();
//            }
//        }
//        for(int i=0;i<n;i++){   
//            if(i%2==0){ 
//                for(int j=0;j<m;j++){   
//                    System.out.print(a[i][j]+" ");
//                }
//                System.out.println("");
//            }else{  
//                for(int j=n-1;j>=0;j--){    
//                    System.out.print(a[i][j]+" ");
//                }
//                System.out.println("");
//            }
//        }
//    }
    //cac phan tu bien cua ma tran
//    public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//       
//        int a[][]=new int[n][n];
//        for(int i=0;i<n;i++){   
//            for(int j=0;j<n;j++){   
//                a[i][j]=sc.nextInt();
//            }
//        }
//        for(int i=0;i<n;i++){   
//            for(int j=0;j<n;j++){   
//               if(i==0||i==n-1||j==0||j==n-1){    
//                   System.out.print(a[i][j]+" ");
//               }
//            }
//        }
//    }
    //in ra max cac pt trong hinh vuong con 3x3 trong ma tran
//                                6
//                            4 6 4 5 8 2
//                            8 0 9 0 1 4
//                            3 5 3 6 3 4
//                            5 7 0 9 5 9
//                            4 5 5 9 6 3
//                            9 2 3 6 1 8
//    public static void main(String[] args) {
//           Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//       
//        int a[][]=new int[n+1][n+1];
//        for(int i=1;i<=n;i++){   
//            for(int j=1;j<=n;j++){   
//                a[i][j]=sc.nextInt();
//            }
//        }
//       
//        int max=Integer.MIN_VALUE;
//        for(int i=1;i<=n-2;i++){    
//            for(int j=1;j<=n-2;j++){
//                 int sum=0;
//                for(int u=i;u<i+3;u++){ 
//                    for(int v=j;v<j+3;v++){ 
//                        sum+=a[u][v];
//                       
//                    }
//                }
//                max=Math.max(max,sum);
//            }
//        }
//        System.out.println(max);
//        
//    }
    //dem cac so nguyen to tren duong cheo chinh va phu neu co 2 phan tugiong nhau
    //o duong cheo chinh va phu thi tinh 1 lan duy nhat
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
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int a[][] = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                a[i][j] = sc.nextInt();
//            }
//        }
//        int dem = 0;
//        for (int i = 0; i < n; i++) {
//            if (snt(a[i][i])) {
//                dem++;
//            }
//            if (snt(a[i][n - i -1])) {
//                dem++;
//            }
//
//        }
//        if (n % 2 != 0) {
//            if (snt(a[n / 2][n / 2])) {
//                dem--;
//            }
//        }
//        System.out.println(dem);
//    }
    //sap xep tung hang cua ma tran
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//       
//        int a[][] = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = sc.nextInt();
//            }
//        }
//        //a[i] tuong ung voi hang ->sort hang tang dan
//        for(int i=0;i<n;i++){   
//            Arrays.sort(a[i]);
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println("");
//        }
//    }
    //sap xep tang dan theo cot ma tran
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                b[j][i]=a[i][j];
            }
        }
        for(int j=0;j<n;j++){   
            Arrays.sort(b[j]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
