
package Chuoikitu;

import java.math.BigInteger;
import java.util.Scanner;


public class Contest1 {
    //bai ;Chuan hoa ten kieu 2
//    public static void chuan1(String s) {
//        String arr[] = s.split("\\s+");
//        StringBuilder bd = new StringBuilder();
//        for (String x : arr) {
//            bd.append(Character.toUpperCase(x.charAt(0)));
//            if (x == arr[2]) {
//                for (int i = 1; i < x.length(); i++) {
//                    bd.append(Character.toUpperCase(x.charAt(i)));
//                }
//            } else {
//                for (int i = 1; i < x.length(); i++) {
//                    bd.append(Character.toLowerCase(x.charAt(i)));
//                }
//
//            }
//            bd.append(" ");
//        }
//        bd.deleteCharAt(bd.length() - 1);
//        System.out.println(bd.toString());
//    }
//
//    public static void chuan2(String s) {
//        String arr[] = s.split("\\s+");
//        StringBuilder bd = new StringBuilder();
//        bd.append(arr[2].toUpperCase());
//        bd.append(",");
//        bd.append(" ");
//        for (int i = 0; i < arr.length - 1; i++) {
//            bd.append(Character.toUpperCase(arr[i].charAt(0)));
//            for (int t = 1; t < arr[i].length(); t++) {
//                bd.append(Character.toLowerCase(arr[i].charAt(t)));
//            }
//            bd.append(" ");
//
//        }
//        bd.deleteCharAt(bd.length() - 1);
//        System.out.println(bd.toString());
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
//       
//        chuan1(s1);
//        chuan2(s1);
//    }
    //bai tap cap email dang 1
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        sc.nextLine();
//        for(int i=0;i<n;i++){   
//            String s=sc.nextLine();
//            StringBuilder bd=new StringBuilder();
//            String a[]=s.split("\\s+");
//            int legth=a.length;
//            bd.append(a[legth-2].toLowerCase());
//            for(int t=0;t<legth-2;t++){ 
//                bd.append(Character.toLowerCase(a[t].charAt(0)));
//            }
//            System.out.println(bd.toString()+"@xyz.edu.vn");
//            String nam[]=a[legth-1].split("/");
//            String res="";
//            for(String x:nam){  
//                res+=Integer.parseInt(x);
//            }
//            System.out.println(res);
//        }
//        
//    }
    //bai tap cap email dang 2:doi voi nhieu dua co ten giong nhau
    //3
//Nguyen Van Hieu 12/05/1995
//Nguyen Van Hung 22/03/1998
//Tran Minh Hieu 15/07/1997
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        HashMap<String, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            String s = sc.nextLine();
//            StringBuilder bd = new StringBuilder();
//            String[] a = s.split("\\s+");
//            int length = a.length;
//
//            // Lấy phần họ (last name)
//            String lastName = a[length - 2].toLowerCase();
//
//            // Lấy phần tên đầu (first name)
//            bd.append(lastName);
//
//            // Thêm các ký tự đầu của các từ còn lại
//            for (int t = 0; t < length - 2; t++) {
//                bd.append(Character.toLowerCase(a[t].charAt(0)));
//            }
//
//            String emailPrefix = bd.toString();
//
//            // Kiểm tra và cập nhật số lượng email trùng
//            if (map.containsKey(emailPrefix)) {
//                map.put(emailPrefix, map.get(emailPrefix) + 1);
//                emailPrefix += map.get(emailPrefix);
//            } else {
//                map.put(emailPrefix, 1);
//            }
//
//            System.out.println(emailPrefix + "@xyz.edu.vn");
//
//            // Lấy phần năm sinh
//            String[] nam = a[length - 1].split("/");
//            StringBuilder res = new StringBuilder();
//            for (String x : nam) {
//                res.append(Integer.parseInt(x));
//            }
//            System.out.println(res.toString());
//        }
//
//        sc.close();
//    }
    //bai 20:kiem xa xem co chua chuoi xon "python hay khong"
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s=sc.nextLine();
//         String t="python";
//         int cn1=0,cn2=0;  
//         
//         for(char x:s.toCharArray()){   
//             if(x==t.charAt(cn2)){  
//                 cn2++;
//                 cn1++;
//             }
//             if(cn2==6){    
//                 break;
//             }
//             
//         }
//         if(cn1==t.length()){    
//             System.out.println("Yes");
//         }
//         else{  
//             System.out.print("No");
//         }
//    }
    //bai 21:Tap chung 2 xau
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         HashSet<String> set1=new HashSet<>();
//         TreeSet<String> set2=new TreeSet<>();
//         String s1=sc.nextLine();
//         String s2=sc.nextLine();
//         String h1=s1.toLowerCase();
//         String h2=s2.toLowerCase();
//         String arr1[]=h1.split("\\s+");
//         String arr2[]=h2.split("\\s+");
//         for(String x:arr1){    
//             set1.add(x);
//         }
//         for(String t:arr2){    
//             if(set1.contains(t)){  
//                 set2.add(t);
//             }
//         }
//         for(String p:set2){    
//             System.out.print(p+" ");
//         }
//         
//    }
    //bai 22:Tap tu rieng cua 2 xau
//        public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         HashSet<String> set1=new HashSet<>();
//         TreeSet<String> set2=new TreeSet<>();
//         String s1=sc.nextLine();
//         String s2=sc.nextLine();
//         String h1=s1.toLowerCase();
//         String h2=s2.toLowerCase();
//         String arr1[]=h1.split("\\s+");
//         String arr2[]=h2.split("\\s+");
//         for(String x:arr2){    
//             set1.add(x);
//         }
//         for(String t:arr1){    
//             if(!set1.contains(t)){  
//                 set2.add(t);
//             }
//         }
//         for(String p:set2){    
//             System.out.print(p+" ");
//         }
//         
//    }
    //bai 23:Ghep xau:sao cho phan tu cuoi co thu tu tu dien max nhat
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        sc.nextLine();
//        String arr[]=new String[n];
//        for(int i=0;i<n;i++){   
//            arr[i]=sc.nextLine();
//        }
//        Arrays.sort(arr,new Comparator<String>(){   
//            @Override
//            public int compare(String o1, String o2) {
//                String h1=o1+o2;
//                String h2=o2+o1;
//                return h2.compareTo(h1);
//            }
//            
//        });
//            
//        for(String x:arr){  
//            System.out.print(x);
//        }
//    }
    //bai 24:Xau co dau cuoi giong nhau:abacaba
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        int a[]=new int[256];
//        //danh dau cac ki tu co trong chuoi a +tan xuat cua chung:dua vao 
//        //Khi x là một ký tự, nó thực sự được đại diện bởi mã ASCII của nó (mã số nguyên trong bảng mã ASCII).
//        for(char x:s.toCharArray()){    
//            a[x]++;
//        }
//        long res=s.length();
//        for(int i=0;i<256;i++){ 
//            res+=((long)a[i]*(a[i]-1))/2;
//        }
//        System.out.println(res);
//        
//    }
    //bai 7:Xau doi xung
//    public static boolean dx(String s){ 
//        String res="";
//        for(int i=s.length()-1;i>=0;i--){   
//            res+=s.charAt(i);
//        }
//        return s.equals(res);
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        if(dx(s)){  
//            System.err.println("Yes");
//        }else{  
//            System.out.println("No");
//        }
//    }
    //bai toan so lon nhat va nho nhat: sao cho co dung m chu va so min nhat va max nhat phai = tong s
    //vi du: m=2,s=15-->min=69,max=96;
    //Số lớn nhất: Bắt đầu từ trái sang phải, cố gắng đặt các chữ số lớn nhất
    //(9) trước tiên cho đến khi đạt được tổng s.
    //Số nhỏ nhất: Bắt đầu từ phải sang trái, cố gắng đặt các chữ số nhỏ nhất trước (1) để
    //đảm bảo tổng là s, sau đó đặt các chữ số lớn hơn lên trên các vị trí phía trước để đạt được tổng s.
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int s = sc.nextInt();
//
//        if ((s == 0 && m > 1) || (s > 9 * m)) {
//            System.out.println("NOT FOUND");
//        } else {
//            System.out.println(findSmallest(m, s));
//            System.out.println(findLargest(m, s));
//        }
//    }
//
//    private static String findSmallest(int m, int s) {
//        char[] smallest = new char[m]; // Tạo một mảng ký tự kích thước m
//        s -= 1; // Giảm s đi 1 để đảm bảo chữ số đầu tiên không phải là 0
//        for (int i = m - 1; i > 0; i--) { // Duyệt từ cuối mảng lên đến vị trí thứ hai
//            if (s > 9) { // Nếu s lớn hơn 9, đặt chữ số tại vị trí i là 9
//                smallest[i] = '9';
//                s -= 9; // Giảm s đi 9
//            } else { // Nếu s không lớn hơn 9, đặt chữ số tại vị trí i là s
//                smallest[i] = (char) ('0' + s);
//                s = 0; // Đặt s về 0 vì đã sử dụng hết
//            }
//        }
//        smallest[0] = (char) ('0' + s + 1); // Đặt chữ số đầu tiên là s + 1
//        return new String(smallest); // Trả về chuỗi kết quả
//    }
//
//    private static String findLargest(int m, int s) {
//        char[] largest = new char[m]; // Tạo một mảng ký tự kích thước m
//        for (int i = 0; i < m; i++) { // Duyệt từ đầu mảng đến cuối mảng
//            if (s >= 9) { // Nếu s lớn hơn hoặc bằng 9, đặt chữ số tại vị trí i là 9
//                largest[i] = '9';
//                s -= 9; // Giảm s đi 9
//            } else { // Nếu s nhỏ hơn 9, đặt chữ số tại vị trí i là s
//                largest[i] = (char) ('0' + s);
//                s = 0; // Đặt s về 0 vì đã sử dụng hết
//            }
//        }
//        return new String(largest); // Trả về chuỗi kết quả
//    }
    //bai tiep:xau con lien tiep chua cac tu giong nhau dai nhat hoac la co the khac nhau
    //neu co nhieu cai co do dai giong nhau thi lay cai co thu tu tu dien lon nhat
    //test case:aabbccddddd
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//
//        int maxcnt = 0;
//        int curcnt = 1;
//        String maxsubtr = "";
//        for (int i = 1; i < s.length(); i++) {
//            //neu la khac nhau sua thanh != la xong
//            if (s.charAt(i) == s.charAt(i - 1)) {
//                curcnt++;
//            } else {
//
//                if (curcnt > maxcnt || curcnt == maxcnt && s.substring(i - curcnt, i).compareTo(maxsubtr) > 0) {
//                    maxcnt = curcnt;
//                    maxsubtr = s.substring(i - curcnt, i);
//                }
//                curcnt = 1;
//            }
//
//        }
//        if (curcnt > maxcnt || curcnt == maxcnt && s.substring(s.length() - curcnt).compareTo(maxsubtr) > 0) {
//            maxsubtr = s.substring(s.length() - curcnt);
//        }
//        System.out.println(maxsubtr);
//    }
    //bai tiep:So lon trong java: abc123bba567ajsj50kkf099
//    public static void handle(String s) {
//        String res = "";
//        for (char x : s.toCharArray()) {
//            if (Character.isDigit(x)) {
//                res += x;
//            } else {
//                res += " ";
//            }
//        }
//        String[] h = res.trim().split("\\s+");
//        //lop biginteger loai bo so 0 o dau
//        BigInteger maxvalue = new BigInteger("0");
//        for (String x : h) {
//            BigInteger value = new BigInteger(x);
//            maxvalue = maxvalue.max(value);
//        }
//        System.out.println(maxvalue);
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        handle(s);
//    }
    //bai 29:sum tong cac chu so trong xau
//     public static void handle(String s) {
//        String res = "";
//        for (char x : s.toCharArray()) {
//            if (Character.isDigit(x)) {
//                res += x;
//            } else {
//                res += " ";
//            }
//        }
//        //su dung trim () de loai bo dau cach thua o dau va cuoi
//        String[] h = res.trim().split("\\s+");
//        //lop biginteger loai bo so 0 o dau
//        BigInteger sumvalue = new BigInteger("0");
//        for (String x : h) {
//            BigInteger value = new BigInteger(x);
//            sumvalue=sumvalue.add(value);
//        }
//        System.out.println(sumvalue);
//
//    }
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        handle(s);
//    }
    //tong chu so lon
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int sum=0;
//        for(char x:s.toCharArray()){    
//            sum+=x-'0';
//        }
//        System.out.println(sum);
//    }
      //bai toan so chia het cho 4
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger value=sc.nextBigInteger();
        BigInteger four=new BigInteger("4");
        BigInteger zero=new BigInteger("0");
        
        if((value.mod(four)).equals(zero)){ 
            System.out.println("Yes");
        }
        else{   
            System.out.println("No");
        }
        
        
    }
    
}
