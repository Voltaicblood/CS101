public class Method
{
  public static void main(String [] args)
  {
    int x = 7;
    print(x);// call - arguments must match the parameters
             // in type and position
    int a = sum(x, x*3);
    print(a);
  }//main
  
  public static void print(int val)
  {
    System.out.print(val);
  }//print
  
  public static int sum(int x, int y)
  {
    return x + y;
  }//sum
}