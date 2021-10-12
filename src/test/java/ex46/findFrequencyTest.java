package ex46;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class findFrequencyTest {

    @Test
    void frequencyCounter() {

        findFrequency test = new findFrequency();
        String st="badger badger badger badger mushroom mushroom snake badger badger badger ";
        Map<String,Integer>result = test.frequencyCounter(st);

        Map<String,Integer> answer= new TreeMap<>();
        answer.put("badger",7);
        answer.put("mushroom",2);
        answer.put("snake",1);

        assertEquals(result,answer);


    }
}