/*
Class that inputs data for person and outputs
sorted information from that input
*/

/*
Jacob
9/12/2016
CS101-03
*/

import java.util.*;
import java.io.*;

/*
                  Class PersonDriver
Variable or Constant          Purpose
____________________          _________________________________________
length                        Length of the Person array
*/

public class PersonDriver
{

  private static int length = 0;
  
/*
public static void main(String [] args) throws Exception
    String inputFileName -> args[0]
    String outputFileName -> args[1]
    File inputFile -> new File (inputFileName)
    File outputFile -> new File (outputFileName)
    Scanner input -> new Scanner(inputFile)
    String echo -> new Scanner(inputFile).useDelimiter("\\Z").next()
    PrintStream out -> new PrintStream(outputFile)
    String [] inputArray -> call createInputArray(input)
    Person [] personArray -> call createPersonArray(inputArray);
    out.print "Project 6 Database Output File" +
              "\nJacob Austin, CS-101-03" +
              "\n\nEcho print of input: \n" +
              echo +
              "\n\nEntire database sorted by name: \n" +
              Person.arrayToString(Person.sortByName(personArray), "n") +
              "\nStaff sorted by date: \n" +
              Person.arrayToString(Staff.sortStaffByDate(personArray), "s") +
              "\nEmployees sorted by salary: \n" +
              Person.arrayToString(Employee.sortEmployeesBySalary(personArray), "e") +
              "\nGraduate students sorted by address: \n" +
              Person.arrayToString(GraduateStudent.sortGraduatesByAddress(personArray), "g")
*/

/*
                  Method main
Variable or Constant          Purpose
____________________          _________________________________________
inputFileName                 String of the input file
outputFileName                String of the output file
inputFile                     File of the input file
outputFile                    File of the output file
input                         Scanner of the input file
echo                          String of the input file
out                           Printstream of the output file
inputArray                    String array built from input file
personArray                   Person array built from String array
*/

  public static void main(String [] args) throws Exception
  {
    String inputFileName = args[0];
    String outputFileName = args[1];
    File inputFile = new File (inputFileName);
    File outputFile = new File (outputFileName);
    Scanner input = new Scanner(inputFile);
    String echo = new Scanner(inputFile).useDelimiter("\\Z").next();
    PrintStream out = new PrintStream(outputFile);
    String [] inputArray = createInputArray(input);
    Person [] personArray = createPersonArray(inputArray);
    out.print("Project 6 Database Output File" +
              "\nJacob Austin, CS-101-03" +
              "\n\nEcho print of input: \n" +
              echo +
              "\n\nEntire database sorted by name: \n" +
              Person.arrayToString(Person.sortByName(personArray), "n") +
              "\nStaff sorted by date: \n" +
              Person.arrayToString(Staff.sortStaffByDate(personArray), "s") +
              "\nEmployees sorted by salary: \n" +
              Person.arrayToString(Employee.sortEmployeesBySalary(personArray), "e") +
              "\nGraduate students sorted by address: \n" +
              Person.arrayToString(GraduateStudent.sortGraduatesByAddress(personArray), "g"));
  }
  
/*
public static String [] createInputArray(Scanner input)
  String [] inputArray -> new String [100]
  for int i -> 0; input.hasNextLine(); i++
    inputArray[i] -> input.nextLine().toString()
    length++
  return inputArray
*/

/*
                  Method createInputArray
Variable or Constant          Purpose
____________________          _________________________________________
input                         Scanner for the file input
inputArray                    Array built from file input
*/

  public static String [] createInputArray(Scanner input)
  {
    String [] inputArray = new String [100];
    for(int i = 0; input.hasNextLine(); i++)
    {
      inputArray[i] = input.nextLine().toString();
      length++;
    }
    return inputArray;
  }
  
/*
public static Person [] createPersonArray(String [] input)
    Person [] personArray -> new Person [length];
    String poundBreak -> "\\s*#\\s*";
    int i -> 0;
    for i -> 0; input[i] != null;i++
      Scanner reader -> new Scanner(input[i]).useDelimiter("#")
      String typetest -> reader.next()
      if typetest.compareTo("u") = 0
        personArray[i] -> new UnderGraduateStudent(reader)
      else if typetest.compareTo("g") = 0
        personArray[i] -> new GraduateStudent(reader)
      else if typetest.compareTo("f") = 0
        personArray[i] -> new Faculty(reader)
      else if typetest.compareTo("s") = 0
        personArray[i] -> new Staff(reader)
      else
        System.out.println "Invalid input on line: " + (i + 1)
    return personArray
*/

/*
                  Method createPersonArray
Variable or Constant          Purpose
____________________          _________________________________________
input                         String array from file input
personArray                   Array built from string array
poundBreak                    String for pound delimiter
reader                        Scanner that reads string array
*/
  
  public static Person [] createPersonArray(String [] input)
  {
    Person [] personArray = new Person [length];
    String poundBreak = "\\s*#\\s*";
    int i = 0;
    for(i = 0; input[i] != null;i++)
    {
      Scanner reader = new Scanner(input[i]).useDelimiter("#");
      String typetest = reader.next();
      if (typetest.compareTo("u") == 0) 
        personArray[i] = new UnderGraduateStudent(reader);
      else if (typetest.compareTo("g") == 0)
        personArray[i] = new GraduateStudent(reader); 
      else if (typetest.compareTo("f") == 0)
        personArray[i] = new Faculty(reader);
      else if (typetest.compareTo("s") == 0)
        personArray[i] = new Staff(reader);
      else
        System.out.println("Invalid input on line: " + (i + 1));
    }
    return personArray;
  }

}//People class end