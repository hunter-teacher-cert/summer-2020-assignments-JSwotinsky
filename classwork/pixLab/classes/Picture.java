import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

// Modified to Complete PixLab for Hunter CS Program
// Jonathan Swotinsky

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */

public class Picture extends SimplePicture 
{
	///////////////////// constructors //////////////////////////////////
  
	/**
	* Constructor that takes no arguments 
	*/
	public Picture ()
	{
		/* not needed but use it to show students the implicit call to super()
		* child constructors always call a parent constructor 
		*/
		super();  
	}
  
  
	/**
	* Constructor that takes a file name and creates the picture 
	* @param fileName the name of the file to create the picture from
	*/
	public Picture(String fileName)
	{
		// let the parent class handle this fileName
		super(fileName);
	}
  
  
	/**
	* Constructor that takes the width and height
	* @param height the height of the desired picture
	* @param width the width of the desired picture
	*/
	public Picture(int height, int width)
	{
		// let the parent class handle this width and height
		super(width,height);
	}
  
  
	/**
	* Constructor that takes a picture and creates a 
	* copy of that picture
	* @param copyPicture the picture to copy
	*/
	public Picture(Picture copyPicture)
	{
		// let the parent class do the copy
		super(copyPicture);
	}
  
  
	/**
	* Constructor that takes a buffered image
	* @param image the buffered image to use
	*/
	public Picture(BufferedImage image)
	{
		super(image);
	}
  
  
	////////////////////// methods ///////////////////////////////////////
  
