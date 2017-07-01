package com.aut.hw4.question3;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class LCS {
    private void longestCommonSubsequence(String filePath1, String filePath2) throws IOException {
        BufferedReader br1 = new BufferedReader(new FileReader(filePath1));
        BufferedReader br2 = new BufferedReader(new FileReader(filePath2));
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        final String lineSeparator = System.lineSeparator();
        try {
            String line;
            while (line = br1.readLine() != null || line = br2.readLine() != null) {
                sb1.append(line);
                sb2.append(line);
                sb1.append(lineSeparator);
                sb2.append(lineSeparator);

            }
        } finally {
            br1.close();
            br2.close();
        }
        String sb1String = sb1.toString();
        String sb2String = sb2.toString();
        Iterator itr = sb1String.iterator();
        Iterator itr2 = sb2String.iterator();
        while (itr2.hasNext()) {
            Object obj2 = itr2.next();
        }
        while (itr.hasNext()) {
            Object obj = itr.next();
        }
    }

}
