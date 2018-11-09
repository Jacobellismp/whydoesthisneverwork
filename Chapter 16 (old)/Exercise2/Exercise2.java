import java.util.Scanner;
class Exercise2
{
  public static void main (String[] args )  
  {
    Scanner scan = new Scanner( System.in );
    int in;
    int integer;
    int answer = 0;

    System.out.print( "Enter N: " );
    times = scan.nextInt();

    while ( times > 0 )
    {
      
      times--;
      integer = scan.nextInt();
      answer = answer + integer;
      
    }
    System.out.println("The sum is " + answer);
  }
}