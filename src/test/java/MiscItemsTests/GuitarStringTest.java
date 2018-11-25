package MiscItemsTests;

import misc_items.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void setUp() throws Exception {
        guitarString = new GuitarString("Electric", 7, 10, "G");
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(7, guitarString.getBuyPrice());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(10, guitarString.getSellPrice());
    }

    @Test
    public void canSetSellPrice() {
        guitarString.setSellPrice(12);
        assertEquals(12, guitarString.getSellPrice());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(3.00, guitarString.calculateMarkUp(), 0.01);
    }

}
