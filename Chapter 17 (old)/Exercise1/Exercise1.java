import java.util.Scanner;

public class Exercise1{
   public static void main(String[] args) {
       double hours;
       double zones;
       double depart;
       double arrive;
      
       Scanner scan = new Scanner(System.in);

       System.out.println("How long was the flight?");
       hours = scan.nextInt();
       System.out.println("How many time zones did you go through?");
       zones = scan.nextInt();
       System.out.println("When did you depart? (In military time)");
       depart = scan.nextInt();
       System.out.println("When did you arrive? (In military time)");
       arrive = scan.nextInt();
      
       System.out.println("It will take " + ((hours/2 + (zones-3) + depart + arrive)/10) + " days to recover.");
   }
}
