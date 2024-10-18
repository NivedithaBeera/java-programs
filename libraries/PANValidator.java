import java.util.Scanner;
import java.util.regex.Pattern;

public class PANValidator {


    public static boolean isValidPAN(String pan) {
        
        String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";

        
        return Pattern.matches(regex, pan);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your PAN number: ");
        String pan = scanner.nextLine().toUpperCase(); 


        if (isValidPAN(pan)) {
            System.out.println("PAN number is valid.");
        } else {
            System.out.println("PAN number is invalid.");
        }

        scanner.close();
    }
}

