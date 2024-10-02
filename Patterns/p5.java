import java.util.*;

public class p5 {
    
        public static void main(String[] args) {

            try (Scanner sc = new Scanner(System.in)) {
                int row = sc.nextInt();
                int col = sc.nextInt();
                for(int line=1;line<=row;line++){
                    for (int pattern=1;pattern <=col;pattern++){
                        if(line==1|| line==row || pattern==1 || pattern==col){
                            System.out.print("$");
                        }
                        else{
                            System.out.print(" ");
                        }
                       
                    }
                    System.out.println();
                }
            }
        }    
}
