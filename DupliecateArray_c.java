import java.util.Arrays;

public class DupliecateArray {

	public static void main(String args[]) {
		int[] numbers = {1,3,4,2,1,2,4};
		duplicate(numbers);
		
	}
	
	public static String duplicate(int[] numbers) {

		int tempNum = 0;
		int[] tempArray = new int[numbers.length];
		String sortedArray = "";
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length;j++) {	
				if(numbers[i] == numbers[j]) {
					tempNum = numbers[i];
					tempArray[i] = tempNum;	
					Arrays.sort(tempArray);
					String sortingToString = Arrays.toString(tempArray);
					sortedArray = sortingToString;
				}		
				if(tempArray[i] == 0) {
					
				}
					
				
			}	
		}

		

		System.out.println("Duplicates in ASC order: " + sortedArray);
		return sortedArray;
	}
}
