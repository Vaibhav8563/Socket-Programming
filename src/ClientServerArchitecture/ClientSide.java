package ClientServerArchitecture;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSide {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		System.out.println("Client Started");
		Socket soc = new Socket("localhost",9806);
	}

}
