import java.net.InetSocketAddress;
import java.net.Socket;

public class CheckOnline{
    public void CheckOnline(String hostName, int port) {

        try {
            Socket socket = new Socket();
            InetSocketAddress ss= new InetSocketAddress(hostName,port);
            socket.connect(ss, 5000); // 5000 is the timeout in milliseconds for response
            socket.close();
            System.out.println("The Host is online");
        } catch (Exception e) {
            System.out.println("The Host is offline");
        }
    }
}
