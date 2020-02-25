
package URI_Problem;

import java.util.Scanner;

public class prob_1020 {
    public static void main(String[] args) {
        int n, aux;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(n/365+" ano(s)");
        aux = n%365;
        System.out.println(aux/30+" mes(es)");
        aux%=30;
        System.out.println(aux+" dia(s)");
    }
}
