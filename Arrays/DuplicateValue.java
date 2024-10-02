import java.util.Arrays;
 public class DuplicateValue {
//     public static int[] duplicate(int arr[]){
//         int[] count=new int[arr.length];
//         for(int i=0;i<arr.length;i++){
//             int k=0;
//             for(int j: arr){
//                 if(arr[i]==j){
//                     k++;
//                 }
//             }
//             count[i]=k;
//         }
//         return count;
//     }

    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,1};
        // int[] f= duplicate(arr);
        boolean[] printed=new boolean[arr.length];
        for(int t=0;t<arr.length;t++){
            if(!printed[t]){
                // for(int i=t;i<arr.length;i++){
                //     if(f[i]>=2 ){
                //         System.out.println(arr[i]+" is repeated "+f[i]+" times");
                //     }       
                // }
                    int count=0;
                    for(int j: arr){
                        if(arr[t]==j){
                            count++;
                        }
                    }
                    if(count>1){
                        System.out.println(arr[t]+" is repeated "+count+" times");
                    }
                }
            for(int k=0;k<arr.length;k++){
                if(arr[k]==arr[t]){
                    printed[k]=true;
                }
            }
        } 
    }
}
