import java.util.*;
class patteren
{
    public static void main(String args[])
    {
        int i,j;
        for (i=1;i<=5;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(i+j==6 || i-j==0)
                {
                    System.out.print("$");
                }
                else
                {
                    System.out.print("*");
                }
            }
                System.out.println();
            }
        }
               
    }