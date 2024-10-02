import java.util.Scanner;

public class CompundInterest {
    public static double compund(double initial, double rate, int time){
        int monthly= time*12;
        double monthly_rate= (rate*0.01)/12;

        double ci= initial * Math.pow((1+monthly_rate), monthly);
        return ci;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial investment ");
        double initial= sc.nextDouble();
        System.out.println("Enter your interest rate ");
        double rate= sc.nextDouble();
        System.out.println("enter the time in years");
        int time = sc.nextInt();
        for(int i=1;i<time;i++){
        double f= compund(initial, rate, i);
        System.out.printf("%.3f\n", f);
        }
        sc.close();
    }
}
