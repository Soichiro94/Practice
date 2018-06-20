package networking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by soich on 20.06.2018.
 */
public class SimpleServer {

    public static void main(String[] args) {

        try {

            ServerSocket serverSocket = new ServerSocket(9999);

            System.out.println("Server is waiting for client");
            Socket socket = serverSocket.accept();
            System.out.println("a client connected to server");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintStream writer = new PrintStream(socket.getOutputStream());

            int buffer;

            while((buffer = reader.read()) > 0){
                System.out.print((char)buffer);
            }

            writer.print("i got the stuff");
            writer.flush();

            socket.close();
            System.out.println("server is exiting");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

