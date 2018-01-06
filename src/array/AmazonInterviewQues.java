package array;

public class AmazonInterviewQues {
	public static boolean saddlePoint(int mat[][], int n) {

		// Process all rows one by one
		for (int i = 0; i < n; i++) {
			int max_row = mat[i][0], col_ind = 0;
			for (int j = 1; j < n; j++) {
				if (max_row < mat[i][j]) {
					max_row = mat[i][j];
					col_ind = j;
				}
			}

			// Check if max element of row is minimum element of column
			int k;
			for (k = 0; k < n; k++)
				if (max_row > mat[k][col_ind]) {
					break;
				}

			if (k == n) {
				System.out.println("Value of Saddle Point " + max_row);
				return true;
			}
		}
		// If saddle point not found
		return false;
	}

	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 9 }, { 4, 5, 6 }, { 7, 8, 91 } };
		int n = 3;
		if (saddlePoint(mat, n) == false)
			System.out.println("No Saddle Point");
	}
}
