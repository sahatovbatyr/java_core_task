package ObjectCopy_Deep;

public class MainApp {
    public static void main(String[] args) {
        try {
            Address address = new Address("New York", "5th Avenue");
            Person person1 = new Person("John Doe", address);
            Person person2 = (Person) person1.clone();

            System.out.println("Person 1: " + person1);
            System.out.println("Person 2: " + person2);

            person2.name = "Jane Doe";
            person2.address.city = "Los Angeles";

            System.out.println("After modification:");
            System.out.println("Person 1: " + person1);
            System.out.println("Person 2: " + person2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
