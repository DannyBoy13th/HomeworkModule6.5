package MusicStoreV2;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MusicStore Jamz = new MusicStore();
        MusicInstrument OrdinaryInstrument = new MusicInstrument();
        Guitar Rocker = new Guitar();
        Piano Mozart = new Piano();
        Trumpet Horn = new Trumpet();



        Jamz.Inventory();
        System.out.println();

        Rocker.Name();
        Rocker.Type();
        System.out.print("$");
        Rocker.Price();
        System.out.print("Quantity: " + Rocker.getQuantity());
        System.out.println();
        Rocker.Play();
        System.out.println();

        Mozart.Name();
        Mozart.Type();
        System.out.print("$");
        Mozart.Price();
        System.out.print("Quantity: " + Mozart.getQuantity());
        System.out.println();
        Mozart.Play();
        System.out.println();

        Horn.Name();
        Horn.Type();
        System.out.print("$");
        Horn.Price();
        System.out.print("Quantity: " + Horn.getQuantity());
        System.out.println();
        Horn.Play();
        System.out.println();


        Map<String, Integer> order = new HashMap<>();
        order.put("Guitar", 111);
        order.put("Piano", 5);
        order.put("Trumpet", 12);



        System.out.println("Your order is: ");
        System.out.println();
        System.out.println(order);
        System.out.println();

        int numberOfGuitarsToRempve = order.get("Guitar");
        if (order.get("") != order.get("Guitar"))
            throw new WrongInstrumentNameException
        if (numberOfGuitarsToRempve > Rocker.getQuantity())
                throw new IllegalStateException();
        int GuitarsLeft = Rocker.getQuantity()-order.get("Guitar");


        int numberOfPianosToRemove = order.get("Piano");
        if (numberOfPianosToRemove > Mozart.getQuantity())
            throw new IllegalStateException();
        int PianosLeft = Mozart.getQuantity() - order.get("Piano");

        int numberOfTrumpetsToRemove = order.get("Trumpet");
        if (numberOfTrumpetsToRemove > Horn.getQuantity())
            throw new IllegalStateException();
        int HornsLeft = Horn.getQuantity() - order.get("Trumpet");




        System.out.println("Inventory after the purchase:");
        System.out.println("Guitars: " + GuitarsLeft);
        System.out.println("Pianos: " + PianosLeft);
        System.out.println("Trumpets: " + HornsLeft);

        }

    }