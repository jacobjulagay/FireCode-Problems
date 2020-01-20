import java.util.Collection;
import java.util.HashMap;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		//String s = "aabcdc";
		// String s = "b";
		 String s = "aaaa";
		firstNonRepeatedCharacter(s);
	}

	public static Character firstNonRepeatedCharacter(String s) {

		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		Character nonDuplicate = 0;
		int counter = 0;
		outerLoop: {
			for (int i = 0; i < s.length(); i++) {
				/* Checking if only one character is in the string */
				if (s.length() == 1) {
					map.put(i, s.charAt(i));
					nonDuplicate = map.get(i);
					break;
				}
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						map.put(i, s.charAt(i));
						counter++;
					}
					if (map.containsValue(s.charAt(i)) && counter > 0) {
						map.remove(i);
						nonDuplicate = map.get(i);
						break;
					}
					/* If first character is a non duplicate */
					if (s.charAt(i) != s.charAt(j) && counter == 0) {
						map.put(i, s.charAt(i));
						nonDuplicate = map.get(i);
						break outerLoop;
					}
					/* Non duplicate later in the string */
					if (s.charAt(i) != s.charAt(j) && counter > 0) {
						map.put(j, s.charAt(j));
						nonDuplicate = map.get(j);
						break outerLoop;
					}

				}
			}
		}
	
		return nonDuplicate;
	}
}
