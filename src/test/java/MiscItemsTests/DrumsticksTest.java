package MiscItemsTests;

import misc_items.Drumsticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {

    Drumsticks drumsticks;

    @Before
    public void setUp() throws Exception {
        drumsticks = new Drumsticks("Nylon tipped sticks", 10, 15, 25);
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(10, drumsticks.getBuyPrice());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(15, drumsticks.getSellPrice());
    }

    @Test
    public void canSetSellPrice() {
        drumsticks.setSellPrice(20);
        assertEquals(20, drumsticks.getSellPrice());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(5.00, drumsticks.calculateMarkUp(), 0.01);
    }

}
