package misc_items;


public class Sheet_music extends Item {

    private String title;


    public Sheet_music(String description, int buyPrice, int sellPrice, String title) {
        super(description, buyPrice, sellPrice);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }





}
