package MusicStoreV2;

/**
 * Created by DannyBoy13th on 17.03.2016.
 */
public class Trumpet extends MusicInstrument {
    public void Name() {
        System.out.println("Golden Horn");
    }

    public void Play() {
        System.out.println("Playing music which you definetely can hear on war parade");
    }

    public void Stop() {
        System.out.println("Music stopped");
    }

    public void Price() {
        System.out.println(999);
    }

    public int Quantity = 7;

    @Override
    public int getQuantity() {
        return Quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