	/**
	* Method to return a string with information about this picture.
	* @return a string with information about the picture such as fileName,
	* height and width.
	*/
	public String toString()
	{
		String output = "Picture, filename " + getFileName() + 
		" height " + getHeight() 
		+ " width " + getWidth();
		return output;  
	}
  
  
	/** Method to set the blue to 0 */
	public void zeroBlue()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setBlue(0);
			}
		}
	}
  
  
	/** Method to set the red to 0 */
	public void zeroRed()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setRed(0);
			}
		}
	}
  
  
  	/** Method to set the green to 0 */
	public void zeroGreen()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setGreen(0);
			}
		}
	}
  
  
	/**	Method to set the red and green to 0 */
	public void keepOnlyBlue(){
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels){
			for (Pixel pixelObj : rowArray){
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}// end for pixelObj
		}// end for rowArray
	}// end keepOnlyBlue
	
	
	/**	Method to set the blue and green to 0 */
	public void keepOnlyRed(){
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels){
			for (Pixel pixelObj : rowArray){
				pixelObj.setBlue(0);
				pixelObj.setGreen(0);
			}// end for pixelObj
		}// end for rowArray
	}// end keepOnlyRed
	
	
	/**	Method to set the blue and red to 0 */
	public void keepOnlyGreen(){
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels){
			for (Pixel pixelObj : rowArray){
				pixelObj.setBlue(0);
				pixelObj.setRed(0);
			}// end for pixelObj
		}// end for rowArray
	}// end keepOnlyGreen
  
  
	/** Method to negate colors*/
	public void negate(){
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels){
			for (Pixel pixelObj : rowArray){
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setGreen(255 - pixelObj.getGreen());
				pixelObj.setBlue(255 - pixelObj.getBlue());
			}// end for PixelOBj
		}// end for rowArray
	}// end negate
  
  
	/**Method for grayscale */
	public void grayscale(){
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels){
			for (Pixel pixelObj : rowArray){
				int sum = pixelObj.getRed() + pixelObj.getRed() + pixelObj.getRed();
				sum = sum - sum%3;
				int average = sum / 3;
				pixelObj.setRed(average);
				pixelObj.setGreen(average);
				pixelObj.setBlue(average);
			}// end for pixelObj
		}// end for rowArray
	}// end for grayscale
  
  
	/**Method for adjustable grayscale */
	public void adjustableGrayscale(int n){
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels){
			for (Pixel pixelObj : rowArray){
				int sum = pixelObj.getRed() + pixelObj.getRed() + pixelObj.getRed();
				sum = sum - sum%3;
				int average = sum / 3;
				pixelObj.setRed(average + n);
				pixelObj.setGreen(average + n);
				pixelObj.setBlue(average + n);
			}// end for pixelObj
		}// end for rowArray
	}// end for adjustableGrayscale
   
  
	/**	Method to fix the underwater photo */
	public void fixUnderwater(){
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels){
			for (Pixel pixelObj : rowArray){
				if(pixelObj.getBlue() > pixelObj.getGreen()){
					pixelObj.setGreen(pixelObj.getGreen()-0);
					pixelObj.setBlue(pixelObj.getBlue()+100);			
				} else {
					pixelObj.setGreen(pixelObj.getGreen()+0);
					pixelObj.setBlue(pixelObj.getBlue()-100);
				}// end if else
			}// end for pixelObj
		}// end for rowAarray
	}// end fixUnderwater
    
  
	/** Method that mirrors the picture around a 
	* vertical mirror in the center of the picture
    * from left to right */
	public void mirrorVertical()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; col < width / 2; col++)
			{
			leftPixel = pixels[row][col];
			rightPixel = pixels[row][width - 1 - col];
			rightPixel.setColor(leftPixel.getColor());
			}
		} 
	}
  
  
	/**Vertical mirror method from right to left*/
	public void mirrorVerticalRightToLeft(){
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++){
			for (int col = 0; col < width / 2; col++){
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				leftPixel.setColor(rightPixel.getColor());
			}// end for col
		}// end for row 
	}// end mirrorVerticalRightToLeft
  
  
	/**	Horizontal mirror method (top to bottom)*/
	public void mirrorHorizontal(){
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int height = pixels.length;
		for (int row = 0; row < height / 2; row++){
			for (int col = 0; col < pixels[0].length; col++){
				topPixel = pixels[row][col];
				bottomPixel = pixels[height - 1 - row][col];
				bottomPixel.setColor(topPixel.getColor());
			}// end for col
		}// end for row
	}// end mirrorHorizontal
  
  
	/**	Horizontal mirror method (bottom to top)*/
	public void mirrorHorizontalBottomToTop(){
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int height = pixels.length;
		for (int row = 0; row < height / 2; row++){
			for (int col = 0; col < pixels[0].length; col++){
				topPixel = pixels[row][col];
				bottomPixel = pixels[height - 1 - row][col];
				topPixel.setColor(bottomPixel.getColor());
			}// end for col
		}// end for row 
	}// end mirrorHorizontalBottomToTop	
  
    
	/**	Diagonal mirror method*/
	public void mirrorDiagonal(){
		Pixel[][] pixels = this.getPixels2D();
		Pixel pixel = null;
		Pixel transposePixel = null;
		
		//Identify the minimum dimension (height or width) of the picture:
		int minDimension = Math.min(pixels.length, pixels[0].length);		
	
		//Cast the color of each pixel to its reflection across a diagonal:
		for (int r = 0; r < minDimension; r++){
			for (int c = 0; c <= r; c++){
				pixel = pixels[r][c];
				transposePixel = pixels[c][r];
				transposePixel.setColor(pixel.getColor());
			}// end for c	
		}// end for r
	}// end mirrorDiagonal
  
  
	/** Mirror just part of a picture of a temple */
	public void mirrorTemple()
	{
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();
    
		// loop through the rows
		for (int row = 27; row < 97; row++)
		{
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++)
			{
				leftPixel = pixels[row][col];      
				rightPixel = pixels[row]                       
                [mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	/** Mirror snowman arms method */
	public void mirrorArms(){
		int mirrorPoint = 193;
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		Pixel[][] pixels = this.getPixels2D();
    
		// mirror left arm
		for (int row = 159; row < mirrorPoint; row++){
			for (int col = 105; col <= 169; col++){
				topPixel = pixels[row][col];      
				bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
				bottomPixel.setColor(topPixel.getColor());
			}// end for col
		}// end for row
		
		// mirror right arm
		for (int row = 172; row < mirrorPoint; row++){
			for (int col = 238; col <= 293; col++){
				topPixel = pixels[row][col];      
				bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
				bottomPixel.setColor(topPixel.getColor());
			}// end for col
		}// end for row
				
	}// end mirrorArms
  
  
  /** Mirror seagull method */
	public void mirrorGull(){
		int mirrorPoint = 172;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		for (int row = 235; row <= 330; row++){
			for (int col = 0; col < mirrorPoint; col++){
				leftPixel = pixels[row][col];      
				rightPixel = pixels[row]                       
                [mirrorPoint - col + mirrorPoint];
				leftPixel.setColor(rightPixel.getColor());
			}// end for col
		}// end for row
	}// end mirrorGull
  
  
	/** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
	public void copy(Picture fromPic, 
                 int startRow, int startCol)
	{
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; 
			fromRow < fromPixels.length &&
			toRow < toPixels.length; 
			fromRow++, toRow++)
		{
			for (int fromCol = 0, toCol = startCol; 
				fromCol < fromPixels[0].length &&
				toCol < toPixels[0].length;  
				fromCol++, toCol++)
			{
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}   
	}


	public void copyPart(Picture fromPic, int startRow, int startCol, int endRow, int endCol){
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		
		for (int 	fromRow = startRow, toRow = startRow; 
					fromRow < endRow && toRow < endRow;	
					fromRow++, toRow++){
			
			for (int 	fromCol = startCol, toCol = startCol; 
						fromCol < endCol && toCol < endCol; 
						fromCol++, toCol++){
				
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}// end for fromCol toCol
		}// end for fromRow toRow   
	}// end copyPart
	
	
	
	public void copyPart2(Picture fromPic, int startRow, int startCol, int height, int width, int toR, int toC){
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		
		for (int 	fromRow = startRow, toRow = toR; 
					fromRow < startRow + height && toRow < toR + height;	
					fromRow++, toRow++){
			
			for (int 	fromCol = startCol, toCol = toC; 
						fromCol < startCol + width && toCol < toC + width; 
						fromCol++, toCol++){
				
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}// end for fromCol toCol
		}// end for fromRow toRow   
	}// end copyPart
	

	/** Method to create a collage of several pictures */
	public void createCollage()
	{
		Picture flower1 = new Picture("flower1.jpg");
		Picture flower2 = new Picture("flower2.jpg");
		this.copy(flower1,0,0);
		this.copy(flower2,100,0);
		this.copy(flower1,200,0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue,300,0);
		this.copy(flower1,400,0);
		this.copy(flower2,500,0);
		this.mirrorVertical();
		this.write("collage.jpg");
	}
  
  
	/** Method to create a new collage of several pictures */
	public void myCollage(String filename1, String filename2, String filename3){
		Picture p1 = new Picture(filename1);
		Picture p2 = new Picture(filename2);
		Picture p3 = new Picture(filename3);
		
		this.copyPart2(p1,0,0,100,100,0,0);
		this.copyPart2(p2,0,0,100,100,0,150);
		this.copyPart2(p3,0,0,100,100,150,0);
		
		
		this.mirrorVertical();
		this.mirrorHorizontal();
		this.write("myCollage.jpg");
	}// end myCollage
  
  
	/** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    * (left to right)
	*/
	public void edgeDetection(int edgeDist)
	{
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; 
				col < pixels[0].length-1; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col+1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > 
					edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
	}
	
	
	/** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    * (top to bottom)
	*/
	public void edgeDetectionTopBottom(int edgeDist){
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color bottomColor = null;
		for (int row = 0; row < pixels.length-1; row++){
			for (int col = 0; col < pixels[0].length; col++){
				topPixel = pixels[row][col];
				bottomPixel = pixels[row+1][col];
				bottomColor = bottomPixel.getColor();
				if (topPixel.colorDistance(bottomColor) > edgeDist){
					topPixel.setColor(Color.BLACK);
				} else {
					topPixel.setColor(Color.WHITE);
				}// end if else
			}// end for col
		}// end for row
	}// end edgeDetectionTopBottom
	
		
	/** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    * (new method)
	*/
	public void newEdgeDetection(int edgeDist){
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color bottomColor = null;
		Color rightColor = null;
		for (int row = 0; row < pixels.length-1; row++){
			for (int col = 0; col < pixels[0].length-1; col++){
				topPixel = pixels[row][col];
				bottomPixel = pixels[row+1][col];
				bottomColor = bottomPixel.getColor();
				if (topPixel.colorDistance(bottomColor) > edgeDist){
					topPixel.setColor(Color.BLACK);
				} else {
					leftPixel = pixels[row][col];
					rightPixel = pixels[row][col+1];
					rightColor = rightPixel.getColor();
					if (leftPixel.colorDistance(rightColor) > edgeDist){
						leftPixel.setColor(Color.BLACK);
					} else {
						leftPixel.setColor(Color.WHITE);
					}// end nested if else
				}// end if else
			}// end for col
		}// end for row
	}// end newEdgeDetection
	  
  
	/* Main method for testing - each class in Java can have a main 
	* method 
	*/
	public static void main(String[] args) 
	{
		Picture p = new Picture("beach.jpg");
		p.explore();
		//Picture smallP = p.scale(0.25,0.25);
		//smallP.write("smallcolorfulcoral.jpg"); 
	}
  
} // this is the end of class Picture, put all new methods before this
