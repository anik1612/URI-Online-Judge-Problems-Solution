
package URI_Problem;

import java.util.Scanner;

public class prob_1065 {
    public static void main(String[] args) {
        int arr[] = new int[5], even=0;
        Scanner in = new Scanner(System.in);
        for(int i=0; i<5; i++){
            arr[i] = in.nextInt();
            if(arr[i]%2==0){
                even++;
            }
        }
        System.out.println(even+" valores pares");
    }
}
