import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(100) + 1;  // Random number from 1 to 100
        int guess = 0;

        while (guess != target) {
            System.out.print("Guess the number (1-100): ");
            guess = sc.nextInt();

            if (guess < target) {
                System.out.println("Too low!");
            } else if (guess > target) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! The number was " + target);
            }
        }
    }
}
