package myTextReader1;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class textReaderTEST {
    //Första testat kontrollerar vad som händer om användaren skriver "stop" -
    //utan att ha givit någon annan input, programmet avslutas enligt testets parametrarna.
    @Test
    public void testStop(){
        textReader myTextReader = new textReader();
        myTextReader.readInput("stop");
        String result = myTextReader.readResults();
        assertEquals("I've read: 0 row(s) and it had 0 letter(s), you can start running now...(｢• ω •)｢", result);
    }
    @Test
    public void testInput() {
        textReader myTextReader = new textReader();
        myTextReader.readInput("Nationalencyklopedin");
        myTextReader.readInput("stop");
        String result = myTextReader.readResults();
        assertEquals("I've read: 1 row(s) and it had 20 letter(s), you can start running now...(｢• ω •)｢", result);
    }
    @Test
    public void testManyInputs(){
        textReader myTextReader = new textReader();
        myTextReader.readInput("Cut");
        myTextReader.readInput("my");
        myTextReader.readInput("life");
        myTextReader.readInput("into");
        myTextReader.readInput("pieces");
        myTextReader.readInput("stop");
        String result = myTextReader.readResults();
        assertEquals("I've read: 5 row(s) and it had 19 letter(s), you can start running now...(｢• ω •)｢", result);

    }

}
