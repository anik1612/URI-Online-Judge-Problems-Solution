package URI_Problem;

import java.util.Scanner;

public class prob_1113 {
    public static void main(String[] args) {
        int x,y;
        Scanner in = new Scanner(System.in);
        while(true){
            x = in.nextInt();
            y = in.nextInt();
            if(x == y){
                break;
            }
            else if(x>y){
                System.out.println("Decrescente");
            }
            else{
                System.out.println("Crescente");
            }
        }
    }
}
