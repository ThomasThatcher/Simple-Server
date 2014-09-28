package core;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends ServerSocket implements Runnable {

	public Socket socket;
	public PrintWriter writer;
	public BufferedReader reader;
	public ServerInputListener serverInputListener;
	
	public Server(ServerInputListener sil, int port) throws IOException {
		super(port);
			serverInputListener = sil;
			socket = accept();
			writer = new PrintWriter(socket.getOutputStream());
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	}
	
	public void close() throws IOException{
		writer.close();
		reader.close();
		socket.close();
	}

	public void addServerInputListener(ServerInputListener sil){
		this.serverInputListener = sil;
	}
	
	@Override
	public void run() {
		
		try {
			
			String line;
			
			while((line = reader.readLine()) != null){
				
				if(serverInputListener != null && !line.equals("")){
					
					int id = ActionEvent.ACTION_PERFORMED;
					String command = "ServerInput";
					
					serverInputListener.handleInput(new ServerEvent(serverInputListener, id, command, line));
					
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
