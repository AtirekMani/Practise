public class IncDec {
    //increasin
    public static void dec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        dec(n-1);
    }
    //decreasing
    public static void inc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        inc(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        
        int n;
        //Decreasing call
        dec(10);
        System.out.println();
        //increasing call
        inc(10);
    }
}
