package URI_Problem;

import java.util.Scanner;

public class prob_1099 {

    public static void main(String[] args) {
        int N, X, Y, temp; 
                
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        int sum_j[] = new int[N];
        int sum_k[] = new int[N];
        for (int i = 0; i < N; i++) {
        X = in.nextInt();
        Y = in.nextInt();
        if (X > Y) {
            temp = X;
            X = Y;
            Y = temp;
        }
        
            for (int j = X + 1; j <= Y - 1; j++) {
                if (j % 2 == 1) {
                    sum_j[i] += j;
                }
            } 
        }
        for (int i = 0; i < N; i++) {
            System.out.printf("%d\n", sum_j[i]);
        }
      }
    }

