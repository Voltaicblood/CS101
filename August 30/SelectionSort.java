public class SelectionSort
{
  public static void main(String [] args)
  {
    int [] a = MakeArray.unsorted(10, 25, 150);
    sort(a);
  }
  
  public static void sort(int [] a)
  {
    for(int select = 0; select < a.length - 1; select++)
    {
      int minIndex = findMinIndex(a, select);
      swap(a, select, minIndex);
    }
  }
  
  public static int findMinIndex(int [] a, int select)
  {
    int lowestIndex = select;
    for(int i = select + 1; i < a.length; i++)
    {
      if (a[i] <= a[lowestIndex])
      {
        lowestIndex = i;
      } 
    }
    return lowestIndex;
  }
  
  public static void swap(int [] a, int select, int minIndex)
  {
    int tempVal = a[minIndex];
    a[minIndex] = a[select];
    a[select] = tempVal;
  }
}