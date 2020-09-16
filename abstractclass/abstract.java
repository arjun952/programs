package abstractclass;
import java.util.Scanner;
public class abstract {
   
    public static void main(String[] args) 
    {
      circle c=new cirle();
      c.printarea();
      sqare sq=new sqare();
      sq.printarea();
      triangle t=new triangle();
      t.printarea();
    }
    
}
abstract class shape
{   double r,area;
    abstract void printarea();
    
    Scanner s=new Scanner(System.in);
    
}
class circle extends shape
{
    
    void printarea()
    {   
        System.out.println("enter radius");
        r=s.nextInt();
        area =3.14*r*r;
        System.out.println("Area of circle"+area);
    }
}
class square extends shape
{
   
   void printarea()
    {    
        System.out.println("enter side");
        r=s.nextInt();
        area =r*r;
        System.out.println("Area of circle"+area);
    }
    
}
class triangle extends shape
{
   
   void printarea()
    {    
        double b;
        System.out.println("enter base and height");
        r=s.nextInt();
        b=s.nextInt();
        area =b*r/2;
        System.out.println("Area of circle"+area);
    }
    
}