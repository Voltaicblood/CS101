//Utility to calculate % error for CHEM-136
//Jacob Austin

import java.util.*;

public class PercentError
{
  public static void main(String [] args)
  {  
    Scanner in = new Scanner(System.in);
    final double VOLUME = 10.0;
    double a = in.nextDouble() - VOLUME;
    double b = in.nextDouble() - VOLUME;
    double c = in.nextDouble() - VOLUME;
    double error = ((a + b + c) / 3) * 100;
    System.out.println(error);
  }
}