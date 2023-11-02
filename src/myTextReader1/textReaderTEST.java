package myTextReader1;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class textReaderTEST {

    @Test
    public void testStop(){
        textReader myTextReader = new textReader();
        String input = "stop";
        String expected = "I've read: "+"rows"+" row(s) and it had "+"letters"+" letter(s), you can start running now...(｢• ω •)｢";

        myTextReader.readInput(input);
        String actual = myTextReader.readResults();
        assertEquals(expected,actual);

    }
}
