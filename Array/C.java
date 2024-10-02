public class C {
    public static void maxsum(int[] arr){
        int maximum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(intk=i;k<j;k++){
                    sum+=arr[k];
                }
                maximum=(int)Math.max(maximum,sum);
            }
        }
    }
}
