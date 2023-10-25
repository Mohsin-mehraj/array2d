package array2d;

public class Printlikeawave {

	public static void printlikeawave(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		
		
		for(int i = 0; i < col; i++) {
			if(i % 2==0) {
				for(int j = 0 ; j < row ;j++) {
					System.out.println(arr[j][i]);
				}
			}else {
				for(int k = row-1; k >= 0 ;k--) {
					System.out.println(arr[k][i]);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ans = {
	            {1, 2, 3,4},
	            { 5, 6,7,8},
	            {9,10,11,12}
	        };
		printlikeawave(ans);
	}

}
