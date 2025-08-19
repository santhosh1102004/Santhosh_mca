import java.net.*;
import java.util.HashMap;
public class UDPServer{
public static void main(String[]args)throws Exception{
DatagramSocket serverSocket=new DatagramSocket(9876);
HashMap<String,String>countryCapitals=new HashMap<>();
countryCapitals.put("India","New Delhi");
countryCapitals.put("USA","Washington,D.C.");
countryCapitals.put("Germany","Berlin");
countryCapitals.put("France","Paris");
byte[]receiveData=new byte[1024];
byte[]sendData=new byte[1024];
System.out.println("Server is runing and waiting for client request...");
while(true){
DatagramPacket receivePacket=new DatagramPacket(receiveData,receiveData.length);
serverSocket.receive(receivePacket);
String country=new String(receivePacket.getData(),0,receivePacket.getLength());
System.out.println("Receive country:"+country);
String capital=countryCapitals.getOrDefault(country,"capital not found");
sendData=capital.getBytes();
InetAddress clientIPAddress=receivePacket.getAddress();
int port=receivePacket.getPort();
DatagramPacket sendPacket=new DatagramPacket(sendData,sendData.length,clientIPAddress,port);
serverSocket.send(sendPacket);
}
}
}
