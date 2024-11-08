package ClientServerArchitecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Server Started. Waiting for Client... ");
		
		ServerSocket ss = new ServerSocket(9806);
		Socket soc =  ss.accept();
		System.out.println("Connection Established...");
		

//		BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
//		PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
		
		
	
	}

}
