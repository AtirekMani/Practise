import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args){
        int[] a={3,4,5,3,2,1,3,2,1};
        Set<Integer> t=new HashSet<>();
        for(int i:a){
            t.add(i);
        }

        System.out.println("After removing duplicates: "+t);
    }
}
