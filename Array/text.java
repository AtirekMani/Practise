public class text {
    public static void prefix(int arr[]){
        int prefix[]= new int[arr.length];
        int max=Integer.MIN_VALUE;
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int cs=0;
        for(int j=0;j<arr.length;j++){
            int start=j;
            for(int k=j;k<arr.length;k++){
                int end=k;
                cs= j==0?prefix[end]:prefix[end]-prefix[start-1];
                if(max<cs){
                    max=cs;
                }
            }
        }
        System.out.println("max sum: "+max);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        prefix(arr);
    }
}
