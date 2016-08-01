public class StringCompare
{
  public static void main(String [] args)
  {
    int x = "abc".compareTo("abc");
    x = "abc".compareTo("acb");
    x = "abc".compareTo("aab");
    x = "abc".compareTo("ab");
    x = "abc".compareTo("acbd");
  }
}