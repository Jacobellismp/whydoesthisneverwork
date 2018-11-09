import java.util.Scanner;
class Exercise3
{
  public static void main (String[] args )  
  {
    Scanner scan = new Scanner( System.in );
    String wordOne;
    String wordTwo;
    int timesOne;
    int timesTwo;
    int counter = 1;

    System.out.print( "Enter first word: " );
    wordOne = scan.nextLine();
    timesOne = wordOne.length();

    System.out.print( "Enter second word: " );
    wordTwo = scan.nextLine();
    timesTwo = wordTwo.length();

    System.out.print(wordOne);
    
    while ( counter <= (30 - (timesOne + timesTwo)) )
    {
      System.out.print(".");
      counter++;
    }

    System.out.print(wordTwo);
  }
}