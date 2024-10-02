import java.util.Arrays;

public class PrefixSum {
    public static void prefix(int arr[]){
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];


        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }


        System.out.print("Your prefix array is: ");
        System.out.println(Arrays.toString(prefix));


        int current=0;
        for(int j=0;j<arr.length;j++){
            int start=j;
            for(int k=j;k<arr.length;k++){
                int end=k;
                current= start==0 ? prefix[end]:prefix[end]-prefix[start-1];
                if(max<current){
                    max = current;
                }
            }
        }
        System.out.println("Maximum sub array sum: "+max);
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,4};
        prefix(arr);
    }
}
