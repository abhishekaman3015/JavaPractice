package question3;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		MyClassWithLambda obj = new MyClassWithLambda();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();		//scanning a line
		sc.close();
		System.out.println(obj.count(str));
	}
}