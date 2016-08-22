public class Driver
{
  public static void main(String [] args)
  {
    Rectangle r = new Rectangle(); //calling the default [no-args] constructor
    r.setLength(4);
    r.setWidth(3);
    System.out.println(r.computeArea());
    System.out.println(r.computePerimeter());
    
    Rectangle s = new Rectangle(); //calling the default [no-args] constructor
    s.setLength(10);
    s.setWidth(5);
    System.out.println(s.computeArea());
    System.out.println(s.computePerimeter());
    
    Rectangle t = new Rectangle(); //calling the default [no-args] constructor
    t.setLength(-14);
    t.setWidth(33);
    System.out.println(t.computeArea());
    System.out.println(t.computePerimeter());
    
    Rectangle u = new Ractangle(13, 6);
    System.out.println(u.computeArea());
    System.out.println(u.computePerimeter());
    System.out.println(u);
    System.out.println(


  }
}