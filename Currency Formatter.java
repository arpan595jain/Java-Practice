import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        
        sc.close();
        
         String u,i,c,f;
        
        u = NumberFormat.getCurrencyInstance(Locale.US).format(n);
        i = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(n);
        c = NumberFormat.getCurrencyInstance(Locale.CHINA).format(n);
        f = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(n);
        
        System.out.println("US: "+u);
        System.out.println("India: "+i);
        System.out.println("China: "+c);
        System.out.println("France: "+f);
    }
}
