// *  UCF COP3330 Fall 2021 Assignment 3 Solution
// *  Copyright 2021 Adan Rodriguez

package ex44;

import java.io.*;
import java.util.*;
import java.io.InputStream;
import org.json.simple.*;
import org.json.simple.parser.*;
import java.io.BufferedReader;


class productSearch {

    public static void main(String args[]) throws IOException
    {

        Product pr = new Product();
        readJson read = new readJson();

        try {

            String path = ("src/main/java/ex44/exercise44_input.json");
            JSONParser parser = new JSONParser();
            Object object = parser.parse(new FileReader(path));
            JSONObject jObject = (JSONObject) object;
            JSONArray arr = (JSONArray) jObject.get("products");
            read.iterateJson(pr, arr);
        } catch (Exception e) {
            System.out.print("This file doesn't exist");
        }


    }





}