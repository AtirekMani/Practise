import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minpos]){
                    minpos=j;
                }
        }
        int temp=arr[minpos];
        arr[minpos]=arr[i];
        arr[i]=temp;
    }
    System.out.println(Arrays.toString(arr));
}
}
