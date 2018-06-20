package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Inet4Address;
import java.net.Socket;

/**
 * Created by soich on 20.06.2018.
 */
public class SimpleClient {

    public static void main(String[] args) throws InterruptedException {


        String host = "localhost";
        int port = 9999;


        try {
            System.out.println("connect now to server");
            Socket socket = new Socket(host, port);
            System.out.println("successful connect");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream writer = new PrintStream(socket.getOutputStream());

            writer.print("hello");
            writer.flush();

            int buffer;

            Thread.sleep(2000);

            while((buffer = reader.read()) > 0){
                System.out.println((char)buffer);
            }

            socket.close();
            System.out.println("client left server");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
