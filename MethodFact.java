import java.util.Scanner;
class MethodFact{
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    void factorial(){
        int answer=1;
        for(int i=1;i<=n;i++){
            answer=answer*i;
        }
        System.out.println(answer);
    }
    

        public static void main(String[] args){
            MethodFact f= new MethodFact();
            f.factorial();
        }
    }