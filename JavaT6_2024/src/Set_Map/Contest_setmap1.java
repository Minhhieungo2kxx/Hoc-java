package Set_Map;

import java.util.*;

public class Contest_setmap1 {

//    public static void main(String[] args) {
//        //bai 4:
//        HashMap<Integer, Integer> map = new HashMap<>();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            int x = sc.nextInt();
//            if (map.containsKey(x)) {
//                map.put(x, map.get(x) + 1);
//            } else {
//                map.put(x, 1);
//            }
//        }
//        //so bo test case
//        int k = sc.nextInt();
//        for (int i = 0; i < k; i++) {
//            int tt = sc.nextInt();
//            if (tt == 1) {
    //            int p = sc.nextInt();
//                if (map.containsKey(p)) {
//                    map.put(p, map.get(k) + 1);
//                } else {
//                    map.put(p, 1);
//                }
//            } else if (tt == 2) {
    //            int p = sc.nextInt();
//                if (map.containsKey(p) && map.get(p) >= 1) {
//                    map.put(p, map.get(p) - 1);
//                }
//            } else {
    //            int p = sc.nextInt();
//                if (map.containsKey(p) && map.containsValue(p)) {
//                    System.out.println("Yes");
//                } else {
//                    System.out.println("No");
//                }
//            }
//        }
//
//    }
    //bai 7:Tan xuat ki tu
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        TreeMap<Character,Integer> map=new TreeMap<>();
//        int n=sc.nextInt();
//        for(int i=0;i<n;i++){
//            char c=sc.next().charAt(0);
//            if(map.containsKey(c)){ 
//                map.put(c,map.get(c)+1);
//            }
//            else{
//                map.put(c,1);
//            }
//        }
//        //thu tu tu dien nho nhat +tan xuat
//        System.out.println("");
//        Map.Entry<Character, Integer> first = map.firstEntry();
//        System.out.println(first.getKey()+" "+first.getValue());
//       
//        //thu tu tu dien lon nhat+tan xuat
//        Map.Entry<Character, Integer> lasts = map.lastEntry();
//        System.out.println(lasts.getKey()+" "+lasts.getValue());
//        
//        //thu tu tu dien tu lon den be +tan xuat
//         ArrayList<Map.Entry<Character, Integer>> arr=new ArrayList<>();
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey()+" "+entry.getValue());
//            arr.add(entry);
//          
//        }
//        System.out.println("");
//        //thu tu tu dien tu lon->be
//        for(int i=arr.size()-1;i>=0;i--){   
//            System.out.println(arr.get(i).getKey()+" "+arr.get(i).getValue());
//        }
//        
//        
//        
//        
//           
//    }
    //bai ?:so xuat hien lien tuc o cac hang va cot
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        TreeMap<Integer,Integer> map=new TreeMap<>();
//        int n=sc.nextInt();
//        int a[][]=new int[n+1][n+1];
//        for(int i=1;i<=n;i++){  
//            for(int j=1;j<=n;j++){  
//                a[i][j]=sc.nextInt();
//            }
//        }
//        for(int i=1;i<=n;i++){  
//            
//            for(int j=1;j<=n;j++){  
//                if(i==1){   
//                    map.put(a[i][j],1);
//                }
//                else if(map.containsKey(a[i][j])&&map.get(a[i][j])==i-1){
//                   map.put(a[i][j],i);
//                }
//            }
//        }
//        int dem=0;
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if(entry.getValue()==n){    
//                dem++;
//                System.out.println(entry.getKey());
//            }
//            
//        }
//        if(dem==0){ 
//            System.out.println("Not found");
//        }
//        
//    }
    //bai 8:lon nhat +nho nhat
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        TreeSet<Integer> set=new TreeSet<>();
//        int n=sc.nextInt();
//        for(int i=0;i<n;i++){   
//            int x=sc.nextInt();
//            set.add(x);
//        }
//       int t=sc.nextInt();
//       for(int i=0;i<t;i++){    
//          int tt=sc.nextInt();
//          
//          if(tt==1){ 
//              int k=sc.nextInt();
//              set.add(k);
//          }
//          else if(tt==2){ 
//              int k=sc.nextInt();
//              if(set.contains(k)){  
//                  set.remove(k);
//              }
//          }
//          else if(tt==3){   
//              System.out.println(set.first());
//          }
//          else{ 
//              System.out.println(set.last());
//          }
//       }
//    }
    //bai 9:Uinion hop 2 mang
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        TreeSet<Integer> set = new TreeSet<>();
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int a[] = new int[n];
//        int b[] = new int[m];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//            set.add(a[i]);
//        }
//        for (int i = 0; i < m; i++) {
//            b[i] = sc.nextInt();
//            set.add(b[i]);
//        }
//        
//        
//        for (int x : set.descendingSet()) {
//            System.out.print(x + " ");
//        }
//
//    }
    //bai 10:Giao 2 mang
    //Cach 1:Map
//       public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int a[] = new int[n];
//        int b[] = new int[m];
//
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//            if (map.containsKey(a[i])) {
//                map.put(a[i], 1);
//            } else {
//                map.put(a[i], 1);  // Ensure all elements of 'a' are added
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            b[i] = sc.nextInt();
//            if (map.containsKey(b[i]) && map.get(b[i]) == 1) {
//                map.put(b[i], 2);  // Update to 2 if found in both arrays
//            }
//        }
//
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == 2) {
//                System.out.print(entry.getKey() + " ");
//            }
//        }
//    }
    //Cach 2 :Set
//       public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int a[] = new int[n];
//        int b[] = new int[m];
//        
//        LinkedHashSet<Integer> giao=new LinkedHashSet<>();
//        HashSet<Integer> setb=new HashSet<>();
//        
//        for(int i=0;i<n;i++){   
//            a[i]=sc.nextInt();
//            
//        }
//        for(int i=0;i<m;i++){   
//            b[i]=sc.nextInt();
//            setb.add(b[i]);
//        }
//        for(int x:a){   
//            if(setb.contains(x)){   
//                giao.add(x);
//            }
//        }
//        
//        
//        for(int x:giao){    
//            System.out.print(x+" ");
//        }
//        
//    }
    //bai 11:tim cac phan tu trong 2 mang nhung ko duoc ton tai ca 2 mang
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int a[] = new int[n];
//        int b[] = new int[m];
//        HashSet<Integer> setb=new HashSet<>(); //luu mang b
//        TreeSet<Integer> hop=new TreeSet<>();  //hop 2 mang
//        HashSet<Integer> giao=new HashSet<>(); //giao 2 mang
//        
//         for (int i = 0; i < m; i++) {
//            b[i] = sc.nextInt();
//            setb.add(b[i]);
//            hop.add(b[i]);
//        }
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//            hop.add(a[i]);
//            if(setb.contains(a[i])){    
//                giao.add(a[i]);
//            }
//           
//            
//        }
//        for(int x:hop){ 
//            if(!giao.contains(x)){  
//                System.out.print(x+" ");
//            }
//        }
//       
//    }
                      //loai tru
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int a[] = new int[n];
//        int b[] = new int[m];
//
//        TreeSet<Integer> loaitru = new TreeSet<>();
//        HashSet<Integer> setb = new HashSet<>();
//
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//
//        }
//        for (int i = 0; i < m; i++) {
//            b[i] = sc.nextInt();
//            setb.add(b[i]);
//        }
//        for (int x : a) {
//            if (!setb.contains(x)) {
//                loaitru.add(x);
//            }
//        }
//
//        for (int x : loaitru) {
//            System.out.print(x + " ");
//        }
//
//    }
     //bai toan:dem cac gia trikhac nhau tu L->n-1 trong mang
//    public static void main(String[] args) {
//       
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        HashSet<Integer> set=new HashSet<>();
//        LinkedHashMap<Integer,Integer> map =new LinkedHashMap<>();
//        for(int i=n-1;i>=0;i--){    
//            set.add(a[i]);
//            map.put(i,set.size());
//                   
//        }
//        int k=sc.nextInt();
//        while(k-->0){   
//            int t=sc.nextInt();
//            System.out.println(map.get(t));
//        }
//        
//
//    }
                    //truy van ki tu
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        TreeMap<Character,Integer> map=new TreeMap<>();
//        String s=sc.nextLine();
//        for(int i=0;i<s.length();i++){  
//            char t=s.charAt(i);
//            if(map.containsKey(t)){ 
//                map.put(t,map.get(t)+1);
//            }
//            else{   
//                map.put(t,1);
//            }
//        }
//        char maxkey=map.firstKey();
//        char minkey=map.lastKey();
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            
//            if(entry.getValue()>map.get(maxkey)){   
//                maxkey=entry.getKey();
//            }
//            if(entry.getValue()<=map.get(minkey)){  
//                minkey=entry.getKey();
//            }
//            
//            
//        }
//        System.out.println(maxkey+" "+map.get(maxkey));
//        System.out.println(minkey+" "+map.get(minkey));
//        System.out.println(map.size());
//
//    }
    //bai 24:
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in); 
//        int n=sc.nextInt();
//        TreeSet<Character> set=new TreeSet<>();
//        for(int i=0;i<n;i++){   
//            char s=sc.next().charAt(0);
//            set.add(s);
//        }
//        System.out.println(set.size());
//        
//        for(char x:set){    
//            System.out.print(x+" ");
//            
//        }
//        System.out.println("");
//        for(char x:set.descendingSet()){    
//            System.out.print(x+" ");
//        }
//        
//    }
    //so lan xuat hien cac phan tu trong mang
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        HashMap<Integer,Integer> map=new HashMap<>();
//        int n=sc.nextInt();
//        for(int i=0;i<n;i++){   
//            int t=sc.nextInt();
//            if(map.containsKey(t)){ 
//                map.put(t,map.get(t)+1);
//            }else{  
//                map.put(t,1);
//            }
//            System.out.print(map.get(t));
//        }
//    }
    //tan xuat chan xuat hien
