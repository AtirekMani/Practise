public class SortedSearch{
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int i=0;
        int j=arr[0].length-1;
        int key=11;
        int ref=arr[0][j];
        while(ref!=key){
            if(ref<key){
                i=i+1;
            }
            else{
                j=j-1;
            }
            ref=arr[i][j];
        }
        System.out.println(i+" , "+j);
    }
}