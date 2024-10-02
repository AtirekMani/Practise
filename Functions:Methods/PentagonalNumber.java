public class PentagonalNumber {
    public static int pentagonal(int n){
        return (3 * n*n - n)/2;
    }
    public static void main(String[] args) {
        int count=1;
        for (int i=1;i<=50;i++){
            System.out.printf("%-6d", pentagonal(i));
            if(count%10==0) {
                System.out.println();
            }    count++;
        }
    }
}
