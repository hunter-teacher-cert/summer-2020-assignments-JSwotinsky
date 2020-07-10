// Modified to Complete PixLab for Hunter CS Program
// Jonathan Swotinsky

public class IntArrayWorker
{
	/** two dimensional matrix */
	private int[][] matrix = null;
  
	/** set the matrix to the passed one
    * @param theMatrix the one to use
    */
	public void setMatrix(int[][] theMatrix)
	{
		matrix = theMatrix;
	}
  
	/**
	* Method to return the total 
	* @return the total of the values in the array
	*/
	public int getTotal()
	{
		int total = 0;
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix[0].length; col++)
			{
				total = total + matrix[row][col];
			}
		}
    return total;
	}
  
	/**
	* Method to return the total using a nested for-each loop
	* @return the total of the values in the array
	*/
	public int getTotalNested()
	{
		int total = 0;
		for (int[] rowArray : matrix)
		{
			for (int item : rowArray)
			{
				total = total + item;
			}
		}
		return total;
	}
  
	/**
	* Method to fill with an increasing count
	*/
	public void fillCount()
	{
		int numCols = matrix[0].length;
		int count = 1;
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < numCols; col++)
			{
				matrix[row][col] = count;
				count++;
			}
		}
	}
  
	/**
	* print the values in the array in rows and columns
	*/
	public void print()
	{
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix[0].length; col++)
			{
				System.out.print( matrix[row][col] + " " );
			}
			System.out.println();
		}
		System.out.println();
	}

  
	/** 
	* fill the array with a pattern
	*/
	public void fillPattern1()
	{
		for (int row = 0; row < matrix.length; row++)
		{
			for (int col = 0; col < matrix[0].length; 
				col++)
			{
				if (row < col)
					matrix[row][col] = 1;
				else if (row == col)
					matrix[row][col] = 2;
				else
					matrix[row][col] = 3;
			}
		}	
	}	
 
 
	/**
	* Count the number of times n appears in the matrix.
	*/
	public int getCount(int n){
		int count = 0;
		for(int r = 0; r <= matrix.length - 1; r++){
			for(int c = 0; c <= matrix[r].length - 1; c++){
				if(matrix[r][c] == n){
					count++;
				}// end if	
			}// end for c
		}// end for r
		return count;
	}// end getCount
  

	/**
	* Return the largest number that appears in the matrix.
	*/
	public int getLargest(){
		int largest = 0;
		for(int r = 0; r <= matrix.length - 1; r++){
			for(int c = 0; c <= matrix[r].length - 1; c++){
				if(matrix[r][c] >= largest){
					largest = matrix[r][c];
				}// end if	
			}// end for c
		}// end for r
		return largest;
	}// end getLargest
  
    
	/**
	* Return the total of all integers in column n.
	*/
	public int getColTotal(int n){
		int total = 0;
		for(int r = 0; r <= matrix.length - 1; r++){
			total += matrix[r][n];
		}// end for r
		return total;
	}// end getColTotal
  
}