public class RangeOfCharacters {
    
    public static void range(char start, char end, int limit){
        for(int i=1;start<=end;i++,start++){
            System.out.print(start +" ");
            if(i%limit==0) System.out.println();
        }
    }
    public static void main(String[] args) {
        range('(', 'z', 20);
    }

}
