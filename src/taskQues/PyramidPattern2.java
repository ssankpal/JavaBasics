package taskQues;

public class PyramidPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// half pyramid * pattern		
		int row = 5;
		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*" + "");
			}
			System.out.println("");
		}

// Half pyramid using numbers
		int row1 = 5;
		for (int i = 1; i < row1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

		// Flyod pyramid with numbers
System.out.println("Flyod pyramid");
		int num = 1;
		int row2 = 3;

		for (int i = 1; i <= row2; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
// reverse floyd
		System.out.println("Reverse Flyod pyramid");
		int num1 = 1;
		int row3 = 5;

		for (int i = row3; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num1 + " ");
				num1++;
			}
			System.out.println();
		}

		// Full pyramid of *
		int pyrow = 5;
		int k = 0;
		for (int i = 1; i <= pyrow; i++, k = 0) {

			for (int j = 1; j <= pyrow - i; j++) {
				System.out.print(" ");
			}
			while (k != 2 * i - 1) {
				System.out.print("*");
				k++;
			}
			System.out.println();
		}
		
	// reverse 
		
		int r=5;
		int m=0;
		
		for(int i=1;i<=r;i++)
		{
			for(int j=r-i;j>=1;j--) {
				System.out.print(" ");
			}
			//System.out.println(m);
			m=0;
			while(m<i) {
				System.out.print("*");
				m++;
				
			}
			System.out.println();
		}
		
		
		// Full diamond pyramid of *
				int s = 5;
			//	int k = 0;
				for (int i = 1; i <= s; i++) {
					for (int j = 1; j <= pyrow - i; j++) {
						System.out.print(" ");
					}
					for( int j = 0;j<i*2-1;j++) {
					
						System.out.print("*");
						
					}
					System.out.println();
				}
				for (int i = s-1; i >= 1; i--) {
					for (int j = 1; j <= pyrow - i; j++) {
						System.out.print(" ");
					}
					for( int j = 0;j<i*2-1;j++) {
					
						System.out.print("*");
						
					}
					System.out.println();
				}
		
	}
}