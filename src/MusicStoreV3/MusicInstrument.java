package MusicStoreV3;

abstract class MusicInstrument {
   public abstract String getType();
    @Override
    public String toString(){
        return "Instrument{" +getType()+"}";
        }
    }
