import java.util.Scanner;

public class MethodExercises {

//Create four separate methods. Each will perform an arithmetic operation:
//Each function needs to take two parameters/arguments so that the operation can be performed.
//
//Test your methods and verify the output.
//
//Add a modulus method that finds the modulus of two numbers.
//
//Food for thought: What happens if we try to divide by zero? What should happen?

    //Addition
    public static int addition(int one, int two) {
        return one + two;
    }

    public static int subtraction(int one, int two) {
        return two - one;
    }

    public static int multiplication(int one, int two) {
        return two - one;
    }

    public static int division(int one, int two) {
        return two - one;
    }

    public static int modulus(int one, int two) {
        return two % one;
    }

//Subtraction


//Multiplication
//Division

    public static void main(String[] args) {
        int sum = addition(5, 10);
        System.out.println(sum);

        int diff = subtraction(10, 5);
        System.out.println(diff);

        int prod = multiplication(10, 5);
        System.out.println(prod);

        int quotient = division(10, 5);
        System.out.println(quotient);

        int value = modulus(20, 10);
        System.out.println(value);
    }

    ////    Create a method that validates that user input is in a certain range and
////    returns that input as an integer if it is within the given range. If not,
////    prompt the user to input their number again until the input is within range.

//
//    public static int getInteger(int min, int max) {
//
//    }
//
}

//
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


