
package URI_Problem;

import java.util.Scanner;

public class prob_1010 {
    public static void main(String[] args) {
        int p_code[] = new int[2];
        int quantity[] = new int[2];
        float price[] = new float[2];
        float total = 0;
        
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
        p_code[i] = in.nextInt();
        quantity[i] = in.nextInt();
        price[i] = in.nextFloat();
        total+= quantity[i] * price[i];
        }
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
