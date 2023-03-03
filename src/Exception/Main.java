package Exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main extends Exception{
    public static void main(String[] args) throws Exceptions {

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        try{
            int a = rnd.nextInt(-50, 50);
            System.out.println("a = " + a);
            System.out.print("x = ");
            double x = scan.nextDouble();
            double f = F(x,a);
            if (x != a) {
                System.out.println("F(x) = "+f);
            } else if (x == a) {
                throw new Exceptions("Numerical error!",x,a);
            }
        } catch (Exceptions e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("You didn't enter a number!");
        } finally {
            System.out.println("All good!");
        }

        System.out.println("\n===================================================\n");
        try{
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = rnd.nextInt(-10,10);
            }
            System.out.println(Arrays.toString(array));
            System.out.println("\n");

            System.out.print("Enter a starting bound : ");
            int startingBound = scan.nextInt();
            System.out.print("Enter an ending bound : ");
            int endingBound = scan.nextInt();

            if (endingBound<= array.length) {
                for (int i = startingBound; i <endingBound ; i++) {
                    array[i] = rnd.nextInt(-10,10);
                }
                System.out.println(Arrays.toString(array));
            } else if (endingBound> array.length) {
                throw new OutOfBound("",array,endingBound);
            }
        } catch (OutOfBound e) {
            System.out.println(e.getMessage());
        }

    }


    public static double F(double x, double a) {
        if (x<0) {
            return x +Math.pow(Math.sin((1/(x-a))+4),2);
        } else if (x>=0) {
            return a*x/(Math.sqrt(a*a - x*x));
        } else {
            return Double.parseDouble(null);
        }
    }
}
