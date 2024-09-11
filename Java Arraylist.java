import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    ArrayList<ArrayList<Integer>> list2d = new ArrayList<>();
    int rows = sc.nextInt();
    for(int i = 0; i < rows; i++){
        int newArrayLength = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int j=0;j < newArrayLength;j++){
            list.add(sc.nextInt());
        }
        list2d.add(list);
    }
    int numberOfQueries = sc.nextInt();
    for(int i =0; i < numberOfQueries; i++){
        int row = sc.nextInt();
        int column = sc.nextInt();
        if( column - 1 < list2d.get(row - 1).size()){
            System.out.println(list2d.get(row - 1).get(column - 1));
        }
        else{
            System.out.println("ERROR!");
        }
    }
}
}
