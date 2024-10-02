public class CopyConstructor {
    public static void main(String[] args) {
        Student obj= new Student();
        obj.name= "Praful";

        Student obj2= new Student(obj);
        System.out.println(obj2.name);
        
    }
}

class Student{
    String name;
    Student(Student t){
        this.name= t.name;
    }
    Student(){
        
    }
}
