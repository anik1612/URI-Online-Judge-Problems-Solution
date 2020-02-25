
package URI_Problem;

import java.util.Scanner;

public class prob_1017 {
    public static void main(String[] args) {
        int travel_hour, average_speed, distance;
        double require_fuel;
        
        Scanner in = new Scanner(System.in);
        
        travel_hour = in.nextInt();
        average_speed = in.nextInt();
        
        distance = travel_hour * average_speed;
        require_fuel = distance/12.0;
        
        System.out.printf("%.3f\n",require_fuel);
        
    }
}
