//Jacob Austin
import java.util.*;

public class ReadNumbers
{
  public static void main (String [] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int a = keyboard.nextInt();
    int b = keyboard.nextInt();
    int c = keyboard.nextInt();
    System.out.println(a + " " + b + " " + c);
    if (a > b && a > c)
      System.out.println(a + " is the largest number.");
    else if (b > a && b > c)
      System.out.println(b + " is the largest number.");
    else
      System.out.println(c + " is the largest number.");
    
  }
 
}