
package URI_Problem;

import java.util.Scanner;

public class prob_1101 {
    public static void main(String[] args) {
        int x,y, temp, sum=0;
        Scanner in = new Scanner(System.in);
        while(true){
        x = in.nextInt();
        y = in.nextInt();
        //if x or y less than equal 0 then break loop
        if(x<=0 || y<=0){
            break;
        }
        //if x greater than y swap x and y
        else if(x>y){
                temp = x;
                x = y;
                y = temp;
                for (int i = x; i <= y; i++) {
                    sum+=i;
                    System.out.printf("%d ",i);
                }
                System.out.printf("Sum=%d\n",sum);
            }
        //this condition execute when x less than y
        else{
            for (int i = x; i <= y; i++) {
                    sum+=i;
                    System.out.printf("%d ",i);
                }
                System.out.printf("Sum=%d\n",sum);
        }
        sum=0;
        }  
    }
    }

