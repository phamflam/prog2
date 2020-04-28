package transmission;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class DataConnector implements DataConnection{
    Socket socket;
    /**
     * Create client side - open connection to address / port
     * @param address
     */
    public DataConnector(String address, int port) throws IOException {
        // TODO client
        String name= "localhost";
        port= 3333;
        socket= new Socket(name, port);
    }

    /**
     * Create server side - open port on this port and wait for one client
     * @param port
     */
    public DataConnector(int port) throws IOException {
        // TODO server
        port=3333;
        ServerSocket server = new ServerSocket(port);
        socket= server.accept();
        System.out.println("client connected");
    }

    @Override
    public DataInputStream getDataInputStream() throws IOException {
        return null; // TODO
        /*
        InputStream is = socket.getInputStream();
        DataInputStream dis= new DataInputStream();

         */
    }

    @Override
    public DataOutputStream getDataOutputStream() throws IOException {
        return null; // TODO
/*
        OutputStream os= socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream();

 */
    }

}
