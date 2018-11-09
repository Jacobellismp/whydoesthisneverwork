import java.util.Scanner;
class Exercise1
{
  public static void main (String[] args )  
  {
    Scanner scan = new Scanner( System.in );
    int times;
    int integer;
    int answer = 0;

    System.out.print( "How man integers will be added: " );
    times = scan.nextInt();

    while ( times > 0 )
    {
      System.out.println( "Enter an integer: " );
      times--;
      integer = scan.nextInt();
      answer = answer + integer;
      
    }
    System.out.println("The sum is " + answer);
  }
}