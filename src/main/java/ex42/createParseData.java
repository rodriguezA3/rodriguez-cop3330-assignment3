package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class createParseData {

    public static ArrayList<String> get_Arraylist() throws FileNotFoundException {
        File inFile = new File("src/main/java/ex42/exercise42_input.txt");
        Scanner sc = new Scanner(inFile);

        ArrayList<String> input = new ArrayList<>();
        while (sc.hasNextLine()) {
            String temp = sc.nextLine();
            input.add(temp);
        }

        return input;

    }

    public static String[] createArray( ArrayList<String> input ) throws FileNotFoundException {

        String[] temp = new String[input.size()];

        for (int i = 0; i < input.size(); i++) {
            temp[i] = input.get(i);
        }
        return temp;
    }
}