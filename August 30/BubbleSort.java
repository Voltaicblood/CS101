public class BubbleSort
{
  public static void main(String [] args)
  {
    int [] a = MakeArray.unsorted(10, 2, 99);
    sort(a);
  }
  
  public static void sort(int [] a)
  {
    for (int pass = 0; pass <a.length - 1; pass++)
    {
      for (int i = 0; i < a.length - 1; i++)
      {
        if (a[i] > a[i + 1])
        {
          int temp = a[i];
          a[i] = a[i +1];
          a[i + 1] = temp;
        }
      } 
    }
  }
}