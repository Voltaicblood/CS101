/*
Creates an array that represents a sudoku grid
*/

/*
Jacob Austin
9/6/2016
CS101-03
*/

import java.util.*;

public class SudokuGrid
{
/*
                  Class SudokuGrid
Variable or Constant          Purpose
____________________          _________________________________________
grid                          int 2 dimensional array used for sudoku grid
initgrid                      matching 2D boolean grid, tracks inital values
*/

   private int [][] grid;
   private boolean [][] initGrid;
   
   public SudokuGrid()
   {
      grid = new int [9][9];
      initGrid = new boolean [9][9];
   }
   
   /*
Algorithm

public String toString()
  gridString -> " "
  rowCount = 0
  threeRowCount = 0
  for int i < 9, i++
    columnCount -> 0
	subSectionCount -> 0
	for int k < 9, k++
	  if grid at i,k = 0
	    add "  " to gridString
	  else
	    add grid at i,k + " "
	  columnCount++
	  if columnCount = 3 AND subSectionCount != 2
	    columnCount -> 0
		subSectionCount++
		add "| " to gridString
    rowCount++
	if rowCount = 3 AND threeRowCount != 2
	  rowCount = 0
	  threeRowCount++
	  add "\n-------+-------+-------\n " to gridString
	else
	  add "\n " to gridString
  return gridString
  
                  Method toString
Variable or Constant          Purpose
____________________          _________________________________________
gridString                    String to represent sudoku grid
rowCount                      int to track rows
threeRowCount                 int to track sets of 3 rows
columnCount                   int to track columns
subSectionCount               int to track sets of 3 columns
*/
   
   public String toString()
   {
      String gridString = " ";
      int rowCount = 0;
      int threeRowCount = 0;
      for(int i = 0;i < 9;i++)
      {
         int columnCount = 0;
         int subSectionCount = 0;
         for(int k = 0;k < 9;k++)
         {
            if (grid[i][k] == 0)
               gridString += "  ";
            else
            {
               gridString += grid [i][k] + " ";
            }
            columnCount++;
            if (columnCount == 3 && subSectionCount != 2)
            {
               columnCount = 0;
               subSectionCount++;
               gridString += "| ";
            }
         }
         rowCount++;
         if (rowCount == 3 && threeRowCount != 2)
         {
            rowCount = 0;
            threeRowCount++;
            gridString += "\n-------+-------+-------\n ";
         }
         else
            gridString += "\n ";
      }
      return gridString;
   }
   
/*
Algorithm

public void addInitial(int row, int column, int value)
  grid at row,column -> value
  initGrid at row,column -> true
*/
   
   public void addInitial(int row, int column, int value)
   {
      grid [row][column] = value;
      initGrid [row][column] = true;
   }
   
/*
Algorithm

public void addGuess(int row, int column, int value)
  if !initGrid at row,column
    grid at row,column -> value
*/
   
   public int addGuess(int row, int column, int value)
   {
      if (!initGrid [row][column])
      {
         grid [row][column] = value;
         return 1;
      }
      else
        return -1;
   }
   
/*
Algorithm

public boolean checkPuzzle()
  if (call isFull)
    for i < 9, i++
	  for k < 9, k++
	    boolean [] check -> call getAllowedValues(i, k)
		if !check at (grid at i,k) - 1
		  return false
  else
    return false
  return true  
*/
   
   public boolean checkPuzzle()
   {
      if (isFull())
      {
         for(int i = 0; i < 9; i++)
         {
            for(int k = 0; k < 9; i++)
            {
               boolean [] check = getAllowedValues(i, k);
               if (!check[grid[i][k] - 1])
                  return false;
            }
         }
      }
      else
         return false;
      return true;
   }

   public int getValueIn(int row, int column)
   {
      return grid [row][column];
   }
   
/*
Algorithm

public boolean [] getAllowedValues(int row, int column)
  boolean [] allowedValues = new boolean [9]
  call Arrays.fill(allowedValues, true)
  for i < 9, i++
    if  grid at row, i != 0 AND grid at row, i != grid at row, column
	  allowedValues at (grid at row, i) - 1 -> false
  for i < 9, i++
    if grid at i, column != 0 AND grid at i, column != grid at row, column
      allowedValues at (grid at i, column) - 1 -> false
  int subsectionNumber -> call findSubsection(row, column)
  int [][] subsection -> call checkSubsection(subsectionNumber)
  for i < 3, i++
    for k < 3, k++
		if subsection at k,i != 0 AND subsection at k,i !+ grid at row,column
		  allowedValues at (subsection at k,i) - 1 -> false
  return allowedValues
  
                  Method getAllowedValues
Variable or Constant          Purpose
____________________          _________________________________________
allowedValues                 boolean array that tracks allowed numbers
subsectionNumber              int to track subsection
subsection                    int 2D array to represent subsection
*/  
   
