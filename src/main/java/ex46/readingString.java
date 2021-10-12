package ex46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;

class readingString {


    public static String readString() throws IOException {
        File inFile = new File("src/main/java/ex46/exercise46_input.txt");
        BufferedReader br = new BufferedReader(new FileReader(inFile));

        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append("\n");
            line = br.readLine();
        }

        String st= sb.toString();
        st=st.replace("\n"," ");
        br.close();

        return st;


    }


}
