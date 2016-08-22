public class Rectangle
{
  //instance variables (these are members)
  int length;  //default value is 0
  int width;
  
  public int computeArea()
  {
    return length * width;
  }
  public int computePerimeter()
  {
    return 2 * length + 2 * width;
  }
}