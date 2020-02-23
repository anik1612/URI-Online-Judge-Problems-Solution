
package URI_Problem;

import java.util.Scanner;

public class prob_1019 {
    public static void main(String[] args) {
        
        int N, hour, h, m, s;
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        h = N/3600;
        hour = N%3600;
        m = hour/60;
        s = hour%60;
        
        System.out.printf("%d:%d:%d\n",h,m,s);
    }
}
