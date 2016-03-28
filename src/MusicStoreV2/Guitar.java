package MusicStoreV2;


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

    public void Type() {
        System.out.println("Guitar");
    }


    public int Quantity = 23;

    @Override
    public int getQuantity() {
        return Quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }


}
