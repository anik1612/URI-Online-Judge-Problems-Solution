package URI_Problem;

import java.util.Scanner;

public class prob_1035 {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        
        if(b>c && d>a && c+d>a+b && c>=0 && d>=0 && a%2==0){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }
        
    }
}
