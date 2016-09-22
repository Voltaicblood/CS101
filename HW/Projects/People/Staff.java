/*
Class that holds information specific to staff
*/

/*
Jacob
9/12/2016
CS101-03
*/

import java.util.*;
import java.text.DecimalFormat;

/*
                  Class Staff
Variable or Constant          Purpose
____________________          _________________________________________
supervisorName                String to store supervisor's name
pattern                       String to store dollar pattern
dollar                        DecimalFormat based off of pattern
*/

public class Staff extends Employee
{

   private String supervisorName;
   private String pattern = "$#,##0.00";
   private DecimalFormat dollar = new DecimalFormat(pattern);
  
   public Staff(Scanner input)
   {
      type = "s";
      name = input.next();
      address = input.next();
      title = input.next();
      phoneNumber = input.next();
      emailAddress = input.next();
      office = input.next();
      salary = input.nextDouble();
      hireDate = new Date(input.next());
      supervisorName = input.next();
   }
   
/*
public String toString()
      return "Staff" +
           "\n\tname: " + name +
           "\n\taddress: " + address +
           "\n\ttitle: " + title +
           "\n\tphoneNumber: " + phoneNumber +
           "\n\te-mail address: " + emailAddress +
           "\n\toffice: " + office +
           "\n\tsalary: " + dollar.format(salary) +
           "\n\thiring date: " + hireDate.toString() +
           "\n\tsupervisor name: " + supervisorName
*/
  
   public String toString()
   {
      return "Staff" +
           "\n\tname: " + name +
           "\n\taddress: " + address +
           "\n\ttitle: " + title +
           "\n\tphoneNumber: " + phoneNumber +
           "\n\te-mail address: " + emailAddress +
           "\n\toffice: " + office +
           "\n\tsalary: " + dollar.format(salary) +
           "\n\thiring date: " + hireDate.toString() +
           "\n\tsupervisor name: " + supervisorName;
   }

/*
public static Person [] sortStaffByDate(Person [] entered)
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
                        if ((Staff)input[i]).hireDate.compareTo(((Staff)input[i + k]).hireDate) > 0
                           Person temp -> input[i]
                           input[i] -> input[i + k]
                           input[i + k] -> temp
                           sorted -> false
            bottom--
        sorted -> true
      return input
*/

/*
                  Method sortStaffbyDate
Variable or Constant          Purpose
____________________          _________________________________________
entered                       Entered array parameter
input                         Copied person array from the entered array
bottom                        Int to store the value the sort stops at
sorted                        Boolean to see if the array is sorted
staff                         Boolean to see if the array slot is a staff
*/
  
   public static Person [] sortStaffByDate(Person [] entered)
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
                        if (((Staff)input[i]).hireDate.compareTo(((Staff)input[i + k]).hireDate) > 0)
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