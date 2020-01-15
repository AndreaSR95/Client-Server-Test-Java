package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	private static int port = 12000;
	public static void main(String[] args) {

		try {
			@SuppressWarnings("resource")
			ServerSocket soc = new ServerSocket(port);
			
			for(;;) {
				Socket client = soc.accept();
				System.out.println("Connessione riuscita");
				
				BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter out = new PrintWriter(client.getOutputStream());
				
				System.out.println(in.readLine().toUpperCase());
				
				out.write("Server: Hello Client\n");
				out.flush();
				
				client.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
