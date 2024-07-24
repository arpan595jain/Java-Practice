package multithreading;
class Shared{
 boolean check=false;
 int items=0;
 synchronized void getItems(){
 if(check==false) {
 try { wait(); } catch (InterruptedException e) {
   e.printStackTrace(); }}
System.out.println("Consumer:"+ items);
 check=false;
 notify();}
synchronized void setItems(int i) {
 if(check==true) {
 try {wait(); } catch (InterruptedException e) {
 // TODO Auto-generated catch block
 e.printStackTrace();}}
 this.items=i;
 System.out.println("Producer:" + items);   
 check=true;
 notify();}}
class Consumer extends Thread
{    Shared s;
Consumer(Shared s)
{this.s=s;
this.start();}
public void run() 
{for(int i=1;i<=6;i++)
{ s.getItems();}}}

class Producer extends Thread
{    Shared s;
Producer(Shared s)
{this.s=s;
this.start();}
public void run() 
{for(int i=1;i<=6;i++)
{s.setItems(i);}}}
public static void main(String[] args) {
// TODO Auto-generated method stub
             Shared s=new Shared();
             new Producer(s);
              new Consumer(s);}}
