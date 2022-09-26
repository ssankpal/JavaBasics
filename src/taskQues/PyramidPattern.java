package taskQues;

public class PyramidPattern {

	public static void main(String[] args) {

		// ========== Diamond Pattern =====//
		System.out.println(" ==== Diamond Pattern ==== ");
		int rw = 5;

		for (int i = 1; i <= rw; i++) {

			for (int j = 0; j < rw - i; j++) {

				System.out.print(" ");
			}

			for (int k = 0; k < i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = rw-1; i >=1; i--) {

			for (int j = 0; j < rw - i; j++) {

				System.out.print(" ");
			}

			for (int k = 0; k < i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
// ==== Hollow diamond =====//		

		System.out.println(" ==== Hollow Diamond ==== ");
		for (int i = 1; i <= rw; i++) {

			for (int j = 0; j < rw - i; j++) {

				System.out.print(" ");
			}

			for (int k = 0; k < i * 2 - 1; k++) {
				
				if(k==0 || k==i*2-2) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = rw-1; i >=1; i--) {

			for (int j = 0; j < rw - i; j++) {

				System.out.print(" ");
			}

			for (int k = 0; k < i * 2 - 1; k++) {
				if(k==0 || k==i*2-2) {
					System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
			}
			System.out.println();
		}
	}

}
