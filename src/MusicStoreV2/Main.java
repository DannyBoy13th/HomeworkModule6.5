package MusicStoreV2;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) throws WrongInstrumentQuantity, WrongInstrumentName {
        MusicStore Jamz = new MusicStore();
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


        int GuitarsLeft = Rocker.getQuantity();
        int PianosLeft = Mozart.getQuantity();
        int HornsLeft = Horn.getQuantity();


        Map<String, Integer> order = new HashMap<>();
        order.put("Guitar",15);
        order.put("Piano", 7);
        order.put("Trumpet", 10);


        System.out.println("Your order is: ");
        System.out.println();
        System.out.println(order);
        System.out.println();


        try {

            int numberOfGuitarsToRemove = order.get("Guitar");
            if (numberOfGuitarsToRemove > Rocker.getQuantity()) {
                throw new WrongInstrumentQuantity();
            }
            if (order.containsKey("Guitar")){
                GuitarsLeft = Rocker.getQuantity() - order.get("Guitar");
            }else
                throw new WrongInstrumentName();


            int numberOfPianosToRemove = order.get("Piano");
            if (numberOfPianosToRemove > Mozart.getQuantity()) {
                throw new WrongInstrumentQuantity();
            }
            if (order.containsKey("Piano")){
                PianosLeft = Mozart.getQuantity() - order.get("Piano");
            }else
                throw new WrongInstrumentName();

            int numberOfTrumpetsToRemove = order.get("Trumpet");
            if (numberOfTrumpetsToRemove > Horn.getQuantity()) {
                throw new WrongInstrumentQuantity();
            }
            if (order.containsKey("Trumpet")){
                HornsLeft = Horn.getQuantity() - order.get("Trumpet");
            }else
                throw new WrongInstrumentName();

        } catch (WrongInstrumentName e) {
            System.out.println("ERROR: Wrong Instrument name!");
        } catch (WrongInstrumentQuantity e) {
            System.out.println("ERROR: Not enough Instruments");
        }



            System.out.println();
            System.out.println("Inventory after the purchase:");
            System.out.println();
            System.out.println("Guitars: " + GuitarsLeft);
            System.out.println("Pianos: " + PianosLeft);
            System.out.println("Trumpets: " + HornsLeft);

        }

    }
