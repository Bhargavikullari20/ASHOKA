import java.util.*;
class Alphabetspecial
{
    public static void main(String args[])
    {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Any Character :");
   char ch=sc.next().charAt(0);
   if(ch>='a && ch<='z' || ch>='A' && ch<='Z')
   {
   System.out.println("Alphabet is:"+ch);
   }
  else if(ch>='0' && ch<='9')
   {
  System.out.println("Digit is:"+ch);
   }
   else
    {
   System.out.println("Special Character is :"+ch);
 
   }
    }
}
