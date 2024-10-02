//Example of Parameterized, non parameterized and copy constructor.
    public class Person {
        private String name;
        private int age;
        private String address;
    
        // Default Constructor (Non-Parameterized)
        public Person() {
            this.name = "Unknown";
            this.age = 0;
            this.address = "Not provided";
        }
    
        // Parameterized Constructor
        public Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    
        // Copy Constructor
        public Person(Person other) {
            this.name = other.name;
            this.age = other.age;
            this.address = other.address;
        }
    
        // Method to display person details
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Address: " + address);
        }
    
        public static void main(String[] args) {
            // Using the default constructor
            Person person1 = new Person();
            System.out.println("Person 1 (Default Constructor):");
            person1.displayInfo();
            System.out.println();
    
            // Using the parameterized constructor
            Person person2 = new Person("Alice", 30, "123 Elm Street");
            System.out.println("Person 2 (Parameterized Constructor):");
            person2.displayInfo();
            System.out.println();
    
            // Using the copy constructor
            Person person3 = new Person(person2);
            System.out.println("Person 3 (Copy Constructor):");
            person3.displayInfo();
        }
    }
    

