import java.util.Scanner;
public class month
   {
	public static void main(String[] args)
	{
		int n,m,d;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the no of days");
		n=s.nextInt();
		m=n/30;
		d=n%30;
		System.out.println(m+" months "+d+" days");
		
	}
}
