package util;

import java.util.Scanner;


public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    String getString() {
        return scanner.nextLine();
    }

    boolean yesNo() {
        // should return true if the user enters y, yes, or variants thereof, and false otherwise
        String userInput = scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("Yes");
    }

    int getInt() {
        return this.scanner.nextInt();
    }

    int getInt(int min, int max) {
        int userInt;
        do {
            System.out.printf("Enter a whole number between %d and %d", min, max);
            userInt = this.scanner.nextInt();
        } while (userInt > max || userInt < min);
        return userInt;
    }

    double getDouble() {
        return this.scanner.nextDouble();
    }

    double getDouble(double min, double max) {
        Double userDouble;
        do {
            System.out.printf("Enter decimal number between %f and %f: %n", min, max);
            userDouble = this.scanner.nextDouble();
        } while (userDouble > max || userDouble < min);
        return userDouble;
    }

}


