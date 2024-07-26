package functionalinterface;
@FunctionalInterface
public interface MessageInterface {
         void message();
         //void message1();       
}
package functionalinterface;
public class Message implements MessageInterface {
       public void message()
       {
       System.out.println("This is functional interface method");
       }
}
package functionalinterface;
public class FunctionalMain {
public static void main(String[] args) {
// TODO Auto-generated method stub
         Message obj= new Message();
         obj.message();
}}
