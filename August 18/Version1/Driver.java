public class Driver
{
  public static void main(String [] args)
  {
    Rectangle r = new Rectangle(); //calling the default [no-args] constructor
    r.length = 4;
    r.width = 3;
    System.out.println(r.computeArea());
    System.out.println(r.computePerimeter());
    
    Rectangle s = new Rectangle(); //calling the default [no-args] constructor
    s.length = 10;
    s.width = 5;
    System.out.println(s.computeArea());
    System.out.println(s.computePerimeter());
    
    Rectangle t = new Rectangle(); //calling the default [no-args] constructor
    t.length = -14;
    t.width = 33;
    System.out.println(t.computeArea());
    System.out.println(t.computePerimeter());


  }
}