package server_client;



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
public class TcpClient {
	public static void main(String[] args) throws IOException{
		 Socket s=new Socket("localhost",1999);
		 DataInputStream din=new DataInputStream(s.getInputStream());
         //PrintStream dout=new PrintStream(s.getOutputStream());  
         PrintWriter pw = new PrintWriter(s.getOutputStream());
         pw.println("Hi,I am Client.Please Send Date and Time");
        // Scanner scanner=new Scanner(System.in);
        // System.out.print("Enter elements separated by space: ");
		// String elementString = scanner.nextLine();
		// dout.println(elementString);
		 //System.out.println("Data received");
		 System.out.println("Server"+din.readLine());
         s.close();
		
	}
}


