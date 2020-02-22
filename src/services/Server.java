package services;

import java.io.IOException;

public class Server extends Connection {

	public Server() throws IOException {
		super("server");
		
	}
	
public void onServer() {
	System.out.println("Server running.....");
}
	
}
