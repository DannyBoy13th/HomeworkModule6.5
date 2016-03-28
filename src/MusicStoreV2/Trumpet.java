package MusicStoreV2;


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

    public int Quantity = 15;

    public void Type() {
        System.out.println("Trumpet");
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
