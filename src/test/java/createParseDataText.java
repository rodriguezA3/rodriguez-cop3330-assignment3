package ex42;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class createParseDataTest {

    @Test
    void get_Arraylist() throws FileNotFoundException{
        int i = 0;
        createParseData test1 = new createParseData();
        File inFile = new File("src/main/java/ex41/exercise41_input.txt");
        Scanner sc1 = new Scanner(inFile);
        while (sc1.hasNextLine()) {
            String temp = sc1.nextLine();
            i++;
        }

        ArrayList<String> result = test1.get_Arraylist();
        assertEquals(result.size(), i);
    }

    @Test
    void createArray() throws FileNotFoundException {
        ArrayList<String> input = new ArrayList<>();
        input.add("Ling,Mai,55900");
        input.add("Johnson,Jim,56500");
        input.add("Jones,Aaron,46000");

        createParseData test2 = new createParseData();
        String[] result = test2.createArray(input);

        assertEquals(input.size(), result.length);
    }
}