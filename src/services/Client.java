package services;

import java.io.DataOutputStream;
import java.io.IOException;

public class Client extends Connection {
 public Client() throws IOException {
		super("client");

	}
 public void onClient(){
	 try {
		 outputServer= new DataOutputStream(s.getOutputStream());
		 outputServer.writeUTF("Este es un mensaje para el servidor del cliente Camila");
		 s.close();
	 }catch(IOException e) {
		 System.out.println(e.getMessage());
	 }
	 
 }


}
