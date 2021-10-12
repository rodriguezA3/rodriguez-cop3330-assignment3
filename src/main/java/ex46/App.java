/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Adan Rodriguez
 */

package ex46;

import java.io.*;
import java.util.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

class wordFrequencyFinder {

    public static void main(String args[]) throws IOException {

        readingString read = new readingString();
        String st=read.readString();
        findFrequency freq = new findFrequency();
        freq.frequencyCounter(st);
        freq.print(st);



    }
}