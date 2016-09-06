public class TwoDArray
{
  public static void main(String [] args)
  {
    int [][] a2D = new int [3][2];
    for (int i = 0; i < a2D.length; i++)
    {
      for (int j = 0; j < a2D[i].length; j++)
      {
        a2D[i][j] = (i + 1) * 10 + j + 5;
      }
    }
    
    for (int i = 0; i < a2D.length; i++)
    {
      for (int j = 0; j < a2D[i].length; j++)
      {
        System.out.print(a2D[i][j] + " ");
      }
      System.out.println();
    }

    
    //ragged arrays
    int [][] a = new int[4][];
    a[0] = new int[3];
    a[1] = new int[2];
    a[2] = new int[4];
    a[3] = new int[1];

    for (int i = 0; i < a.length; i++)
    {
      for (int j = 0; j < a[i].length; j++)
      {
        a[i][j] = (i + 1) * 10 + j + 5;
      }
    }
    
    for (int i = 0; i < a.length; i++)
    {
      for (int j = 0; j < a[i].length; j++)
      {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }

  }
}