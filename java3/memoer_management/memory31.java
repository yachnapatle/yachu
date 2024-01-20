//import java.util.Scanner;
public class memory31 {
    public static void main(String[] args) {
        int a=9;
        int b=7;
        //System.out.println("enter the values of a and b");
        //Scanner sc=new Scanner(system.in);
        //a=sc.nextInt();
        //b=sc.nextInt();
        if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else if(a<b)
        {
            System.out.println("a is less than b");
        }
        else
        {
            System.out.println("a is iqual to b");
        }
       String s= a>b?"a is greater than b":a<b?"a is less than b":"a is equal to b";
       System.out.println(s);
    }
    
}
