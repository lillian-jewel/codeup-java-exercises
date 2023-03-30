import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        int shortPi = (int) pi;
        System.out.format("The value of pi is approximately %d%n", shortPi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = scanner.nextInt();
        System.out.printf("You entered: %d%n", number);


        System.out.println("Enter 3 words:");
        String one = scanner.next();
        String two = scanner.next();
        String three = scanner.next();
        System.out.printf("You entered: %s, %s, %s%n", one, two, three);


        System.out.println("Enter a sentence:");
        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.printf("You said: %s%n", sentence);


        System.out.println("Enter the width of classroom:");
        String widthStr = scanner.nextLine();
        double width = Double.parseDouble(widthStr);

        System.out.println("Enter the length of classroom:");
        String lengthStr = scanner.nextLine();
        double length = Double.parseDouble(lengthStr);

        double area = width * length;
        double perim = (width * length) * 2;

        System.out.printf("Area of the classroom is %s feet %n", area);
        System.out.printf("Perimeter of the classroom is %s feet %n", perim);

    }
}


