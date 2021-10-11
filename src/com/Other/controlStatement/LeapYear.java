//Leap year or not
// NOTE : Not every year divisble by 4 is a leap year.
// E.g 1700 was not a leap yeay. But 1600 was a leap year. 
//Similarly year 2000 is a leap year but 2100 will not be a leap year

/*  
So the condition for leap year is that:

1. Year must be divisible by 4 and not divisible by 100
OR
2. year must be divisible by 400

*/

class LeapYear{

  public static void main(String []args){
      String a = (Integer.parseInt(args[0]) %4==0  &&  Integer.parseInt(args[0]) %100 != 0) || (Integer.parseInt(args[0]) %400 == 0)? "Leap Year":"Non Leap Year";
      System.out.println(a);
  }
}