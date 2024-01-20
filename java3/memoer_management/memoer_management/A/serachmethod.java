package memoer_management.A;
import java.util.Scanner;
public class serachmethod {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter n");
        int n= sc.nextInt();
        int arr []= new int[n];
        boolean flag= false;
        
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        
        }
        System.out.println("enter num");
int num=sc.nextInt();
         
        for(int i=0;i<n;i++)
        {if(arr[i]==num)
            {
                flag=true;
                break;
            }
        
        }
        if(flag==true)
        System.out.println("found");
        else
        System.out.println("not found");
    }
    
}
