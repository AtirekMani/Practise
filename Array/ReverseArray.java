import java.util.Scanner;

public class ReverseArray {

    public static void reverse(int arr[]){
        int first= 0;
        int last= arr.length-1 ;
        while(first<last){
            int temp= arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[5];
        System.out.println("Enter the array elements");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}