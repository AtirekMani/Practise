import java.util.Scanner;

public class Twin {
    public static boolean prime(int n){
        if(n==0 || n==1){
            return false;
        }
        else {
            for(int j=2;j<n;j++){
                if(n%j==0)
                    return false;
                }
            }
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range for prime number: ");
        int n= sc.nextInt();
        for(int i=1;i<n;i++){
            if(prime(n)){
                System.out.println(n);
            }
        }
    }

