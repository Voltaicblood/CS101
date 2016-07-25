//Jacob Austin

import javax.swing.*;

public class AgeInFiveYears
{
 public static void main(String [] args)
 {
   String age = JOptionPane.showInputDialog(null, "Please input your current age:");
   int agePlusFive = Integer.parseInt(age) + 5;
   JOptionPane.showMessageDialog(null, "Your age in 5 years is: " + agePlusFive); 
 
 }


}