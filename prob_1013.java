
package URI_Problem;

import java.util.Scanner;

public class prob_1013 {
    public static void main(String[] args) {
        int n1, n2, n3, min, mid, max = 0;
        Scanner in = new Scanner(System.in);
        n1 = in.nextInt();
            n2 = in.nextInt();
            n3 = in.nextInt();
            
            min = Math.min(n1, Math.min(n2, n3));
            if (min == n1) {
                min = n1;
                mid = Math.min(n2, n3);
                max = Math.max(n2, n3);
            } else if (min == n2) {
                min = n2;
                mid = Math.min(n1, n3);
                max = Math.max(n1, n3);
            } else if (min == n3) {
                min = n3;
                mid = Math.min(n1, n2);
                max = Math.max(n1, n2);

            }
            
            System.out.printf("%d eh o maior\n", max);
    }
}
