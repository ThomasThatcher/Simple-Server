package core;

public class ServerThread extends Thread {

	public Server server;
	
	public ServerThread(Server s){
		super(s);
			this.server = s;
	}
	
}
