package SpaceCounter;

import java.lang.invoke.WrongMethodTypeException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by DannyBoy13th on 11.03.2016.
 */
public class Counter {
    public static void main(String[] args) {

        Scanner ShapeScanner = new Scanner(System.in);
        Scanner TriangleMeter = new Scanner(System.in);
        Scanner CircleMeter = new Scanner(System.in);
        Scanner RectangleMeter = new Scanner(System.in);

        double Height;
        double sideC;
        double sideA;
        double sideB;
        double Radius;
        double Pi = 3.1412;

        System.out.println("Space Counter");
        System.out.println();
        System.out.println("Please enter a shape which you would like to count (Triangle, Circle or Rectangle): ");


        if (ShapeScanner.hasNext("Triangle")){

            System.out.println("Please, print in the Height of triangle");

            if (TriangleMeter.hasNextDouble()) {
                Height = TriangleMeter.nextDouble();

                System.out.println();
                System.out.println("Please, print in Side C of the triangle");
                sideC = TriangleMeter.nextDouble();

                System.out.println();
                System.out.println("Result is: " + Height * sideC / 2);

            }
        }
        if (ShapeScanner.hasNext("Circle")){
            System.out.println("Please, print in radius of the circle");

            if (CircleMeter.hasNextDouble()){
                Radius = CircleMeter.nextDouble();

                System.out.println();
                System.out.println("Result is: " + Radius * Radius *Pi);
            }
        }
        if (ShapeScanner.hasNext("Rectangle")){
            System.out.println("Please, print in Side A of the rectangle");

            if (RectangleMeter.hasNextDouble()){
                sideA = RectangleMeter.nextDouble();

                System.out.println();
                System.out.println("Please, print in Side B of the rectangle");
                sideB = RectangleMeter.nextDouble();

                System.out.println();
                System.out.println("Result is: " + sideB * sideA);
            }
        }
        try {
            if (ShapeScanner.hasNext()) {
                throw new InputMismatchException();
            }
        }catch (InputMismatchException A){
            System.out.println("ERROR: Wrong Shape!");
        }

    }

}