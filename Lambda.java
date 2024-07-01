@FunctionalInterface 
interface Message 
{ 
public abstract void msg(); 
} 
public class Test  
{ 
public static void main(String args[]) 
{ 
//Interface implementation using Anonymous Inner Class: - Order Method in Java 1.7 or earlier 
Message m1 = new Message() 
{ 
} 
m1.msg(); 
@Override 
public void msg()  
{ 
} 
System.out.println(“By using Anonymous class”); 
//Interface implementation using Lambda Express: - New method in Java 1.8 or later 
Message m2 = ()->System.out.println(“By using Lambda Express”); 
m2.msg(); 
} 
} 
