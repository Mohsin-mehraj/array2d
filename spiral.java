package array2d;

public class spiral {
	
	public static void spirall(int arr[][]) {
		int row = arr.length;
		int col = arr[0].length;
		
		int rowstart = 0;
		int rowend= row-1;
		
		int colstart = 0;
		int colend = col-1;
		
		int elements = row* col;
		
		
		
		while(elements >0) {
			for(int i = colstart ; i <= colend;i++) {
				System.out.print(arr[rowstart][i]+" ");
				elements--;
			}
			
			rowstart++;
			
			for(int i = rowstart ;i <= rowend;i++) {
				System.out.print(arr[i][colend]+" ");
				elements--;
			}
			colend--;
			
			for(int i = colend ; i >= colstart ;i--) {
				System.out.print(arr[rowend][i]+" ");
				elements--;
			}
			
			rowend--;
			
			for(int i = rowend ; i >= rowstart ;i--) {
				System.out.print(arr[i][colstart]+" ");
				elements--;
				
			}
			colstart++;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] sampleArray = {
	            {1,2,3,4},
	            {5,6,7,8},
	            {9,10,11,12},
	            {13,14,15,16}
	            
	        };
		spirall(sampleArray);
	}

}
