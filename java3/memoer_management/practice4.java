import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int mask=1;
        if((n&mask)==0)
        System.out.println("even");
        else
        System.out.println("odd");
    }
    
}
