/*
Class that holds information specific to graduate students
*/

/*
Jacob
9/12/2016
CS101-03
*/

import java.util.*;

/*
                  Class GraduateStudent
Variable or Constant          Purpose
____________________          _________________________________________
assistType                    String to store assistantship type
*/

public class GraduateStudent extends Student
{

  private String assistType;
  
  public GraduateStudent(Scanner input)
  {
    type = "g";
    name = input.next();
    address = input.next();
    birthDate = new Date(input.next());
    phoneNumber = input.next();
    emailAddress = input.next();
    status = input.next();
    assistType = input.next();
  }
  
/*
public String toString()
    return "Graduate Student" +
           "\n\tname: " + name +
           "\n\taddress: " + address +
           "\n\tbirth date: " + birthDate.toString() +
           "\n\tphoneNumber: " + phoneNumber +
           "\n\te-mail address: " + emailAddress +
           "\n\tstatus: " + findStatus(status) +
           "\n\tassistantship type: " + 
           findAssistantship(assistType)
*/
  
  public String toString()
  {
    return "Graduate Student" +
           "\n\tname: " + name +
           "\n\taddress: " + address +
           "\n\tbirth date: " + birthDate.toString() +
           "\n\tphoneNumber: " + phoneNumber +
           "\n\te-mail address: " + emailAddress +
           "\n\tstatus: " + findStatus(status) +
           "\n\tassistantship type: " + 
           findAssistantship(assistType);
  }
  
/*
public String findStatus(String input)
  if input.compareToIgnoreCase("m") == 0
    return "master"
  else if input.compareToIgnoreCase("d") == 0
    return "doctoral"
  return "invalid"
*/
 
  public String findStatus(String input)
  {
    if (input.compareToIgnoreCase("m") == 0)
      return "master";
    else if (input.compareToIgnoreCase("d") == 0)
      return "doctoral";
    return "invalid";
  }

/*
public String findAssistantship(String input)
  if input.compareToIgnoreCase("t") == 0
    return "teaching"
  else if input.compareToIgnoreCase("r") == 0
    return "research"
  return "invalid"
*/
  
  public String findAssistantship(String input)
  {
    if (input.compareToIgnoreCase("t") == 0)
      return "teaching";
    else if (input.compareToIgnoreCase("r") == 0)
      return "research";
    return "invalid";
  }
  
/*
public static Person [] sortGraduatesByAddress(Person [] entered)
      Person [] input -> entered
      int bottom -> input.length - 1
      boolean sorted -> false
      boolean graduate -> false
      while !sorted
         for int pass -> 0; pass < input.length - 1; pass++
            for int i -> 0; i < bottom; i++
               if input[i].type.compareTo("g") = 0
                  for int k -> 1; graduate != true OR k > 100; k++
                     if input[i + k].type.compareTo("g") = 0
                        sorted -> true
                        graduate -> true
                        if ((GraduateStudent)input[i]).address.compareTo(((GraduateStudent)input[i + k]).address) > 0
                           Person temp -> input[i]
                           input[i] -> input[i + k]
                           input[i + k] -> temp
                           sorted -> false
            bottom--
         sorted -> true
      return input
*/

/*
                  Method sortGraduatesByAddress
Variable or Constant          Purpose
____________________          _________________________________________
entered                       Entered array parameter
input                         Copied person array from the entered array
bottom                        Int to store the value the sort stops at
sorted                        Boolean to see if the array is sorted
graduate                      Boolean to see if the array slot is a graduate
*/
  
  public static Person [] sortGraduatesByAddress(Person [] entered)
   {
      Person [] input = entered;
      int bottom = input.length - 1;
      boolean sorted = false;
      boolean graduate = false;
      while(!sorted)
      {
         for (int pass = 0; pass < input.length - 1; pass++)
         {
            for (int i = 0; i < bottom; i++)
            {
               if (input[i].type.compareTo("g") == 0)
               {
                  for(int k = 1; graduate != true || k > 100; k++)
                     if (input[i + k].type.compareTo("g") == 0)
                     {
                        sorted = true;
                        graduate = true;
                        if (((GraduateStudent)input[i]).address.compareTo(((GraduateStudent)input[i + k]).address) > 0)
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