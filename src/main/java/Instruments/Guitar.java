package Instruments;


import Enums.Instrument_types;
import interfaces.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int noOfStrings;
    private String style;


    public Guitar(Instrument_types instrument_types, String brand, String style, int noOfStrings, int buyPrice, int sellPrice) {
        super(instrument_types, brand, buyPrice, sellPrice);
        noOfStrings = noOfStrings;
        this.style = style;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }


    public void setNoOfStrings(int noOfStrings) {
        noOfStrings = noOfStrings;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String play() {
        return "Riff riff riff";
    }


}
