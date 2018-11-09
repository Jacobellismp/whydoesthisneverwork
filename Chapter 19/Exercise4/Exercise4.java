import java.util.Scanner;
public class Exercise4
{
  public static void main (String[] args) 
  {
    Scanner scan = new Scanner( System.in );
    String inWord;
    int place = 0;

    System.out.print("Enter a word: ");
    inWord =  scan.nextLine();

    double length = inWord.length();

    for(int i = 0; i < length; i++){
        System.out.println(inWord.charAt(i));

    }

  }
}