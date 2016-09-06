public class MoreArrayStuff
{
  public static void main(String [] args)
  {
    //access array elements
    int [] a = new int [10];
    a[7] = 3;
    a[0] = a[7] * 4;
    //put the first 10 squares into a
    for (int i = 0; i < a.length; i++)
    {
      a[i] = (i + 1)*(i + 1);
    }
    
    int [] b = new int [100];
    b[0] = 1;
    for (int i = 1; i < b.length; i++)
    {
      b[i] = b[i - 1] + 2 * i + 1;
    }
    
    for(int i = 0; i < b.length; i++)
      System.out.println(b[i]);
  }
}
