
package URI_Problem;

import java.util.Scanner;

public class prob_1078 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        N = in.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(i+" x "+N+" = "+N*i);
        }
    }
}
