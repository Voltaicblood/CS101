/*
Class that holds information specific to faculty
*/

/*
Jacob
9/12/2016
CS101-03
*/

import java.util.*;
import java.text.DecimalFormat;

/*
                  Class Faculty
Variable or Constant          Purpose
____________________          _________________________________________
officeHours                   String that store office hours
pattern                       String to stores dollar pattern
dollar                        DecimalFormat from pattern
*/

public class Faculty extends Employee
{

  private String officeHours;
  private String pattern = "$#,##0.00";
  private DecimalFormat dollar = new DecimalFormat(pattern);
  
/*
public String toString()
    return "Faculty" +
           "\n\tname: " + name +
           "\n\taddress: " + address +
           "\n\tphoneNumber: " + phoneNumber +
           "\n\te-mail address: " + emailAddress +
           "\n\toffice: " + office +
           "\n\tsalary: " + dollar.format(salary) +
           "\n\thiring date: " + hireDate.toString() +
           "\n\ttitle: " + title +
           "\n\toffice hours: " + officeHours
*/
  
  public Faculty(Scanner input)
  {
    type = "f";
    name = input.next();
    address = input.next();
    phoneNumber = input.next();
    emailAddress = input.next();
    office = input.next();
    salary = input.nextDouble();
    hireDate = new Date(input.next());
    title = input.next();
    officeHours = input.next();
  }
  
  public String toString()
  {
    return "Faculty" +
           "\n\tname: " + name +
           "\n\taddress: " + address +
           "\n\tphoneNumber: " + phoneNumber +
           "\n\te-mail address: " + emailAddress +
           "\n\toffice: " + office +
           "\n\tsalary: " + dollar.format(salary) +
           "\n\thiring date: " + hireDate.toString() +
           "\n\ttitle: " + title +
           "\n\toffice hours: " + officeHours;
  }

  
}//People class end