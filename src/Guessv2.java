import java.util.Random;
import java.util.Scanner;

/**
 * Created by jc299358 on 2/03/15.
 */
public class Guessv2 {
    public static void main(String[] args) {
        System.out.println("Set Minimum: ");
        Scanner scanner = new Scanner(System.in);
        int minimum = scanner.nextInt();
        System.out.println("Set maximum: ");
        int maximum = scanner.nextInt();

        while (maximum <= minimum) {
            System.out.println("The maximum must be a larger number then the minimum. P lease reset your maximum: ");
            maximum = scanner.nextInt();
        }

        Random random = new Random();
        int secret = minimum + random.nextInt(maximum - minimum + 1);

        System.out.println("Guess the number: ");
        int guess = scanner.nextInt();
        while (guess != secret) {
            System.out.println("You have guessed the incorrect number. Try again: ");
            guess = scanner.nextInt();
        }
        if (guess == secret) {
            System.out.println("You win!");
        }
    }
}
