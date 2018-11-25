package misc_items;

public class GuitarString extends Item {

    private String chord;

    public GuitarString(String description, int buyPrice, int sellPrice, String chord) {
        super(description, buyPrice, sellPrice);
        this.chord = chord;
    }

}
