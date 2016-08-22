/*
Program to determine and report the sales values of
employees determined by input files, and written
to output files
*/

/*
Jacob Austin
8/19/2016
CS101-03
*/

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class SalesReport
{

/*
                  Algorithm
highestSales <-- assigned minimum integer value
lowestSales <-- assigned maximum integer value

   main(args)
     String salesDataFileName <-- argument 0
     String nameDataFileName <-- argument 1
     String outputFileName <-- argument 2
     File salesData <-- new File using string salesDataFileName
     File nameData <-- new File using string nameDataFileName
     File outputFile <-- new File using string outputFileName
     Scanner salesInput <-- new Scanner using File salesData
     Scanner nameInput <-- new Scanner using File nameData
     PrintStream out <-- new PrintStream using FileoutputFile
     
     print to out <-- "Report on Salespersons\nJacob Austin CS101\n"
     
     String SENTINEL <-- "quit"
     String inputString <-- String of next line of salesInput
     
     while a lowercase inputString does not contain "quit"
       personName <-- call method readSalesInput(inputString, nameData)
       personSales <-- call method readMoneyInput(inputString)
       call method writeOutput(out, personName, personSales)
       inputString <-- string value of next line of stringInput
       
     String pattern <-- "$#,##0"
     DecimalFormat dollarFormat <-- DecimalFormat using pattern
     int highestDollarValue <-- highestSales / 100
     int highestCentValue <-- highestSales % 100
     int lowestDollarValue <-- lowestSales / 100
     int lowestCentValue <-- lowestSales % 100
     
     print new line to out <-- "\nHighest Sales: " + highestPerson
     print new line to out <-- "\tTotal Sales: " + 
                                dollarFormat.format(highestDollarValue)
                                + "." + highestCentValue
     print new line to out <-- "\nHighest Sales: " + lowestPerson
     print new line to out <-- "\tTotal Sales: " + dollarFormat.format(lowestDollarValue)
                                 + "." + lowestCentValue            
*/

/*
                   Data Table
Variable or Constant          Purpose
____________________          _________________________________________
highestSales                  static integer for highest sales
highestPerson                 static string for person with highest sales
lowestSales                   static integer for lowest sales
lowestPerson                  static string for person with lowest sales

args                          parameter of main
salesDataFileName             String file name for the sales data pulled from argument 0
nameDataFileName              String file name for the name data pulled from argument 1
outputFileName                String file name for the output file pulled from argument 2
salesData                     File pulled from the string salesDataFileName
nameData                      File pulled from the string nameDataFileName
outputFile                    File pulled from the string outputFileName
salesInput                    Scanner using input from File salesData
nameInput                     Scanner using input from File nameData
out                           PrintStream that prints to File outputFile
SENTINEL                      String using "quit" to end while loop
personName                    String that stores name of salesperson
personSales                   String that stores sales of the salesperson
inputString                   String that stores a line from salesInput
pattern                       String that stores the pattern "$#,##0"
dollarFormat                  DecimalFormat that uses String pattern
highestDollarValue            Dollar value of highestSales
highestCentValue              Cent value of highestSales
lowestDollarValue             Dollar value of lowestSales
lowestCentValue               Cent value of lowestSales                
*/

   static int highestSales = Integer.MIN_VALUE;
   static String highestPerson;
   static int lowestSales = Integer.MAX_VALUE;
   static String lowestPerson;

   public static void main(String [] args) throws Exception 
   {
      String salesDataFileName = args[0];
      String nameDataFileName = args[1];
      String outputFileName = args[2];
      File salesData = new File (salesDataFileName);
      File nameData = new File (nameDataFileName);
      File outputFile = new File (outputFileName);
      Scanner salesInput = new Scanner(salesData);
      Scanner nameInput = new Scanner(nameData);
      PrintStream out = new PrintStream(outputFile);
      
      out.print("Report on Salespersons\nJacob Austin CS101\n");
      
      String SENTINEL = "quit";
      String personName;
      String personSales;
      
      String inputString = salesInput.nextLine().toString();
      
      while(!inputString.toLowerCase().contains(SENTINEL))
      {
         personName = readSalesInput(inputString, nameData);
         personSales = readMoneyInput(inputString);
         writeOutput(out, personName, personSales);
         inputString = salesInput.nextLine().toString();
      }
      String pattern = "$#,##0";
      DecimalFormat dollarFormat = new DecimalFormat(pattern);
      int highestDollarValue = highestSales / 100;
      int highestCentValue = highestSales % 100;
      int lowestDollarValue = lowestSales / 100;
      int lowestCentValue = lowestSales % 100;
      out.println("\nHighest Sales: " + highestPerson);
      out.println("\tTotal Sales: " + dollarFormat.format(highestDollarValue) 
                   + "." + highestCentValue);
      out.println("\nHighest Sales: " + lowestPerson);
      out.println("\tTotal Sales: " + dollarFormat.format(lowestDollarValue) 
                   + "." + lowestCentValue);
   
    
   }//main method end
   
/*
                  Algorithm
   readSalesInput(String stringInput, File nameData)
     Scanner input <-- new Scanner using stringInput
     Scanner nameInput <-- new Scanner using nameData
     String personID <-- String value for next token from input
     String checkID <-- String value for next line from nameInput
     
     while checkID does not contain personID
       if nameInput has a next line
         checkID <-- String value for next line from nameInput
       else
         print "Error: Missing ID number in name data."
         exit the program

     Scanner personNameInput <-- new Scanner usingcheckID
     call next on personNameInput to skip ID number
     String personName <-- trimmed String value for the next line from personNameInput
     return personName           
*/

/*
                   Data Table
Variable or Constant          Purpose
____________________          _________________________________________
stringInput                   String parameter of readSalesInput
nameData                      File paramater of readSalesInput
Scanner input                 Scanner using String stringInput
Scanner nameInput             Scanner using File nameData
String personID               ID number of person
String checkID                Line with ID numbers and names of salepersons
Scanner personNameInput       Scanner using checkID
String personName             Name of person that is on same line as the 
                                inputed ID number               
*/
  
   public static String readSalesInput(String stringInput, File nameData) 
                                        throws Exception
   {
      Scanner input = new Scanner(stringInput);
      Scanner nameInput = new Scanner(nameData);
      String personID = input.next().toString();
      String checkID = nameInput.nextLine().toString();
      while (!checkID.contains(personID))
      {
         if(nameInput.hasNextLine())
            checkID = nameInput.nextLine().toString();
         else
         {
            System.out.println("Error: Missing ID number in name data.");
            System.exit(0);
         } 
      }
      Scanner personNameInput = new Scanner(checkID);
      personNameInput.next();
      String personName = personNameInput.nextLine().toString().trim();
      return personName;
   }//readSalesInput method end
   
/*
                  Algorithm
   readMoneyInput(String stringInput)
     Scanner input <-- new Scanner using stringInput
     call next on input to skip ID number
     return trimmed String value for the next line of input            
*/

/*
                   Data Table
Variable or Constant          Purpose
____________________          _________________________________________
stringInput                   String parameter for readMoneyInput
input                         Scanner using stringInput                  
*/
   
   public static String readMoneyInput(String stringInput)
   {
      Scanner input = new Scanner(stringInput);
      input.next();
      return input.nextLine().toString().trim();
   }//readMoneyInput method end
   
/*
                  Algorithm
   writeOutput(PrintStream out, String personName, String personSales)
     print to out "\nSalesperson: " + personName + "\n\tSales Amounts:"
     Scanner sales <-- new Scanner using personSales
     String pattern <-- "$#,##0"
     DecimalFormat dollarFormat <-- new DecimalFormat using pattern
     int totalSales <-- 0
       
     while sales has a next integer token
       currentSales <-- next integer token of sales
       dollarValue <-- currentSales / 100
       centValue <-- currentSales % 100
       print to out "\t\t" + dollarFormat.format(dollarValue) + "." + centValue
       totalSales <-- totalSales + currentSales
       
     int totalDollarValue <-- totalSales / 100
     int totalCentValue <-- totalSales % 100
     print to out "\tTotal Sales: " + dollarFormat.format(totalDollarValue) 
                   + "." + totalCentValue
     
     if totalSales > highestSales
       highestSales = totalSales
       highestPerson = personName
       
     if totalSales < lowestSales
       lowestSales = totalSales
       lowestPerson = personName          
*/

/*
                   Data Table
Variable or Constant          Purpose
____________________          _________________________________________
out                           PrintStream parameter for writeOutput
personName                    String parameter for writeOutput
personSales                   String parameter for writeOutput
sales                         Scanner using personSales
pattern                       String used as a pattern for decimalFormat
dollarFormat                  DecimalFormat based on String pattern
totalSales                    integer that stores total amount of all sales in cents
currentSales                  integer that stores the current sales number in cents
dollarValue                   integer that is the dollar value of currentSales
centValue                     integer that is the value of currentSales in cents minus
                                the dollar value
totalDollarValue              integer that is the dollar value of totalSales
totalCentValue                integer that is the value of totalSales in cents minus 
                                the dollar value                  
*/
   
   public static void writeOutput(PrintStream out, String personName, String personSales)
   {
      out.println("\nSalesperson: " + personName + "\n\tSales Amounts:");
      Scanner sales = new Scanner(personSales);
      String pattern = "$#,##0";
      DecimalFormat dollarFormat = new DecimalFormat(pattern);
      int totalSales = 0;
      int currentSales;
      int dollarValue;
      int centValue;
      while (sales.hasNextInt())
      {
         currentSales = sales.nextInt();
         dollarValue = currentSales / 100;
         centValue = currentSales % 100;
         out.println("\t\t" + dollarFormat.format(dollarValue) + "." + centValue); 
         totalSales = totalSales + currentSales;
      }
      int totalDollarValue = totalSales / 100;
      int totalCentValue = totalSales % 100;
      out.println("\tTotal Sales: " + dollarFormat.format(totalDollarValue) 
                   + "." + totalCentValue);
      if (totalSales > highestSales)
      {
         highestSales = totalSales;
         highestPerson = personName;
      }
      if (totalSales < lowestSales)
      {
         lowestSales = totalSales;
         lowestPerson = personName;
      }
   }//writeOutput method end

}//SalesReport class end