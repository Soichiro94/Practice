package handprogrammieren;


import java.io.*;

public class Reader {

    public static void main(String[] args) throws IOException {


        FileInputStream fis = new FileInputStream("output.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

        String read;
        while((read = reader.readLine()) != null) {

            System.out.println(read);
        }

        String output2 = "ich hätte jetzt sehr gerne\nein zweites output file";
        FileOutputStream fos = new FileOutputStream("output2.txt");
        OutputStreamWriter writer = new OutputStreamWriter(fos);

        writer.write(output2);
        writer.flush();

    }
}
