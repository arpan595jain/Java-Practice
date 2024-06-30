@FunctionalInterface 
interface Message { 
public abstract void msg (); 
} 
public class Main implements Message { 
public void msg () 
{ 
} 
System.out.println(“This is Functional Interface Method”); 
public static void main (String args ) 
{ 
Message m1 = new Main (); 
m1.msg(); 
} 
}
