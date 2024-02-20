package MyMorseReader;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class morseTest {

    @Test
    public void testToMorse() {
        Converter converter = new Converter();
        String expected = "*-";
        String actual = converter.toMorse("A");
        assertEquals(expected, actual);
    }

    @Test
    public void testToMorseAgain(){
        Converter converter = new Converter();
        String expected = "*----";
        String actual = converter.toMorse("1");
        assertEquals(expected,actual);
    }

    @Test
    public void testToEnglish(){
        Converter converter = new Converter();
        String expected = "E";
        String actual = converter.toEnglish("*");
        assertEquals(expected, actual);
    }

    @Test
    public void testManyNumbers(){
        Converter converter = new Converter();
        String expected = "12345";
        String actual = converter.toEnglish("*---- **--- ***-- ****- *****");
        assertEquals(expected,actual);
    }

    @Test
    public void testManyLetters(){
        Converter converter = new Converter();
        String expected = "*- -*** -*-* -** *";
        String actual = converter.toMorse("ABCDE");
        assertEquals(expected,actual);
    }

    @Test
    public void testWord(){
        Converter converter = new Converter();
        String expected = "HOW?";
        String actual = converter.toEnglish("**** --- *-- **--**");
        assertEquals(expected, actual);
    }

    @Test
    public void testFaultyInput(){
        Converter converter = new Converter();
        String morse = converter.toMorse("Ö");
        assertEquals("", morse);
    }

    @Test
    public void testFaultyOther(){
        Converter converter = new Converter();
        String english = converter.toEnglish("#");
        assertEquals("", english);
    }

}
