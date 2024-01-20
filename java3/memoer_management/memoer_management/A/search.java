package memoer_management.A;
import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number pf elements");
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the elements");
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number for serach");
        int num;
        num=sc.nextInt();
        int i;
        for( i=0;i<n;i++)
        {
            if(arr[i]==num)
            {
                System.out.println("found");
                break;
            }
        }
        
        if(i==n)
        {
            System.out.println("not found");
        }
    }
    
}
