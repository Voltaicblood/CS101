public class Rectangle
{
  protected int length;
  protected int width;
  
  public Rectangle(int length, int width)
  {
    this.length = length;
    this.width = width;
  }
  
  public String toString()
  {
    return "rectangle with length: " + length +
            " and width: " + width;
  }
  
  public int computeArea()
  {
    return length * width;
  }
}