package client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {
	
	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("192.168.56.1", 12000);
			
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.write("il messaggio è tutto minuscolo, trasportalo in maiuscolo");
			
			out.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
