/* Temperature Conversion
   Anderson, Franceschi
   Jacob Austin
*/

public class TemperatureConversion
{
   public static void main( String [] args )
   {
      //***** 1. declare any constants here
      final double CELSIUS_CONVERSION = 0.5556;
			
      //***** 2.  declare temperature in Fahrenheit as an int 
      int temperature = 47;
	  
      //***** 3. calculate equivalent Celsius temperature	
	   temperature = (int)((temperature - 32) * CELSIUS_CONVERSION);
	  		
      //***** 4. output the temperature in Celsius
	   System.out.println("It is " + temperature + " degrees Celsius.");
												  
      //***** 5. convert Celsius temperature back to Fahrenheit
      //Added 1 to fix rounding errors
		temperature = (int)(temperature / CELSIUS_CONVERSION + 32 + 1);
				
      //***** 6. output Fahrenheit temperature to check correctness 
		System.out.println("It is " + temperature + " degrees Fahrenheit.");
				
   }
} 