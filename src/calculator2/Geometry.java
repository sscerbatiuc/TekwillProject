package calculator2;

/**
 * This is a class that contains geometry operations.
 *
 * @author sscerbatiuc
 */
public class Geometry {

    public int calculateSquarePerimeter(int sideLength) {
        int perimeter = sideLength * 4;
        return perimeter;
    }

    public void calculateSquareSurface(int sideLength) {
        int surface = sideLength * sideLength;
        System.out.println("Surface: " + surface);
    }

    // rectangle surface
    // rectangle perimeter
//    System.out.println("Please enter square side length:");
//            int squareSide = keyboardScanner.nextInt();
//            // 2. Calculate perimeter
//            int perimeter = 4 * squareSide;
//            // 3. Calculate surface
//            int surface = squareSide * squareSide;
//            // 4. Display the result
//            System.out.println("Surface "+surface+ "; Perimeter:" + perimeter);
//
//            System.out.println("Please enter rectangle size:");
//            System.out.println("Length:");
//            int length = keyboardScanner.nextInt();
//            System.out.println("Width:");
//            int width = keyboardScanner.nextInt();
//            int rectPerimeter = (width + length)*2; 
//            int rectSurface = length * width;
//            System.out.println("Rectangle: Surface " + rectSurface + "; Perimeter:" + rectPerimeter);
}
