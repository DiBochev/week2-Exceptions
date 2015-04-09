package week2Exceptions.problem4;

public class NullException extends Error{

	public NullException(){
		super("cannot insert null key. You wanted that way!");
	}
}
