import java.util.Scanner;

public class SumPositiveNumbers {
    public static void main(String[] arges){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        System.out.println("Enter numbers to sum positive values.Type 'o' to finish:");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("0")){
                break;
            }

            try {

                double number = Double.parseDouble(input);

                if (number > 0){
                    sum += number;
                }
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input, please enter a number or '0' to finish");
            }
            
        }

        System.out.println("The sum of positive numbers is: " + sum );
        scanner.close();
    }
}
