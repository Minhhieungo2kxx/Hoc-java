
package Buoi_3;

import java.util.*;
public class tachso {
    public static long ts(long n){
        long sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
       
        while (n>=10) {            
           n=ts(n);
            
            
        }
        System.out.println(n);
    }
}
