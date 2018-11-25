package InstrumentTests;

import Enums.Instrument_types;
import Instruments.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    Keyboard keyboard;

    @Before
    public void setUp() throws Exception {
        keyboard = new Keyboard(Instrument_types.KEYBOARD, "Yamaha", 250, 300, 400);
    }

    @Test
    public void canGetType() {
        assertEquals(Instrument_types.KEYBOARD, keyboard.getInstrument_types());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(250, keyboard.getBuyPrice());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(300, keyboard.getSellPrice());
    }

    @Test
    public void canSetSellPrice() {
        keyboard.setSellPrice(300);
        assertEquals(300, keyboard.getSellPrice());
    }

    @Test
    public void canPlay() {
        assertEquals("Plonk plonk plonk", keyboard.play());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(50.00, keyboard.calculateMarkUp(), 0.01);
    }
}
