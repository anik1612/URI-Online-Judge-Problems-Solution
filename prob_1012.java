package URI_Problem;

import java.util.Scanner;

public class prob_1012 {
    public static void main(String[] args) {
        double pi = 3.14159;
        //CALCULATION FORMULA
        //triangle formula = 1/2 * A * C;
        //circle formula = pi * c^2;
        //trapezium formula = ((A+B)/2)*C;
        //square formula = B^2;
        //rectangle formula = A*B;
        
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();
        
        double triangle = (1/2.0) * A * C;
        double circle = pi * Math.pow(C, 2);
        double trapezium = ((A+B)/2)*C;
        double square = Math.pow(B, 2);
        double rectangle = A*B;
        
        System.out.printf("TRIANGULO: %.3f\n", triangle);
        System.out.printf("CIRCULO: %.3f\n", circle);
        System.out.printf("TRAPEZIO: %.3f\n", trapezium);
        System.out.printf("QUADRADO: %.3f\n", square);
        System.out.printf("RETANGULO: %.3f\n", rectangle);
        
    }
}
