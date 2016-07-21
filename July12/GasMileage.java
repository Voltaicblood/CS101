//Program to compute gas mileage
//Jacob Austin
public class GasMileage
{
/*
  Algorithm
main(args)
  gallonsUsed <- 10.7
  milesDriven <- 97
  mileage <- milesDriven / gallonsUsed
  print gallonsUsed, milesDriven, mileage

*/
   public static void main(String [] args)
   {
      double gallonsUsed = 10.7;
      double milesDriven = 97;
      double mileage = milesDriven / gallonsUsed;
      System.out.println("The gas mileage is " + mileage 
                          + " for " + gallonsUsed + " gallons used and " 
                          + milesDriven + " miles driven.");
   
   }//main
}//class GasMileage