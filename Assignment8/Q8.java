interface Instrument {
    void play();
}

interface StringInstrument extends Instrument {
    void tuneStrings();
}

class Guitar implements StringInstrument {
    @Override
    public void play() {
        System.out.println("Guitar is playing a melody.");
    }

    @Override
    public void tuneStrings() {
        System.out.println("Tuning guitar strings...");
    }
}

public class Q8 {
    public static void main(String[] args) {
        // Using polymorphism with Instrument reference
        Instrument instrument = new Guitar();
        instrument.play();

        // Using polymorphism with StringInstrument reference
        StringInstrument stringInstrument = new Guitar();
        stringInstrument.play();
        stringInstrument.tuneStrings();
    }
}
