public class FloatVariables
{
  public static void main(String [] args)
  {
    final float DELTA = 0.0001F;
    float x = 0.1F;
    float y = 0.01F;
    float z = y + y + y + y + y +
              y + y + y + y + y;
    if (x == z)
     System.out.println("True");
    else
     System.out.println("False");
     
    
    if ((x - z > 0 && x - z < DELTA) || (x - z < 0 && x - z > (- DELTA)))
     System.out.println("True using threshold");
    else
     System.out.println("False using threshold");
  }
}