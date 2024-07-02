@FunctionalInterface 
interface Message  
{ 
} 
public abstract void msg (); 
class DisplayMessage 
{ 
} 
public DisplayMessage() 
{ 
} 
System.out.println("This is method references example"); 
public class Test 
{ 
} 
public static void main (String [] args) 
{ 
} 
Message m1 =DisplayMessage::new; 
m1.msg();
