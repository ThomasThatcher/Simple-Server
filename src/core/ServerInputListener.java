package core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class ServerInputListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent ae){
		
	}
	
	public abstract void handleInput(ServerEvent se);
	
}
