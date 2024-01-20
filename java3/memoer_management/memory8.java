package memoer_management;

public class memory8 {
    public static void main(String[] args) {
        int n=60;
      memory8 m =new memory8();
      System.out.println("sum of the natural numbers = " + m.sum1(n));


    }
   int sum1(int n)
    {
int ans=(n*(n+1))/2;
return ans;
    }
    
}
