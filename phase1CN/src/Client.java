import java.io.*;
import java.net.Socket;
import java.util.Scanner;


public class Client {

    Scanner inp = new Scanner(System.in);
    public void getMethod(String UserId)
    {
        String nameHost= "localhost";
        int port= 8080;


        try{
            Socket soc= new Socket(nameHost,port);
            String request= "GET " +UserId+ "\n\r";

            BufferedWriter writer =new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
            writer.write(request);
            writer.flush();

            BufferedReader reader= new BufferedReader(new InputStreamReader(soc.getInputStream()));

            String response=reader.readLine();
            System.out.println(response);

        }catch (Exception e){
            System.out.println("error" + e.getMessage());
        }
    }

    public void postMethod(){
        String hostName = "localhost";
        int port = 8080;

        try {
            Socket socket = new Socket(hostName, port);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Sample POST request data
            String postData = "Alice 28"; // Example data for adding a new user

            // Send the POST request to the server
            out.print("POST / HTTP/1.1\r\n");
            out.print("Host: " + hostName + "\r\n");
            out.print("Content-Type: text/plain\r\n");
            out.print("Content-Length: " + postData.length() + "\r\n");
            out.print("\r\n");
            out.print(postData);
            out.flush();

            // Read and display the response from the server

            socket.close();
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }

    }
}