package MusicStoreV3;

/**
 * Created by Daniel Solo on 17.03.2016.
 */
abstract class MusicInstrument {
   public abstract String getType();
    @Override
    public String toString(){
        return "Instrument{" +getType()+"}";
        }
    }
