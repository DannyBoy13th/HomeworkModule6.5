package MusicStoreV2;

/**
 * Created by DannyBoy13th on 17.03.2016.
 */
public class Piano extends MusicInstrument {

    public void Name() {
        System.out.println("Mozart 1778");
    }

    public void Play() {
        System.out.println("Playing some classic, sad tune");
    }

    public void Stop() {
        System.out.println("Music stopped");
    }

    public void Price() {
        System.out.println(15999);
    }

    private int Quantity = 2;

    @Override
    public int getQuantity() {
        return Quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

}