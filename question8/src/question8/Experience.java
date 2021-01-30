package question8;

import java.time.*;
import java.util.Scanner;
public class Experience {
	private int day;
	private int month;
	private int year;
	private String input;
	
	void inputDateMonthYear() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Date of Joining-(DD/MM/YYYY)");
		input = sc.nextLine();
		sc.close();
	}
	void extractValues() {
		inputDateMonthYear();
		int d,m,y;
		String values[] = input.split("/");
		try {
			d = Integer.parseInt(values[0]);
			m = Integer.parseInt(values[1]);
			y = Integer.parseInt(values[2]);
			if(d>=1&&d<=31&&m>=1&&m<=12&&y>=1900) {
				day = d;
				month = m;
				year = y;
			}
			else {
				try {
					throw new InvalidDateFormat();
				}
				catch (InvalidDateFormat i) {
					i.printStackTrace();
				}
			}
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	void totalExperience() {
		extractValues();
		LocalDate joiningDate = LocalDate.of(year, month, day);
		LocalDate today = LocalDate.now();
		Period experience = Period.between(joiningDate, today);
		int d = experience.getDays();
		int m = experience.getMonths();
		int y = experience.getYears();
		System.out.println("Total Experience in Wipro is: "+d+" Day(s) "+m+" Month(s) "+y+" Year(s)");
	}
	public static void main(String[] args) {
		Experience e = new Experience();
		e.totalExperience();
	}
}