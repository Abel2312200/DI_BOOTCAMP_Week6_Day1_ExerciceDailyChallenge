public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(); // creation a person using no-arg constructor
        Person person2 = new Person("Abel",23,550000); // creation a person using second constructor

        // display persons informations
        person1.displayInfo();
        person2.displayInfo();

        Person person3 = new Person("Akila",8); // creation a person using third constructor
        person3.displayInfo(); // display  person3 information

        // check if salary is provided
        if(person3.getSalary() == -1 )
            System.out.println("Salary not provided");
    }
}