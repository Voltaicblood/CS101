/*
Perform integer calculations by selecting operands and
an operator from input
*/

/*
Jacob Austin
8/1/2016
CS101-03
*/

import java.util.*;

public class IntegerCalculations
{

/*
                 Algorithm
main(args)   
  rawInput <-- scanner object reference for keyboard input
  call checkTokens using rawInput
  
checkTokens(String rawInput)
  
                
*/

/*
                  Data Table
Variable or Constant          Purpose
____________________          _________________________________________
args                          parameter of main
                  
*/

  public static void main(String [] args)
  {
    Scanner rawInput = new Scanner(System.in);
    int totalTokens = checkTokens(rawInput);
    System.out.println(totalTokens);
    
  
  }//main method end
  
  public static int checkTokens(Scanner rawInput)
  {
    int tokens = 0;
    if (rawInput.hasNext() == true)
       tokens = tokens + 1;
    if (rawInput.hasNext() == true)
       tokens = tokens + 1;
    if (rawInput.hasNext() == true)
       tokens = tokens + 1;
    if (rawInput.hasNext() == true)
       tokens = tokens + 1;
    return tokens;
  }//checkTokens method end
  
}//IntegerCalcuations class end