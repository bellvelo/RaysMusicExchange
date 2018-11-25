package ShopTests;

import Instruments.Guitar;
import Enums.Instrument_types;
import Instruments.Keyboard;
import Instruments.Trumpet;
import interfaces.ISell;
import misc_items.Drumsticks;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import java.util.ArrayList;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Drumsticks drumsticks;
    Trumpet trumpet;
    Keyboard keyboard;


    @Before
    public void setUp() throws Exception {
        ArrayList stock = new ArrayList<ISell>();
        shop = new Shop("Rays Music Exchange", stock, 1000.00);
        guitar = new Guitar(Instrument_types.STRING, "Fender", "Bass",4, 150, 200);
        drumsticks = new Drumsticks("Nylon tipped sticks", 10, 15, 25);
        trumpet = new Trumpet(Instrument_types.BRASS, "Horner", 300, 350, "Sharp");
        keyboard = new Keyboard(Instrument_types.KEYBOARD, "Yamaha", 250, 300, 400);
    }

    @Test
    public void canGetTillCount() {
        assertEquals(1000, shop.getTill(), 0.01);
    }

    @Test
    public void canGetItemBuyPrice() {
        assertEquals(10, drumsticks.getBuyPrice());
    }

    @Test
    public void canGetStock() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canBuyItem() {
        shop.buyItem(guitar);
        shop.buyItem(drumsticks);
        assertEquals(2, shop.getStockCount());
        assertEquals(840, shop.getTill(), 0.01);
    }

    @Test
    public void canSellItem() {
        shop.buyItem(guitar);
        shop.buyItem(keyboard);
        shop.sellItem(guitar);
        assertEquals(1, shop.getStockCount());
        assertEquals(800, shop.getTill(), 0.01);
    }

    @Test
    public void canGetStockDetails() {
        shop.buyItem(guitar);
        assertNotNull(shop.getStock());
    }

    @Test
    public void canGetTotalPotentialProfit() {
        shop.buyItem(guitar);
        shop.buyItem(keyboard);
        shop.buyItem(drumsticks);
        shop.buyItem(trumpet);
        assertEquals(155, shop.getTotalProfit());

    }
}
