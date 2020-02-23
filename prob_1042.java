
package URI_Problem;

import java.util.Scanner;

public class prob_1042 {
    public static void main(String[] args) {
        int a,b,c, min, min1 = 0, min2 = 0;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        
        min = Math.min(a, Math.min(b,c));
        
        if(min == a){
            min = a;
            min1 = Math.min(b,c); 
            min2 = Math.max(b, c);
        }
        
        if(min == b){
            min = b; 
            min1 = Math.min(a, c);
            min2 = Math.max(a,c);
        }
        
        if(min == c){
            min = c; 
            min1 = Math.min(a, b);
            min2 = Math.max(a, b);
        }
        
        System.out.print(min+"\n"+min1+"\n"+min2+"\n\n");
        System.out.print(a+"\n"+b+"\n"+c+"\n");
    }
}
