package calculator2;

import java.util.Scanner;

/**
 *
 * @author sscerbatiuc
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner keyboardScanner = new Scanner(System.in);
            Geometry geometry = new Geometry();
            System.out.println("Please enter square side:");
            int squareSide = keyboardScanner.nextInt();
            geometry.calculateSquareSurface(squareSide);
            int perimeter = geometry.calculateSquarePerimeter(squareSide);
            System.out.println("Perimeter " + perimeter);
            
            System.out.println("Please enter number to check:");
            int number = keyboardScanner.nextInt();
            Algebra algebra = new Algebra();
            algebra.detectOddOrEven(number);
            
            
            System.out.println("How many Fibonacci numbers to print");
            int count = keyboardScanner.nextInt();
            FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
            fibonacciGenerator.generateFibonacciList(count);
            
    }
    
}
