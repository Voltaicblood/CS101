import java.util.*;
import java.io.*;

public class PumpingInput
{
  public static void main(String [] args) throws Exception
  {
    //read values from user, stop on input 0
    final int SENTINEL = 0;
    File inFile = new File("in.txt");
    Scanner in = new Scanner(inFile);
    //System.out.print("Enter value " + SENTINEL + " to stop: ");
    int val = in.nextInt();//priming read
    
    //pumping loop
    while(val != SENTINEL)
    {
      System.out.println(val);
      //System.out.print("Enter value " + SENTINEL + " to stop: ");
      val = in.nextInt();//pumping read
    }
    System.out.println("Input complete");
  }
}