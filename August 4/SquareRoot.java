public class SquareRoot
{
   public static void main(String [] args)
   {
      final double DELTA = 0.00001;
      double p = 835;
      double x = p/2;
      int count = 0;
      while (Math.abs(x*x - p) > DELTA)
      {
         if (x*x > p)
            x = x - x/2;
         else
            x = x + x/2;
         count++;
      } 
      System.out.println(x); 
      System.out.println(x*x);
      System.out.println(p);
      System.out.println(count);
   }
}