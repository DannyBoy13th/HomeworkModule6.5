package MusicStoreV2;


import java.util.List;
import java.util.Map;

public class MusicInstrument {
    private String Name;
    private String Type;
    private int Price;
    private int Quantity;

    public void Play() {
        System.out.println("Playing something");
    }

    public void Stop() {
        System.out.println("Music Stopped");
    }

    public void Price() {
        System.out.println("Display price");
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}