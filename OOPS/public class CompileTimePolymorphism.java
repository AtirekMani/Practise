public class CompileTimePolymorphism {
    // Method with one parameter
    public void display(int a) {
        System.out.println("Argument: " + a);
    }

    // Method with two parameters
    public void display(int a, int b) {
        System.out.println("Arguments: " + a + ", " + b);
    }

    // Method with different parameter type
    public void display(String s) {
        System.out.println("String argument: " + s);
    }

    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        obj.display(10);           // Calls display(int a)
        obj.display(10, 20);       // Calls display(int a, int b)
        obj.display("Hello");      // Calls display(String s)
    }
}
