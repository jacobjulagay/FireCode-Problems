
public class horizontalFlipIt {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3}, { 4, 5, 6 },{7,8,9}};
		flipHorizontalAxis(matrix);
	}

	public static void flipHorizontalAxis(int[][] matrix) {
		
	
		
		//Row
		for (int i = matrix.length-1; i >= 0; i--) {
			System.out.println();
			//Column
			for (int j = 0; j < matrix[i].length; j++) {
				

				
				
				System.out.print(matrix[i][j]);
			}
		}

	}

}
