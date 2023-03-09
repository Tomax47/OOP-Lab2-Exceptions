package Exception;

import java.util.Random;
import java.util.Scanner;

//UNKNOWN ERROR
public class NoYValueMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        try {

            int n, belongingPoints=0; double x, y;
            System.out.print("Enter the number of points : ");
            n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter x : ");
                x = scan.nextDouble();
                System.out.print("Enter y : ");
                y = scan.nextDouble();
                if(belongToTheArea(x,y)) {
                    belongingPoints++;
                }
            }

            System.out.println("\nThe number of points belonging to the shaded area is : "+belongingPoints);

        } catch (NumberFormatException e) {
            System.out.println("You didn't enter a value!");
        }

    }

    //CHECK THE BELONGING OF THE POINT
    public static boolean belongToTheArea(double x, double y) {
        return (y >= -4.0 && y <= 4.0 && x >= -4.0 && x <= 0.0 | x >= 0.0 && x<= 4.0 && y>= 0.0 && y <= 4.0 && x*x + y*y <= 32);
    }
}
