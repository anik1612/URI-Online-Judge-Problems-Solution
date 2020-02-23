
package URI_Problem;

import java.util.Scanner;

public class prob_1075 {
    public static void main(String[] args) {
        int N;
        
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
            for(int i=1; i<=10000; i++){
                if(i%N==2){
                    System.out.println(""+i);
                }
            }
    }

}
