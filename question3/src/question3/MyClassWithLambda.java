package question3;

public class MyClassWithLambda implements WordCount {
	public int count(String str) {
		return str.split(" ").length;
	}
}