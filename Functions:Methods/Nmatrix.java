public class Nmatrix {
    public static void matrix(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%-3d",(int)(Math.random()*2));
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        matrix(10);
    }
}
