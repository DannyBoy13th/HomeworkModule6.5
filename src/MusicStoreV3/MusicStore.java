package MusicStoreV3;

import java.util.List;

/**
 * Created by Daniel Solo on 17.03.2016.
 */
public class MusicStore {
   List<Guitar> Guitars;
    List<Piano> Pianos;
    List<Trumpet> Trumpets;

    public List<Guitar> getGuitars() {
        return Guitars;
    }

    public void setGuitars(List<Guitar> guitars) {
        Guitars = guitars;
    }

    public List<Piano> getPianos() {
        return Pianos;
    }

    public void setPianos(List<Piano> pianos) {
        Pianos = pianos;
    }

    public List<Trumpet> getTrumpets() {
        return Trumpets;
    }

    public void setTrumpets(List<Trumpet> trumpets) {
        Trumpets = trumpets;
    }

    @Override
    public String toString() {
        return "Music Store{" + "Guitars="+Guitars.size() +", Pianos=" + Pianos.size() +", Trumpets=" + Trumpets.size() + '}';
    }
}

