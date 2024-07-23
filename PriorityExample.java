package Threading; 
class MyPriorityThread extends Thread 
{ MyPriorityThread(String s) 
{ super(s); 
start(); } 
public void run() 
{ for(int i=0;i<5;i++) { 
System.out.println("Thread Name:"+Thread.currentThread().getName()); 
try { 
Thread.sleep(1000); 
} catch (InterruptedException e) { 
// TODO Auto-generated catch block 
e.printStackTrace(); } } } } 
public class PriorityExample {public static void main(String[] args) { 
// TODO Auto-generated method stub 
System.out.println("Thread Name:"+Thread.currentThread().getName()); 
MyPriorityThread m1=new MyPriorityThread ("My Thread 1"); 
m1.setPriority(Thread.MAX_PRIORITY); 
int p1=m1.getPriority(); 
System.out.println("Thread Priroty: "+p1); 
MyPriorityThread m2=new MyPriorityThread("My Thread 2"); 
m2.setPriority(Thread.MIN_PRIORITY); 
int p2=m2.getPriority(); 
System.out.println("Thread Priroty: "+p2); } }
