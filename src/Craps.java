import java.util.Random;
import java.util.Scanner;

public class Craps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        while (true) {
            System.out.println("Welcome to Craps!");

            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("Rolling the dice...");
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum: " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You lose!");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You win!");
            } else {
                System.out.println("The point is " + sum);
                int point = sum;
                while (true) {
                    int newDie1 = rnd.nextInt(6) + 1;
                    int newDie2 = rnd.nextInt(6) + 1;
                    int newSum = newDie1 + newDie2;

                    System.out.println("Rolling the dice again...");
                    System.out.println("Die 1: " + newDie1);
                    System.out.println("Die 2: " + newDie2);
                    System.out.println("Sum: " + newSum);

                    if (newSum == point) {
                        System.out.println("Made point! You win!");
                        break;
                    } else if (newSum == 7) {
                        System.out.println("Got a seven! You lose!");
                        break;
                    } else {
                        System.out.println("Trying for point...");
                    }
                }
            }

            if (!playAgain(scanner)) {
                System.out.println("Thanks for playing!");
                break;
            }
        }

        scanner.close();
    }

    public static boolean playAgain(Scanner scanner) {
        while (true) {
            System.out.print("Do you want to play again? [Y/N]: ");
            String choice = scanner.nextLine().trim().toLowerCase();
            if (choice.equals("y")) {
                return true;
            } else if (choice.equals("n")) {
                return false;
            } else {
                System.out.println("Invalid choice. Please enter Y or N.");
            }
        }
    }
}
