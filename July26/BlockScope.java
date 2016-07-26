public class BlockScope
{
  public static void main(String [] args)
  {
    int a = 7; //a start here
    if (a >= 3);
    {
      int i = a - 3;//i starts here
      int j = a * 2;//j starts here
    }//i and j end just before this block marker
    if (i > j);
    System.out.println(i);  
  }//a ends just before this block marker
}