import java.util.Scanner; 
class Greatest 
{ 
int num1,num2,num3; 
void getdata() 
{ 
Scanner input = new Scanner(System.in); 
System.out.println("Enter number1="); 
num1=input.nextInt(); 
System.out.println("Enter number2="); 
num2=input.nextInt(); 
System.out.println("Enter number3="); 
num3=input.nextInt(); 
if(num1>=num2&&num1>=num3) 
{ 
System.out.println("greatest"+num1); 
} 
else if(num2>=num1&&num2>=num3)
{ 
System.out.println("greatest"+num2); 
} 
else if(num3>=num1&&num3>=num2) 
{ 
System.out.println("greatest"+num3); 
} 
else 
{ 
System.out.println("all are equal"); 
} } } 
public class GreatestMain { 
public static void main(String[] args) { 
// TODO Auto-generated method stub 
Greatest g = new Greatest(); 
g.getdata(); } } 
