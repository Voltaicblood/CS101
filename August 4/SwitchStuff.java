import java.util.*;

public class SwitchStuff
{
  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Favorite color: ");
    String color = in.next();
    switch(color.toLowerCase())
    {
      case "blue": System.out.println("It is okay");
                  break;
      case "green": System.out.println("Much better than blue");
                  break;
      case "red": System.out.println("Dangerous choice");
                  break;         
      case "purple": System.out.println("Rhymes with orange");
                  break;   
      default: System.out.println("Is that really a color?");
                  break;
    }
  }
}