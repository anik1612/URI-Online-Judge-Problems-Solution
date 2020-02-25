
package URI_Problem;

import java.util.Scanner;

public class prob_1014 {
    public static void main(String[] args) {
        int x;
        float y, dis;
        
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextFloat();
        dis = x/y;
        System.out.printf("%.3f km/l\n",dis);
    }
}
