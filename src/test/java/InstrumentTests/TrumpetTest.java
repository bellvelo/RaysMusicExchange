package InstrumentTests;

import Enums.Instrument_types;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp() throws Exception {
        trumpet = new Trumpet(Instrument_types.BRASS, "Horner", 300, 350, "Sharp");
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(300, trumpet.getBuyPrice());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(350, trumpet.getSellPrice());
    }

    @Test
    public void canSetBuyPrice() {
        trumpet.setBuyPrice(400);
        assertEquals(400, trumpet.getBuyPrice());
    }

    @Test
    public void canPlay() {
        assertEquals("Toot toot toot", trumpet.play());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(50.00, trumpet.calculateMarkUp(), 0.01);
    }
}

