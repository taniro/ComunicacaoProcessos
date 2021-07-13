package tads.eaj.ufrn.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) throws Exception {
	
	if (args.length < 3){
		System.out.println("Uso correto: TCPClient <host> <port> <message>");
		System.exit(0);
	}
		
	String host = args[0];
	String port = args[1];
	String message = args[2];
	String modifiedMessage; 
	
	Socket clientSocket = new Socket(host, Integer.parseInt(port));
	
	DataInputStream in = new DataInputStream(clientSocket.getInputStream());
	DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
	
	out.writeUTF(message);
	modifiedMessage = in.readUTF();
	
	System.out.println("Nova palavra: " + modifiedMessage);
	
	
	clientSocket.close();		 
	}
}
