//Utility to calculate water masses and volumes for CHEM-136
//Jacob Austin

import java.util.*;

public class WaterCalculator
{
  public static void main(String [] args)
  {  
    Scanner in = new Scanner(System.in);
    final double DENSITY = 0.99823;
    final double BEAKER = 13.366;
    double mass = in.nextDouble();
    
    double massWater = mass - BEAKER;
    double volume = massWater * DENSITY;
    System.out.println("Water mass is: " + massWater + " and volume is: " + volume);
  }
}