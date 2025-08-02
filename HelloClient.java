import java.io.*;
import java.net.*;

public class HelloClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 10000);
        DataInputStream in = new DataInputStream(socket.getInputStream());
        System.out.println("Messaggio dal server: " + in.readUTF());
        in.close();
        socket.close();
    }
}
