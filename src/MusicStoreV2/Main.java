package MusicStoreV2;

import java.util.List;
import java.util.Scanner;

/**
 * Created by DannyBoy13th on 17.03.2016.
 */
public class Main {
    public static void main(String [] args){
        MusicStore Jamz=new MusicStore();
        MusicInstrument OrdinaryInstrument=new MusicInstrument();
        Guitar Rocker=new Guitar();
        Piano Mozart=new Piano();
        Trumpet Horn=new Trumpet();
        Scanner Order=new Scanner(System.in);
        String PianosLeft= "Pianos left: " ;
        String GuitarsLeft= "Guitars left: ";
        String HornsLeft = "Trumpets left: ";

        Jamz.Inventory();
        System.out.println();

        Rocker.Name();
        System.out.print("$");
        Rocker.Price();
        System.out.print("Quantity: ");
        Rocker.Quantity();
        Rocker.Play();
        System.out.println();

        Mozart.Name();
        System.out.print("$");
        Mozart.Price();
        System.out.print("Quantity: ");
        Mozart.Quantity();
        Mozart.Play();
        System.out.println();

        Horn.Name();
        System.out.print("$");
        Horn.Price();
        System.out.print("Quantity: ");
        Horn.Quantity();
        Horn.Play();
        System.out.println();

        System.out.println("Please, type in what would you like to order");
        System.out.println();


        System.out.print(PianosLeft);
        Mozart.Quantity();
        System.out.print(GuitarsLeft);
        Rocker.Quantity();
        System.out.print(HornsLeft);
        Horn.Quantity();

    }
}