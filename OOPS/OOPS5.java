public class OOPS5 {
    public static void main(String[] args) {
        Student obj= new Student();
        Student obj2= new Student("Parameterized...");
        System.out.println(obj2.name);
    }

}

class Student{
    String name;
    //Parameterized constructor
    Student(String n){
        this.name=n;
    }

    //Non-Parameterized constructor
    Student(){
        System.out.println("Constuctor is called ....");
    }

}
