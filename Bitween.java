import java.util.*;
class Bitween
{
    public static void main(String[] args)
    {
        int sum=0;
        int i;
        for(i=9;i<=300;i++)
        {
            if(i%7==0 && i%63 !=0)
            sum=sum+i;
        }
        System.out.println("The sum of integersbetwwn 9 and 300 divisbleby7 but not divisible by63 is:"+sum );
    }