import java.rmi.*;  
import java.rmi.server.*; 
import java.util.Scanner; 
public class PowerRemote extends UnicastRemoteObject implements Power

{  
PowerRemote()throws RemoteException
{  
	super();  
}  
public int power1(int z)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the base number ::");
int x = sc.nextInt();
System.out.println("Enter the exponent number ::");
int y = sc.nextInt();
               z=y^x;
System.out.println(z);
}  
}