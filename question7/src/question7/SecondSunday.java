package question7;

import java.util.Scanner;
import java.time.*;
public class SecondSunday {
	private int day =1;
	private int month;
	private int year;
	private String input;
	void inputMonthYear() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month and Year (eg. January 2021)");
		input = sc.nextLine();
		sc.close();
	}
	void extractValues() {
		inputMonthYear();
		String value[] = input.split(" ");
		year = Integer.parseInt(value[value.length-1]);
		month = value[0].equalsIgnoreCase("january")?1:
				value[0].equalsIgnoreCase("february")?2:
				value[0].equalsIgnoreCase("march")?3:
				value[0].equalsIgnoreCase("april")?4:
				value[0].equalsIgnoreCase("may")?5:
				value[0].equalsIgnoreCase("june")?6:
				value[0].equalsIgnoreCase("july")?7:
				value[0].equalsIgnoreCase("august")?8:
				value[0].equalsIgnoreCase("september")?9:
				value[0].equalsIgnoreCase("october")?10:
				value[0].equalsIgnoreCase("november")?11:
				value[0].equalsIgnoreCase("december")?12:0;
	}
	void secondSunday() {
		extractValues();
		int count=0;
		for(day=1; day<=14; day++) {
			LocalDate date = month==12?LocalDate.of(year+1, 1, day):LocalDate.of(year, month+1, day);
			DayOfWeek dayOfWeek = date.getDayOfWeek();
			String dayOfWeekName = dayOfWeek.name();
			if(dayOfWeekName.equalsIgnoreCase("SUNDAY"))
				count++;
			if(count == 2) {
				System.out.println("The date of next month second sunday:  "+date);
				break;
			}
		}
	}
	public static void main(String[] args) {
		SecondSunday a = new SecondSunday();
		a.secondSunday();
	}	
}
