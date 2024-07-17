package PolymorphismEx;
      class Baseclass{
      void display() {
      System.out.println("I am in BaseClass");  }}
class Subclass extends Baseclass{
  void display() {
    System.out.println("I am in Subclass"); }}
public class PolyMain {
  public static void main(String[] args) {
 // Method Overloading method stub
     Baseclass a= new Baseclass();
      a.display();  
      Subclass b= new Subclass();
      b.display();
      Baseclass a1= new Subclass();             // Upcasting
     // Subclass b1= (Subclass) new Baseclass(); // Downcasting Not Possible: Gives Error
      a1.display();}} 

