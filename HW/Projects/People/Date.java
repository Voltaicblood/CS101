/*
Class to hold information pertaining to dates
*/

/*
Jacob
9/12/2016
CS101-03
*/

import java.util.*;

/*
                  Class Date
Variable or Constant          Purpose
____________________          _________________________________________
day                           int that stores the day
month                         int that stores the month
year                          int that stores the year
*/

public class Date
{

  private int day;
  private int month;
  private int year;
  
  public Date(int day, int month, int year)
  {
    setDay(day);
    setMonth(month);
    setYear(year);
  }
  
  public Date(String stringInput)
  {
    Scanner input = new Scanner(stringInput).useDelimiter("/");
    setMonth(input.nextInt());
    setDay(input.nextInt());
    setYear(input.nextInt());
  }
  
  public Date()
  {
    this(0, 0, 0);
  }
  
  public void setDay(int day)
  {
    this.day = day;
  }
  
  public void setMonth(int month)
  {
    this.month = month;
  }
  
  public void setYear(int year)
  {
    this.year = year;
  }
  
  public int getDay()
  {
    return day;
  }
  
  public int getMonth()
  {
    return month;
  }
  
  public int getYear()
  {
    return year;
  }
  
/*
public String toString()
    return month + "/" + day + "/" + year
*/ 
  
  public String toString()
  {
    return month + "/" + day + "/" + year;
  }
  
/*
public int compareTo(Date input)
    if year > input.year then
      return -1
    else if year < input.year then
      return 1
    else
	if month > input.month then
        return -1
      else if month < input.month then
        return 1
      else
        if day > input.day then
          return -1
        else if day < input.day then
          return 1
        else
          return 0
*/
  
  public int compareTo(Date input)
  {
    if (year > input.year)
      return -1;
    else if (year < input.year)
      return 1;
    else
    {
      if (month > input.month)
        return -1;
      else if (month < input.month)
        return 1;
      else
      {
        if (day > input.day)
          return -1;
        else if (day < input.day)
          return 1;
        else
          return 0;
      }
    }
  }
  

}//People class end