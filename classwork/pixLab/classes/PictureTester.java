// Modified to Complete PixLab for Hunter CS Program
// Jonathan Swotinsky

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */

public class PictureTester
{
	/**	Method to explore a picture */
	public static void explorePicture(String filename){
		Picture p = new Picture(filename);
		p.explore();
	}// end explorePicture
    
  
	/** Method to test zeroBlue */
	public static void testZeroBlue(String filename){
		Picture p = new Picture(filename);
		p.zeroBlue();
		p.explore();
	}// end testZeroBlue
	
		
	/** Method to test zeroRed */
	public static void testZeroRed(String filename){
		Picture p = new Picture(filename);
		p.zeroRed();
		p.explore();
	}// end testZeroRed
	
	
	/** Method to test zeroGreen */
	public static void testZeroGreen(String filename){
		Picture p = new Picture(filename);
		p.zeroGreen();
		p.explore();
	}// end testZeroGreen
	
  
	/** Method to test keepOnlyBlue */
	public static void testKeepOnlyBlue(String filename){
		Picture p = new Picture(filename);
		p.keepOnlyBlue();
		p.explore();
	}// end testKeepOnlyBlue
  
	
	/** Method to test keepOnlyRed */
	public static void testKeepOnlyRed(String filename){
		Picture p = new Picture(filename);
		p.keepOnlyRed();
		p.explore();
	}// end testKeepOnlyRed
	
	
	/** Method to test keepOnlyGreen */
	public static void testKeepOnlyGreen(String filename){
		Picture p = new Picture(filename);
		p.keepOnlyGreen();
		p.explore();
	}// end testKeepOnlyGreen
   
  
	/** Method to test negate */
	public static void testNegate(String filename){
		Picture p = new Picture(filename);
		p.negate();
		p.explore();
	}// end testNegate
  
  
	/** Method to test grayscale */
	public static void testGrayscale(String filename){
		Picture p = new Picture(filename);
		p.grayscale();
		p.explore();
	}// end testGrayscale
  
  
	/** Method to test adjustableGrayscale */
	public static void testAdjustableGrayscale(String filename, int n){
		Picture p = new Picture(filename);
		p.adjustableGrayscale(n);
		p.explore();
	}// end testAdjustableGrayScale


	/** Method to test fixUnderwater */
	public static void testFixUnderwater(){
		Picture water = new Picture("water.jpg");
		water.explore();
		water.fixUnderwater();
		water.explore();
	}// end testFixUnderwater
  
  
	/** Method to test mirrorVertical */
	public static void testMirrorVertical(String filename){
		Picture p = new Picture(filename);
		p.mirrorVertical();
		p.explore();
	}// end testMirrorVertical
  
  
	/** Method to test mirrorVertical (right to left) */
	public static void testMirrorVerticalRightToLeft(String filename){
		Picture p = new Picture(filename);
		p.mirrorVerticalRightToLeft();
		p.explore();
	}// end testMirrorVerticalRightToLeft
  
  
	/** Method to test mirrorHorizontal*/
	public static void testMirrorHorizontal(String filename){
		Picture p = new Picture(filename);
		p.mirrorHorizontal();
		p.explore();
	}// end testMirrorHorizontal
  
  
	/** Method to test mirrorHorizontal (bottom to top)*/
	public static void testMirrorHorizontalBottomToTop(String filename){
		Picture p = new Picture(filename);
		p.mirrorHorizontalBottomToTop();
		p.explore();
	}// end testMirrorHorizontalBottomToTop
  
  
	/** Method to test mirrorDiagonal */
	public static void testMirrorDiagonal(String filename){
		Picture p = new Picture(filename);
		p.mirrorDiagonal();
		p.explore();
	}// end testMirrorDiagonal
    
  
	/** Method to test mirrorTemple */
	public static void testMirrorTemple(){
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}// end testMirrorTemple
	
	
	/** Method to test mirrorArms */
	public static void testMirrorArms(){
		Picture snowman = new Picture("snowman.jpg");
		snowman.explore();
		snowman.mirrorArms();
		snowman.explore();
	}// end testMirrorArms
  
  
  /** Method to test mirrorGull */
	public static void testMirrorGull(){
		Picture seagull = new Picture("seagull.jpg");
		seagull.explore();
		seagull.mirrorGull();
		seagull.explore();
	}// end testMirrorGull
  
  
	/** Method to test the copy method */
	public static void testCopy(String filename, int row, int column){
		Picture canvas = new Picture("7inX95in.jpg");
		Picture p = new Picture(filename);
		canvas.copy(p,row,column);
		canvas.explore();
	}// end testCopy
	
	
	/** Method to test the copyPart method */
	public static void testCopyPart(String filename, int row, int column, int endRow, int endCol){
		Picture canvas = new Picture("7inX95in.jpg");
		Picture p = new Picture(filename);
		canvas.copyPart(p,row,column, endRow, endCol);
		canvas.explore();
	}// end testCopyPart
	
	
	/** Method to test the copyPart2 method */
	public static void testCopyPart2(String filename, int row, int column, int height, int width, int toR, int toC){
		Picture canvas = new Picture("7inX95in.jpg");
		Picture p = new Picture(filename);
		canvas.copyPart2(p,row,column, height, width,toR,toC);
		canvas.explore();
	}// end testCopyPart2
	
	
	/** Method to test the collage method */
	public static void testCollage(){
		Picture canvas = new Picture("7inX95in.jpg");
		canvas.createCollage();
		canvas.explore();
	}// end testCollage
  
  
  /** Method to test the myCollage method */
	public static void testMyCollage(){
		Picture canvas = new Picture("640x480.jpg");
		canvas.myCollage("smallcolorfulcoral.jpg","smallcolorfulcoral.jpg","smallcolorfulcoral.jpg");
		canvas.explore();
	}// end testMyCollage
  
  
	/** Method to test edgeDetection */
	public static void testEdgeDetection(String filename){
		Picture p = new Picture(filename);
		p.edgeDetection(10);
		p.explore();
	}// end testEdgeDetection
  
  
	/** Adjustable method to test edgeDetection */
	public static void adjustableTestEdgeDetection(String filename, int n){
		Picture p = new Picture(filename);
		p.edgeDetection(n);
		p.explore();
	}// end adjustableTestEdgeDetection
	
	
	/** Method to test edgeDetectionTopBottom */
	public static void testEdgeDetectionTopBottom(String filename){
		Picture p = new Picture(filename);
		p.edgeDetectionTopBottom(10);
		p.explore();
	}// end testEdgeDetectionTopBottom
  
  
	/** Adjustable method to test edgeDetectionTopBottom */
	public static void adjustableTestEdgeDetectionTopBottom(String filename, int n){
		Picture p = new Picture(filename);
		p.edgeDetectionTopBottom(n);
		p.explore();
	}// end adjustableTestEdgeDetectionTopBottom


