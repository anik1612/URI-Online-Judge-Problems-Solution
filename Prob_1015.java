
package URI_Problem;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Prob_1015 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, distance;
        Scanner input = new Scanner(System.in);
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        
        distance = sqrt(Math.pow(x2-x1,2)+(Math.pow(y2-y1,2)));
        System.out.printf("%.4f\n",+distance);
        //calculation part
//        double p1, p2;
//        p1 = (x2-x1);
//        p1*=p1;
//        p2 = (y2-y1);
//        p2*=p2;
//        double distance = sqrt(p1 + p2);
//        System.out.printf("%.4f\n",+distance);
    }
    
//    public static void calculation(double x1, double y1, double x2, double y2){
//        double p1, p2;
//        p1 = (x2-x1);
//        p1*=p1;
//        p2 = (y2-y1);
//        p2*=p2;
//        double distance = sqrt(p1 + p2);
//        System.out.printf("%.4f",+distance);
//    }
}
