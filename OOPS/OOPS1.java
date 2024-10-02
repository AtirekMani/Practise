public class OOPS1 {
        public static void main(String[] args) {
            Pen obj1= new Pen();
            obj1.setname("Mark");
            System.out.println(obj1.name);
            obj1.name="Pinky";
            System.out.println(obj1.name);
        }
    }

class Pen{
    static String name;
    void setname(String n){
        this.name=n;
    }
}

