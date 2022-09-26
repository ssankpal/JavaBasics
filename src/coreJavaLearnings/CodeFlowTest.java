package coreJavaLearnings;

public class CodeFlowTest {
	
	CodeFlowTest(){
		System.out.println("This is constrcutor code!!!");
	}
	
	{
		System.out.println("This is Instance code");
	}

	public String print(String a) {
		return ("Your Stirng is "+a);
	}
	
	static {
		System.out.println("This is static block!!!!");
	}


public static void main(String[] args) {
	
	CodeFlowTest x = new CodeFlowTest();
//	Learn y =new Learn();
//	String Y = x.print("One");
//	System.out.println(Y);
	
}
}