package time.sectohrs;
import java.util.*;
 public class hrs {
   void convertsec(int seconds)
{    
 int secs = seconds % 60;
        int hr = seconds / 60;
        int min = hr % 60;
        hr = hr / 60;
        System.out.print( hr + "hrs:" + min + "mins:" + secs+"secs);
		System.out.print("\n");
}

 public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Input seconds: ");
		int seconds = s.nextInt();
         convertsecs(seconds);
    }    
 }
