import java.util.Scanner;

public class CommonFactorsThreeNumbers {

    public static void findCommonFactors(int a, int b, int c) {
        System.out.println("Common factors of " + a + ", " + b + ", and " + c + ":");

    
        int min = Math.min(a, Math.min(b, c));

    
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        findCommonFactors(num1, num2, num3);

        scanner.close();
    }
}
