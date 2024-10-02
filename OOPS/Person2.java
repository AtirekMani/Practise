//Getter and setter
public class Person2 {
    // Private fields
    private String name;
    private int age;
    private String address;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) { // Ensure age is non-negative
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person();

        // Set values using setters
        person.setName("Alice");
        person.setAge(30);
        person.setAddress("123 Elm Street");

        // Get values using getters and display them
        System.out.println("Person Details:");
        person.displayInfo();

        // Demonstrating validation with setters
        person.setAge(-5); // This will trigger validation and not update the age
        System.out.println("Updated Person Details:");
        person.displayInfo();
    }
}
