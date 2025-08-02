import java.io.*;
import java.net.*;

public class HelloServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(10000);
        System.out.println("Server in attesa sulla porta 10000...");
        Socket client = server.accept();
        DataOutputStream out = new DataOutputStream(client.getOutputStream());
        out.writeUTF("Ciao dal server!");
        out.close();
        client.close();
        server.close();
    }
}
