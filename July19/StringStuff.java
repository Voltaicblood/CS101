public class StringStuff
{
  public static void main(String [] args)
  {
    String s = "abcdef";
    System.out.println(s.length());
    System.out.println(s.charAt(2));
    //leading character is at index 0
    System.out.println(s.charAt(0));
    System.out.println(s.charAt(s.length() - 1));
    //System.out.println(s.charAt(s.length()));
    //error - index is out of range
    
    String t = "abcD12Ef";
    t.toLowerCase();
    System.out.println(t);
    String r = t.toLowerCase();
    System.out.println(r);
    r = t.toUpperCase();
    System.out.println (r);
    r = r.toLowerCase();
    System.out.println();
    r = "A more interesting string";
    int location = r.indexOf('i');
    int location3 = r.indexOf('i', location + 1);
    int location3 = r.indexOf('z');
  }
}