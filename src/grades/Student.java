package grades;

import java.util.ArrayList;

public class Student {
        private String name;
        private ArrayList<Integer> grades;

        public Student(String name) {
            this.name = name;
            this.grades = new ArrayList<Integer>();
        }

    public String getName(){
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        if (grades.size() == 0){
            return 0;
        }

        int sum = 0;

        for (int grade : grades){
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public String toString(){
            return name + ": " + grades.toString();
    }

}
