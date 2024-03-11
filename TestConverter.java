import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConverter{

    @Test
    public void testGetMorseFromText(){
        String testdata = "Hello";

        Converter converter = new Converter();

        String actual = converter.getMorse(testdata);
        String expected = "**** * *-** *-** ---";

        assertEquals(expected, actual);

    }

    @Test
    public void testGetTextFromMorse(){
        String testdata = "*** --- ***";

        Converter converter = new Converter();

        String actual = converter.getText(testdata);
        String expected = "sos";

        assertEquals(expected, actual);

    }

    @Test
    public void testGetTextfromNotAMorseCode(){
        String testdata = "--------------";

        Converter converter = new Converter();

        String actual = converter.getMorse(testdata);
        String expected = "";

        assertEquals(expected, actual);

    }
}
