class TotalNumOfOddNum { 
public static void main(String args[]) 
{ int count = 0; 
 int sum = 0;
for(int i = 1;i <= 100;i++) 
{ if(i % 2 != 0) 
{ count++; 
sum = sum + i;}}
System.out.println("The Count Of Odd Numbers are:" + count); 
System.out.println("The Sum Of 100 Odd Numbers are:" + sum);} }
