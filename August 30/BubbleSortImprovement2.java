public class BubbleSortImprovement2
{
   public static void main(String [] args)
   {
      int [] a = MakeArray.unsorted(10, 2, 99);
      sort(a);
   }
  //stop array when array is sorted
   public static void sort(int [] a)
   {
      int bottom = a.length - 1;
      boolean sorted = false;
      while(!sorted){
         for (int pass = 0; pass <a.length - 1; pass++)
         {
            for (int i = 0; i < bottom; i++)
            {
               sorted = true;
               if (a[i] > a[i + 1])
               {
                  int temp = a[i];
                  a[i] = a[i +1];
                  a[i + 1] = temp;
                  sorted = false;
               }
            }
            bottom--; 
         }
      }
   }
}