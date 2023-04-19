import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("%f%n", pi);

        Scanner input = new Scanner(System.in);

//        System.out.println("Enter a number: ");
//        int userInput = input.nextInt();
//        System.out.println("You entered : " + userInput);
//
//        System.out.println("Enter 3 words: ");
//        String one = input.next();
//        String two = input.next();
//        String three = input.next();
//        System.out.printf("You entered : %n%s %s %s%n", one, two, three);

//        System.out.println("Enter a sentence: ");
//        String sentence = input.nextLine();
//        System.out.printf("You entered: %s", sentence);

        System.out.println("Enter the width of the classroom: ");
        int width = input.nextInt();
        System.out.println("Enter the length of the classroom: ");
        int length = input.nextInt();
        System.out.println("The area of the classroom is:" + (width * length));
        System.out.println("The perimeter of the classroom is: " + ((width * 2) + (length * 2)));
    }
}