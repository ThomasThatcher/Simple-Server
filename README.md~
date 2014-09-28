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

		st.start();

		/*
			Stop server by calling st.server.close(); and then, st.join();
			Ensuring that all connections are closed. :)
		*/
		
	}
