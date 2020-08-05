import java.util.Scanner;
public class min
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("enter two numbers");
		a=s.nextInt();
		b=s.nextInt();
		if (a>b)
		  System.out.println("b is minimum");
		else if(a==b)
		   System.out.println("neither a nor b is minimum");
		else  
		   System.out.println("a is minimum");
		   
		
	}
}
