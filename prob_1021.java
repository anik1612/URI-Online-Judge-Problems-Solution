package URI_Problem;

import java.util.Scanner;

public class prob_1021 {

    public static void main(String[] args) {
        float N;
        float remainder, coin_1;
        int note_100, note_50, note_20, note_10, note_5, note_2, note_1;
        int coin_50, coin_25, coin_10, coin_5;
        Scanner in = new Scanner(System.in);

        N = in.nextFloat();

        note_100 = (int) N / 100;
        remainder = N % 100;
        note_50 = (int) remainder / 50;
        remainder %= 50;
        note_20 = (int) remainder / 20;
        remainder %= 20;
        note_10 = (int) remainder / 10;
        remainder %= 10;
        note_5 = (int) remainder / 5;
        remainder %= 5;
        note_2 = (int) remainder / 2;
        remainder %= 2;
        note_1 = (int) remainder / 1;
        remainder %= 1;
        coin_50 = (int) (remainder / 0.50);
        remainder %= 0.50;
        coin_25 = (int) (remainder / 0.25);
        remainder %= 0.25;
        coin_10 = (int) (remainder / 0.10);
        remainder %= 0.10;
        coin_5 = (int) (remainder / 0.05);
        remainder %= 0.05;
        coin_1 = (float) (remainder / 0.01);

        System.out.println("NOTAS:");
        System.out.println(note_100 + " nota(s) de R$ 100.00");
        System.out.println(note_50 + " nota(s) de R$ 50.00");
        System.out.println(note_20 + " nota(s) de R$ 20.00");
        System.out.println(note_10 + " nota(s) de R$ 10.00");
        System.out.println(note_5 + " nota(s) de R$ 5.00");
        System.out.println(note_2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(note_1 + " moeda(s) de R$ 1.00");
        System.out.println(coin_50 + " moeda(s) de R$ 0.50");
        System.out.println(coin_25 + " moeda(s) de R$ 0.25");
        System.out.println(coin_10 + " moeda(s) de R$ 0.10");
        System.out.println(coin_5+ " moeda(s) de R$ 0.05");
        System.out.printf("%.0f moeda(s) de R$ 0.01\n", coin_1);
    }
}
