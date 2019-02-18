package root.initialization.overload.ambiguity;

import java.util.Scanner;

/**
 *
 * @author sscerbatiuc
 */
public class SumCalculator {

    public int add(double a, double b) {
        return 0;
    }
    
//    public double add(double a, double b) {
//        return 0D;
//    }
}

class SumCalculatorCorrectDemo {

    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        Scanner scanner = new Scanner(System.in);
        sumCalculator.add(5, 5);
        sumCalculator.add(5, 4);
    }
}
