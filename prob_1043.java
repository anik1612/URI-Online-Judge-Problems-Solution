package URI_Problem;


import java.util.Scanner;

public class prob_1043 {
    public static void main(String[] args) {
        float a, b, c;
        Scanner in = new Scanner(System.in);
        a = in.nextFloat();
        b = in.nextFloat();
        c= in.nextFloat();
        if(a+b>c && a+c>b && b+c>a){
            float triangle = a+b+c;
            System.out.println("Perimetro = "+triangle);
        }
        else{
            float area = ((a+b)*c)/2;
            System.out.println("Area = "+area);
        }
}
}
