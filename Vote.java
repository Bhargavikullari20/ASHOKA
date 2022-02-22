import java.util.Scanner;
public class Vote {

 

  public static void main(String[] args)
  {
    
    int age;
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter person age:");
    age=sc.nextInt();
    if (age>=18)
    {
    System.out.println("Eligible ");
    }
    else
    {
        System.out.println(" Not Eligible ");
    }
    }
}