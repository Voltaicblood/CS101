//Program to swap first and last name
//Jacob Austin
public class NameTransformation
{

  public static void main(String [] args)
  {
    String name = "Ray Thomas";
    int location = name.indexOf(" ");
    String transformedName = name.substring(location + 1) + ", " + name.substring(0, location);
    System.out.println(transformedName);
  }
}