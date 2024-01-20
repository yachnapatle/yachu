package memoer_management;

public class memory2 
{
    public static boolean method1()
    {
        int p=9;
        int k=3;
        int t=k*p;
        System.out.println("method1");
        return true;
        
    }
    public static void main(String[] args) {
        int a=3;
        double b=3.3;
        double c=a+b;
        method2();
        System.out.println("main");
        
    }
    public static char method2()
    {
        float Q=10.2f;
        int g=9;
        float p=Q-g;
        System.out.println("method2");
        method1();
        return 'A';
    }



    
}
