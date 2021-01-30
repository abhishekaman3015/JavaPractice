package question8;

@SuppressWarnings("serial")
public class InvalidDateFormat extends Exception{
	@Override
	public String toString() {
		return ("Date must be in DD/MM/YYYY");
	}
}