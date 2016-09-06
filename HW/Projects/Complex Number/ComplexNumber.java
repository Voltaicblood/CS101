cc/*
Purpose is to represent the complex number
by storing a real and imaginary part
*/

/*
Jacob Austin
8/27/2016
CS101-03 (CS101-xx, where xx is 02 or 03 -section number)
*/

import java.util.*;

/*
                  Data Table
Variable or Constant          Purpose
____________________          _________________________________________
real                          double that is real part of the complex number
imaginary                     double that is imaginary part of the complex number
count                         int that represents the amount of stored ComplexNumbers
DEFAULT_REAL                  double that is the initial real value of ComplexNumber
DEFAULT_IMAGINARY             double that is the initial imaginary value of ComplexNumber
*/

public class ComplexNumber
{

  private double real;
  private double imaginary;
  private static int count;
  public static final double DEFAULT_REAL = 0.0;
  public static final double DEFAULT_IMAGINARY = 0.0;


/*
ComplexNumber(real, imaginary)
    setReal(real)
    setImaginary(imaginary)
    count++
*/

  public ComplexNumber(double real, double imaginary)
  {
    setReal(real);
    setImaginary(imaginary);
    count++;
  }

/*
ComplexNumber()
    this(DEFAULT_REAL, DEFAULT_IMAGINARY)
*/
  
  public ComplexNumber()
  {
    this(DEFAULT_REAL, DEFAULT_IMAGINARY);
  }
  
/*
ComplexNumber(real)
    setReal(real)
    setImaginary(0)
    count++
*/
  
  public ComplexNumber(double real)
  {
    setReal(real);
    setImaginary(0);
    count++;
  }
  
/*
ComplexNumber(value)
    setReal(value.getReal())
    setImaginary(value.getImaginary())
    count++
*/
  
  public ComplexNumber(ComplexNumber value)
  {
    setReal(value.getReal());
    setImaginary(value.getImaginary());
    count++;
  }
  
  public double getReal()
  {
    return real;
  }
  
  public double getImaginary()
  {
    return imaginary;
  }
  
  public static int getCount()
  {
    return count;
  }
  
/*
setReal(double real)
    this.real <- real
*/

/*
                   Data Table
Variable or Constant          Purpose
____________________          _________________________________________
real                          double value is to be set as real
*/
  
  public void setReal(double real)
  {
    this.real = real;
  }
  
/*
setImaginary(double imaginary)
    this.imaginary <- imaginary
*/

/*
                   Data Table
Variable or Constant          Purpose
____________________          _________________________________________
imaginary                     double value is to be set as imaginary
*/
  
  public void setImaginary(double imaginary)
  {
    this.imaginary = imaginary;
  }
  
/*
add(number)
    double newReal <- getReal() + number.getReal()
    double newImaginary <- getImaginary() + number.getImaginary()
    ComplexNumber sum <- new ComplexNumber(newReal, newImaginary)
    return sum
*/

/*
                   Data Table
Variable or Constant          Purpose
____________________          _________________________________________
number                        inputted ComplexNumber value to be added
newReal                       double value that is the real after addition
newImaginary                  double value that is the imaginary after addition
sum                           new ComplexNumber after addition
*/
  
  public ComplexNumber add(ComplexNumber number)
  {
    double newReal = getReal() + number.getReal();
    double newImaginary = getImaginary() + number.getImaginary();
    ComplexNumber sum = new ComplexNumber(newReal, newImaginary);
    return sum;
  }
  
/*
subtract(number)
    double newReal <- getReal() - number.getReal()
    double newImaginary <- getImaginary() - number.getImaginary()
    ComplexNumber difference <- new ComplexNumber(newReal, newImaginary)
    return difference
*/

/*
                   Data Table
Variable or Constant          Purpose
____________________          _________________________________________
number                        inputted ComplexNumber value to be subtracted
newReal                       double value that is the real after subtraction
newImaginary                  double value that is the imaginary after subtraction
sum                           new ComplexNumber after subtraction   
*/
  
  public ComplexNumber subtract(ComplexNumber number)
  {
    double newReal = getReal() - number.getReal();
    double newImaginary = getImaginary() - number.getImaginary();
    ComplexNumber difference = new ComplexNumber(newReal, newImaginary);
    return difference;
  }
  
/*
multiply(ComplexNumber number)
    double newReal <- getReal() * number.getReal()
    double newImaginary <- (getReal() * number.getImaginary()) 
                           + (number.getReal() * getImaginary())
    newReal <- newReal - (getImaginary() * number.getImaginary());
    ComplexNumber difference <- new ComplexNumber(newReal, newImaginary)
    return difference
*/

/*
                   Data Table
Variable or Constant          Purpose
____________________          _________________________________________
number                        inputted ComplexNumber value to be multiplied
newReal                       double value that is the real after multiplication
newImaginary                  double value that is the imaginary after multiplication
sum                           new ComplexNumber after multiplication
*/
  
  public ComplexNumber multiply(ComplexNumber number)
  {
    double newReal = getReal() * number.getReal();
    double newImaginary = (getReal() * number.getImaginary()) 
                          + (number.getReal() * getImaginary());
    newReal = newReal - (getImaginary() * number.getImaginary());
    ComplexNumber difference = new ComplexNumber(newReal, newImaginary);
    return difference; 
  }

/*
isZero()
    if getReal() equals 0.0 AND getImaginary() equals 0.0 is true then
      return true
    return false
*/
  
  public boolean isZero()
  {
    if (getReal() == 0.0 && getImaginary() == 0.0)
      return true;
    return false;
  }
  
/*
toString()
    return getReal() + " + " + getImaginary() + "i"
*/
  
  public String toString()
  {
    return getReal() + " + " + getImaginary() + "i";
  }

/*
valueOf(String x)
    Scanner in <- new Scanner(x).useDelimiter("[^0-9.-]+")
    double realPart <- in.nextDouble()
    double imaginaryPart <- in.nextDouble()
    ComplexNumber out <- new ComplexNumber(realPart, imaginaryPart)
    return out
*/

/*
                   Data Table
Variable or Constant          Purpose
____________________          _________________________________________
x                             inputted String value that is to be 
                                converted to a ComplexNumber                            
in                            Scanner that uses the x String
realPart                      double value that represents the real (first) 
                                part of the string
imaginaryPart                 double value that represents the imaginary (second) 
                                part of the string
out                           ComplexNumber that represents the inputted string
*/
  
  public static ComplexNumber valueOf(String x)
  {
    Scanner in = new Scanner(x).useDelimiter("[^0-9.-]+");
    double realPart = in.nextDouble();
    double imaginaryPart = in.nextDouble();
    ComplexNumber out = new ComplexNumber(realPart, imaginaryPart);
    return out;
  }

}//ComplexNumber class end