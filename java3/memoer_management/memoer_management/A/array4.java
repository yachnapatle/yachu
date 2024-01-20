package memoer_management.A;
import java.util.Scanner;
public class array4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n= sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the values of array");
            arr[i]=sc.nextInt();
        }
        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
if(arr[i]%2==0)
{
    sum=sum+arr[i];
}

}
        
        System.out.println(sum);
        int sum1=0;

        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                sum1=sum1+arr[i];
            }
        }
       
       System.out.println(sum1); 
    }
    
}
