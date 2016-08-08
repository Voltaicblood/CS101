import java.util.*;
import java.io.*;

public class ReadEntireFile
{
  public static void main(String [] args) throws Exception
  {
    //read values from user, stop on input 0
    final int SENTINEL = 0;
    File inFile = new File("in.txt");
    Scanner in = new Scanner(inFile);
    
    while(in.hasNext())
    {
      String token = in.next();
      System.out.println(token);
    }
    System.out.println("Input complete");
  }
}