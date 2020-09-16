import java.util.Scanner;
public class digits
   {
	public static void main(String[] args)
	{
		int n,i,r=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		n=s.nextInt();
		while(n!=0)
		{
		  n=n/10;
		  r=r+1;
		}
		System.out.println("The digit is "+r);
	}
}
