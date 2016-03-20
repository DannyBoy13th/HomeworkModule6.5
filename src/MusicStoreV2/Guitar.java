package MusicStoreV2;

/**
 * Created by DannyBoy13th on 17.03.2016.
 */
public class Guitar extends MusicInstrument {
    public void Name() {
        System.out.println("Rocker 2016");
    }

    public void Play() {
        System.out.println("Playing some heavy metal extremely loud music");
    }

    public void Stop() {
        System.out.println("Music stopped");
    }

    public void Price() {
        System.out.println(1500);
    }

    public int Quantity = 16;

    @Override
    public int getQuantity() {
        return Quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
