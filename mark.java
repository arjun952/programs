import java.util.Scanner;
public class mark
   {
	public static void main(String[] args)
	{
		int n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		n=s.nextInt();
		switch(n)
		{
		    case 10:
		        System.out.println("EXCELLENT"); break;
		     case 9:
		        System.out.println("Very good"); break;

             case 8:
		        System.out.println("Very good"); break;

              case 7:
		        System.out.println("Good"); break;

            case 6:
		        System.out.println("Good"); break;

        case 5:
		        System.out.println("Poor"); break;

      case 4:
		        System.out.println("Poor"); break;

        case 3:
		        System.out.println("Poor"); break;

case 2:
		        System.out.println("Very Poor"); break;

case 1:
		        System.out.println("Very Poor"); break;

case 0:
		        System.out.println("Very Poor"); break;
default:
                 System.out.println("enter the valid value 10 and below"); break;
		}
	}
}
