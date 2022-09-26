package taskQues;

public class SplitAplhaNumbericString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input="233sebeke%^46";
		
		StringBuffer aplha = new StringBuffer(),num = new StringBuffer(),special = new StringBuffer();
		String a = "",b,c;
			
		for(int i=0; i<input.length();i++) {
			
			if(Character.isDigit(input.charAt(i))) {
				num.append(input.charAt(i));
			
			}
			else if(Character.isAlphabetic(input.charAt(i))) {
				aplha.append(input.charAt(i));
				a=a+input.charAt(i);
			}
				else
					special.append(input.charAt(i));
		}
		
		System.out.println("Aplhabetic: "+aplha);
		System.out.println(a);
		System.out.println("Numeric: " +num);
		System.out.println("special; "+special);
		String word[]= input.split("([0-9])+");
		String srnum[]=input.split("([a-zA-Z])+");
		for(String s: word) {
			System.out.println("ss: "+s);
		}
		for(String s: srnum) {
			System.out.println("cc: "+s);
		}
		 
	}

}
