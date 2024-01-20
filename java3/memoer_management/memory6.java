package memoer_management;
public class memory6 {
  static double ci(double a ,double b,double c )
   {
 
    double fa=a* Math.pow((1+b/100), c);

    double ci=fa-a;
    return ci;
   }

   static double si(double p,double r,double t )
   {
    double sip=( p*r*t)/100;
    return sip;
   }
   static double s(double d,double t )
  {
    double sd=d/t;
    return sd;
   }
   static double v(double  m,double d)
   {
    double vc=m/d;
    return vc;
   } 
   static double ar(double g)
   {
    double area=g*g;
    return area;
   }
    public static void main(String[] args) {
        double p=10000;
        double r=30;
        double t=5;
        double x=ci(p,r,t);
        double y=si(p,r,t);
        double z=s(p,r);
        double f=v(p,r);
        double u=ar(p);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(f);
        System.out.println(u);


        
    }
    
}
