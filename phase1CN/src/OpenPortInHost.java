import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;

public class OpenPortInHost{
    public void openPort( String host){

        ArrayList<Services> listService= new ArrayList<>();
        listService.add(new Services(20,"ftp"));
        listService.add(new Services(21,"ftp"));
        listService.add(new Services(22,"ssh"));
        listService.add(new Services(25,"smtp"));
        listService.add(new Services(80,"http"));
        listService.add(new Services(123,"ntp"));
        listService.add(new Services(443,"https"));

        for ( int port = 70; port <= 85; port++) {
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress(host, port), 1000);
                socket.close();
                System.out.println("Port " + port + "\t\tState = is opened" );
                for(int i=0 ; i<listService.size();i++){
                    if(listService.get(i).getPortNumber()==port){
                        System.out.println(listService.get(i).toString());
                    }
                }

            } catch (Exception ex) {
                System.out.println("Port " + port + "\t\tState = is closed" );
                // Port is likely closed or filtered
            }
        }
    }
}
