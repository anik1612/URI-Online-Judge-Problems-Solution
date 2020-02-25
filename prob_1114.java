package URI_Problem;

import java.util.Scanner;

public class prob_1114 {
    public static void main(String[] args) {
        int num, pass=2002;
        
        Scanner in = new Scanner(System.in);
         
        while(true){
            num = in.nextInt();
            if(num == pass){
                System.out.println("Acesso Permitido");
                break;
            }
            else{
                System.out.println("Senha Invalida");
            }
        }
    }
}
