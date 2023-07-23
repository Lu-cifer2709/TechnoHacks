import java.util.Scanner;
import java.util.Random;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        int g = 0;
        System.out.println("========================WELCOME TO THE NUMBER GUESSING GAME============================");
        System.out.println("\nGuess the number between 1 to 100!");
        for (int i = 1; i <= 30; i++) { 
            System.out.print("Guess #" + i + ": ");
            int guess = sc.nextInt();
            g++;
            if (guess == num) {
                System.out.println("Congratulations, you guessed the number in " + g + " guesses!");
                return;
            } else if (guess < num) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Too high, try again.");
            }
        }
        System.out.println("Sorry, you didn't guess the number. The secret number was " + num + ".");
    }
}