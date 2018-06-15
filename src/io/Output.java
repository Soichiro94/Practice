package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by soich on 07.06.2018.
 */
public class Output {

    public static void main(String[] args) throws IOException {

        String output = "ich möchte das ganze in ein file schreiben\nmit einer neuen zeile";

        FileOutputStream outputStream = new FileOutputStream("output.txt");
        OutputStreamWriter writer = new OutputStreamWriter(outputStream);

        writer.write(output);
        writer.flush();

        FileInputStream fis = new FileInputStream("output.txt");
        //BufferedReader reader = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
        Files.newBufferedReader(Paths.get("output.txt"))
                .lines()
                .map(s-> s.toUpperCase())
                .forEach(System.out::println);
        /*
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
        }

        System.out.println(sb.toString());*/
    }
}
