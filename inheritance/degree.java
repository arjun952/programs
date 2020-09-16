package inheritance;
import java.util.Scanner;
public class degree 
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        Degree d=new Degree();
        d.getDegree();
        System.out.println("enter 1 if ur a UG and enter 2 if ur a PG ");
        int n =s.nextInt();
        Undergraduate ug=new Undergraduate();
        Postgraduate pg=new Postgraduate();
        switch(n)
        {
            case 1:
                ug.undergraduate();
                break;
            case 2:
                pg.postgraduate();
                break;
            default:
                System.out.println("Enter 1 or 2");
        }
        
    }
}
class Degree
{
    void getDegree()
    {
        System.out.println("I got a Degree");
    }
}
class Postgraduate extends Degree
{
    void postgraduate()
    {
        System.out.println("Iam a postgraduate");
    }
}
class Undergraduate extends Degree
{
    void undergraduate()
    {
        System.out.println("Iam a undergraduate");
    }
}