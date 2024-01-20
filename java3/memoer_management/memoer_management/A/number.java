package memoer_management.A;

import java.util.Scanner;



public class number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1 , p=1;i<=n;i=i+1,p+=2)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(p +"");
                
               
            }

            for(int j=1;j<=(n-i)+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
    
}