//    public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         TreeMap<Integer,Integer> map=new TreeMap<>();
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){  
//             int t=sc.nextInt();
//             if(map.containsKey(t)){    
//                map.put(t,map.get(t)+1);        
//             }
//             else{  
//                map.put(t,1);
//            }  
//         }
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if(entry.getValue()%2==0){  
//                System.out.println(entry.getKey()+" "+entry.getValue());
//            }
//            
//        }
//         System.out.println("");
//         for(int x:map.descendingKeySet()){ 
//            int value=map.get(x);
//            if(value%2==0){ 
//                System.out.println(x+" "+value);
//            }
//         }
//    }
                     //bai 25:
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> setb = new TreeSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            setb.add(t);
        }

        System.out.println(setb.size());
        System.out.print(setb.last() + " " + setb.first());

        // Nếu setb có ít nhất 2 phần tử, ta có thể tìm phần tử lớn thứ 2
        System.out.println("");
        if (setb.size() >= 2) {
            // Lấy phần tử lớn nhất
            int max = setb.last();
            int min=setb.first();
            // Loại bỏ phần tử lớn nhất khỏi set
            setb.remove(max);
            setb.remove(min);
            // Phần tử lớn nhất tiếp theo sẽ là phần tử lớn thứ 2
            int secondMax = setb.last();
            int secondmin=setb.first();
            System.out.print(secondMax+" "+secondmin);
        } else {
            // Nếu setb có ít hơn 2 phần tử, không thể tìm được phần tử lớn thứ 2
            System.out.println(" Không có phần tử lớn va nho thu 2");
        }
    }
}

    

