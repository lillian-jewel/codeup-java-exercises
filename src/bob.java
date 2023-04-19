import java.util.Scanner;

public class bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Talk to Bob.");

        boolean cont = true;
        do {
            String inputConvo = input.nextLine();
            if (inputConvo.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (inputConvo.endsWith("?")) {
                System.out.println("Sure");
            } else if (inputConvo.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
        } while (cont);
    }
}
