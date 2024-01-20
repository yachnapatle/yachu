import java.util.Scanner;
public class swap 
{
    public static void main(String[] args) {
        swap sa= new swap();
        int a,b;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(sa.swapq(a,b));
        
    }
    int swapq(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
        return 1 ;

    }
    
}
