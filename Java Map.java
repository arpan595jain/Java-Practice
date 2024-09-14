import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String, Integer> numberBook = new HashMap<>(n);
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            numberBook.put(name, phone);
            in.nextLine();
        }
        List<String> query = new ArrayList<>();
        while(in.hasNext())
        {
            String s=in.nextLine();
            query.add(s);
        }
        for(String q : query){
            if(numberBook.get(q) != null)
                System.out.println(q+"="+numberBook.get(q));
            else System.out.println("Not found");
        }
    }
}
