package Exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main extends Exception{
    public static void main(String[] args) throws Exceptions {

        //DIVIDING BY ZERO EXCEPTION

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

//        try{
//            int a = rnd.nextInt(-50, 50);
//            System.out.println("a = " + a);
//            System.out.print("x = ");
//            double x = scan.nextDouble();
//            double f = F(x,a);
//            if (x != a) {
//                System.out.println("F(x) = "+f);
//            } else if (x == a) {
//                throw new Exceptions("Numerical error!",x,a);
//            }
//        } catch (Exceptions e) {
//            System.out.println(e.getMessage());
//        } catch (InputMismatchException e) {
//            System.out.println("You didn't enter a number!");
//        } finally {
//            System.out.println("All good!");
//        }
//
//        System.out.println("\n===================================================\n");

        //OUTTA OF BOUND EXCEPTION
//        try{
//            int[] array = new int[10];
//            for (int i = 0; i < array.length; i++) {
//                array[i] = rnd.nextInt(-10,10);
//            }
//            System.out.println(Arrays.toString(array));
//            System.out.println("\n");
//
//            System.out.print("Enter a starting bound : ");
//            int startingBound = scan.nextInt();
//            System.out.print("Enter an ending bound : ");
//            int endingBound = scan.nextInt();
//
//            if (endingBound<= array.length) {
//                for (int i = startingBound; i <endingBound ; i++) {
//                    array[i] = rnd.nextInt(-10,10);
//                }
//                System.out.println(Arrays.toString(array));
//            } else if (endingBound> array.length) {
//                throw new OutOfBound("",array,endingBound);
//            }
//        } catch (OutOfBound e) {
//            System.out.println(e.getMessage());
//        }


        //THIRD TASK

        //#1
//        try {
//            int a,b,n;
//            System.out.print("Enter a : ");
//            a = scan.nextInt();
//            System.out.print("Enter b : ");
//            b = scan.nextInt();
//            System.out.print("Enter the size of the array  : ");
//            n = scan.nextInt();
//            int[] array2 = new int[n];
//            if (a<= array2.length && b<= array2.length) {
//                for (int i = 0; i < array2.length; i++) {
//                    if (i>=a && i<=b) {
//                        System.out.print("Enter an integer : ");
//                        array2[i] = scan.nextInt();
//                    } else {
//                        array2[i] = rnd.nextInt(-10,10);
//                    }
//                }
//                System.out.println("\n");
//
//                for (int i = 0; i < array2.length; i++) {
//                    System.out.print(array2[i]+" ");
//                }
//            } else if (a> array2.length | b> array2.length) {
//                throw new OutOfBound(" ",array2,a,b);
//            }
//        } catch (OutOfBound e) {
//            System.out.println(e.getMessage());
//        }

        //#2
        try{
            double x; int a;
            double[] fArray = new double[5];
            for (int i = 0; i < fArray.length; i++) {
                System.out.print("Enter x : ");
                x = scan.nextDouble();
                System.out.print("Enter a : ");
                a = scan.nextInt();
                if (x != a){
                    fArray[i] = F(x,a);
                } else {
                    throw new Exceptions("Numerical error!",x,a);
                }


            }
            for (int i = 0; i < fArray.length; i++) {
                System.out.print(fArray[i]+" , ");
            }
        } catch (Exceptions e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("You didn't enter a number!");
        }

    }



    //CALCULATING THE VALUE OF THE FUNCTION
    public static double F(double x, double a) {
        if (x<0) {
            return x +Math.pow(Math.sin((1/(x-a))+4),2);
        } else {
            return (a*x)/(Math.sqrt(a*a - x*x));
        }
    }
}
