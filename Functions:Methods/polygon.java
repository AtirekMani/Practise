
import java.util.Scanner;

public class polygon {
    public static float polygon(float n, float length){
        return ((n*length*length)/(float)(4*Math.tan(Math.PI/n)));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of sides ");
        float n= sc.nextFloat();
        System.out.println("enter the length of side");
        float length= sc.nextFloat();
        float f= polygon(n, length);
        System.out.println("your area is"+f);
    }
    
}
