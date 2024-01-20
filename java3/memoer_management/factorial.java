import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of n ad r");
        int n= sc.nextInt();
        int r= sc.nextInt();
      System.out.println(fact(n));
      System.out.println(co(n,r));
        
        }
         static int fact(int n)
        {
            int fact=1;
            while(n>=1)
            {
                fact=fact*n;
                n--;
            }

            return fact;
        }
        static int co(int n,int r)
        {
            int A= fact(n);
            int B= fact(r);
            int C=fact(n-r);
            int F=A/(B*C);
            return F;

        }

}
