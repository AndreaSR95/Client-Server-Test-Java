package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
				
				String line;
				while((line = in.readLine()) != null) {
					System.out.println(line.toUpperCase());
				}
				in.close();
				client.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
