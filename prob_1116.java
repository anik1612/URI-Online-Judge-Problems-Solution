package URI_Problem;

import java.util.Scanner;

public class prob_1116 {
    public static void main(String[] args) {
        int n;
        float x, y, result;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            y = in.nextInt();
            if(y==0){
                System.out.println("divisao impossivel");
            }
            else{
            result = x/y;
            System.out.println(""+result);
            }
            
        }
    }
}
