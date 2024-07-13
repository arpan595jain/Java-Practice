import java.util.Scanner; 
class Room 
{ 
int roomno; 
String roomtype,roomarea,acmachine; 
void setData() 
{ 
Scanner input = new Scanner(System.in); 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter room no="); 
roomno=input.nextInt(); 
System.out.println("Enter room type="); 
roomtype=sc.nextLine(); 
System.out.println("Enter room area="); 
roomarea=sc.nextLine(); 
System.out.println("Enter AC machine="); 
acmachine=sc.nextLine();
} 
void displayData() 
{ 
System.out.println("room no:"+roomno); 
System.out.println("room type:"+roomtype); 
System.out.println("room area:"+roomarea); 
System.out.println("AC machine:"+acmachine); 
} 
} 
public class MainRoom { 
public static void main(String[] args) { 
// TODO Auto-generated method stub 
Room r = new Room(); 
r.setData(); 
r.displayData(); 
} 
} 
