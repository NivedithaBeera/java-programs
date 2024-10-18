import java.util.Random;

public class ArrayAboveAverage {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random rand = new Random();
        int sum = 0;

        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1; 
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
        }

        
        double average = sum / (double) numbers.length;
        System.out.println("\nAverage of the array: " + average);

    
        System.out.println("Elements greater than the average:");
        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
    }
}
