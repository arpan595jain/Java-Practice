public class PalindromeChecking 
{ 
  public static void main(String[] args) { 
String inpstr ="AMMA"; 
char[] inpArray = inpstr.toCharArray(); 
char[] revArray = new char[inpArray.length]; 
int j=0; for (int i = inpArray.length - 1; i >= 0; i--) { 
revArray[j]=inpArray[i]; 
j++;
} 
String revstr=String.valueOf(revArray); 
if(inpstr.equals(revstr)) 
{
  System.out.println("The given string is a Palindrome");
} 
else 
{ 
  System.out.println("The given string is not a Palindrome");
}
  }
}
