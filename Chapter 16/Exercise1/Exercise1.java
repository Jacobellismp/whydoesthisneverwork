import java.util.Scanner;

public class Exercise1
{
  public static void main (String[] args) 
  {
    Scanner scan = new Scanner( System.in );
    double answer;

    System.out.print("How much was the purchase? (in cents) ");
    answer =  scan.nextDouble();

    double discounted = (answer * .10);
    
    if ( answer > 10 )
      System.out.println( "Discounted price: " + (answer - discounted) + " cents");              // true branch
    else
      System.out.println("Not enough to discount.");             // false branch   
  }
}