
package URI_Problem;

import java.util.Scanner;

public class prob_1011 {
    public static void main(String[] args) {
        double pi = 3.14159, R, formula;
        
        //formula = (4/3) * pi * R^3;
        
        Scanner in = new Scanner(System.in);
        R = in.nextFloat();
        formula = (4/3.0) * pi * Math.pow(R, 3);
        
        //display result
        System.out.printf("VOLUME = %.3f\n", formula);
    }
}
