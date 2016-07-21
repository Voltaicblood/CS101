import java.util.*;

public class ScannerStuff
{
  public static void main(String [] args)
  {
    Scanner in = new Scanner(System.in); //read from keyboard
    String token = in.next();
    int i = in.nextInt();
    String line = in.nextLine(); //skip the rest of this input line
    line = in.nextLine();//gets an entire line, because we already skipped to the beginning of it
    double d = in.nextDouble();
    
  
  }
}