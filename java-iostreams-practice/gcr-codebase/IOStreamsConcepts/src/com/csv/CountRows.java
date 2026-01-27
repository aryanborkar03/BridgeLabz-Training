package com.csv;

import java.io.*;

public class CountRows {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src/com/csv/samplefiles/students.csv"));
        int count = -1;
        while (br.readLine() != null) count++;
        br.close();
        System.out.println(count);
    }
}
