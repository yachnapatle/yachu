package memoer_management;

import java.util.Scanner;
public class memory42 {
    public static void main(String[] args) {
        int n,r;
        System.out.println("enter value of n ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();

        System.out.println("enter the values of r");
        r=sc.nextInt();
        memory42 y= new memory42(); 
        //System.out.println(y.fact1(n));
        System.out.println(y.bc(n,r));

    }
    int fact1(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    int bc(int n,int r)
    {
        int nfac=fact1(n);
        int rfac=fact1(r);
        int n_rfact=fact1(n-r);
        int ans=(nfac)/(rfac*n_rfact);//when we take input 60 and 6 then we find error of exception handling
        return ans;

    }
    
}
