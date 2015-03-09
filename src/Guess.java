import java.util.Scanner;

/**
 * Created by jc299358 on 2/03/15.
 */
public class Guess {
    public static void main(String[] args) {
        System.out.println("Guess the number: ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        if (guess == 42) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose...");
        }

    }
}
