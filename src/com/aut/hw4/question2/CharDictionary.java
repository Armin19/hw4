package com.aut.hw4.question2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class CharDictionary {
    public static String readTextFile(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        StringBuilder sb = new StringBuilder();
        final String lineSeparator = System.lineSeparator();
        try {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(lineSeparator);

            }
        } finally {
            br.close();
        }
        return sb.toString();
    }

    private void charFrequency(String filePath) {
        try {
            readTextFile("F:\\test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(1,readTextFile("F:\\test.txt"));
    }

}
