import Stock.Accessories.AccessoryType;
import Stock.Accessories.Mallet;
import Stock.Instrument;
import Stock.InstrumentType;
import Stock.PercussionInstruments.Glockenspiel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GlockenspielTest {
    Glockenspiel glockenspiel;
    Mallet mallet;

    @Before
    public void before(){
        glockenspiel = new Glockenspiel("metal", "silver", InstrumentType.PERCUSSION, 40.50, 88.60, mallet);
        mallet = new Mallet(5, 6.5, AccessoryType.MALLET, "Pink", 8);
    }


    @Test
    public void hasMaterial(){
        assertEquals("metal", glockenspiel.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("silver", glockenspiel.getColour());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.PERCUSSION, glockenspiel.getType());
    }

    @Test
    public void hasRPrice(){
        assertEquals(88.60, glockenspiel.getRPrice(), 1);
    }

    @Test
    public void hasWPrice(){
        assertEquals(40.50, glockenspiel.getWPrice(), 1);

    }

    @Test
    public void canPlay(){
        assertEquals("I am playing music", glockenspiel.play("music"));
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(48.1, glockenspiel.calculateMarkup(), 1);
    }

    @Test
    public void canGetTwentyDiscountPrice(){
        assertEquals(70.88, glockenspiel.getTwentyDiscountPrice(), 1);
    }

    @Test
    public void canSetDiscountPrice(){
        glockenspiel.setDiscountPrice();
        assertEquals(70.88, glockenspiel.getRPrice(), 1);
    }
}
