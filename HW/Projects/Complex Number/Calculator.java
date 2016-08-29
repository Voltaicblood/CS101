public class Calculator
{
  public static void main(String [] args)
  {
    //test all the constructors
    ComplexNumber c1 = new ComplexNumber(4.5, 7.2);
    System.out.println("First number should be: " + "4.5 + 7.2i\n" +
                       "Your number is:         " + c1);
    ComplexNumber c2 = new ComplexNumber();
    System.out.println("\nSecond number should be: " + "0.0 + 0.0i\n" +
                       "Your number is:          " + c2);    
    ComplexNumber c3 = new ComplexNumber(17.7);
    System.out.println("\nThird number should be: " + "17.7 + 0.0i\n" +
                       "Your number is:         " + c3);  
    ComplexNumber c4 = new ComplexNumber(c1);
    System.out.println("\nFourth number should be: " + "4.5 + 7.2i\n" +
                       "Your number is:          " + c4);  
                       
    //accessor methods
                       
    int count = ComplexNumber.getCount();
    System.out.println("\nThere are 4 complex numbers.  You have counted "
                       + count + " of them.\n");     
    double real = c3.getReal();
    System.out.println("The real value should be: " + "17.7\n" +
                       "Your real value is :      "  + real);   
    double imaginary = c1.getImaginary();
    System.out.println("\nThe imaginary value should be: " + "7.2\n" +
                       "Your imaginary value is :      "  + imaginary); 
                       
    System.out.println();                   
                       
    //isZero method
    System.out.println(c1 + " is not zero, your method should return false\n"
                       + "Your method returns " + c1.isZero());
                       
    System.out.println();                   
    
    System.out.println(c2 + " is zero, your method should return true\n"
                       + "Your method returns " + c2.isZero());  
                       
   // arithmetic                     
                       
    System.out.println();
    
    c1 = new ComplexNumber(5.2, -3.1);
    c2 = new ComplexNumber(-1.4, 5.1);
    
    System.out.println();
    
    System.out.println("result of add: " + c1 + " + " + c2 + " = 3.8000000000000003 + 1.9999999999999996i\n"  +
                       "your add is:   " + c1 + " + " + c2 + " = "  + c1.add(c2));
                                                       
     
    System.out.println(); 
    
    c1 = new ComplexNumber(19.2, 4.71);
    c2 = new ComplexNumber(2.4, -1.1);
    
    System.out.println();
    
    System.out.println("result of add: " + c1 + " + " + c2 + " = 21.599999999999998 + 3.61i\n"  +
                       "your add is:   " + c1 + " + " + c2 + " = "  + c1.add(c2));
                                                       
     
    System.out.println();   
    
    c1 = new ComplexNumber(5.2, -3.1);
    c2 = new ComplexNumber(-1.4, 5.1);
    
    System.out.println();
    
    System.out.println("result of subtract: " + c1 + " - " + c2 + " = 6.6 + -8.2i\n"  +
                       "your subtract is:   " + c1 + " - " + c2 + " = "  + c1.subtract(c2));
                                                       
     
    System.out.println(); 
    
    c1 = new ComplexNumber(19.2, 4.71);
    c2 = new ComplexNumber(2.4, -1.1);
    
    System.out.println();
    
    System.out.println("result of subtract: " + c1 + " - " + c2 + " = 16.8 + 5.8100000000000005i\n"  +
                       "your subtract is:   " + c1 + " - " + c2 + " = "  + c1.subtract(c2)); 
                       
    System.out.println();  
    
    c1 = new ComplexNumber(12.7, 3.71);
    c2 = new ComplexNumber(5.4, -4.1);
    
    System.out.println();
    
    System.out.println("result of multiply: " + c1 + " * " + c2 + " = 83.791 + -32.03599999999999i\n"  +
                       "your multiply is:   " + c1 + " * " + c2 + " = "  + c1.multiply(c2)); 
                       
    System.out.println();
    
    //test valueOf
    
    ComplexNumber n = ComplexNumber.valueOf("52.3+-2.45i");
    System.out.println("Your result should be: 52.3 + -2.45i\n" +
                       "Your result is :       " + n);
                       
    System.out.println();
    
    n = ComplexNumber.valueOf(" 52.3 + -2.45i ");
    System.out.println("Your result should be: 52.3 + -2.45i\n" +
                       "Your result is :       " + n);                 
    
                     
    
                                                                                                                                  
  }
}