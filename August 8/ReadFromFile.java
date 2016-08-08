import java.util.*;
import java.io.*;

public class ReadFromFile
{
  public static void main(String [] args) throws Exception
  {
    final int SENTINEL = 0;
    File inFile = new File("input.txt");
    Scanner in = new Scanner(inFile);
    int sum = 0;
    int val = in.nextInt();//priming read
    
    //pumping loop
    while(val != SENTINEL)
    {
      sum = sum + val;
      System.out.println(sum);
      val = in.nextInt();//pumping read
    }
    System.out.println("Input total: " + sum);
    
  }

}