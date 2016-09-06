public class Square extends Rectangle
{
  //No instance variables are necessary for  side of Square.
  //Square inherits length and width from Rectangle.
  
  public Square(int side)
  {
    super(side, side);//call constructor of Rectangle
  }
  
  //computeArea() is inherited
  
  //toString() is inherited
  //override toString()
  public String toString()
  {
    return "square with side: " + length;
  }
}