package Chuoikitu;

import java.util.*;

public class ChuoiTB {
    //chuan hoa ten nguoi va nam sinh

//    public static void chuan2(String s) {
//        String res2 = "";
//        String arr1[] = s.split("/");
//        res2 = String.format("%02d", Integer.parseInt(arr1[0])) + "/" + String.format("%02d", Integer.parseInt(arr1[1])) + "/" + arr1[2];
//        System.out.println(res2);
//    }
//
//    public static void chuan1(String people) {
//        String arr2[] = people.split("\\s+");
//        //su dung buider de chen them , xoa
//        StringBuilder bd = new StringBuilder();
//        for (String x : arr2) {
//            bd.append(Character.toUpperCase(x.charAt(0)));
//            for (int t = 1; t < x.length(); t++) {
//                bd.append(Character.toLowerCase(x.charAt(t)));
//            }
//            bd.append(" ");
//        }
//        bd.deleteCharAt(bd.length() - 1);//xoa di dau cach thua
//        System.out.println(bd.toString());
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String people = sc.nextLine();
//        String namsinh = sc.nextLine();
//        chuan1(people);
//        chuan2(namsinh);
//
//    }
    //dem so luong ki tu trong xau
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int alpha=0,digit=0,special=0;
//        for(char x:s.toCharArray()){    
//            if(Character.isAlphabetic(x)){  
//                alpha++;
//            }
//            else if(Character.isDigit(x)){  
//                digit++;
//            }
//            else{   
//                special++;
//            }
//        }
//        System.out.print(alpha+" "+digit+" "+special);
//    }
    //in hoa in thuong xua
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String upper=s.toUpperCase();
//         String lower=s.toLowerCase();
//         System.out.println(upper+"\n"+lower);
//    }
    //tan xuat xuat hien cua ki tu
//    public static void in(Map<Character, Integer> map, String s) {
//        for (char x : s.toCharArray()) {
//            if (map.containsKey(x)) {
//                map.put(x, map.get(x) + 1);
//            } else {
//                map.put(x, 1);
//            }
//        }
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        //thu tu tu dien tang dan
//        TreeMap<Character, Integer> map1 = new TreeMap<>();
//        LinkedHashMap<Character,Integer> map2=new LinkedHashMap<>();
//        //thu tu tu dien xuat hien
//        in(map1, s);
//        System.out.println("");
//        in(map2, s);
//    }
    //ki tu xuat hien max va min trong xau
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        TreeMap<Character, Integer> map = new TreeMap<>();
//        for (char x : s.toCharArray()) {
//            if (map.containsKey(x)) {
//                map.put(x, map.get(x) + 1);
//            } else {
//                map.put(x, 1);
//            }
//        }
//        char min=map.firstKey();
//        char max=map.firstKey();
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if(entry.getValue()>=map.get(max)){ 
//                max=entry.getKey();
//            }
//            if(entry.getValue()<=map.get(min)){ 
//                min=entry.getKey();
//            }
//            
//        }
//        System.out.println(max+" "+map.get(max));
//        System.out.println(min+" "+map.get(min));
//    }
    //ki tu xuat hien o  2 xau theo thu tu tu dien
    //nTOhOGvRBk bUJtZSoONh
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s1 = sc.nextLine();
//         String s2 = sc.nextLine();
//         HashSet<Character> set1=new HashSet<>();
//         TreeSet<Character> set2=new TreeSet<>();
//         TreeSet<Character> set3=new TreeSet<>();
//         for(char x:s1.toCharArray()){  
//             set1.add(x);
//             set3.add(x);
//         }
//         for(char x:s2.toCharArray()){  
//             
//             set3.add(x);
//         }
    //giao 2 xau
//         for(char t:s2.toCharArray()){  
//             if(set1.contains(t)){  
//                 set2.add(t);
//             }
//         }
//         //thu tu tang dan:giao 2 xau
//         for(char x:set2){  
//             System.out.print(x+" ");
//         }
//         //thu tu giam dan:hop 2 xau
//         System.out.println("");
//         for(char x:set3){  
//             System.out.print(x+" ");
//         }
//    }
    //bai 7:Xau paragram 1:chua dua 26 ki tu tu a->z
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String h=s.toLowerCase();
//         HashSet<Character> set1=new HashSet<>();
//         for(char x:h.toCharArray()){ 
//             if(x>='a'&&x<='z'){    
//                 set1.add(x);
//             }
//         }
//         if(set1.size()==26){   
//             System.out.println("Yes");
//         }
//         else{  
//             System.out.println("No");
//         }
//    }
    //bai 9:dem so luong tu trong xau
//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String res="";
//         int dem=0;
//         // truong hop chua cac dau o duoi chuyen ve dau " " de tach
//         for(char x:s.toCharArray()){   
//             if(x=='.'||x==','||x=='?'||x=='|'){    
//                 res+=" ";
//             }
//             else{
//                 res+=x;
//             }
//         }
//         String arr[]=res.split("\\s+");
//         System.out.println(arr.length);
//       
//        
//         
//    }
    //bai 10:
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        TreeSet<String> set=new TreeSet<>();
//        LinkedHashSet<String> set1=new LinkedHashSet<>();
//        String arr[]=s.split("\\s+");
//        for(String x:arr){  
//            set.add(x);
//            set1.add(x);
//        }
//        //thu tu tang dan tu dien
//        for(String x:set){  
//            System.out.print(x+" ");
//        }
//        System.out.println("");
//        //thu tu xuat hien tu dien
//        for(String x:set1){  
//            System.out.print(x+" ");
//        }
//    }
    //bai 11:sap xep xau
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        TreeSet<String> set = new TreeSet<>();
//        String arr[] = s.split("\\s+");
//        //sap xep thu tu tu dien tang dan
//        for (String x : set) {
//            System.out.print(x + " ");
//        }
//
//        for (String x : arr) {
//            System.out.print(x + " ");
//        }
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() != o2.length()) {
//                    return o1.length() - o2.length();
//                }
//                return o1.compareTo(o2);
//            }
//
//        });
//        System.out.println("");
//        for (String t : arr) {
//            System.out.print(t + " ");
//        }
//
//    }
    //bai 12:
//    public static boolean tn(String s) {
//        String res = "";
//        for (int i = s.length() - 1; i >= 0; i--) {
//            res += s.charAt(i);
//        }
//        return res.equals(s);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        LinkedHashSet<String> set = new LinkedHashSet<>();
//        String arr[] = s.split("\\s+");
//
//        for (String x : arr) {
//            if (tn(x)) {
//                set.add(x);
//            }
//        }
//        ArrayList<String> list = new ArrayList<>();
//        for (String p : set) {
//            list.add(p);
//        }
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//
//                return o1.length() - o2.length();
//
//            }
//
//        });
//        for (String v : list) {
//            System.out.print(v + " ");
//        }
//    }
    //bai 14:tu xuat hien it nhat va nho nhat
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String arr[]=s.split("\\s+");
//        TreeMap<String,Integer> map=new TreeMap<>();
//        for(String x:arr){  
//            if(map.containsKey(x)){ 
//                map.put(x,map.get(x)+1);
//            }
//            else{   
//                map.put(x,1);
//            }
//        }
//        String max=map.firstKey();
//        String min=map.firstKey();
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if(entry.getValue()>=map.get(max)){ 
//                max=entry.getKey();
//            }
//            if(entry.getValue()<=map.get(min)){ 
//                min=entry.getKey();
//            }
//            
//        }
//        System.out.println(max+" "+map.get(max));
//        System.out.println(min+" "+map.get(min));
//    
    //chuan hoa 1
//    public static void chuan2(String s){    
//       String arr[]=s.split("/");
//       int day=Integer.parseInt(arr[0]);
//       int moth=Integer.parseInt(arr[1]);
//       int year=Integer.parseInt(arr[2]);
//       String res=String.format("%02d",day)+"/"+String.format("%02d",moth)+"/"+year;
//        System.out.println(res);
//    }
//    public static void chuan1(String s){    
//        String arr[]=s.split("\\s+");
//        StringBuilder bd=new StringBuilder();
//        for(String x:arr){  
//            char t= Character.toUpperCase(x.charAt(0));
//            bd.append(t);
//            for(int i=1;i<x.length();i++){  
//                bd.append(Character.toLowerCase(x.charAt(i)));
//            }
//            bd.append(" ");
//        }
//        bd.deleteCharAt(bd.length()-1);
//        System.out.println(bd.toString());
//    }
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       String s1 = sc.nextLine();
//       String s2=sc.nextLine();
//        chuan1(s1);
//        chuan2(s2);
//    }
    //chuan hoa ten 2:tRAn van tECH28
//    public static void chuan1(String s) {
//
//        String arr[] = s.split("\\s+");
//        StringBuilder bd = new StringBuilder();
//        for (int i = 0; i < arr.length; i++) {
//            char t = Character.toUpperCase(arr[i].charAt(0));
//            bd.append(t);
//            for (int n = 1; n < arr[i].length(); n++) {
//                if (i == arr.length - 1) {
//                    bd.append(Character.toUpperCase(arr[i].charAt(n)));
//                } else {
//                    bd.append(Character.toLowerCase(arr[i].charAt(n)));
//                }
//            }
//            if (i == 1) {
//                bd.append(",");
//            }
//            bd.append(" ");
//
//        }
//        bd.deleteCharAt(bd.length() - 1);
//        System.out.println(bd.toString());
//
//    }
//
//    public static void chuan2(String s) {
//        String arr[] = s.split("\\s+");
//        StringBuilder bd = new StringBuilder();
//        String h = arr[2].toUpperCase();
//        bd.append(h);
//        bd.append(",");
//        bd.append(" ");
//        for (int i = 0; i < arr.length-1; i++) {
//            char t = Character.toUpperCase(arr[i].charAt(0));
//            bd.append(t);
//            for (int n = 1; n < arr[i].length(); n++) {
//
//                bd.append(Character.toLowerCase(arr[i].charAt(n)));
//
//            }
//
//            bd.append(" ");
//
//        }
//
//        bd.deleteCharAt(bd.length() - 1);
//
//        System.out.println(bd.toString());
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
//        chuan1(s1);
//        chuan2(s1);
//
//    }
     //so may man khi tong cac chu so cua no =9:
    //vi du:6435=18->9 la lan cuoi cung
    public static String tcs(String s){    
       while(s.length()>1){ 
           int sum=0;
           for(int i=0;i<s.length();i++){   
               sum+=s.charAt(i)-'0';
           }
           s=""+sum;
       }
       return s;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(tcs(s).equals("9")){ 
            System.out.println("Yes");
        }
        else{   
            System.out.println("No");
        }
        
    }
    
}
