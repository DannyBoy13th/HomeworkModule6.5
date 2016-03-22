package MusicStoreV3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by DannyBoy13th on 17.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MusicStore Store = new MusicStore();

        ArrayList<Guitar> Guitars = new ArrayList<>();
        for (int i = 0; i < 60; i++) {
            Guitars.add(new Guitar());
        }
        Store.setGuitars(Guitars);

        ArrayList<Piano> Pianos = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Pianos.add(new Piano());
        }
        Store.setPianos(Pianos);

        ArrayList<Trumpet> Trumpets = new ArrayList<>();
        for (int i = 0; i < 78; i++) {
            Trumpets.add(new Trumpet());
        }
        Store.setTrumpets(Trumpets);

        System.out.println(Store);

        Map<String, Integer> order = new HashMap<>();
        order.put("Guitar", 9);
        order.put("Piano", 4);
        order.put("Trumpet", 13);


        System.out.println("Your order is: ");
        System.out.println();

        List<MusicInstrument> guitarsToRemove = prepareOrder(Store, order);
        System.out.println("guitars: " + guitarsToRemove.size());

        List<MusicInstrument> pianosToRemove = prepareOrder(Store, order);
        System.out.println("pianos: " + pianosToRemove.size());

        List<MusicInstrument> trumpetsToRemove = prepareOrder(Store, order);
        System.out.println("trumpets: " + trumpetsToRemove.size());


        System.out.println(Store);
    }

    private static List<MusicInstrument> prepareOrder(MusicStore Store, Map<String, Integer> order) {
        ArrayList<MusicInstrument> result = new ArrayList<>();

        List<Guitar> guitars = Store.getGuitars();
        int numberOfGuitarsToRemove = order.get("Guitar");
        if (Store.getGuitars().size() < numberOfGuitarsToRemove) throw  new IllegalStateException();
        List<Guitar> guitarsToRemove = Store.getGuitars().subList(0, numberOfGuitarsToRemove);
        List<Guitar> guitarsToStay = Store.getGuitars().subList(numberOfGuitarsToRemove, guitars.size());
        Store.setGuitars(guitarsToStay);
        result.addAll(guitarsToRemove);

        List<Piano> pianos = Store.getPianos();
        int numberOfPianosToRemove = order.get("Piano");
        if (Store.getPianos().size() < numberOfPianosToRemove) throw  new IllegalStateException();
        List<Piano> pianosToRemove = Store.getPianos().subList(0, numberOfPianosToRemove);
        List<Piano> pianosToStay = Store.getPianos().subList(numberOfPianosToRemove, pianos.size());
        Store.setPianos(pianosToStay);
        result.addAll(pianosToRemove);

        List<Trumpet> trumpets = Store.getTrumpets();
        int numberOfTrumpetsToRemove = order.get("Trumpet");
        if (Store.getTrumpets().size() < numberOfTrumpetsToRemove) throw  new IllegalStateException();
        List<Trumpet> trumpetsToRemove = Store.getTrumpets().subList(0, numberOfTrumpetsToRemove);
        List<Trumpet> trumpetsToStay = Store.getTrumpets().subList(numberOfTrumpetsToRemove, trumpets.size());
        Store.setTrumpets(trumpetsToStay);
        result.addAll(trumpetsToRemove);

        return result;
    }

}



