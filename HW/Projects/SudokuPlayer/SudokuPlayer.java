/*
Uses the SudokuGrid class to play a game
of Sudoku
*/

/*
Jacob Austin
9/9/2016
CS101-03
*/

import java.util.*;

public class SudokuPlayer
{

/*
Algorithm

public static void main(String [] args)
  Sudokugrid g = new SudokuGrid()
  print "Please enter in the initial values. This can " +
        "be doneby entering\nin [row] [column] [value]." +
        " You must enter in 15 initial values.\nRow, column," +
        " and values must be between 1-9.");
   call setInitialValues(g)
   call playSudoku(g)
   
                  Method main
Variable or Constant          Purpose
____________________          _________________________________________
g                             SudokuGrid for the player
*/

   public static void main(String [] args)
   {
      SudokuGrid g = new SudokuGrid();
      System.out.println("Please enter in the initial values. This can " +
                          "be doneby entering\nin [row] [column] [value]." +
                          " You must enter in 15 initial values.\nRow, column," +
                          " and values must be between 1-9.");
      setInitialValues(g);
      playSudoku(g);
   }
   
/*
Algoritm

public static void setInitialValues(SudokuGrid g)
  Scanner in -> new Scanner(System.in)
  int initialValuesLeft -> 15
  while initialValuesLeft > 0
    print "Initial values left: " + initialValuesLeft
    String initialValueEntered -> in.nextLine().toString()
    Scanner enteredValue -> new Scanner(initialValueEntered)
    int row -> -1
    int column -> -1
    int value -> -1
    int count -> 0
    while enteredValue.hasNextInt()
      count++
      if count = 1
	    row -> enteredValue.nextInt() - 1
        else if count = 2
          column -> enteredValue.nextInt() - 1
        else if count = 3
          value -> enteredValue.nextInt()
    if row > -1 AND row < 9 AND column > -1 AND column < 9 AND value > 0 AND value < 10
      boolean [] allowedValues -> call g.getAllowedValues(row, column)
      if !g.initGrid[row][column]
        if allowedValues[value - 1]
          call g.addInitial(row, column, value);
          initialValuesLeft--
        else
          print "Value conflicts with other initial values."
      else
        if allowedValues[value - 1]
          call g.addInitial(row, column, value)
    else
      print "Row, column, or value is not within 1-9"
      print call g.toString()
      
                  Method setInitialValues
Variable or Constant          Purpose
____________________          _________________________________________
in                            Scanner for input from user
initialValuesLeft             int to track remaining initial values
initialValueEntered           String to track values entered
enteredValue                  Scanner to sort values entered
row                           int to track row value entered
column                        int to track column value entered
value                         int to track value entered
count                         int to track amount of while loops
allowedValues                 boolean [] to track allowed values
*/
   
   public static void setInitialValues(SudokuGrid g)
   {
      Scanner in = new Scanner(System.in);
      int initialValuesLeft = 15;
      while(initialValuesLeft > 0)
      {
         System.out.println("Initial values left: " + initialValuesLeft);
         String initialValueEntered = in.nextLine().toString();
         Scanner enteredValue = new Scanner(initialValueEntered);
         int row = -1;
         int column = -1;
         int value = -1;
         int count = 0;
         while(enteredValue.hasNextInt())
         {
            count++;
            if (count == 1)
            {
               row = enteredValue.nextInt() - 1;
            }
            else if (count == 2)
            {
               column = enteredValue.nextInt() - 1;
            }
            else if (count == 3)
            {
               value = enteredValue.nextInt();
            } 
         }
         if (row > -1 && row < 9 && column > -1 && column < 9 && value > 0 && value < 10)
         {
            boolean [] allowedValues = g.getAllowedValues(row, column);
            if (!g.initGrid[row][column])
            {
               if (allowedValues[value - 1])
               {
                  g.addInitial(row, column, value);
                  initialValuesLeft--;
               }
               else
                  System.out.println("Value conflicts with other initial values.");
            }
            else
               if (allowedValues[value - 1])
               {
                  g.addInitial(row, column, value);
               }
         }
         else
            System.out.println("Row, column, or value is not within 1-9");
         System.out.println(g.toString());
      }
   }
   
/*
Algorithm

public static void playSudoku(SudokuGrid g)
  print "You can now play the game."
  String inputString = "";
  while call g.checkPuzzle() = false
    print "Enter 1 for " +
          "current puzzle state, enter 2 to guess\nat " +
          "at a value, enter 3 to see allowed values " +
          "for a cell.\nEnter reset to reset the puzzle."
    Scanner in -> new Scanner(System.in)
	inputString -> in.next().toString()
	if inputString equals 1
	  print call g.toString
	else if inputString euqls 2
	  call inputGuess(g)
	else if inputString equals 3
	  call inputAllowedCell(g)
	else if inputString equals reset
	  call g.reset
	else
	  print "Incorrect command."
  print call g.toString()
  
                  Method playSudoku
Variable or Constant          Purpose
____________________          _________________________________________
inputString                   String for inputted values
in                            Scanner for user input
*/
   
