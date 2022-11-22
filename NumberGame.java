import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    static int count = 1;

    public static int numberGenerator() {
        Random rand = new Random();
        int n = rand.nextInt(100);
        return n;
    }

    public static void score() {
        int score = 100 / count;
        System.out.println("\n Your Score is: " + score);
    }

    public static boolean check(int ans, int que) {
        if (ans == que) {
            System.out.println("Hurray you got it right");
            NumberGame.score();
            return false;
        } else {
            if (ans < que) {
                System.out.println("The number is greater than" + ans);
            } else {
                System.out.println("The number is less than" + ans);
            }
            return true;
        }

    }

    public static void main(String[] args) {
        System.out.println("----------------------------------");
        System.out.println("| Welcome to Number Guessing game|");
        System.out.println("----------------------------------\n");
        System.out
                .println("A Random Number is generated between 1 and 100, You've got 7 chances to guess the number\n");

        int randomNumber = NumberGame.numberGenerator();
        Scanner s = new Scanner(System.in);
        boolean alpha = true;

        while (alpha) {
            if (count > 7) {
                System.out.println("\nOops out of chances\nThe number is: " + randomNumber);

                break;
            }
            System.out.println("Guess the Number");
            int guess = s.nextInt();
            alpha = check(guess, randomNumber);
            count++;

        }

    }

}