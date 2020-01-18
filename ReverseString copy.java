
public class ReverseString {

	public static void main(String[] args) {
		String s = "abcd"; 
		System.out.println(reverseString(s));
	}
	
	public static String reverseString(String s) {
		
		//Checking if String is null
		if(s == null) {
			return null;
		}
		StringBuilder str = new StringBuilder();
		for(int i = s.length() - 1; i >= 0; i--) {
			if(!s.equals("") && s.length() != 0 ) {
				str.append(s.charAt(i));		
			}		
		}		
		return str.toString(); 	
	}
}
