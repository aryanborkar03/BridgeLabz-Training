package com.csv;

import java.io.*;

public class WriteCSV {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/csv/samplefiles/employees.csv"));
        bw.write("ID,Name,Department,Salary\n");
        bw.write("1,Aakash,IT,50000\n");
        bw.write("2,Aryan,HR,40000\n");
        bw.write("3,Ravi,IT,60000\n");
        bw.write("4,Sneha,Sales,45000\n");
        bw.write("5,Priya,IT,70000\n");
        bw.close();
    }
}
