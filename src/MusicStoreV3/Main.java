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
        for (int i = 0; i < 16; i++) {
            Guitars.add(new Guitar());
        }
        Store.setGuitars(Guitars);

        ArrayList<Piano> Pianos = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Pianos.add(new Piano());
        }
        Store.setPianos(Pianos);

        ArrayList<Trumpet> Trumpets = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Trumpets.add(new Trumpet());
        }
        Store.setTrumpets(Trumpets);

        System.out.println(Store);

        Map<String, Integer> order = new HashMap<>();
        order.put("Guitar", 8);
        order.put("Piano", 1);
        order.put("Trumpet", 4);


        System.out.println("Your order is: ");
        System.out.println();
        List<MusicInstrument> guitarsToRemove = prepareOrder(Store, order);
        System.out.println("guitars: " + guitarsToRemove.size());

        List<MusicInstrument> pianosToRemove = prepareOrder(Store, order);
        System.out.println("pianos: " + pianosToRemove.size());

        List<MusicInstrument> trumpetsToRemove = prepareOrder(Store, order);
        System.out.println("trumpets: " + trumpetsToRemove);


        System.out.println(Store);


    }

    private static List<MusicInstrument> prepareOrder(MusicStore store, Map<String, Integer> order) {
        ArrayList<MusicInstrument> result = new ArrayList<>();

        List<Guitar> guitars = store.getGuitars();
        int numberOfGuitarsToRemove = order.get("Guitar");
        if (store.getGuitars().size() < numberOfGuitarsToRemove) throw  new IllegalStateException();
        List<Guitar> guitarsToRemove = store.getGuitars().subList(0, numberOfGuitarsToRemove);
        List<Guitar> guitarsToStay = store.getGuitars().subList(numberOfGuitarsToRemove, guitars.size());
        store.setGuitars(guitarsToStay);
        result.addAll(guitarsToRemove);

        List<Piano> pianos = store.getPianos();
        int numberOfPianosToRemove = order.get("Piano");
        if (store.getPianos().size() < numberOfPianosToRemove) throw  new IllegalStateException();
        List<Piano> pianosToRemove = store.getPianos().subList(0, numberOfPianosToRemove);
        List<Piano> pianosToStay = store.getPianos().subList(numberOfPianosToRemove, pianos.size());
        store.setPianos(pianosToStay);
        result.addAll(pianosToRemove);

        List<Trumpet> trumpets = store.getTrumpets();
        int numberOfTrumpetsToRemove = order.get("Trumpet");
        if (store.getTrumpets().size() < numberOfTrumpetsToRemove) throw  new IllegalStateException();
        List<Trumpet> trumpetsToRemove = store.getTrumpets().subList(0, numberOfTrumpetsToRemove);
        List<Trumpet> trumpetsToStay = store.getTrumpets().subList(numberOfTrumpetsToRemove, trumpets.size());
        store.setTrumpets(trumpetsToStay);
        result.addAll(trumpetsToRemove);

        return result;

    }
}



