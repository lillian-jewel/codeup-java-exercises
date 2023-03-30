import java.util.Scanner;

public class MethodExercises {

    public static int addNumbers(int one, int two) {
        return one + two;
    }

    public static int subNumbers(int one, int two) {
        return one - two;
    }

    public static int multNumbers(int one, int two) {
        return one * two;
    }

    public static int divNumbers(int one, int two) {
        return one / two;
    }

    public static void main(String[] args) {
        System.out.println(addNumbers(10, 5));
        System.out.println(addNumbers(22, 7));

        System.out.println(subNumbers(50, 5));
        System.out.println(subNumbers(112, 3));

        System.out.println(multNumbers(10, 5));
        System.out.println(multNumbers(100, 2));

        System.out.println(divNumbers(6, 3));
        System.out.println(divNumbers(18, 2));

    }

//    Create a method that validates that user input is in a certain range and
//    returns that input as an integer if it is within the given range. If not,
//    prompt the user to input their number again until the input is within range.
    public static int getRange(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number within the range [" + min + ", " + max + "]: ");
        int input = scanner.nextInt();

        if (input >= min && input <= max) {
            return input;
        } else {
            System.out.println("Invalid input. Please enter a number within the range [" + min + ", " + max + "].");
            return getRange(min, max); // recursion
        }
    }

//    public static int getFactor(int num1, int num2) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1-10");
//        int input = scanner.nextInt();
//
//        System.out.println("\nHere is your table!\n");
////
////        System.out.println("number | squared | cubed");
////        System.out.println("------ | ------- | -----");
////
//        for (int v = 1; v <= input; v++) {
//            int squared = v * v;
//            int cubed = v * v * v;
//            System.out.printf("%-6d | %-7d | %d%n", v, squared, cubed);
//        }
////
////        for(int n = 1; n <= input; n++ ) {
////
////        }
//
////        int num1 = getRange(1, 10);
////        int num2 = getRange(1, 10);
////
////        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + addNumbers(num1, num2));
////        System.out.println("The difference of " + num1 + " and " + num2 + " is: " + subNumbers(num1, num2));
////        System.out.println("The product of " + num1 + " and " + num2 + " is: " + multNumbers(num1, num2));
////        System.out.println("The quotient of " + num1 + " and " + num2 + " is: " + divNumbers(num1, num2));
//    }

}
