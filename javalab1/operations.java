import java.util.Scanner;
public class operations
   {
	public static void main(String[] args)
	{
		int a,b,c,d;
		Scanner s = new Scanner(System.in);
		System.out.println("enter two numbers");
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		d=a*b;
    	System.out.println("ADD:"+c);
		System.out.println("MUL:"+d);
		
		
	}
}
