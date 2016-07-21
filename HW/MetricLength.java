/* MetricLength - converts inches to centimeters
   Anderson, Franceschi
   Jacob Austin
*/

public class MetricLength
{
   public static void main( String [] args )
   {
   
      final double CM_PER_INCH = 2.54;
      double inches = 10.0;
      double centimeters = inches * CM_PER_INCH;
      System.out.println(inches + " inches is " + centimeters + " centimeters.");
   
   
   }
}