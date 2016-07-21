import java.text.DecimalFormat;

public class FormatStuff
{
  public static void main(String [] args)
  {
    String pattern = "$#,##0.00";
    DecimalFormat f = new DecimalFormat(pattern);
    double value = 12345567.8765;
    System.out.println(value);
    System.out.println(f.format(value));
    value = .012;
    System.out.println(f.format(value));
    pattern = "#0.00%";
    f = new DecimalFormat(pattern);
    System.out.println(f.format(value));
    pattern = "0%";
    f = new DecimalFormat(pattern);
    System.out.println(f.format(value));
  
  }
  
}