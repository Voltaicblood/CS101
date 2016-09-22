/*
Class that holds information specific to undergraduate students
*/

/*
Jacob
9/12/2016
CS101-03
*/

import java.util.*;
import java.text.DecimalFormat;

public class UnderGraduateStudent extends Student
{

  public UnderGraduateStudent(Scanner input)
  {
    type = "u";
    name = input.next();
    address = input.next();
    phoneNumber = input.next();
    emailAddress = input.next();
    birthDate = new Date(input.next());
    status = input.next();
  }
  
/*
public String toString()
    return "UnderGraduate Student" +
           "\n\tname: " + name +
           "\n\taddress: " + address +
           "\n\tphoneNumber: " + phoneNumber +
           "\n\te-mail address: " + emailAddress +
           "\n\tbirth date: " + birthDate.toString() +
           "\n\tstatus: " + findStatus(status)
*/
  
  public String toString()
  {
    return "UnderGraduate Student" +
           "\n\tname: " + name +
           "\n\taddress: " + address +
           "\n\tphoneNumber: " + phoneNumber +
           "\n\te-mail address: " + emailAddress +
           "\n\tbirth date: " + birthDate.toString() +
           "\n\tstatus: " + findStatus(status);
  }
  
/*
public String findStatus(String input)
    if input.compareToIgnoreCase("f") = 0
      return "freshman"
    else if input.compareToIgnoreCase("s") = 0
      return "sophomore"
    else if input.compareToIgnoreCase("j") = 0
      return "junior"
    else if input.compareToIgnoreCase("r") = 0
      return "senior"
    return "invalid"
*/
  
  public String findStatus(String input)
  {
    if (input.compareToIgnoreCase("f") == 0)
      return "freshman";
    else if (input.compareToIgnoreCase("s") == 0)
      return "sophomore";
    else if (input.compareToIgnoreCase("j") == 0)
      return "junior";
    else if (input.compareToIgnoreCase("r") == 0)
      return "senior";
    return "invalid";
  }
  
}//People class end