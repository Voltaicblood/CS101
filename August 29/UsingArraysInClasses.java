public class UsingArraysInClasses
{
  private int [] a;
  
  public UsingArraysInClasses(int [] a)
  {
    this.a = new int[a.length];
    for(int i = 0; i < a.length; i++)
      this.a[i] = a[i];
  }
  
  public int [] getA()
  {
    int [] tempA = new int[a.length];
    for (int i = 0; i < a.length; i++)
      tempA[i] = a[i];
    return tempA;
  }
}