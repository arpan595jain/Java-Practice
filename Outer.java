package innerclass;
public class Outer {
class Inner{
void display() {
System.out.println("Inside the inner class");
}}
public static void main(String[] args) {
// TODO Auto-generated method stub
           Inner i= new Inner();        // Compilation Error     
}}
ackage innerclass;
public class Outer {
class Inner{
void display() {
System.out.println("Inside the inner class");}}
public static void main(String[] args) {
// TODO Auto-generated method stub
        Outer o= new Outer();  
 Inner i= o.new Inner(); 
 i.display();}}