   public boolean [] getAllowedValues(int row, int column)
   {
      boolean [] allowedValues = new boolean [9];
      Arrays.fill(allowedValues, true);
      for(int i = 0; i < 9; i++)
      {
         if (grid [row][i] != 0 && grid[row][i] != grid[row][column])
         {
            allowedValues[(grid [row][i]) - 1] = false;
         }
      }
      for(int i = 0; i < 9; i++)
      {
         if (grid [i][column] != 0 && grid[i][column] != grid[row][column])
         {
            allowedValues[(grid [i][column]) - 1] = false;
         }
      }
      int subsectionNumber = findSubsection(row, column);
      int [][] subsection = checkSubsection(subsectionNumber);
      for(int i = 0; i < 3; i++)
      {
         for(int k = 0; k < 3; k++)
         {
            if (subsection [k][i] != 0 && subsection[k][i] != grid[row][column])
            {
               allowedValues[(subsection [k][i]) - 1] = false;
            }
         }
      }
      return allowedValues;
   }
   
/*
Algorithm

public int findSubsection(int row, int column)
  int columnSub -> call findColumnSub(column)
  int subsection -> 0
  if (row + 3)/3 = 1
    if columnSub = 1
	  subSection -> 1
	else if columnSub = 2
	  subSection -> 2
	else if columnSub = 3
	  subSection -> 3
  if (row + 3)/3 = 2
    if columnSub = 1
	  subsection -> 4
	else if columnSub = 2
	  subsection -> 5
    else if columnSub = 3
	  subsection -> 6
  if (row + 3)/3 = 3
    if columnSub = 1
	  subsection -> 7
	else if columnSub = 2
	  subsection -> 8
	else if columnSub = 3
	  subsection -> 9
  return subsection;
  
                  Method findSubsection
Variable or Constant          Purpose
____________________          _________________________________________
columnSub                     int to track column subsections
subSection                    int to track subsection
*/
   
   public int findSubsection(int row, int column)
   {
      int columnSub = findColumnSub(column);
      int subSection = 0;
      if ((row + 3)/ 3 == 1)
      {
         if (columnSub == 1)
         {
            subSection = 1;
         }
         else if (columnSub == 2)
         {
            subSection = 2;
         }
         else if (columnSub == 3)
         {
            subSection = 3;
         }
      }
      else if ((row + 3)/ 3 == 2)
      {
         if (columnSub == 1)
         {
            subSection = 4;
         }
         else if (columnSub == 2)
         {
            subSection = 5;
         }
         else if (columnSub == 3)
         {
            subSection = 6;
         }
      }
      else if ((row + 3)/ 3 == 3)
      {
         if (columnSub == 1)
         {
            subSection = 7;
         }
         else if (columnSub == 2)
         {
            subSection = 8;
         }
         else if (columnSub == 3)
         {
            subSection = 9;
         }
      }
      return subSection;
   }
   
/*
Algorithm

public int [][] checkSubsection(int subsection)
  int [][] subsectionArray -> new int [3][3]
  int row -> 0
  int column -> 0
  switch(subsection)
    case 1:
	  row -> 0
	  column -> 0
	  break
	case 2:
	  row -> 0
	  column -> 3
	  break  
	case 3:
	  row -> 0
	  column -> 6
	  break  
    case 4:
	  row -> 3
	  column -> 0
	  break
	case 5:
	  row -> 3
	  column -> 3
	  break
	case 6:
	  row -> 3
	  column -> 6
	  break
	case 7:
	  row -> 6
	  column -> 0
	  break
	case 8:
	  row -> 6
	  column -> 3
	  break
	case 9:
	  row -> 6
	  column -> 6
	  break
  return fill3Array(row, column)
  
                  Method checkSubsection
Variable or Constant          Purpose
____________________          _________________________________________
subsectionArray               int 2D array to represent subsection
row                           int to track row value
column                        int to track column value
*/
   
   public int [][] checkSubsection(int subsection)
   {
      int [][] subsectionArray = new int [3][3];
      int row = 0;
      int column = 0;
      switch(subsection)
      {
         case 1:
            row = 0;
            column = 0;
            break;
         case 2:
            row = 0;
            column = 3;
            break;
         case 3:
            row = 0;
            column = 6;
            break;
         case 4:
            row = 3;
            column = 0;
            break;
         case 5:
            row = 3;
            column = 3;
            break;
         case 6:
            row = 3;
            column = 6;
            break;
         case 7:
            row = 6;
            column = 0;
            break;
         case 8:
            row = 6;
            column = 3;
            break;
         case 9:
            row = 6;
            column = 6;
            break;
      }
      return fill3Array(row, column);
   }
   
/*
Algorithm

public int [][] fill3Array(int row, int column)
  int [][] filledArray -> new int [3][3]
  for i < 3, i++
    for k < 3, k++
	  filledArray at i,k -> grid at (row + 1), (column + k)
  return filledArray
  
                  Method fill3Array
Variable or Constant          Purpose
____________________          _________________________________________
filledArray                   int 3x3 2D array to be filled
*/
   
   public int [][] fill3Array(int row, int column)
   {
      int [][] filledArray = new int [3][3];
      for(int i = 0; i < 3; i++)
      {
         for(int k = 0; k <3; k++)
         {
            filledArray[i][k] = grid[row + i][column + k];
         }
      }
      return filledArray;
   } 
   
/*
Algorithm

public int findColumnSub(int column)
  if (column + 3)/3 = 1
    return 1
  if (column + 3)/3 = 2
    return 2
  if (column + 3)/3 = 3
    return 3
  else
    return -1;
*/
   
   public int findColumnSub(int column)
   {
      if ((column + 3)/ 3 == 1)
         return 1;
      else if ((column + 3)/ 3 == 2)
         return 2;
      else if ((column + 3)/ 3 == 3)
         return 3;
      else 
         return -1;
   }
   
/*
Algorithm

public boolean isFull()
  for i < 9, i++
    for k < 9, k++
	  if grid at i,k = 0
	    return false
  return true
*/
   
   public boolean isFull()
   {
      for(int i = 0; i < 9; i++)
      {
         for(int k = 0; k < 9; k++)
         {
            if (grid [i][k] == 0)
               return false;
         }
      }
      return true;
   }
   
/*
Algorithm

public void reset()
  for i < 9, i++
    for i < k, k++
	  if initGrid at i,K = false
	    grid at i,k -> 0
*/
   
   public void reset()
   {
      for(int i = 0;i < 9;i++)
      {
         for(int k = 0;k < 9;k++)
         {
            if (!initGrid [i][k])
               grid[i][k] = 0;
         }
      }
   }

}//SudokuGrid class end