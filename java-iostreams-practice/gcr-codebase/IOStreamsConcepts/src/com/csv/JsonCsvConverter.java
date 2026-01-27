package com.csv;

import java.io.*;

public class JsonCsvConverter {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("src/com/csv/samplefiles/students.json"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/csv/samplefiles/students11.csv"));

        bw.write("id,name,age,marks\n");

        String line;
        String id = "", name = "", age = "", marks = "";

        while ((line = br.readLine()) != null) {

            line = line.trim();

            if (line.contains("\"id\""))
                id = line.split(":")[1].replace(",", "").trim();

            if (line.contains("\"name\""))
                name = line.split(":")[1].replace("\"", "").replace(",", "").trim();

            if (line.contains("\"age\""))
                age = line.split(":")[1].replace(",", "").trim();

            if (line.contains("\"marks\"")) {
                marks = line.split(":")[1].replace(",", "").trim();

                // Write full row when last field is found
                bw.write(id + "," + name + "," + age + "," + marks + "\n");
            }
        }

        br.close();
        bw.close();

        System.out.println("CSV created successfully.");
    }
}