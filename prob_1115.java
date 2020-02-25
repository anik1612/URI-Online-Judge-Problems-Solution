
package URI_Problem;

import java.util.Scanner;

public class prob_1115 {
    public static void main(String[] args) {
        int x,y;
        Scanner in = new Scanner(System.in);
        
        while(true){
        x = in.nextInt();
        y = in.nextInt();
        
        if(x>0 && y>0){
            System.out.println("primeiro");
        }
        else if(x>0 && y<0){
            System.out.println("quarto");
        }
        else if(x<0 && y>0){
            System.out.println("segundo");
        }
        else if(x<0 && y<0){
            System.out.println("terceiro");
        }
        else if(x=='\0' || y=='\0'){
            break;
        }
    }
    }
}
