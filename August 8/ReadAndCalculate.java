import java.util.*;
import java.io.*;

public class ReadAndCalculate
{
  public static void main(String [] args) throws Exception
  {
    String inputFileName = args[0];
    String outputFileName = args[1];
    File inFile = new File (inputFileName);
    Scanner in = new Scanner(inFile);
    File outFile = new File(outputFileName);
    PrintStream out = new PrintStream(outFile);
    int tokens = 0;
    int val = 0;
    int sum = 0;
    int maxVal = Integer.MIN_VALUE;
    int minVal = Integer.MAX_VALUE;
    while(in.hasNextInt())
    {
      tokens++;
      val = Integer.parseInt(in.next());
      sum = sum + val;
      if (maxVal == 0)
        maxVal = val;
      else if (val > maxVal)
        maxVal = val;
      if (minVal == 0)
        minVal = val;
      else if (val < minVal)
        minVal = val;
    }
    double average = (double)sum / tokens;
    out.println("Input complete");
    out.println("The number of values are: " + tokens);
    out.println("The sum of values is: " + sum);
    out.println("The average of values is: " + average);
    out.println("The maximum value is: " + maxVal);
    out.println("The minimum value is: " + minVal);
  }
}