   public static void playSudoku(SudokuGrid g)
   {
      System.out.println("You can now play the game.");
      String inputString = "";
      while (!g.checkPuzzle())
      {
         System.out.println("Enter 1 for " +
                            "current puzzle state, enter 2 to guess\nat " +
                            "at a value, enter 3 to see allowed values " +
                            "for a cell.\nEnter reset to reset the puzzle.");
         Scanner in = new Scanner(System.in);                  
         inputString = in.next().toString();
         if (inputString.equals("1"))
         {
            System.out.println(g.toString());
         }
         else if (inputString.equals("2"))
         {
            inputGuess(g); 
         }
         else if (inputString.equals("3"))
         {
            inputAllowedCell(g);
         }
         else if (inputString.equals("reset"))
            g.reset();
         else
            System.out.println("Incorrect command.");
      }
      System.out.println(g.toString());                  
   }
   
/*
Algorithm

public static void inputGuess(SudokuGrid g)
    print "Please enter in a guess. This can " +
          "be done by entering\nin [row] [column] [value]." +
          " You cannot replace an initial value.\nRow, column," +
          " and values must be between 1-9."
    Scanner in -> new Scanner(System.in)
    String guessedValueEntered -> in.nextLine().toString()
    Scanner enteredValue -> new Scanner(guessedValueEntered)
    int row -> -1
    int column -> -1
    int value -> -1
    int count -> 0
    while enteredValue.hasNextInt()
      count++
      if count = 1
        row -> enteredValue.nextInt() - 1
      else if count = 2
        column -> enteredValue.nextInt() - 1
      else if count = 3
        value -> enteredValue.nextInt()
    if row > -1 AND row < 9 AND column > -1 AND column < 9 AND value > 0 AND value < 10
      boolean [] allowedValues -> call g.getAllowedValues(row, column)
      if !g.initGrid at row,column
        call g.addGuess(row, column, value);
      else
        print "You cannot replace initial values."
    else
      print "Row, column, or value is not within 1-9"
      
                  Method inputGuess
Variable or Constant          Purpose
____________________          _________________________________________
in                            Scanner for user input
guessedValueEntered           String for entered values
enteredValue                  Scanner for seperating values entered                           
row                           int to track row value entered
column                        int to track column value entered
value                         int to track value entered
count                         int to track amount of while loops
allowedValues                 boolean [] to track allowed values
*/
   
   public static void inputGuess(SudokuGrid g)
   {
      System.out.println("Please enter in a guess. This can " +
                         "be done by entering\nin [row] [column] [value]." +
                         " You cannot replace an initial value.\nRow, column," +
                         " and values must be between 1-9.");
      Scanner in = new Scanner(System.in);
      String guessedValueEntered = in.nextLine().toString();
      Scanner enteredValue = new Scanner(guessedValueEntered);
      int row = -1;
      int column = -1;
      int value = -1;
      int count = 0;
      while(enteredValue.hasNextInt())
      {
         count++;
         if (count == 1)
         {
            row = enteredValue.nextInt() - 1;
         }
         else if (count == 2)
         {
            column = enteredValue.nextInt() - 1;
         }
         else if (count == 3)
         {
            value = enteredValue.nextInt();
         } 
      }
      if (row > -1 && row < 9 && column > -1 && column < 9 && value > 0 && value < 10)
      {
         boolean [] allowedValues = g.getAllowedValues(row, column);
         if (!g.initGrid[row][column])
         {
            g.addGuess(row, column, value);
         }
         else
            System.out.println("You cannot replace initial values.");
      }
      else
         System.out.println("Row, column, or value is not within 1-9");
   }
   
/*
Algorithm

public static void inputAllowedCell(SudokuGrid g)
    print "Please enter in a cell. This can " +
          "be done by entering\nin [row] [column]." +
          " Row, column," +
          " must be between 1-9."
    Scanner in -> new Scanner(System.in)      
    String cellValueEntered -> in.nextLine().toString()
    Scanner enteredValue -> new Scanner(cellValueEntered)
    int row -> -1
    int column -> -1
    int count -> 0
    while enteredValue.hasNextInt()
         count++
         if count = 1
            row -> enteredValue.nextInt() - 1
         else if count = 2
            column -> enteredValue.nextInt() - 1
      if row > -1 && row < 9 && column > -1 && column < 9
         boolean [] allowedValues -> g.getAllowedValues(column, row)
         String allowedString -> "Allowed values: "
         for  i < 9, i++
            if allowedValues at i
               add (i + 1) + " " to allowedString
         print allowedString
      else
         print "Row or column is not within 1-9"
         
                  Method inputAllowedCell
Variable or Constant          Purpose
____________________          _________________________________________
in                            Scanner for user input
cellValueEntered              String for entered values
enteredValue                  Scanner for seperating values entered                           
row                           int to track row value entered
column                        int to track column value entered
count                         int to track amount of while loops
allowedValues                 boolean [] to track allowed values
allowedString                 String to represent allowed values
*/
   
   public static void inputAllowedCell(SudokuGrid g)
   {
      System.out.println("Please enter in a cell. This can " +
                         "be done by entering\nin [row] [column]." +
                         " Row, column," +
                         " must be between 1-9.");
      Scanner in = new Scanner(System.in);      
      String cellValueEntered = in.nextLine().toString();
      Scanner enteredValue = new Scanner(cellValueEntered);
      int row = -1;
      int column = -1;
      int count = 0;
      while(enteredValue.hasNextInt())
      {
         count++;
         if (count == 1)
         {
            row = enteredValue.nextInt() - 1;
         }
         else if (count == 2)
         {
            column = enteredValue.nextInt() - 1;
         }
      }
      if (row > -1 && row < 9 && column > -1 && column < 9)
      {
         boolean [] allowedValues = g.getAllowedValues(column, row);
         String allowedString = "Allowed values: ";
         for(int i = 0; i < 9; i++)
         {
            if (allowedValues[i])
               allowedString += (i + 1) + " ";
         }
         System.out.println(allowedString);
      }
      else
         System.out.println("Row or column is not within 1-9");
   }
   

}//SudokuPlayer class end