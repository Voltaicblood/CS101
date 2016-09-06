public class LinearUnsortedSearch
{
  public static void main(String [] args)
  {
    int [] a = MakeArray.sorted(10, 3, 4);
    int val = 17;
    int location = search(a, val);
    if (location == -1)
      System.out.println(val + " not in array");
    else
      System.out.println("The value at location " + location 
                           + " is " + a[location]);
  }
  
  public static int search(int [] a, int val)
  {
    int index = 0;
    boolean found = false;
    boolean more = true;
    
    while (more)
    {
      if (a[index] == val)
      {
        found = true;
        more = false;
      }
      else if (a[index] > val)
      {
        more = false;
      }
      else
      {
      index++;
      }
    }
    if (found) return index;
    return -1;
  }
}