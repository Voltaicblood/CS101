/*
Program to keep track of Beekeeper's gross income
*/

/*
Jacob Austin
7/25/2016
CS101-03
*/

import javax.swing.*;

public class BeekeeperEarnings
{

/*
                 Algorithm
main(args)
  COST_OF_CASE <-- 4536
  COST_OF_COMB <-- 249
  COST_OF_RAW <-- 99
  COST_OF_RENT <-- 53499
  
  JARS_IN_CASE <-- 24
  
  jarSold <-- input from dialog asking for amount of jars sold
  jarSoldNum <-- convert jarSold to integer
  jarSoldNum <-- round to nearest whole number
  caseSold <-- jarSoldNum / JARS_IN_CASE
  
  combSold <-- input from dialog asking for how many lbs of honey combs sold
  rawSold <-- input from dialog asking for how many lbs of raw honey sold
  rentSold <-- input from dialog asking for how many hives were rented
                 out for a week
                 
  caseIncome <-- caseSold * COST_OF_CASE
  combIncome <-- convert combSold to integer, then multiply it by COST_OF_COMB
  rawIncome <-- convert rawSold to integer, then multiply it by COST_OF_RAW
  rentIncome <-- convert rentSold to integer, then multiply it by COST_OF_RENT
  
  totalIncome <-- caseIncome + combIncome + rawIncome + rentIncome
  
  dollarPattern <-- "$#,##0.00" decimal format
  
  display message caseIncome using dollarPattern, labeled
  display message combIncome using dollarPattern, labeled
  display message rawIncome using dollarPattern, labeled
  display message rentIncome using dollarPattern, labeled
  display message totalIncome using dollarPattern, labeled
                 
              
*/

/*
                  Data Table
Variable or Constant          Purpose
____________________          _________________________________________
args                          parameter of main
COST_OF_CASE                  Cost in cents of 1 case of honey jars
COST_OF_COMB                  Cost in cents of 1 lb of honey comb
COST_OF_RAW                   Cost in cents of 1 lb of raw honey
COST_OF_RENT                  Cost in cents of renting a hive for 1 week
JARS_IN_CASE                  Amount of jars in a case
jarSold                       Amount of jars sold
jarSoldNum                    Amount of jars sold in integer format
caseSold                      Amount of cases sold
combSold                      Amount of combs in lbs sold
rawSold                       Amount of raw honey in lbs sold
rentSold                      Amount of weeks hives were rented
caseIncome                    Gross income from selling cases
combIncome                    Gross income from selling honeycomb
rawIncome                     Gross income from selling raw honey
rentIncome                    Gross income from renting out hives
totalIncome                   Total gross income from all sources
dollarPattern                 Formating for dollars and cents.
                  
*/

  public static void main(String [] args)
  {
  
  }//main method end

}//BeekeeperEarnings class end