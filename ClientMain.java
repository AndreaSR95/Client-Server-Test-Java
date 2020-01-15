package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {
	
	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("192.168.1.11"/* "DESKTOP-IF79ES3"*/, 12000);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

			out.write("Client: Hello Server\n");
			out.flush();

			String line = in.readLine();

			System.out.println(line);
			
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