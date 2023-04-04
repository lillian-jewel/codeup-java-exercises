public class ArraysExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

//        Create an array that holds 3 Person objects. Assign a new
//        instance of the Person class to each element. Iterate through
//        the array and print out the name of each person in the array.

//        String[] people = {"Me", "Myself", "I"};
        Person[] people = new Person[3];

        people[0] = new Person("Me");
        people[1] = new Person("Myself");
        people[2] = new Person("I");

        for (Person person : people) {
            System.out.println(person.getName());
        }


        
    }
}
