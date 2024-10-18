import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 5;


        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            sum += num;  
        }

        double average = (double) sum / count;

    
        System.out.println("The average of the entered numbers is: " + average);
    }
}
