package coreJavaLearnings;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated *method stub
// if sum of digits of number raised with power of number of digits equal to number itself is Armstrong number
// 153 = (1*1*1)+(5*5*5)+(3*3*3)= 153 	

		int num = 153;
		int len = String.valueOf(num).length();
		System.out.println(len);

		int ori = num;
		int rem,mul = 0, num2 = 0;
		while (num != 0) {
			rem = num % 10;
			 
			num2 = (int) (num2 + Math.pow(rem, len));
			num = num / 10;
		}
		if (ori != num2) {
			System.out.println("Number " + ori + " is not Armstrong number!");
		} else {
			System.out.println("Number " + ori + " is Armstrong number!");
		}
	}

}
