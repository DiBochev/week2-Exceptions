package week2Exceptions.problem2;

import java.net.ConnectException;

public class ServiceNotAvailableAtTheMoment extends ConnectException{

	public ServiceNotAvailableAtTheMoment(){
		this("possible reasons: ");
	}
	
	public ServiceNotAvailableAtTheMoment(String message){
		super(message + "\npossible reasons: ");
	}
}
