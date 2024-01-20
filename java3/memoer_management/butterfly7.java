 import java.util.Scanner;
public class butterfly7
 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {   
      for(int j=1;j<=i;j++) 
      {
        System.out.print("* ");
      }
      for(int j=i;j<=n;j++)
      {
        System.out.print("  ");
      }
      for(int j=i;j<n;j++)
      {
        System.out.print("  ");
      }
      for(int j=1;j<=i;j++)
      {
        System.out.print("* ");
    
      }

      System.out.println(); 
    }
    
     for(int i=1;i<=(n*2)+1;i++)
     {
         for(int j=1;j<=(n*2)+1;j++)
         {
             if(j==4)
             {
                 System.out.print("* ");
            }
        }
     }

     System.out.println();
    for(int i=1;i<=n;i++)
    {
        for(int j=i;j<=n;j++)
        {
            System.out.print("* ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("  ");
        }
        for(int j=2;j<=i;j++)
        {
            System.out.print("  ");
        }
        for(int j=i;j<=n;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}

//     }
//     for(int i=1;i<=3;i++)
//     {
//         for(int j=i;j<=3;j++)
//         {
// System.out.print("*");
//         }
//         for(int j=1;j<=i;j++)
//         {
//             System.out.print("$");
//         }
//         System.out.println();
//     }



