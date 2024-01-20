package memoer_management;

public class control6 {
    public static void main(String[] args) {
      
        
        int a=1800;
        if(a%4==0)
        {
            if(a%100!=0)
            {
                System.out.println("this is leap year");
            }
            else if(a%400==0)
            {
                System.out.println("THIS IS A LEAP YEAR");
            }
            else
            {
                System.out.println("not aleap year");
            }

            
        }
        else{
            System.out.println("NOT A LEAP YEAR");
        }
        System.out.println("work done");
       // String u=a%4==0 ?a%400!=0?"this is leap year":a%400==0?"THIS IS A LEAP YEAR":"not a leap year":"NOT A LEAP YEAR";
       // System.out.println(u);
//String u=a%4==0?a%100!=0?"this is a leap year:a%400==0?"THIS IS A LEAP YEAR:"not a leap year" :"NOT A LEAP YEAR";

String g= a%4==0?a%100!=0?"this is leap year":a%400==0?"THIS IS A LEAP LEAR":"not a leap year":"NOT A LEAP YEAR" ;
System.out.println(g);






    }
    
}
