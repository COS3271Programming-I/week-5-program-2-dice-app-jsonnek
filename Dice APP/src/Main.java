// Jonathan Sonnek
// February 20th 2026
// Dice APP

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner userinput = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {

        // define keepRolling variable to control the loop
        boolean keepRolling = true;
        System.out.println("Would you like to roll the dice? (y/n): ");
        String initialAnswer = userinput.nextLine().trim().toLowerCase();
        keepRolling = initialAnswer.equals("y") || initialAnswer.equals("yes");

        // begin loop to roll dice until user decides to stop
        while (keepRolling) {
            int dieOne = random.nextInt(6) + 1;
            int dieTwo = random.nextInt(6) + 1;
            int sum = dieOne + dieTwo;

            System.out.println("Die 1: " + dieOne);
            System.out.println("Die 2: " + dieTwo);
            System.out.println("Sum: " + sum);

            System.out.print("Roll again? (y/n): ");
            String answer = userinput.nextLine().trim().toLowerCase();
            keepRolling = answer.equals("y") || answer.equals("yes");
            System.out.println();
        }

        userinput.close();
    }
}

