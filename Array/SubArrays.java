public class SubArrays {
    public static  void subarray(int arr[]){
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int k=0;k<arr.length;k++){
            for(int i=k+1;i<=arr.length;i++){
                int sum=0;
                for(int j=k;j<i;j++){
                    sum+=arr[j];
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
                if(sum>max){
                    max=sum;
                }
                if(sum<min){
                    min=sum;
                }
            }
        }
        System.out.println("Maximum sum "+max);
        System.out.println("Minimum sum "+min);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        subarray(arr);
    }
}
