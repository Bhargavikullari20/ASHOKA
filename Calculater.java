mport java.util.Scanner;
 class  calculater {
    public static void main(String args[])
    {
    int a,b c;
 char ch;
  Scanner sc = new Scanner(system.in);
System.out.println("addition ");
System.out.println("subtraction");
System.out.println("multiplication ");
    System.out.println("division ");
    System.out.println("percentage ");
    
System.out.println("your choice any one can pick ");
 ch=Sc.nextInt().charAt(0);

   System.out.println("enter value ");
 a=sc.nextInt();
   b=sc.nextInt();
   switch (ch){
case 1:
  c=a+b;
  System.out.println(c);
 break;
  case 2:
    c=a-b;
 
  System.out.println(c);
 break;
case 3:
   c=a*b;
  System.out.println(c);
    break;
    case 4:
 c=a/b;
    System.out.println(c);
break;
case 5:
    c=a%b;
    System.out.println(c);
    break;
 
    default:
   System.out.println(  "invalid operator");
   
}
    }

   }