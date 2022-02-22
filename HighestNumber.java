import java.util.Scanner;

 

public class HighestNumber {
    public static void main(String[] args)
    {
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the frist number:");
        n1=sc.nextInt();
        System.out.println("Enter the second number:");
        n2=sc.nextInt();
        System.out.println("Enter the third number:");
        n3=sc.nextInt();
        if(n1 > n2 && n1 > n3)
        {
             System.out.println("Highest number is:"+n1);
            
        }
        else if(n2 > n3)
        {
            System.out.println("Highest number is:"+n2);
        }
        else
        {
            System.out.println("Highest number is:"+n3);
        }
}
}