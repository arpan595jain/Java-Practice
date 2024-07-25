package multithreading;
class Abc{}
public class Deadlock {
public static Abc a=new Abc();// Deadlock ka object nahi banana padega
public static Abc aa=new Abc();
public static void main(String args[]) {
Thread thread1=new Thread(new Runnable() {
@Override
public void run() {
synchronized (a) {
try {
System.out.println("Thread 1 acquired a");
for(int i=0;i<50;i++)
Thread.sleep(1000);
} catch (InterruptedException e) {
System.out.println("Exception aa gayi");}}
System.out.println("Thread 1 waiting to get aa");
synchronized (aa) {
System.out.println("Thread 1 acquired aa");}}});
Thread thread2=new Thread(new Runnable() {
@Override
public void run() {
synchronized (aa) {
try {
System.out.println("Thread 2 acquired aa");
for(int i=0;i<50;i++)
Thread.sleep(1000);
} catch (InterruptedException e) {
System.out.println("Exception aa gayi");
}
}
System.out.println("Thread 2 waiting to get a");
synchronized (a) {
System.out.println("Thread 2 acquired a");}}});
thread1.start();
thread2.start();}}
