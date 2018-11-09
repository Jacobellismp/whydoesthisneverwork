import java.util.Scanner;

public class Exercise6{
    
    public static void main(String[] args) {
    boolean digit = false;
    boolean checker = false;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter password: ");
    String password = scan.nextLine();
    checker(password);
    checkDigit(password);
    }


    public String checker(String password){
        if(password.length() < 7){
            return ("That password is not acceptable.");

        } else {
            return ("YOTE");
        }

    }

    public static boolean checkDigit(String password){

        for(int i=0; i <= password.length(); i++){

            char letter = password.charAt(i);
            if(Character.isDigit(i)){
                digit = true;

            }
        }
        return ("password");
    }

}