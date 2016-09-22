/*
Abstract superclass for rest of employee hierarchy
*/

/*
Jacob
9/12/2016
CS101-03
*/

//Any imports replace this comment

/*
                  Class Employee
Variable or Constant          Purpose
____________________          _________________________________________
office                        String to store office name
salary                        Double to store salary
hireDate                      Date to store hire date
title                         String to store title
*/

public abstract class Employee extends Person
{

   protected String office;
   protected double salary;
   protected Date hireDate;
   protected String title;
   
/*
public static Person [] sortEmployeesBySalary(Person [] entered)
      Person [] input -> entered
      int bottom -> input.length - 1
      boolean sorted -> false
      boolean staff -> false
      while !sorted
         for int pass -> 0; pass < input.length - 1; pass++
            for int i -> 0; i < bottom; i++
               if input[i].type.compareTo("s") = 0
                  staff -> false
                  for int k -> 1; staff != true OR k > 100; k++
                     if input[i + k].type.compareTo("s") = 0
                        sorted -> true
                        staff -> true
                        if ((Staff)input[i]).salary < ((Staff)input[i + k]).salary
                           Person temp -> input[i]
                           input[i] -> input[i + k]
                           input[i + k] -> temp
                           sorted -> false
                     else if (input[i + k].type.compareTo("f") = 0)
                        sorted -> true
                        staff -> true
                        if ((Staff)input[i]).salary < ((Faculty)input[i + k]).salary
                           Person temp -> input[i]
                           input[i] -> input[i + k]
                           input[i + k] -> temp
                           sorted -> false
               else if input[i].type.compareTo("f") = 0
                  staff -> false
                  for int k = 1; staff != true || k > 100; k++
                     if input[i + k].type.compareTo("f") = 0
                        sorted -> true
                        staff -> true
                        if ((Faculty)input[i]).salary < ((Faculty)input[i + k]).salary
                           Person temp -> input[i]
                           input[i] -> input[i + k]
                           input[i + k] -> temp
                           sorted -> false
                     else if input[i + k].type.compareTo("s") = 0
                        sorted -> true
                        staff -> true
                        if ((Faculty)input[i]).salary < ((Staff)input[i + k]).salary
                           Person temp -> input[i]
                           input[i] -> input[i + k]
                           input[i + k] -> temp
                           sorted -> false

            bottom--
         sorted -> true
      return input
*/

/*
                  Method sortEmployeesBySalary
Variable or Constant          Purpose
____________________          _________________________________________
entered                       Entered array parameter
input                         Copied person array from the entered array
bottom                        Int to store the value the sort stops at
sorted                        Boolean to see if the array is sorted
staff                         Boolean to see if the array slot is an employee
*/
  
   public static Person [] sortEmployeesBySalary(Person [] entered)
   {
      Person [] input = entered;
      int bottom = input.length - 1;
      boolean sorted = false;
      boolean staff = false;
      while(!sorted)
      {
         for (int pass = 0; pass < input.length - 1; pass++)
         {
            for (int i = 0; i < bottom; i++)
            {
               if (input[i].type.compareTo("s") == 0)
               {
                  staff = false;
                  for(int k = 1; staff != true || k > 100; k++)
                     if (input[i + k].type.compareTo("s") == 0)
                     {
                        sorted = true;
                        staff = true;
                        if (((Staff)input[i]).salary < ((Staff)input[i + k]).salary)
                        {
                           Person temp = input[i];
                           input[i] = input[i + k];
                           input[i + k] = temp;
                           sorted = false;
                        }
                     }
                     else if (input[i + k].type.compareTo("f") == 0)
                     {
                        sorted = true;
                        staff = true;
                        if (((Staff)input[i]).salary < ((Faculty)input[i + k]).salary)
                        {
                           Person temp = input[i];
                           input[i] = input[i + k];
                           input[i + k] = temp;
                           sorted = false;
                        }
                        
                     }
               }
               else if (input[i].type.compareTo("f") == 0)
               {
                  staff = false;
                  for(int k = 1; staff != true || k > 100; k++)
                     if (input[i + k].type.compareTo("f") == 0)
                     {
                        sorted = true;
                        staff = true;
                        if (((Faculty)input[i]).salary < ((Faculty)input[i + k]).salary)
                        {
                           Person temp = input[i];
                           input[i] = input[i + k];
                           input[i + k] = temp;
                           sorted = false;
                        }
                        
                     }
                     else if (input[i + k].type.compareTo("s") == 0)
                     {
                        sorted = true;
                        staff = true;
                        if (((Faculty)input[i]).salary < ((Staff)input[i + k]).salary)
                        {
                           Person temp = input[i];
                           input[i] = input[i + k];
                           input[i + k] = temp;
                           sorted = false;
                        }
                        
                     }
               }
            }
            bottom--;
         }
         sorted = true;
      }
      return input;
   }
  
}//People class end