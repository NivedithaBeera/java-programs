import java.util.Scanner;

public class TotalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0; 

        System.out.println("Please enter five numbers (can be integers or decimals):");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            String userInput = input.nextLine();
            try {
            
                double number = Double.parseDouble(userInput);
                total += number; 
            } catch (NumberFormatException e) {
                
                System.out.println("Invalid input. Please enter a valid number.");
                i--; 
            }
        }


        System.out.println("The total of the entered numbers is: " + total);
        
        input.close();
    }
}

