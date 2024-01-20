package memoer_management;

public class test1 {
    public static void main(String[] args) {
        System.out.println(method1());
        System.out.println(method2());
        System.out.println(method3());
        System.out.println(method4());
        test1 t= new test1();//constructor internally create and test1 is the name of class which is user defind data type and h is a variable which hold weard address of objrcr
        System.out.println(t.Yachna());
        
    }
   public static int method1()

    {
        return 2;
    }
   public static short method2()
    {
        return 3;
    }
    public static float method3()
    {
        return 4.5f;
    }
   public static long method4()
    {
        return 5;
    }
    int Yachna()
    {
        return 67;
    }
    
}
