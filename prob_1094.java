package URI_Problem;

import java.util.Scanner;

public class prob_1094 {

    public static void main(String[] args) {

        int total_C = 0, total_R = 0, total_S = 0, N, X, total = 0;
        float percent_C, percent_R, percent_S;
        String animal_char;
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        for (int i = 0; i < N; i++) {
            X = in.nextInt();
            animal_char = in.next();
            total += X;
            switch (animal_char) {
                case "C":
                    total_C += X;
                    break;
                case "R":
                    total_R += X;
                    break;
                case "S":
                    total_S += X;
                    break;
                default:
                    break;
            }
        }

        percent_C = (float) ((total_C * 100.00) / total);
        percent_R = (float) ((total_R * 100.00) / total);
        percent_S = (float) ((total_S * 100.00) / total);
        
        System.out.println("Total: " +total+ " cobaias");
        System.out.println("Total de coelhos: "+total_C);
        System.out.println("Total de ratos: "+total_R);
        System.out.println("Total de sapos: "+total_S);
        System.out.printf("Percentual de coelhos: %.2f",percent_C);
        System.out.println(" %");
        System.out.printf("Percentual de ratos: %.2f",percent_R);
        System.out.println(" %");
        System.out.printf("Percentual de sapos: %.2f",percent_S);
        System.out.println(" %");
    }
}
