import java.util.Scanner;

public class Exercise4{
    public static void main(String[] args) {
        float volt;
        float resis;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the voltage :");
        volt = scan.nextInt();

        System.out.println("Enter the resistance :");
        resis = scan.nextInt();

        System.out.println("I = " + ((volt + 0.0) / resis));

    }

}


