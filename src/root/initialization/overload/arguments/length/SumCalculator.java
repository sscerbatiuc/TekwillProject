package root.initialization.overload.arguments.length;

/**
 * @author sscerbatiuc
 */
public class SumCalculator {

    public int add(int a, int b) {
        System.out.println("Adding 2 int numbers " + a + ", " + b);
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.println("Adding 3 int numbers " + a + ", " + b +", " + c);
        return a + b + c;
    }
}

class SumCalculatorDemo {

    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();
        System.out.println(calculator.add(5, 5));
        System.out.println(calculator.add(5, 4, 5));
    }
}
