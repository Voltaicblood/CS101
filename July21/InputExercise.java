import java.util.*;

public class InputExercise
{

  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);
    int maxOne = in.nextInt();
    int maxTwo = in.nextInt();
    System.out.println(Math.max(maxOne, maxTwo));
    double minOne = in.nextDouble();
    double minTwo = in.nextDouble();
    System.out.println(Math.min(minOne, minTwo));
    int signNumber = in.nextInt();
    System.out.println(Math.abs(signNumber));
    signNumber = in.nextInt();
    System.out.println(Math.abs(signNumber));
  
  }
  
}