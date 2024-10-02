public class OOPS3 {
    public static void main(String[] args) {
        Student obj= new Student();
        
        obj.setname("Nancy");
        System.out.println(obj.name);
        System.out.println(obj.getname());
    }

}
class Student{
    String name;
    //setter
    void setname(String n){
        this.name=n;
    }
    //getter
    String getname(){
        return this.name;
    }
}
