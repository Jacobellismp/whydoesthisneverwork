import java.util.Scanner;
class Exercise1
{
  public static void main (String[] args )  
  {
    Scanner scan = new Scanner( System.in );
    double start, end;

    System.out.print( "Enter starting value: " );
    start = scan.nextDouble();

    System.out.print( "Enter ending value: " );
    end = scan.nextDouble();

    while ( start <= end )
    {
      System.out.println( start );
      start = start + 1;
    }
  }
}