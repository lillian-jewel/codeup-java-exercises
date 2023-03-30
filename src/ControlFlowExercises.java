import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {

//        While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }


//        Do While
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536

//        int x = 0;
//        do {
//            System.out.println(x);
//            x += 2;
//        } while (x >= 100);

//        int x = 100;
//        do {
//            System.out.println(x);
//            x -= 5;
//        } while (x >= -10);

//        int x = 2;
//        do {
//            System.out.println(x * x);
//            x++;
//        } while (x * x < 10);

        //

//        for (int y = 0; y <= 100; y++) {
//            if (y % 3 == 0 && y % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (y % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (y % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(y);
//            }
//        }

        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter an integer:");
//        int number = scanner.nextInt();
//
//        System.out.println("\nHere is your table!\n");
//
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (int v = 1; v <= number; v++) {
//            int squared = v * v;
//            int cubed = v * v * v;
//            System.out.printf("%-6d | %-7d | %d%n", v, squared, cubed);
//        }


        System.out.println("Enter a grade from 0-100");
        int num = scanner.nextInt();
        System.out.printf("You entered the grade %d, please continue.%n", num);

        System.out.println("Grade Ranges");
        if (num >= 88 && num <= 100){
            System.out.printf("A: 100 - 88,%n B: 87 - 80,%n C: 79 - 67,%n D: 66 - 60,%n F:" +
                    " 50 - 0");
        } else if (num >= 80 && num <= 87) {
            System.out.printf("A: 100 - 88,%n B: 87 - 80,%n C: 79 - 67,%n D: 66 - 60,%n F:" +
                    " 50 - 0");
        }else if (num >= 67 && num <= 79) {
            System.out.printf("A: 100 - 88,%n B: 87 - 80,%n C: 79 - 67,%n D: 66 - 60,%n F:" +
                    " 50 - 0");
        }else if (num >= 60 && num <= 66) {
        System.out.printf("A: 100 - 88,%n B: 87 - 80,%n C: 79 - 67,%n D: 66 - 60,%n F:" +
                " 50 - 0");
        }else if (num >= 0 && num <= 59) {
        System.out.printf("A: 100 - 88,%n B: 87 - 80,%n C: 79 - 67,%n D: 66 - 60,%n F:" +
                " 50 - 0");
        }


    }
}
