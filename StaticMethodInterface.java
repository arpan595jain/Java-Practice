package defautPackage;
public interface MessageInterface {
    void message();
     public static void defaultMessage()
     {
     System.out.println("Inside static defaultMessage Method of Interface");
     }
}
package defautPackage;
public class Message implements MessageInterface {
public void message() {
System.out.println("Inside normal Abstract Message Method of Interface");
}
/*    public static void defaultMessage() {
    System.out.println("Overriding defaultMessage function of Interface");
    }
}*/
package defautPackage;
public class MainDefault {
public static void main(String[] args) {
 Message obj= new Message();
        obj.message();
        obj.defaultMessage();
        MessageInterface.defaultMessage();
}}
