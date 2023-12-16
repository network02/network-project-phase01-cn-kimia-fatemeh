import java.io.IOException;
import java.util.Scanner;

public class NmapMenu {
    public static void main(String[] args) throws IOException {

        Scanner inp= new Scanner(System.in);


        System.out.println("Welcome to nMap application\n");

        while (true){
            System.out.println("choose your desired order");
            System.out.println("1-nMap _sn");
            System.out.println("2-nMap _py");
            System.out.println("3-GET/POST");
            System.out.println("4-End program");

            int input=inp.nextInt();

            switch (input){
                case 1:
                    System.out.println("You can check the host if its online or offline :)\n ");
                    System.out.println("Host name : ");
                    String host = inp.next();
                    System.out.println("Port number : ");
                    int portNumber = inp.nextInt();
                    CheckOnline obj1= new CheckOnline();
                    obj1.CheckOnline(host,portNumber);

                    break;
                case 2:

                    System.out.println("You can check which port for your desired host is open ?!\n");
                    System.out.println("Host name : ");
                    host = inp.next();

                    OpenPortInHost obj2= new OpenPortInHost();
                    obj2.openPort(host);

                    break;
                case 3:


                    Client obj3= new Client();
                    System.out.println("enter your request(GET/POST) ");
                    String req= inp.next();

                    if(req.equals("GET")){
                        System.out.println("please enter your user_id : ");
                        String id= inp.next();
                        obj3.getMethod(id);
                    }
                    else if(req.equals("POST")){
                        obj3.postMethod();
                    }

                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}

