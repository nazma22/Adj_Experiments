package server_client;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class TCPServer {
	
	public static void main(String args[]) throws IOException{
		ServerSocket ss = new ServerSocket(1999);
		Socket TcpClient = ss.accept();
		System.out.println("Server is ready");
		DataInputStream din = new DataInputStream(TcpClient.getInputStream());
		PrintWriter pw=new PrintWriter(TcpClient.getOutputStream());
		
		System.out.println("Client :"+ din.readLine());
		
		pw.println("Server's Date and Time"+new Date().toString());
		
		TcpClient.close();
	
	}

}
