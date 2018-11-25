package Instruments;

import Enums.Instrument_types;
import interfaces.IPlay;

public class Keyboard extends Instrument implements IPlay {

    private int size;

    public Keyboard(Instrument_types instrument_types, String brand, int buyPrice, int sellPrice, int size) {
        super(instrument_types, brand, buyPrice, sellPrice);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String play() {
        return "Plonk plonk plonk";
    }
}
