import java.util.Scanner;

public class VerticalString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        System.out.println("\nString displayed vertically:");
        for (int i = 0; i < userInput.length(); i++) {
            System.out.println(userInput.charAt(i));
        }

        input.close();
    }
}

