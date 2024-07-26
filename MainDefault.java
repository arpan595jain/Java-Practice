package defautPackage;
public interface MessageInterface {
     void message();
     public default void defaultMessage()
     {System.out.println("Inside defaultMessage Method of Interface");  }}
package defautPackage;
public class Message implements MessageInterface {
public void message() {
System.out.println("Inside normal Abstract Message Method of Interface");}
    public void defaultMessage() {
    System.out.println("Overriding defaultMessage Method of Interface");  }}
package defautPackage;
public class MainDefault {
public static void main(String[] args) {
// TODO Auto-generated method stub
         Message obj= new Message();
         obj.message();
         obj.defaultMessage();
   //  MessageInterface.defaultMessage();
