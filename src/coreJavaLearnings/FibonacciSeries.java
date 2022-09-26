package coreJavaLearnings;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=0, a=1, b=1;
		
		while (k<10)
		{
			k=a+b;
			System.out.println(+k);
			a=b;
			b=k;
		}
		
	}

}
