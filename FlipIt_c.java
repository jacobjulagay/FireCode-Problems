
public class FlipIt {
	
	public static void main(String[] args) {
	
		int[][]matrix = {{3,2,1},{6,5,4},{9,8,7}};
		flipItVertical(matrix);
	}
	
	
	// Flips the values of the 2d array on the vertical axis
	public static void flipItVertical(int[][] matrix) {
		//Rows
		for(int i = 0; i < matrix.length; i++) {
			System.out.println();
			//Columns 
			for(int j = matrix[0].length - 1; j >= 0; j--) {
				System.out.print(matrix[i][j]);
			}
		}
	}

}
