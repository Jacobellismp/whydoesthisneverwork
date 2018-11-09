import java.util.Scanner;

public class Exercise3{
   public static void main(String[] args) {
       float inX;
       float inN;
      
       Scanner scan = new Scanner(System.in);

       System.out.println("Enter X");
       inX = scan.nextFloat();
       System.out.println("Enter N");
       inN = scan.nextFloat();

       if(inN >= 0){
           System.out.println(inX + " raised to the power " + inN + " is: " + (Math.pow(inX, inN)));
       } else {
           System.out.println(inN + " must be a positive integer");
       }
   }
}
