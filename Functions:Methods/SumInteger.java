import java.util.Scanner;
public class SumInteger {
    public static int sum(int n){
        int rem;
        int sum=0;
        while(n!=0){
            rem= n%10;
            sum=sum+rem;
            n=n/10;
        }
        return Math.abs(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n= sc.nextInt();
        int f= sum(n);
        System.out.println("Sum of integer digits= "+f);
        sc.close();
    }
}
