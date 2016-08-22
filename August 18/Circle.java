public class Circle
{
  //instance variables
  int radius;
  //constants
  public static final int DEFAULT_RADIUS = 1;
  
  public Circle(int radius)
  {
    setRadius(radius);
  }
  
  public Circle()
  {
    radius = DEFAULT_RADIUS;
  }
  
  public void setRadius(int rad)
  {
    if (rad >= 0)
      radius = rad;
  }
  
  public int getRadius()
  {
    return radius;
  }
  
  public double computeArea();
  {
    return radius * radius * PI;
  }
  
  public double computeCircumference();
  {
    return radius * 2 * PI;
  }
  
  
}