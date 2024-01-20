package memoer_management;

public class memory4 {

  static int add(int x,int y)
{
    int ans=x+y;
    return ans;
}
 static int pro(int u,int v)
{
    int m=u*v;
    return m;
}
static int sub(int r,int s)
{
    int q=r-s;
    return q;
}
static double div(int e,int f)
{
    float n=e/f;
    return n;
}
static int mod(int s,int c)
{
    int x=s%c;
    return x;
}

public static void main(String[] args) {
    int a=30;
    int b=78;
    int w=add(a,b);
    int r=pro(a,b);
    int v=sub( a, b);
    double z=div(a,b);
    int p=mod(a,b );
    System.out.println("addition = " + w);
    System.out.println("multication = " + r);
        System.out.println("subtraction= "+v);
    System.out.println("division="+z);
        System.out.println("modulous="+p);



    
}
    
}
