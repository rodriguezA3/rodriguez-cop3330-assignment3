package ex46;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class readingStringTest {

    @Test
    void readString()throws IOException
    {

        readingString test = new readingString();
        String result = test.readString();
        String answer = "badger badger badger badger mushroom mushroom snake badger badger badger ";
        assertEquals(result, answer);

    }
}