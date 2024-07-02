import java.util.function.*;  
public class Main {  
public static void main (String args [])  
{  
}  
}  
List<Integer> li = new ArrayList<Integer> (); 
li.add(10); 
li.add(20); 
li.add(30); 
li.add(40); 
List<Integer> ll =li.stream().map((x)->x*x).collect(Collectors.toList()); 
System.out.println(“List of number are=”+li); 
System.out.println(“Square of list of number are=”+ll);
