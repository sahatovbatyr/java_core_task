package ObjectCopy_Shallow;

public class MainApp {

    public static void main(String[] args) {

        Address address = new Address("New York", "5th Avenue");
        Person person1 = new Person("John Doe", address);

        try {
            Person person2 = (Person) person1.clone();
            person2.address.city = "Los Angeles";

            System.out.println("After modification:");
            System.out.println("Person 1: " + person1);
            System.out.println("Person 2: " + person2);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
