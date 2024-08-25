import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
         int sum = A.length() + B.length();
    System.out.println(sum);
    int com = A.compareTo(B);
    if(com > 0){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
    String c =A.toUpperCase();
    String d =B.toUpperCase();
    System.out.println(c.charAt(0)+A.substring(1)+" "+d.charAt(0)+B. substring(1));
        
    }
}
