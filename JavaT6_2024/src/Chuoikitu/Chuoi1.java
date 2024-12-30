package Chuoikitu;

import java.util.*;

public class Chuoi1 {
//    public static void main(String[] args) {
    //bai 1:check so dung giua
//       Scanner sc=new Scanner(System.in);
//       String s=sc.nextLine();
//       if(s.length()%2==1){ 
//            
//               System.out.println(s.charAt(s.length()/2));
//           
//       }else{   
//           System.out.println("Not Found");
//       }
    //bai 2:sum chu so trong 1 chuoi:Ac1n2M3n4Ut5kI

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        int sum=0;
//        for(char x:s.toCharArray()){    
//            if(Character.isDigit(x)){   
//                sum+=x-'0';
//            }
//        }
//        System.out.println(sum);
//    }
    // bai 3:dem so chu hoa chu ,chu so trong chuoi
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        int so=0,thuong=0,hoa=0;
//        for(char x:s.toCharArray()){    
//            if(Character.isDigit(x)){   
//                so++;
//            }
//            else if(Character.isLowerCase(x)){  
//                thuong++;
//            }
//            else if(Character.isUpperCase(x)){  
//                hoa++;
//            }
//        }
//        System.out.println(so+"\n"+hoa+"\n"+thuong);
//    }
    //bai 4:in hoa,in thuong,lat nguoc sau:hjweXafgbDdeGxEa
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        String h=s.toUpperCase();
//        System.out.println(h);
//        String t=s.toLowerCase();
//        System.out.println(t);
//        
//        for(int i=s.length()-1;i>=0;i--){   
//            System.out.print(s.charAt(i));
//        }
//    }
    //check so dep bang 
//    public static boolean check(String s){  
//        for(int i=1;i<s.length();i++){  
//            if(Math.abs(s.charAt(i)-s.charAt(i-1))!=1){  
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        if(check(s)){   
//            System.out.println("Yes");
//        }else{  
//            System.out.println("No");
//        }
//    }
    //chen dau phay 
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        StringBuilder bd=new StringBuilder("");
//        int dem=0;
//        for(int i=s.length()-1;i>=0;i--){   
//            bd.append(s.charAt(i));
//            dem++;
//            if(i!=0&&dem%3==0){   
//                bd.append(",");
//            }
//            
//            
//        }
//        System.out.println(bd.reverse().toString());
//        
//    }
    //sap xep chu so 
//       public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         ArrayList<Character> arr=new ArrayList<>();
//         for(char x:s.toCharArray()){   
//             arr.add(x);
//         }
//         Collections.sort(arr);
//         
//         int index=0;
//         while(index<arr.size()-1&&arr.get(index)=='0'){ 
//             index++;
//         }
//         for(int i=index;i<arr.size();i++){ 
//             System.out.print(arr.get(i));
//         }
//                 
//    }
    //tach chu so:I68c8SASicab6AiI9i
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        for (char x : s.toCharArray()) {
//            if (Character.isDigit(x)) {
//                System.out.print(x);
//
//            }
//
//        }
//        System.out.println("");
//        for (char x : s.toCharArray()) {
//            if (Character.isAlphabetic(x)) {
//                System.out.print(x);
//
//            }
//
//        }
//    }
    //bai tap :28tech va teo ti
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        StringBuilder result = new StringBuilder();
//
//        for (char x : s.toCharArray()) {
//            if (x != '2' && x != '8' && x != 't' && x != 'e' && x != 'c' && x != 'h') {
//                result.append(x);
//            }
//        }
//
//        if (result.length() == 0) {
//            System.out.println("Empty");
//        } else {
//            System.out.println(result.toString());
//        }
//        sc.close();
//    }
    // chen vao chuoi
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int k=sc.nextInt();
//        StringBuilder db=new StringBuilder(s);
//        db.insert(k,"28tech");
//        System.out.println(db.toString());
//    }
    //ki tu xuat hien dau tien
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int cnt[]=new int[256];
//        for(char x:s.toCharArray()){    
//            if(cnt[x]!=0){  
//                System.out.println(x);
//                return;
//            }
//            cnt[x]++;
//        }
//        System.out.println("None");
//    }
    //chuan hoa nam sinh
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String arr[] = s.split("/");
//        
//        int day = Integer.parseInt(arr[0]);
//        int moth = Integer.parseInt(arr[1]);
//        int year = Integer.parseInt(arr[2]);
//        String res=String.format("%02d",day)+"/"+String.format("%02d",moth)+"/"+year;
//        System.out.println(res);
//}
    //bai tiep trong xau
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String arr[]=s.split("\\s+");
//        int dem=0;
//        for(String x:arr){  
//            if(x.equals(x.toUpperCase())){   
//                dem++;
//            }
//        }
//        System.out.print(dem);
//        
//    }
    //bai toan tach xau
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String t="";
//        for(char x:s.toCharArray()){    
//            if(x=='.'||x==','||x=='?'||x=='|'){ 
//                t+=" ";
//            }
//            t+=x;
//        }
//        String arr[]=t.split("\\s+");
//        for(String x:arr){    
//            System.out.print(x+" ");
//        }
//        
//    }
    //bai tiep
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String arr[]=s.split("\\s+");
//        int dem=0;
//        for(int i=0;i<arr.length;i++){  
//           if(arr[i].compareToIgnoreCase("28Tech")==0){    
//               dem++;
//           }
//           
//        }
//        System.out.println(dem);
//    }
    //bai tiep
//        public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String arr[] = s.split("\\s+");
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i % 2 == 0) {
//                System.out.print(arr[i]);
//            } else {
//                for (int t = arr[i].length() - 1; t >= 0; t--) {
//                    System.out.print(arr[i].charAt(t));
//                }
//            }
//            if (i != arr.length - 1) { // Thêm khoảng trắng giữa các từ
//                System.out.print(" ");
//            }
//        }
//        sc.close();
//    }
    //sap xep ki tu tang dan va giam dan:wFJvCFumWtOt7U
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        ArrayList<Character> arr=new ArrayList<>();
//        for(char x:s.toCharArray()){    
//            arr.add(x);
//        }
//       
//        Collections.sort(arr);
//        for(int i=0;i<arr.size();i++){  
//            System.out.print(arr.get(i));
//        }
//        Collections.sort(arr,new Comparator<Character>(){   
//            @Override
//            public int compare(Character o1, Character o2) {
//                return o2-o1;
//            }
//            
//        });
//        System.out.println("");
//        for(int i=0;i<arr.size();i++){  
//            System.out.print(arr.get(i));
//        }
//    }
    //sap xep theo chieu dai
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String arr[] = s.split("\\s+");
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() != o2.length()) {
//                    return o1.length() - o2.length();
//
//                }
//                return o1.compareTo(o2);
//
//            }
//        });
//    
//         for (String word : arr) {
//            System.out.print(word + " ");
//        }
//}
     //sap sep giam dan
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String arr[] = s.split("\\s+");
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                
//                return o2.compareTo(o1);
//
//            }
//        });
//        for (String word : arr) {
//            System.out.print(word + " ");
//        }
//    }
      //dem cac tu khac nhau khong phan biet hoa thuong
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String h=s.toLowerCase();
//        
//        String arr[] = h.split("\\s+");
//        HashSet<String> set=new HashSet<>();
//        for(String x:arr){  
//            set.add(x);
//        }
//        System.out.println(set.size());
//    }
     //sap xep cac tu thuan nghich tang dan
//    public static boolean tn(String s){ 
//        String temp="";
//        for(int i=s.length()-1;i>=0;i--){   
//            temp+=s.charAt(i);
//        }
//        return s.equals(temp);
//        //equal tra ve true or  fale
//        //compare tra ve so am ,duong or bang 0
//    }
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String a[] = s.split("\\s+");
//         ArrayList<String> arr=new ArrayList<>();
//         for(String x:a){   
//             if(tn(x)){ 
//                 arr.add(x);
//             }
//         }
//         Collections.sort(arr);
//         for(String x:arr){ 
//             System.out.print(x+" ");
//         }
//
//    }
      // 
}
