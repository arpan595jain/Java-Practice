class SimpleObject 
{ 
SimpleObject() 
{ 
System.out.println("I am in class simple object default constructor");
} 
SimpleObject(int a) 
{ 
System.out.println("I am in super class parameterized constructor"); 
} 
} 
public class MainSimple { 
public static void main(String[] args) { 
// TODO Auto-generated method stub 
new SimpleObject(); 
new SimpleObject(100); 
} }
