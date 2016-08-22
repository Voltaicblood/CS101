import java.util.*;

public class DoWhileTest
{
  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);
    String endExpression;
    do{
      //processes
      System.out.println("Do you want to do the processes again?");
      in.next();
      endExpression = in.substring(0, 1); 
    } while (endExpression.equals("n") || end.Expression.equals("y"));
    
  }
}