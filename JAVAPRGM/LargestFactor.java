import java.util.Scanner;

public class LargestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = sc.nextInt();

    
        int largestFactor = 1; 

        for (int i = number / 2; i >= 1; i--) {
            if (number % i == 0) {
                largestFactor = i;
                break; 
            }
        }

        
        System.out.println("The largest factor of " + number + " other than the number itself is: " + largestFactor);
    }
}

