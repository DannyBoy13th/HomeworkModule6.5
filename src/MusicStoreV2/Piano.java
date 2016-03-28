package MusicStoreV2;


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

    private int Quantity = 8;

    public void Type() {
        System.out.println("Piano");
    }

    @Override
    public int getQuantity() {
        return Quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

}