	/** Method to test newEdgeDetection */
	public static void testNewEdgeDetection(String filename){
		Picture p = new Picture(filename);
		p.newEdgeDetection(10);
		p.explore();
	}// end testNewEdgeDetection
  
  
	/** Adjustable method to test newEdgeDetection */
	public static void adjustableTestNewEdgeDetection(String filename, int n){
		Picture p = new Picture(filename);
		p.newEdgeDetection(n);
		p.explore();
	}// end adjustableTestNewEdge


	/** Main method for testing.  Every class can have a main
	* method in Java */
	public static void main(String[] args){
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		
		String filename = "colorfulcoral.jpg";	
		
		//explorePicture(filename);
		//testZeroBlue(filename);
		//testZeroRed(filename);
		//testZeroGreen(filename);
		//testKeepOnlyBlue(filename);
		//testKeepOnlyRed(filename);
		//testKeepOnlyGreen(filename);
		//explorePicture(filename);
		//testNegate(filename);
		//testGrayscale(filename);
		//testAdjustableGrayscale(filename,100);
		//explorePicture(filename);
		//testGrayscale(filename);
		//testAdjustableGrayscale(filename,100);
		//testFixUnderwater();
		//testMirrorVertical(filename);
		//testMirrorVerticalRightToLeft(filename);
		//testMirrorHorizontal(filename);
		//testMirrorHorizontalBottomToTop(filename);
		//testMirrorDiagonal(filename);
		//testMirrorTemple();
		//testMirrorArms();
		//testMirrorGull();
		//testCollage();
		//testCopy(filename,0,0);
		//testCopyPart(filename,0,0,40,40);
		//testCopyPart2(filename,0,0,300,300,50,50);
		testMyCollage();
		//int edgeSensitivity = 20;
		//explorePicture(filename);
		//testEdgeDetection(filename);
		//adjustableTestEdgeDetection(filename,edgeSensitivity);
		//testEdgeDetectionTopBottom(filename);
		//adjustableTestEdgeDetectionTopBottom(filename,edgeSensitivity);
		//testNewEdgeDetection(filename);
		//adjustableTestNewEdgeDetection(filename,edgeSensitivity);
		//testChromakey();
		//testEncodeAndDecode();
		//testGetCountRedOverValue(250);
		//testSetRedToHalfValueInTopHalf();
		//testClearBlueOverValue(200);
		//testGetAverageForColumn(0);
		
	}// end main
	
}// end PictureTester