import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateServer{ 
public static void main(String[] args){
try{
ServerSocket serverSocket=new ServerSocket(6789);
System.out.println("Server is waiting for client on port6789..");
Socket connectionSocket=serverSocket.accept();
System.out.println("client connected.");
DataOutputStream outToClient=new DataOutputStream(connectionSocket.getOutputStream());
String currentTime=new SimpleDateFormat("yyyy/mm/ddHH:mm:ss").format(new Date());
outToClient.writeBytes("current date and time:"+currentTime+"\n");
connectionSocket.close();
serverSocket.close();
}catch(IOException e){
e.printStackTrace();
}
}
}


