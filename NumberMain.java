class Number 
{ 
private double n; 
Number(int n) 
{ 
this.n=n; 
} 
public boolean isZero() 
{ 
if(n==0) 
return true; 
else 
return false; 
} 
public boolean isPositive() 
{ 
if(n>0)
return true; 
else 
return false; 
} 
public boolean isNegative() 
{ 
if(n<0) 
return true; 
else 
return false; 
} 
public boolean isOdd() 
{ 
if(n%2!=0) 
return true; 
else 
return false; 
} 
public boolean isEven() 
{ 
if(n%2==0) 
return true; 
else 
return false; 
} 
public boolean isPrime() 
{ 
double a=2,f=0; 
while(a<n) 
{ 
if(n%a==0) 
{
f=1; 
break; 
} 
a++; 
} 
if(f==0) 
return true; 
else 
return false; 
} 
public boolean isArmstrong() 
{ double m; 
double temp,sum=0; 
temp=n; 
while(n>0) { 
m=n%10; 
sum=sum+m*m*m; 
n=n/10; } 
if(sum==temp) 
return true; 
else 
return false; } } 
public class NumberMain {public static void main(String[] args) { 
// TODO Auto-generated method stub 
Number n1= new Number(10); 
System.out.println("zero="+n1.isZero()); 
System.out.println("positive="+n1.isPositive()); 
System.out.println("nagative="+n1.isNegative()); 
System.out.println("odd="+n1.isOdd()); 
System.out.println("even="+n1.isEven()); 
System.out.println("prime="+n1.isPrime()); 
System.out.println("armstrong="+n1.isArmstrong()); } }
