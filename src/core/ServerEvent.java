package core;

import java.awt.event.ActionEvent;

public class ServerEvent extends ActionEvent {

	private static final long serialVersionUID = 1L;

	public String input;
	
	public ServerEvent(Object source, int id, String command, String input) {
		super(source, id, command);
			this.input = input;
	}
	
	public String getInput(){
		return this.input;
	}

}
