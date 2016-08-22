public class Rectangle
{
  //instance variables (these are members)
  private int length; //default value is 0
  private int width;
  //private access modifier gives encapsulation
  
  //class constants (instance constants are silly)
  public static final int DEFAULT_LENGTH = 2;
  public static final int DEFAULT_WIDTH = 1;
  
  //constructor create an object
  // constructor usually gives initial values to instance variables
  
  public Rectangle(int length, int iwdth)
  {
    setLength(length);
    setWidth(width);
  }
  
  public Rectangle() //no-args constructor must write it in order to use it
  {
    length = DEFAULT_LENGTH;
    width = DEFAULT_WIDTH;
  }
  
  public void setLength(int len)
  {
    if (len >= 0)
      length = len;
  }
  
  public void setWidth(int wid)
  {
    if (wid >= 0)
      width = wid;
  }
  
  public int getLength()
  {
    return length;
  }
  
  public int getWidth()
  {
    return width;
  }
  
  public int computeArea()
  {
    return length * width;
  }
  public int computePerimeter()
  {
    return 2 * length + 2 * width;
  }
}