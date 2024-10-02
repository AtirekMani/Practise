

public class D{
    public static void kadane(int arr[]){
        int max= Integer.MIN_VALUE;
        int currentsum=0;
        for(int i=0;i<arr.length;i++){
            currentsum= Math.max(currentsum+arr[i], arr[i]);
            
            max=Math.max(currentsum, max);
        }
        System.out.println("Your maximum sum is: "+ max);
    }
    public static void main(String[] args){
        int arr[]= new int []{-1,-2,-3,-4};
        kadane(arr);
    }
}