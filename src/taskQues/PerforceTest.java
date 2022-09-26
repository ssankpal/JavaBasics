package taskQues;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class PerforceTest {

	public static void main(String[] args) {

		int num = 345;
		int revNum = 0;
		int rem = 0;
		while (num != 0) {

			rem = num % 10;
			revNum = rem + (revNum * 10);
			num = num / 10;
		}
		System.out.println("Reverse No: " + revNum);
		
		
		// Convert 24 hours into 12 hrs
		String input = "00:10";
		String[] ipary = input.split(":");
		int o = 0;
		String ampm = "AM";
		String lhrs;
		if (Integer.valueOf(ipary[0]) > 12 && (Integer.valueOf(ipary[0]) < 24)) {
			o = Integer.valueOf(ipary[0]) - 12;
			ampm = "PM";
			//System.out.println(String.format("%02d", o));
			lhrs = String.format("%02d", o) + ":" + ipary[1] + " " + ampm;
		} else if (Integer.valueOf(ipary[0]) == 00) {
			o = Integer.valueOf(ipary[0]) + 12;
			lhrs = String.format("%02d", o) + ":" + ipary[1] + " " + ampm;
		} else {
			lhrs = ipary[0] + ":" + ipary[1] + " " + ampm;
		}
		System.out.println(lhrs);

		String result = LocalTime.parse(input, DateTimeFormatter.ofPattern("HH:mm"))
				.format(DateTimeFormatter.ofPattern("hh:mm a"));
		System.out.println(result);

//Print 	
//	1
//	2 3
// 4 5 6
		int number = 1;
		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				++number;
			}
			System.out.println();
		}
	}
}
