package MiscItemsTests;

import misc_items.Sheet_music;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    Sheet_music sheet_music;

    @Before
    public void setUp() throws Exception {
        sheet_music = new Sheet_music("Guitar Sheet Music", 5, 10,"The Beatles White Album");
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(5, sheet_music.getBuyPrice());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(10, sheet_music.getSellPrice());
    }

    @Test
    public void canSetBuyPrice() {
        sheet_music.setBuyPrice(15);
        assertEquals(15, sheet_music.getBuyPrice());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(5.00, sheet_music.calculateMarkUp(), 0.01);
    }

}
