package Project.zyBook_8_25;

public class PersonTester {
    public static void main(String[] args) {
        // Create an object of the Person class with no friends using the default constructor
        Person person1 = new Person("John");

        // Create an object of the Person class with one friend using the constructor with one parameter
        Person friend = new Person("Jane");
        Person person2 = new Person("Johnson",friend);

        // Add two friends to the first object
        Person friend2 = new Person("Jack");
        Person friend3 = new Person("Jill");
        person1.befriend(friend2);
        person1.befriend(friend3);

        // Add three friends to the second object
        Person friend4 = new Person("Joe");
        Person friend5 = new Person("Jenny");
        Person friend6 = new Person("Jerry");
        person2.befriend(friend4);
        person2.befriend(friend5);
        person2.befriend(friend6);

        // Print objects one and two
        System.out.println(person1);
        System.out.println(person2);

        // Unfriend one from the first object and one from the second object
        person1.unfriend(friend2);
        person2.unfriend(friend4);

        // Print both objects
        System.out.println(person1);
        System.out.println(person2);

        // Remove the only friend from the first object and print it
        person1.unfriend(friend3);
        System.out.println(person1);
    }
}
