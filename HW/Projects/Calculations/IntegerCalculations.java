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
  in <-- scanner object reference for keyboard input
  print "Please input 2 integers and 1 operator:"
  rawInput <-- the next line string of in
  inputOne <-- scanner object from rawInput
  inputTwo <-- scanner object from rawInput
  inputThree <-- scanner object from rawInput
  inputFour <-- scanner object from rawInput
  inputFive <-- scanner object from rawInput
  call checkTokens using inputOne
  call checkIntegers using inputTwo
  operand1 <-- integer value based on calling findOperand1
  operand2 <-- integer value based on calling findOperand2
  operator <-- character value based on calling findOperato4r
  call calculate using operand1, operand2, and operator                
*/

/*
                  Data Table
Variable or Constant          Purpose
____________________          _________________________________________
args                          parameter of main
in                            scanner object reference using keyboard input
rawInput                      string of the next line of in
inputOne                      scanner object refernce using rawInput
inputTwo                      scanner object refernce using rawInput
inputThree                    scanner object refernce using rawInput
inputFour                     scanner object refernce using rawInput
inputFive                     scanner object refernce using rawInput
operand1                      the first inputted operand
operand2                      the second inputted operand
operator                      the inputted operator
                  
*/

   public static void main(String [] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Please input 2 integers and 1 operator:");
      String rawInput = in.nextLine().toString();
      Scanner inputOne = new Scanner (rawInput);
      Scanner inputTwo = new Scanner (rawInput);
      Scanner inputThree = new Scanner(rawInput);
      Scanner inputFour = new Scanner(rawInput);
      Scanner inputFive = new Scanner(rawInput);
      checkTokens(inputOne);
      checkIntegers(inputTwo);
      int operand1 = findOperand1(inputThree);
      int operand2 = findOperand2(inputFour);
      char operator = findOperator(inputFive);
      calculate(operand1, operand2, operator);
   
    
   }//main method end
/*
                 Algorithm
                 
checkTokens(stringInput)
  tokens <-- 0
  if stringInput has a next token,
    then add 1 to tokens and go to next value for stringInput
  if stringInput has a next token,
    then add 1 to tokens and go to next value for stringInput
  if stringInput has a next token,
    then add 1 to tokens and go to next value for stringInput
  if stringInput has a next token,
    then add 1 to tokens
  if tokens < 3
    then print "Your input has less than 3 tokens."
    end program
  if tokens > 3
    then print "Your input has more than 3 tokens."
    end program
*/

/*
                  Data Table
Variable or Constant          Purpose
____________________          _________________________________________
stringInput                   scanner object parameter using inputOne from main
tokens                        amount of tokens scanned
                
*/

   public static void checkTokens(Scanner stringInput)
   {
      int tokens = 0;
      if (stringInput.hasNext() == true)
      {
         tokens++;
         stringInput.next();
      }
      if (stringInput.hasNext() == true)
      {
         tokens++;
         stringInput.next();
      }
      if (stringInput.hasNext() == true)
      {
         tokens++;
         stringInput.next();
      }
      if (stringInput.hasNext() == true)
      {
         tokens++;
      }
      if (tokens < 3)
      {
         System.out.println("Your input contained less than 3 tokens.");
         System.exit(0);                  
      }
      else if(tokens > 3)
      {
         System.out.println("Your input contained more than 3 tokens.");
         System.exit(0);
      }
   }//checkTokens method end
   
/*
                 Algorithm
                 
checkIntegers(integerInput)
  tokens <-- 0
  if integerInput's next token is an integer,
    then add 1 to tokens 
  Go to next value
  if integerInput's next token is an integer,
    then add 1 to tokens 
  Go to next value
  if integerInput's next token is an integer,
    then add 1 to tokens 
  if tokens < 2
    print "Your input contained less than 2 integers."
    end program
  if tokens > 2
    print "Your input does not have an operator."
    end program
*/

/*
                  Data Table
Variable or Constant          Purpose
____________________          _________________________________________
integerInput                  scanner object parameter using inputTwo from main
tokens                        amount of integer tokens scanned
                
*/

  
   public static void checkIntegers(Scanner integerInput)
   {
      int tokens = 0;
      if (integerInput.hasNextInt() == true)
      {
         tokens++;
      }
      integerInput.next();
      if (integerInput.hasNextInt() == true)
      {
         tokens++;  
      }
      integerInput.next();
      if (integerInput.hasNextInt() == true)
      {
         tokens++;
      }
      if (tokens < 2)
      {
         System.out.println("Your input contained less than 2 integers.");
         System.exit(0); 
      }
      else if(tokens > 2)
      {
         System.out.println("Your input does not have an operator.");
         System.exit(0);
      }
   }//checkIntegers method end
   
/*
                 Algorithm
                 
findOperand1(input)
  if input's next token is an integer,
    then operand1 <-- the next token (first token)
  else
    go to next token
    operand1 <-- the next token (second token)
  return operand1
*/

