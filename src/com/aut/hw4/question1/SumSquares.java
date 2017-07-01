package com.aut.hw4.question1;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SumSquares {
    List<Integer> list = new ArrayList<Integer>();


    private void setter(ArrayList<Integer> nums) {
        for (int j = 0; j < nums.lastIndexOf(nums); j++) {
            nums.get(j);
            list.add(j, list);
        }
    }

    public static void writeTextFile(String filePath, String content) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        try {
            bw.write(content);
        } finally {
            bw.close();
        }
    }

    public void writeOutSquares() throws IOException {
        for (int number : list) {
            Math.pow(number, 2);
            list.toString();
            list.toArray();
            for (int k = 0; k <= list.toArray().length; k++) {
                list.toArray()[k] + list.toArray()[k + 1];

            }
            writeTextFile("F:\\", "" + list);
        }

    }


    //...
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < m; i++) {
            list.add(i);
        }

        writeOutSquares();
    }
}
