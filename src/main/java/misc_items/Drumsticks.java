package misc_items;

public class Drumsticks extends Item {

    private int length;


    public Drumsticks(String description, int buyPrice, int sellPrice, int length) {
        super(description, buyPrice, sellPrice);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
