public class Stocks {
    public static int stock(int arr[]){
        int max=Integer.MIN_VALUE;
        int buy=0;
        int sell;
        int profit[]=new int[arr.length];
        buy=arr[0];
        for(int i=1;i<arr.length;i++){
            sell=arr[i];
            profit[i-1]=sell-buy;
            buy=sell<buy? sell:buy;
        }
        for(int i=0;i<arr.length;i++){
            if(max<profit[i]){
                max=profit[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={7,4,2,9,10};
        int f= stock(arr);
        System.out.println("profit: "+f);
    }
}
