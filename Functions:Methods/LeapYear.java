import java.util.Scanner;

public class LeapYear {
    
    public static boolean leap(int year){
        if(((year%4==0)&&(year%100!=0)) || (year%400==0)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year ");
        int year= sc.nextInt();
        boolean f= leap(year);
        if (f)
        {
            System.out.println("leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
