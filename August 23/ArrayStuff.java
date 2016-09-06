public class ArrayStuff
{
  public static void main(String [] args)
  {
    //array declaration
    //type [] identifier
    int [] a;
    double [] b;
    String [] c;
    //alternative form of array delcartion
    //type identifier []
    char d [];
    
    //instantiation - creating an array
    //identifier = new type [int_expression]
    a = new int [5];
    b = new double [3 * 2];
    c = new String [2];
    d = new char [4];
    
    //combine declaration and instantiation
    boolean [] f = new boolean [3];
  }
}