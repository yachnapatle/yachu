package memoer_management;

public class memory7 {
    static int sum(int n)
    {
        int ans=(n*(n+1))/2;
        return ans;
    }
    static void check(int m)
    {
        if(m%2==0)
        {
            System.out.println("this is even number");
        }
        else{
            System.out.println("this is odd number");
        }
    }
    public static void main(String[] args) {
        
        int n=10;
        int e=sum(n);
        System.out.println("sum of the natural number is = " + e );
        check(n);
    }
    
}
