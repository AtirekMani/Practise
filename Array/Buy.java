public class Buy {
    public static void main(String[] args) {
        int arr[]= new int []{1,2,3,4,5,6};
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                curr=arr[j]-arr[i]<0?0:arr[j]-arr[i];
                max=Math.max(max,curr);
            }
        }
        System.out.println("Maximum profit: "+max);
    }
}
