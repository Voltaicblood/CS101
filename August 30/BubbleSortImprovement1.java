public class BubbleSortImprovement1
{
  public static void main(String [] args)
  {
    int [] a = MakeArray.unsorted(10, 2, 99);
    sort(a);
  }

  public static void sort(int [] a)
  {
    int bottom = a.length - 1;
    for (int pass = 0; pass <a.length - 1; pass++)
    {
      for (int i = 0; i < bottom; i++)
      {
        if (a[i] > a[i + 1])
        {
          int temp = a[i];
          a[i] = a[i +1];
          a[i + 1] = temp;
        }
      }
      bottom--; 
    }
  }
}