/*
                  Data Table
Variable or Constant          Purpose
____________________          _________________________________________
input                         scanner object parameter using inputThree from main
operand1                      integer value based on first integer inputted
                
*/

   public static int findOperand1(Scanner input)
   {
      int operand1;
      if (input.hasNextInt() == true)
         operand1 = Integer.parseInt(input.next());
      else 
      {
         input.next();
         operand1 = Integer.parseInt(input.next());
      }
      return operand1;
   }//findOperand1 method end
   
/*
                 Algorithm
                 
findOperand2(input)
  countInt <-- 0
  if input's next token is an integer,
    +1 to countInt
  go to next token
  if the next token is an integer and countInt equals 1,
    operand2 <-- the next token (second token)
  else
    go to next token
    operand2 <-- the next token (third token)
  return operand2
*/

/*
                  Data Table
Variable or Constant          Purpose
____________________          _________________________________________
input                         scanner object parameter using inputFour from main
operand2                      integer value based on second integer inputted
countInt                      counts if the first value is an integer
                
*/
   
   public static int findOperand2(Scanner input)
   {
      int operand2;
      int countInt = 0;
      if (input.hasNextInt() == true)
         countInt++;
      input.next();
      if (input.hasNextInt() == true && countInt == 1)
         operand2 = Integer.parseInt(input.next());
      else
      {
         input.next();
         operand2 = Integer.parseInt(input.next());
      }
      return operand2;
   }//findOperand2 method end
   
/*
                 Algorithm
                 
findOperator(input)
  if input's next token is not an integer,
    then operator <-- the next token (first token)
  else
    go to next token
    if the next token is not an integer,
      operator <-- the next token (second token)
    else
      go to next token
      operator <-- the next token (third token)
  return operator
*/

/*
                  Data Table
Variable or Constant          Purpose
____________________          _________________________________________
input                         scanner object parameter using inputFive from main
operator                      char value based on operator inputted

                
*/
   
   public static char findOperator(Scanner input)
   {
      char operator;
      if (input.hasNextInt() == false)
         operator = input.next().charAt(0);
      else
      {
         input.next();
         if (input.hasNextInt() == false)
            operator = input.next().charAt(0);
         else
         {z
            input.next();
            operator = input.next().charAt(0);
         }
      }
      return operator;
   }//findOperator method end
   
/*
                 Algorithm
                 
calculate(operand1, operand2, operator)
  if the operator is +
    output <-- operand1 + operand2
    print operand1 plus operand2 equals output
  else if the operator is -
    output <-- operand1 - operand2
    print operand1 minus operand2 equals output
  else if the operator is *
    print operand1 multipled by operand2 equals output
  else if the operator is /
    if operand2 is 0
      print operand1 divided by operand2 is not defined, division by zero is not allowed
    else
      output <-- operand1 / operand2
      print operand1 divided by operand 2 equals output
  else if the operator is ^
    output <-- operand1^operand2
    print operand1 to the power of operand2 equals output
  else if the operator is %
    if operand2 is 0
      print the remainder of operand1 divided by operand2 is not defined, division
               by zero is not allowed
    else
      output <-- the remainder of operand1 divided by operand2 is output
  else
    print the operator inputted is not a valid operator
*/

/*
                  Data Table
Variable or Constant          Purpose
____________________          _________________________________________
operand1                      integer of the first operand, from main
operand2                      integer of the second operand, from main
operator                      char of the operator, from main
output                         integer of the output of (operand1 operator operand2)

*/
   
   public static void calculate(int operand1, int operand2, char operator)
   {
     int output;
     if (operator == '+')
     {
       output = operand1 + operand2;
       System.out.println(operand1 + " plus " + operand2 + " equals " + output);
     }
     else if (operator == '-')
     {
       output = operand1 - operand2;
       System.out.println(operand1 + " minus " + operand2 + " equals " + output);
     }
     else if (operator == '*')
     {
       output = operand1 * operand2;
       System.out.println(operand1 + " multipled by " + operand2 + " equals " + output);
     }
     else if (operator == '/')
     {
       if (operand2 == 0)
         System.out.println(operand1 + " divided by " + operand2 + " is not defined,"
                              + " division by zero is not allowed.");
       else
       {
         output = operand1 / operand2;
         System.out.println(operand1 + " divided by " + operand2 + " equals " + output);
       }
     }
     else if (operator == '^')
     {
       output = (int)Math.pow(operand1, operand2);
       System.out.println(operand1 + " raised to the power " + operand2 +
                               " equals " + output);
     }
     else if (operator == '%')
     {
       if (operand2 == 0)
         System.out.println("The remainder after dividing "+ operand1 + " by " + operand2
                               + " is not defined, division by zero is not allowed.");
       else
       {
         output = operand1 % operand2;
         System.out.println("The remainder after dividing " + operand1 + " by " 
                               + operand2 + " is " + output);
       }
     }
     else
       System.out.println("The operator inputted is not a valid operator.");

     
   }//calculate method end
   
}//IntegerCalcuations class end