package memoer_management.A;
import java.util.Scanner;
static int search(int arr[],int n,int num)
{
    if(arr[i]%2==0)
    {
        return i;
    }
    return 1;
}
public class methodarry {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter elements");
            arr[i]=sc.nextInt();
        }
int num;
System.out.println("enter num");
num= sc.nextInt();
System.out.println(search(arr,n,num));
        
    }
    
}
