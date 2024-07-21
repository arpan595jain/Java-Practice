package Threading; 
public class FirstThread { 
public static void main(String[] args) { 
// TODO Auto-generated method stub 
System.out.println("I am in main thread"); 
System.out.println("Thread name="+Thread.currentThread().getName()); 
MyThread t1=new MyThread("Thread 1"); 
t1.start(); 
MyThread t2=new MyThread("Thread 2"); 
t2.start(); } } 
class MyThread extends Thread 
{ MyThread(String name) 
{ super(name);} 
public void run() 
{ System.out.println("Thread name="+Thread.currentThread().getName()); } }
