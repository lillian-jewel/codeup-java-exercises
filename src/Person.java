public class Person {
    private String name;

    public Person (String name){
        this.name = name;
    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hi, " + this.name);
    }

    public static void main(String[] args) {
        Person lilly = new Person("Lilly");

        String myName = lilly.getName();
        System.out.println("myName = " + myName);

        String myName2 = lilly.name;
        System.out.println("myName2 = " + myName2);

        lilly.setName("lillian");
        System.out.println("lilly.getName() = " + lilly.getName());

        lilly.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());




    }

}

