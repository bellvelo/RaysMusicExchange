package Instruments;

import Enums.Instrument_types;
import interfaces.IPlay;

public class Trumpet extends Instrument implements IPlay {

    private String note;

    public Trumpet(Instrument_types instrument_types, String brand, int buyPrice, int sellPrice, String note) {
        super(instrument_types, brand, buyPrice, sellPrice);
        this.note = note;
    }

    public String play() {
        return "Toot toot toot";
    }
}
