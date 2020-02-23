package URI_Problem;

public class prob_1098 {

    public static void main(String[] args) {
        float i, j, k = 0;
        int l, x=2;
        for (i = 0; i <= 2; i += 0.2, k += 0.2) {
            for (j = 1 + k; j <= 3 + k; j++) {
                if(i==0.0 || i==1.0){
                    System.out.printf("I=%.0f J=%.0f\n", i, j);
                    continue;
                }
                System.out.printf("I=%.1f J=%.1f\n", i, j);
            }
        }
        for(l=3; l<=5; l++){
            System.out.printf("I=%d J=%d\n",x,l);
        }
    }
}
