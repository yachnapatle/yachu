package memoer_management.A;
import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        // System.out.println("enter the size of an array");
        // int size= sc.nextInt();
        // int [] arr=new int[size];
        // for(int i=0;i<size;i++)
        // {
        //     System.out.println("enter the elements of the array");
        //     arr[i]=sc.nextInt();
        // }
        // for(int a:arr)
        // {
        //     System.out.println(a);
        // }
        // int xrr[]=new int[]{1,2,3};
        // System.out.println(xrr[2]);
        // int [] qrr= new int[]{1,2,3};
//         // System.out.println(qrr[0]);
// System.out.println("enter the size of float array");
// int b= sc.nextInt();
// float [] frr= new float[b];


//         for(int i=0;i<b;i++)
//          {
//             System.out.println("enter the elements of the array");
//              frr[i]=sc.nextFloat();


//     }
    
//         for(float a:frr)
//         {
//             System.out.println(a);
//         }
System.out.println("enter the size of string array");
int r= sc.nextInt();
String [] qrr= new String[r];
for(int u=0;u<r;u++)
{
    System.out.println("enter the elements of string array");
    qrr[u]=sc.next();
    
}
for(String s: qrr)
{
    System.out.println(s);
}
    
}
}