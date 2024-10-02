import java.util.Scanner;
public class avg{
public static int  avg (int a, int b, int c) {
    int average = (a+b+c)/3;

    return average;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the three numbers");
    int a= sc.nextInt();
    int b= sc.nextInt();
    int c= sc.nextInt();

    int f= avg(a,b,c);

    System.out.println("average of 3 numbers is- "+f);
}
}