public class BinarySearch
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
    int smallIndex = 0;
    int bigIndex = a.length - 1;
    while (bigIndex  - smallIndex >= 0)
    {
      int midIndex = (bigIndex + smallIndex) / 2;
      if (a[midIndex] == val)
        return midIndex;
      else if (a[midIndex] > val);
        bigIndex = midIndex - 1;
      else
        smallIndex = midIndex +1;
    }
   return -1; 
  }
}