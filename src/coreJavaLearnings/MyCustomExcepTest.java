package coreJavaLearnings;

public class MyCustomExcepTest {
	
	public static void validateAge(int x) throws MyCustomException {
		
		if(x<18) {
			throw new MyCustomException("Underage");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			validateAge(17);
			System.out.println("Valid age!");
			
			}
		catch(MyCustomException e) {
			System.out.println("Inside Exception");
			System.out.println(e.getMessage());
		}
	}
}
