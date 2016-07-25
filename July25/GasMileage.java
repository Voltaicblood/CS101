/*
Compute gas mileage
*/

/*
Jacob Austin
July 25, 2016
CS101-03
*/

import java.util.*;

public class GasMileage
{

/*
                 Algorithm
main(args)
  keyboard <-- Scanner object associated with keyboard
  ask user to input number of miles
  numberOfMiles <-- input from keyboard
  ask user to input number of gallons
  numberOfGallons <-- input from keyboard
  mileage <-- numberOfMiles / numberOfGallons
  print numberOfMiles, numberOfGallons, mileage
           in a well labeled manner
              
*/

/*
                  Data Table
Variable or Constant          Purpose
____________________          _________________________________________
args                          parameter of main
keyboard                      Scanner object to read from keyboard
numberOfMiles                 number of miles driven
numberOfGallons               number of gallons used
mileage                       gas mileage
                  
*/

  public static void main(String [] args)
  {
 
    Scanner keyboard = new Scanner(System.in);
    System.out.print("enter the number of miles driven: ");
    double numberOfMiles = keyboard.nextDouble();
    System.out.print("enter the number of gallons used: ");
    double numberOfGallons = keyboard.nextDouble();
    double mileage = numberOfMiles / numberOfGallons;
    System.out.print("The gas mileage is " + mileage + " miles per gallon"
                         + " for " + numberOfMiles + " miles driven and "
                         + numberOfGallons + " gallons used.");
    
  }//main method end

}//Template class end