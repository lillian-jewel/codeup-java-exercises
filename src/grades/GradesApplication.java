package grades;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> students = new HashMap<>();

        ArrayList<Integer> myGrades = new ArrayList<>();
        myGrades.add(90);
        myGrades.add(91);
        myGrades.add(92);

        ArrayList<Integer> myselfGrades = new ArrayList<>();
        myselfGrades.add(93);
        myselfGrades.add(94);
        myselfGrades.add(95);

        ArrayList<Integer> meGrades = new ArrayList<>();
        meGrades.add(96);
        meGrades.add(97);
        meGrades.add(98);

        ArrayList<Integer> iGrades = new ArrayList<>();
        iGrades.add(99);
        iGrades.add(100);
        iGrades.add(101);

        students.put("My", myGrades);
        students.put("Myself", myselfGrades);
        students.put("Me", meGrades);
        students.put("I", iGrades);

        Scanner input = new Scanner(System.in);
        boolean wantToContinue = true;
        do {
            System.out.println("Welcome to the Grades Application!");
            System.out.println("Here are the GitHub usernames of our students:");
            for (String name : students.keySet()) {
                System.out.println(name);
            }
            System.out.print("Please enter a GitHub username to see more information: ");
            String username = input.nextLine();

            if (students.containsKey(username)) {
                ArrayList<Integer> grades = students.get(username);
                double average = 0;
                for (Integer grade : grades) {
                    average += grade;
                }
                average /= grades.size();
                System.out.println(username + " has an average grade of " + average + " out of 100");
            } else {
                System.out.println("No students with that GitHub username were found.");
            }

            System.out.print("Would you like to see another student? (y/n): ");
            String choice = input.nextLine();
            wantToContinue = choice.equalsIgnoreCase("y");
        } while (wantToContinue);
    }
}