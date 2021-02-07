import java.rmi.*;  
public class MyClient
{  
public static void main(String args[])
{  
try
{  
Power stub=(Power)Naming.lookup("rmi://localhost:1995/shristee");  
System.out.println(stub.power1());  
}
catch(Exception e){}  
}  
}
