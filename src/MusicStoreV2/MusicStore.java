package MusicStoreV2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class MusicStore {

    public String Inventory = "You`re browsing inventory of JAMZ HARD ROCK STORE:";
    public String Rocker = "Wide variety of acustic and electro guitars for any kind of freak";
    public String Mozart = "If you have shitloads of money and prefer to listen to boring music we have a wide range of pianos";
    public String Horn = "Trumpets for anyone who is still interested in this kind of music";

    private List Store = Arrays.asList(Rocker, Mozart, Horn);

    public String getContent() {
        return Inventory;
    }

    public void setContent(String content) {
        Inventory = content;
    }

    Iterator itr = Store.iterator();

    public void Inventory() {
        System.out.println(Inventory);
        while (itr.hasNext())

            System.out.println(itr.next());
    }

    }



