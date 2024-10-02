import java.util.*;

public class DescendingDoubles {

    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        String [] s=new String[n];
        
        Double [] array=new Double[n];
        
        for(int i=0;i<n;i++){
                s[i]= scan.next();
                array[i]=Double.parseDouble(s[i]);
        }
        
        Arrays.sort(array, Collections.reverseOrder());
        
        Set<String> p=new LinkedHashSet<>();
        
        for(Double t:array){
            for(int i=0;i<n;i++){
                if(t==Double.parseDouble(s[i])){ 
                    p.add(s[i]);
                }
            }
        }
        
        Iterator<String> it= p.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
