import java.io.*;
import java.net.*;
public class DateClient{
public static void main(String[] args){
try{
Socket clientSocket=new Socket("localhost",6789);
BufferedReader inFromServer=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
String serverResponse=inFromServer.readLine();
System.out.println("From server:"+serverResponse);
clientSocket.close();
}catch(IOException e){
e.printStackTrace();
}
}
}











