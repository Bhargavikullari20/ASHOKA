
import java.util.*;
class leapyear
{
public static void main(String args[])
 {
 int year;
 
 Scanner sc=new Scanner(System.in);
 
 System.out.println("Enter Leap Year Or Not");
 year=sc.nextInt();
 
 if (year%4==0)
  {
 System.out.println("It is a Leap Year");
 }
 else
 {
 System.out.println("It is  Not Leap Year");
 }
  
  }
}
