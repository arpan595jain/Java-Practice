interface Message {
public abstract void msg ();
public default void msg2()
{
System.out.println(“Default method in Interface”);
}
}
public class Main implements Message {
public void msg ()
{
System.out.println(“This is Functional Interface Method”);
}
public static void main (String [] args)
{
Message m1 = new Main ();
m1.msg();
m1.msg2();
}
}
