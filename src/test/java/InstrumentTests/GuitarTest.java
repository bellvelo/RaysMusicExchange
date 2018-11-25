package InstrumentTests;

import Instruments.Guitar;
import Enums.Instrument_types;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar(Instrument_types.STRING, "Fender", "Bass",4, 150, 200);
    }

    @Test
    public void canGetType() {
        assertEquals(Instrument_types.STRING, guitar.getInstrument_types());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(150, guitar.getBuyPrice());
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(200, guitar.getSellPrice());
    }

    @Test
    public void canSetSellPrice() {
        guitar.setSellPrice(250);
        assertEquals(250, guitar.getSellPrice());
    }

    @Test
    public void canPlay() {
        assertEquals("Riff riff riff", guitar.play());
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(50.00, guitar.calculateMarkUp(), 0.01);
    }
}
