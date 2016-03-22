package DistanceMeter;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Daniel Solo on 11.03.2016.
 */
public class DistanceMeter {
    public static void main(String[] args) {

        Scanner DistMet = new Scanner(System.in);

        double pointX1;
        double pointY1;
        double pointX2;
        double pointY2;

        System.out.println("Distance Meter");
        System.out.println();
        System.out.println("This program will help you to count a distance between two dots in two dimensional coordinates");
        System.out.println();
        System.out.println("Please print in coordinates for X1:");
        System.out.println();

        try {

            if (DistMet.hasNextDouble()) {

                pointX1 = DistMet.nextDouble();
                System.out.println();
                System.out.println("Please print in coordinates for Y1:");
                pointY1 = DistMet.nextDouble();
                System.out.println();
                System.out.println("Please print in coordinates for X2:");
                pointX2 = DistMet.nextDouble();
                System.out.println();
                System.out.println("Please print in coordinates for Y2:");
                pointY2 = DistMet.nextDouble();
                System.out.println();


                System.out.println("Now program will use formula to count the result");
                System.out.println();
                System.out.println("Result is: " + Math.sqrt(((pointX2 - pointX1) * (pointX2 - pointX1)) + ((pointY2 - pointY1) * (pointY2 - pointY1))) + "          Congratulations!");
            }

        }catch(InputMismatchException A){
            System.out.println("ERROR: Input has to be a number!");
        }
    }
}
