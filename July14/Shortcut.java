public class Shortcut
{
  public static void main(String [] args)
  {
    int a = 5;
    int b = a++;
    a = 5;
    b = ++a;
    a = 5;
    b = 6;
    int c = 7;
    int d = 8;
    int e = 9;
    int f = 2;
    int g = 3;
    d = a + ++b -d-- + --d + ++c + c++ + --f + g-- - --e;
    System.out.println(d);
  }

}