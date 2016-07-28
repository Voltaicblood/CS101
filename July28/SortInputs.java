//Print values in order of smallest to largest.
//Jacob Austin
import java.util.*;

public class SortInputs
{
  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in);
    int numOne = in.nextInt();
    int numTwo = in.nextInt();
    int numThree = in.nextInt();
    
    if (numOne >= numTwo) //One >= Two
    {
     if (numOne == numTwo)// One = Two
     {
       if (numThree >= numOne)// Three >= One = Two
         System.out.println(numTwo + " " + numOne + " " + numThree);
       else //One = Two >= Three
         System.out.println(numThree + " " + numTwo + " " + numOne);
     }
     else if (numThree >= numOne)// Three >= One > Two
       System.out.println(numTwo + " " + numOne + " " + numThree);
     else if (numThree >= numTwo) //One > Three > Two
       System.out.println(numTwo + " " + numThree + " " + numOne);
     else //One > Two > Three 
       System.out.println(numThree + " " + numTwo + " " + numOne);  
    }
    else if (numTwo >= numThree)
      {
      if (numThree >= numOne)// Two >= Three >= One 
        System.out.println(numOne + " " + numThree + " " + numTwo);
      else //Two >= One > Three
        System.out.println(numThree + " " + numOne + " " + numTwo);
       }
    else // Three > Two > One
      System.out.println(numOne + " " + numTwo + " " + numThree);
  }
}