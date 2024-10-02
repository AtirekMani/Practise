import java.util.*;

public class DuplicateWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        in.nextLine();
        
        
        while(n--!=0){
            String str=in.nextLine();
            String [] arr=str.split("\\s+");
            Set<String> s= new LinkedHashSet<>();
            
            for(String word:arr){
                String l=word.toLowerCase();
                if(!s.contains(l)){
                    s.add(word);
                }
            }
            for(String a:s){
                System.out.print(a+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
