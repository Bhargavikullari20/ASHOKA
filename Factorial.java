mport java.util.Scanner;

 

class Factorial
{
    public static void main(String args[])
    {
        int i=1,n,fact=1;
        
         Scanner sc=new Scanner(System.in);
       System.out.println("enter any value");
        n=sc.nextInt();
          
        
        while (i<=n)
        {
            fact = fact * i; 
            i=i+1;
        }
      System.out.println("The factorial of" +n+ "number is:" + fact);
    }
}