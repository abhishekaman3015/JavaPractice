package question2;

public class Main {
	public static void main(String[] args) {
		Guitar g;
		Piano p;
		g = new Instrument();
		p = new Instrument();
		System.out.print("Guitar");
		g.play();
		System.out.print("Piano");
		p.play();
	}
}