import java.util.Scanner;
public class memory43 {
    public static void main(String[] args) {
        int n;
        
        System.out.println("enter the value of n");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(y(n));
        
    }
     static int y(int n)
    {
        int dec=0,pow=0,ld=1;
        while(n>0)
        {
            ld=n%10;
            dec=dec+(int)Math.pow(2,pow);
            pow++;
            n=n/10;
        }
        return dec;
    }
    }

