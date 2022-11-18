/*
 * 
 *  Art.java -> H2-5
 *  
 *  Draw some picture using stdlib.StdDraw.
 *  
 *  Note this is included in the imported stdlib.jar library.
 *  
 */


public class Art1
{

	public static void main(String[] args)
	{

		StdDraw.clear();  // What does this do?  Continue...
//		StdDraw.setPenRadius(0.05);
//        StdDraw.setPenColor(StdDraw.BLUE);
//        StdDraw.point(0.5, 0.5);
//        StdDraw.setPenColor(StdDraw.MAGENTA);
//        StdDraw.line(0.2, 0.2, 0.8, 0.2);
        StdDraw.circle(0.5, 0.5, 0.45);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledCircle(0.5, 0.4, 0.05);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledEllipse(0.3, 0.65, 0.03, 0.06);
        StdDraw.filledEllipse(0.7, 0.65, 0.03, 0.06);
        StdDraw.arc(0.5, 0.4, 0.2, 205, 335);
        StdDraw.arc(0.5, 0.315, 0.18, 180, 360);
	}

}
