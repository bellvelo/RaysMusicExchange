package Instruments;

import interfaces.IPlay;
import interfaces.ISell;

import Enums.Instrument_types;
import interfaces.ISell;

public abstract class Instrument implements ISell {

    private Instrument_types instrument_types;
    private String brand;
    private int buyPrice;
    private int sellPrice;


    public Instrument(Instrument_types instrument_types, String brand, int buyPrice, int sellPrice) {
        this.instrument_types = instrument_types;
        this.brand = brand;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public Instrument_types getInstrument_types() {
        return instrument_types;
    }

    public void setIntrument_types(Instrument_types intrument_types) {
        this.instrument_types = intrument_types;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkUp() {
        return getSellPrice() - getBuyPrice();
    }


}
