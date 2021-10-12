package ex44;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Iterator;
import java.util.Scanner;
import java.io.IOException;

public class readJson {


    public static void iterateJson(Product pr, JSONArray arr) throws IOException {

        Integer check = 0;
        String match = "";
        JSONObject temp = new JSONObject();
        Scanner sc = new Scanner(System.in);

        while (check == 0) {
            Iterator it = arr.iterator();
            System.out.print("What is the product name? ");
            String input = sc.nextLine();

            while (it.hasNext()) {
                JSONObject current = (JSONObject) it.next();
                String name = pr.getName(current);

                if (input.equalsIgnoreCase(name)) {
                    temp = current;
                    match = name;
                    check = 1;

                }

            }
            pr.print(temp, check, match);
        }

    }
}