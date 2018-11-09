import java.util.Scanner;

public class Exercise4
{
  public static void main (String[] args) 
  {
    Scanner scan = new Scanner( System.in );
    int bolt;

    System.out.print("How many bolts? ");
    bolt =  scan.nextDouble();

    System.out.print("How many nuts? ");
    nut =  scan.nextDouble();

    System.out.print("How many washers? ");
    washer =  scan.nextDouble();

    if ( nut >= bolt && washer >=(2 * bolt)) 
      System.out.println( "Order is OK.");
    if ( nut < bolt) 
      System.out.println("Check the Order: too few nuts ");
    if ( washer < (2 * bolt)) 
      System.out.println("Check the Order: too few washers ");
    System.out.println("Order Total: " + ((bolt * 5) + (nut * 3) + (washer)));
  }
}