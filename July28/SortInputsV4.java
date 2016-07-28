//Print values in order of smallest to largest.
//Jacob Austin
import java.util.*;

public class SortInputsV4
{
  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    
    int small = Math.min(a, Math.min(b, c));
    int big = Math.max(Math.max(a, b), c);
    int mid = a + b + c - big - small;
    System.out.println(small + " " + mid + " " + big);
  }   
}