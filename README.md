Simple-Server
=============
A Simple Java Server

General Use:

	public static void main(String[] args) throws IOException {
		
		int port = 3000;
		
		ServerThread st = new ServerThread(new Server(new ServerInputListener(){

			@Override
			public void handleInput(ServerEvent se) {
				
			}
			
		}, port));
		
	}
