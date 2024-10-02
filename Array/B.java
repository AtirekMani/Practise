public class B {
    public static void subarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<j;k++){
                    System.out.printf("%d ",arr[k]);
                }
                 System.out.println();
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4};
        subarray(arr);
    }
}
