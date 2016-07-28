//Print values in order of smallest to largest.
//Jacob Austin
import java.util.*;

public class SortInputsV3
{
  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    int small = a;
    int mid = 0;
    int big = 0;
    
    if (a < b)
      mid = b;
    else
    {
      small = b;
      mid = a;
    }
    
    if (c >= mid)
      big = c;
    else if (c < small)
    {
     big = mid;
     mid = small;
     small = c;
    }
    else
    {
      big = mid;
      mid = c;
    }
    
    System.out.println(small + " " + mid + " " + big);
   }
}
