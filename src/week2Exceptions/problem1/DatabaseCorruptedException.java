package week2Exceptions.problem1;

public class DatabaseCorruptedException extends IllegalAccessError{
	
	public DatabaseCorruptedException(String message){
		super(message);
	}
	
	public DatabaseCorruptedException(){
		super();
	}
}
