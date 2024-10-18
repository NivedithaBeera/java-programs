import java.util.Scanner;

public class SpacePositions {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

    
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        System.out.println("\nPositions of spaces in the string:");
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == ' ') {
                System.out.println("Space found at position: " + i);
            }
        }

        
        input.close();
    }
}
