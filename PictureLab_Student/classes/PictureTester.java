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
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture chella = new Picture("chella.jpg");
    chella.explore();
    chella.zeroBlue();
    chella.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture chella = new Picture("chella.jpg");
	  chella.explore();
	  chella.onlyBlue();
	  chella.explore();
  }
  
  public static void testNegate()
  {
	  Picture chella = new Picture("chella.jpg");
	  chella.explore();
	  chella.negate();
	  chella.explore();
  }
  
  public static void testGrayscale()
  {
	  Picture chella = new Picture("chella.jpg");
	  chella.explore();
	  chella.grayscale();
	  chella.explore();
  }
  
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRighttoLeft()
  {
    Picture chella = new Picture("chella.jpg");
    chella.explore();
    chella.mirrorVerticalRighttoLeft();
    chella.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture chella = new Picture("chella.jpg");
    chella.explore();
    chella.mirrorHorizontal();
    chella.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture chella = new Picture("chella.jpg");
    chella.explore();
    chella.mirrorHorizontalBotToTop();
    chella.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture chella = new Picture("chella.jpg");
    chella.explore();
    chella.mirrorDiagonal();
    chella.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	Picture gull = new Picture("seagull.jpg");
    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCopy()
  {
	  Picture pic = new Picture("chella.jpg");
	  Picture pic2 = new Picture("seagull.jpg");
	  pic.explore();
	  pic.copy(pic2, 200, 200, 400, 400);
	  pic.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
	swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
	//testMirrorVertical();
    //testMirrorVerticalRighttoLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}