
package URI_Problem;

import java.util.Scanner;

public class prob_1018 {
    public static void main(String[] args) {
        int N, note_100, note_50, note_20, note_10, note_5, note_2, note_1, remainder;
        Scanner in = new Scanner(System.in);
        
        N = in.nextInt();
        
        note_100 = N/100;
        remainder = N%100;
        note_50 = remainder/50;
        remainder %= 50;
        note_20 = remainder/20;
        remainder %= 20;
        note_10 = remainder/10;
        remainder %= 10;
        note_5 = remainder/5;
        remainder %= 5;
        note_2 = remainder/2;
        remainder %= 2;
        note_1 = remainder/1;
        
        System.out.println(N+"");
        System.out.println(note_100+" nota(s) de R$ 100,00");
        System.out.println(note_50+" nota(s) de R$ 50,00");
        System.out.println(note_20+" nota(s) de R$ 20,00");
        System.out.println(note_10+" nota(s) de R$ 10,00");
        System.out.println(note_5+" nota(s) de R$ 5,00");
        System.out.println(note_2+" nota(s) de R$ 2,00");
        System.out.println(note_1+" nota(s) de R$ 1,00");
        
    }
}
