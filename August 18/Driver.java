public class Driver
{
  public static void main(String [] args)
  {
    Circle c = new Circle(); //calling the default [no-args] constructor
    c.setRadius(3);
    System.out.println(c.computeArea());
    System.out.println(c.computeCircumference());


  }
}