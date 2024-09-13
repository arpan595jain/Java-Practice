import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList();
    int a=sc.nextInt();
    for(int i=0;i<a;i++)
    {
        list.add(sc.nextInt());
    }
    int c= sc.nextInt();
    sc.nextLine();
    for(int i=0;i<c;i++)
    {
    String str = sc.next();
    if(str.equals("Insert"))
    {
        int index = sc.nextInt();
        int element = sc.nextInt();
        list.add(index, element);
    }

    else if(str.equals("Delete"))
    {
        int ind= sc.nextInt();
        list.remove(ind);

    }
    }
    for(int s: list)
    {
        System.out.print(s+" ");
    }


}
}
