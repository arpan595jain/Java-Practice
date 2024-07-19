package filehandling; 
import java.io.File; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.Scanner; 
public class WriteEmployee { 
public static void main(String[] args) { 
// TODO Auto-generated method stub 
String empName; 
int empNo,empBasic; 
Scanner input = new Scanner(System.in); 
Scanner s = new Scanner(System.in); 
System.out.println("Enter employee name="); 
empName=input.nextLine(); 
System.out.println("Enter employee no="); 
empNo=s.nextInt(); 
System.out.println("Enter employee salary="); 
empBasic=s.nextInt(); 
input.close(); 
s.close(); 
File f=new File("src\\filehandling\\emp.txt"); 
try { 
FileWriter fw = new FileWriter(f,true); 
fw.write("employee name:"+empName+" "); 
fw.write(" employee no:"+empNo+" "); 
fw.write(" employee salary:"+empBasic+" "); 
fw.close(); 
System.out.println("data inserted"); 
}catch (IOException e) { 
// TODO Auto-generated catch block 
e.printStackTrace(); 
} 
} 
} fw.close(); 
System.out.println("data inserted"); 
}catch (IOException e) { 
// TODO Auto-generated catch block 
e.printStackTrace(); } } }  

