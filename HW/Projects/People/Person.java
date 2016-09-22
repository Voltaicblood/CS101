/*
Abstract superclass for rest of student/employee hierarchy
*/

/*
Jacob
9/12/2016
CS101-03
*/

//Any imports replace this comment

/*
                  Class Person
Variable or Constant          Purpose
____________________          _________________________________________
type                          String to store type of person
name                          String to store name of person
address                       String to store address
phoneNumber                   String to store phone number
emailAddress                  String to store email address
*/

public abstract class Person
{

  protected String type;
  protected String name;
  protected String address;
  protected String phoneNumber;
  protected String emailAddress;
  
/*
  public static Person [] sortByName(Person [] entered)
    Person [] input -> entered
    int bottom -> input.length - 1
    boolean sorted -> false
    while !sorted
      for int pass -> 0; pass < input.length - 1; pass++
        for int i -> 0; i < bottom; i++
          sorted -> true;
          if input[i].name.compareToIgnoreCase(input[i + 1].name) > 0
            Person temp -> input[i]
            input[i] -> input[i +1]
            input[i + 1] -> temp
            sorted -> false
        bottom--
    return input
*/

/*
                  Method sortByName
Variable or Constant          Purpose
____________________          _________________________________________
entered                       Entered array parameter
input                         Copied person array from the entered array
bottom                        Int to store the value the sort stops at
sorted                        Boolean to see if the array is sorted
*/
  
  public static Person [] sortByName(Person [] entered)
  {
    Person [] input = entered;
    int bottom = input.length - 1;
    boolean sorted = false;
    while(!sorted)
    {
      for (int pass = 0; pass < input.length - 1; pass++)
      {
        for (int i = 0; i < bottom; i++)
        {
          sorted = true;
          if (input[i].name.compareToIgnoreCase(input[i + 1].name) > 0)
          {
            Person temp = input[i];
            input[i] = input[i +1];
            input[i + 1] = temp;
            sorted = false;
          }
        }
        bottom--; 
      }
    }
    return input;
  }
  
/*
  public static String arrayToString(Person [] input, String type)
    String arrayString -> ""
    if type.compareTo("n") = 0
      for int i -> 0; i < input.length; i++
        arrayString += input[i].toString() + "\n\n"
    else if type.compareTo("s") = 0
      for int i -> 0; i < input.length; i++
        if input[i].type.compareTo("s") = 0
          arrayString += input[i].toString() + "\n\n"
    else if type.compareTo("e") = 0
      for int i -> 0; i < input.length; i++
        if (input[i].type.compareTo("s") = 0 || input[i].type.compareTo("f") = 0)
          arrayString += input[i].toString() + "\n\n"
    else if type.compareTo("g") = 0
      for int i -> 0; i < input.length; i++
        if input[i].type.compareTo("g") = 0
          arrayString += input[i].toString() + "\n\n"
    return arrayString
*/

/*
                  Method arrayToString
Variable or Constant          Purpose
____________________          _________________________________________
input                         The inputted Person array
type                          Type of persons to access
arrayString                   String that is created and returned
*/
  
  public static String arrayToString(Person [] input, String type)
  {
    String arrayString = "";
    if (type.compareTo("n") == 0)
    {
      for(int i = 0; i < input.length; i++)
      {
        arrayString += input[i].toString() + "\n\n";
      }
    }
    else if (type.compareTo("s") == 0)
    {
      for(int i = 0; i < input.length; i++)
      {
        if (input[i].type.compareTo("s") == 0)
          arrayString += input[i].toString() + "\n\n";
      }
    }
    else if (type.compareTo("e") == 0)
    {
      for(int i = 0; i < input.length; i++)
      {
        if (input[i].type.compareTo("s") == 0 || input[i].type.compareTo("f") == 0)
          arrayString += input[i].toString() + "\n\n";
      }
    }
    else if (type.compareTo("g") == 0)
    {
      for(int i = 0; i < input.length; i++)
      {
        if (input[i].type.compareTo("g") == 0)
          arrayString += input[i].toString() + "\n\n";
      }
    }
    return arrayString;
  }
  
}//People class end