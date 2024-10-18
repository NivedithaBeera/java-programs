import java.util.Scanner;

public class InvertCase {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

    
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        
        StringBuilder invertedString = new StringBuilder();

        for (int i = 0; i < userInput.length(); i++) {
            char ch = userInput.charAt(i);
        
            if (Character.isUpperCase(ch)) {
                invertedString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                invertedString.append(Character.toUpperCase(ch));
            } else {
                
                invertedString.append(ch);
            }
        }

        
        System.out.println("String with inverted case: " + invertedString);

    
        input.close();
    }
}
