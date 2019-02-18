package root.initialization.overload.arguments.type;

/**
 * @author sscerbatiuc
 */
public class SumCalculator {

    public int add(int a, int b) {
        System.out.println("Adding 2 int numbers " + a + ", " + b);
        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("Adding 2 double numbers " + a + ", " + b);
        return a + b;
    }
}

class SumCalculatorDemo {

    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();
        calculator.add(5, 5);
        calculator.add(5.2, 4.5);
    }
}
