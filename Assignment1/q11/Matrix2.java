package q11;

public class Matrix2 {

public static void main(String[] args) {
	final int[][] matrix = {
	         {1, },
	         {2,3}
	};
    // To find number of rows
  	      
    			for (int i = 0; i < matrix.length; i++) { 
   // To find number of columns in each row
  	       
  	    	  for (int j = 0; j < matrix[i].length; j++) {
  	            System.out.print(matrix[i][j] + " ");
  	         }
  	         //End line after each loop
  	         System.out.println(); 
}
    			}
}