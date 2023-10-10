package array2d;

public class SUM {

	public static void sum(int arr[][]) {
		
		int row = arr.length;
		int col = arr[0].length;
		int sum = 0;
		// row boundary
		for(int i = 0 ; i < arr.length ; i++) {
			sum = sum + arr[0][i];
			sum = sum + arr[row-1][i];
		}
		// column boundary
		for(int i = 1; i < row-1 ; i++) {
			sum = sum + arr[i][0];
			sum = sum + arr[i][col-1];
		}
		
		//diagonal 
		for (int i =1 ; i < row-1 ;i++) {
			sum = sum + arr[i][i];
			sum = sum + arr[i][row - 1 - i];
		}
		
		if(row%2!=0) {
			sum = sum - arr[row/2][row/2];
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] sampleArray = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
		sum(sampleArray);
		
	}

}
