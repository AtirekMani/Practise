public class Kadane {
    public static void kadane(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("sum: "+ms);
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4,5};
        kadane(arr);
    }
}
