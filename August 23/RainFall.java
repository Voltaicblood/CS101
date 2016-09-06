import java.util.*;

public class RainFall
{
  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);
    double [] normalRainFall = {5.3, 4.7, 9.2, 11.3, 10.1, 8.6,
                                7.4, 4.3, 4.2, 8.5, 13.2, 10.1};
    System.out.println("Enter 12 months rain fall:");
    double [] rain = new double [12];
    for(int i = 0; i < rain.length; i++)
    {
      rain[i] = in.nextDouble();
    }
    
    double greatDiff = -1.0;
    double amountForGreatDiff = -1.0;
    
    for(int i = 0; i < rain.length; i++)
    {
      if (Math.abs(rain[i] - normalRainFall[i]) > greatDiff)
      {
        amountForGreatDiff = rain[i];
        greatDiff = Math.abs(rain[i] - normalRainFall[i]);
      }
    }
    
    System.out.println(amountForGreatDiff);
  }
}