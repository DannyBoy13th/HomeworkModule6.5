package MusicStoreV2;

import java.util.Scanner;

/**
 * Created by DannyBoy13th on 17.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MusicStore Jamz = new MusicStore();
        MusicInstrument OrdinaryInstrument = new MusicInstrument();
        Guitar Rocker = new Guitar();
        Piano Mozart = new Piano();
        Trumpet Horn = new Trumpet();
        Scanner Order = new Scanner(System.in);
        int PianosLeft;
        int GuitarsLeft;
        int HornsLeft;
        int pianoOrder;
        int guitarOrder;
        int trumpetOrder;
        Scanner orderScanner = new Scanner(System.in);

        Jamz.Inventory();
        System.out.println();

        Rocker.Name();
        System.out.print("$");
        Rocker.Price();
        System.out.print("Quantity: " + Rocker.getQuantity());
        System.out.println();
        Rocker.Play();
        System.out.println();

        Mozart.Name();
        System.out.print("$");
        Mozart.Price();
        System.out.print("Quantity: " + Mozart.getQuantity());
        System.out.println();
        Mozart.Play();
        System.out.println();

        Horn.Name();
        System.out.print("$");
        Horn.Price();
        System.out.print("Quantity: " + Horn.getQuantity());
        System.out.println();
        Horn.Play();
        System.out.println();


        System.out.println("Please, type in how many guitars would you like to order");
        System.out.println();

        if (orderScanner.hasNextInt()) {
            guitarOrder = orderScanner.nextInt();

            System.out.println("Please, type in how many pianos would you like to order");
            System.out.println();
            pianoOrder = orderScanner.nextInt();

            System.out.println("Please, type in how many trumpets would you like to order");
            System.out.println();
            trumpetOrder = orderScanner.nextInt();

            System.out.println("Your order is: ");
            System.out.println("Guitars: " + guitarOrder);
            System.out.println("Pianos: " + pianoOrder);
            System.out.println("Trumpets: " + trumpetOrder);

            GuitarsLeft = Rocker.getQuantity() - guitarOrder;
            PianosLeft = Mozart.getQuantity()-pianoOrder;
            HornsLeft =  Horn.getQuantity() - trumpetOrder;

            System.out.println();
            System.out.println("Inventory of the store after the purchase: ");
            System.out.println();
            System.out.println("Guitars: " + GuitarsLeft);
            System.out.println("Pianos: " + PianosLeft);
            System.out.println("Trumpets: " + HornsLeft);


        }

    }
}