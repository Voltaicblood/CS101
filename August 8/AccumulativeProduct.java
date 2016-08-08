import java.util.*;
import java.io.*;

public class AccumulativeProduct
{
  public static void main(String [] args) throws Exception
  {
    final int SENTINEL = 0;
    File inFile = new File("input2.txt");
    Scanner in = new Scanner(inFile);
    int product = 1;
    int val = in.nextInt();//priming read
    
    //pumping loop
    while(val != SENTINEL)
    {
      product = product * val;
      System.out.println(product);
      val = in.nextInt();//pumping read
    }
    System.out.println("Input multiplicative total: " + product);
    
  }

}