package handprogrammieren;


import java.io.*;

public class Reader {

    public static void main(String[] args) throws IOException {


        FileInputStream fis = new FileInputStream("output.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(fis, "UTF-8"));

        String read;
        while((read = reader.readLine()) != null) {

            System.out.println(read);
        }

    }
}
