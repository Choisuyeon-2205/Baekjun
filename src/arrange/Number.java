package arrange;

import java.text.DecimalFormat;

public class Number
{
 public static void main(String[] args)
 {
  DecimalFormat df = new DecimalFormat("#######.000");
  String number = df.format(12);
  String number1 = df.format(12.45);
  String number2 = df.format(12.879);

  System.out.println(number);
  System.out.println(number1);
  System.out.println(number2);
 }
}