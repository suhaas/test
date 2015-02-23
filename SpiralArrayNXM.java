
public class SpiralArrayNXM {
	
	static int count = 0;
	static int arraySize = 0;
	
	// Method to print the top-right layer of the array and 
	// recursively call the print bottom-left on the subarray.
	static void printTopRight(int a[][], int x1, int y1, int x2, int y2) {
	    int i = 0, j = 0;

	    // Print values in the row.
	    if (count < arraySize ) {
	    for(i = x1; i<=x2; i++) {
	        System.out.print(  a[y1][i]);
	        count++;
	    }

	    // Print values in the column.
	    for(j = y1 + 1; j <= y2; j++)         {
	        System.out.print(  a[j][x2]);
	        count++;
	    }
	    }
	    // Check if more layers need to be printed.
	    if(x2-x1 > 0) {
	        // if yes recursively call the function to 
	        // print the bottom left of the sub array.
	        printBottomLeft(a, x1, y1 + 1, x2-1, y2);
	    }
	}

	// Method to print the bottom-left layer of the array and 
	// recursively call the print top-right on the subarray.
	static void printBottomLeft(int a[][], int x1, int y1, int x2, int y2) {
	    int i = 0, j = 0;
	    if (count < arraySize ) {
	    // print the values in the row in reverse order.
	    for(i = x2; i>=x1; i--) {
	        System.out.print(  a[y2][i]);
	        count++;
	    }

	    // print the values in the col in reverse order.
	    for(j = y2 - 1; j >= y1; j--) {
	        System.out.print(  a[j][x1]);
	        count++;
	    }
	    }
	    // Check if more layers need to be printed.
	    if(x2-x1 > 0) {
	        // if yes recursively call the function to 
	        // print the top right of the sub array.
	        printTopRight(a, x1+1, y1, x2, y2-1);
	    }
	}

	static void printSpiral(int arr[][]) {
		
		System.out.println("Array Height is " + arr.length + " Array width is " + arr[0].length);
		arraySize = arr[0].length * arr.length ; 
	    printTopRight(arr,0,0, arr[0].length -1, arr.length -1 );
	    System.out.print("\n");
	}
	
	  public static void main(String[] args) {
		  int[][]testArray1 = new int[4][4];
		    
		    testArray1[0][0] = 1;
		    testArray1[0][1] = 2;
		    testArray1[0][2] = 3;
		    testArray1[0][3] = 4;
		    
		    testArray1[1][0] = 5;
		    testArray1[1][1] = 6;
		    testArray1[1][2] = 7;
		    testArray1[1][3] = 8;
		    
		    testArray1[2][0] = 9;
		    testArray1[2][1] = 10;
		    testArray1[2][2] = 11;
		    testArray1[2][3] = 12;

//		    testArray1[3][0] = 13;
//		    testArray1[3][1] = 14;
//		    testArray1[3][2] = 15;
//		    testArray1[3][3] = 16;
		    
		    printSpiral(testArray1);
	  }

}
