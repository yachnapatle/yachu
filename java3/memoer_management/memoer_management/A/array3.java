package memoer_management.A;
import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner (System.in);
        int n;
        System.out.println("enter the number of elements ");
        n=sc.nextInt();
int [] arr= new int[n];
int product=1;
for(int i=0;i<n;i++)
{
    System.out.println("enter the elemets present in the array");
    arr[i]= sc.nextInt();
    product=product*arr[i];
    
}
System.out.println("the product of array elements is:" + product);
        
    }
    
}
