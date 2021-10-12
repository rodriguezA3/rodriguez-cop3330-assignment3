// *  UCF COP3330 Fall 2021 Assignment 3 Solution
// *  Copyright 2021 Adan Rodriguez

package ex42;

import java.io.FileNotFoundException;
import java.util.ArrayList;

class parseData {

    public static void main(String[] args) throws FileNotFoundException {

        createParseData array = new createParseData();
        ArrayList<String> list=array.get_Arraylist();

        String[] arr = array.createArray(list);

        PrintAnswer print = new PrintAnswer();
        print.printArray(arr);

    }

