public class Rectangle
{
  private int length;
  private int width;
  private static int count;
  public static final int DEFAULT_LENGTH = 2;
  public static final int DEFAULT_WIDTH = 1;
  
  public Rectangle()
  {
    this(DEFAULT_LENGTH, DEFAULT_WIDTH);
  }
  
  public Rectangle(int length, int width)
  {
    setLength(length);
    setWidth(width);
    count++;
  }
  
  public int getLength()
  {
    return length;
  }
  
  public int getWidth()
  {
    return width;
  }
  
  public void setWidth(int width)
  {
    if (width >= 0)
      this.width = width;
  }
  
  public void setLength(int length)
  {
    if (length >= 0)
      this.length = length;
  }
  
  public int computeArea()
  {
    return length * width;
  }
  
  public int computePerimeter()
  {
    return 2 * (length + width);
  }
  
  public static int getCount()
  {
    return count;
  }
  
  public String toString()
  {
    return "Rectangle with length: " + length +
           " and width: " + width;
  }
}