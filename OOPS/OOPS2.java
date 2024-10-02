public class OOPS2 {
    public static void main(String[] args) {
        Bank obj=new Bank();
        obj.username="Zenny";
        //obj.password="abcd";
        obj.setpassword("abcd");
        //System.out.println(obj.password);
    }
    
}

class Bank{
    public String username;
    private String password;
    void setpassword(String s){
        password=s;
    }

}
