public class CallByValue
{
  public static void main(String [] args)
  {
    int x = 7;
    incX(x);
    System.out.println(x);
    incX(7+3);
    System.out.println(7+3);
    A a = new A(17);
    incX(a);
  }
  
  public static void incX(int x)
  {
    x++;
  }
}