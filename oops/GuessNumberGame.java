import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame{
    public static void main(String[] args){

        Random rand = new Random();
        int randomNumber = rand.nextInt(25) + 1;

        int attempts = 3;
        int guess;
        boolean guessedCorrectly = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Guess a number between 1 and 25. You have " + attempts + " attempts.");

        for(int i =1; i<= attempts; i++){
            System.out.print("Attempt" + i + ": Enter your guess: ");
            guess = input.nextInt();

            if(guess == randomNumber){
            System.out.println("Congratulations! You've guessedthe correct number:" + randomNumber);
            guessedCorrectly =  true;
            break;
        }
        else if (guess < randomNumber){
            System.out.println("Too low! Try again.");
        }
        else{
            System.out.println("Too high! Try again.");
        }

    }

    if(!guessedCorrectly){
        System.out.println("Sorry, you've used all attempts.The correctnumber was:" + randomNumber);
    }
    input.close();
} 
}