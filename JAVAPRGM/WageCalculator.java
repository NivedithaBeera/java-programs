import java.util.Scanner;

public class WageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day of the week (1 for Monday, 7 for Sunday): ");
        int day = sc.nextInt();
        System.out.print("Enter the number of hours worked: ");
        int hours = sc.nextInt();
        int rate = switch (day) {
            case 1, 2, 3 -> 200;
            case 4, 5 -> 400;
            case 6 -> 600;
            case 7 -> 800;
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };
        int totalWage = rate * hours;
        if (totalWage > 2000) {
            totalWage += totalWage * 0.10; 
        }

        System.out.println("Total Wage: Rs " + totalWage);
    }
}
