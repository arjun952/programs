package time.hrstomins;
import java.io.*;
import java.util.Scanner;
  
public class mins { 
  
 static void ConvertHours(int n) 
{ 
 int minutes, seconds; 
  
    minutes = n * 60; 
    seconds = n * 3600; 
  
    System.out.println( "Minutes = " + minutes 
        + ", Seconds = " + seconds); 
} 
    public static void main (String[] args) { 
    int n ;
    Scanner s=new Scanner(System.in);
    System.out.ptintln("enter hours")
    n=s.nextInt();
    ConvertHours(n); 
    } 
      
} 
