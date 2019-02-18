package root.initialization.overload.ambiguity;

/**
 * @author sscerbatiuc
 */
public class AmbiguousSumCalculator {

    public int add(int a, int b) {
        System.out.println("Adding 2 int numbers " + a + ", " + b);
        return a + b;
    }

//    public double add(int a, int b) {
//        System.out.println("Adding 3 int numbers " + a + ", " + b);
//        return a + b;
//    }
}

class SumCalculatorDemo {

    public static void main(String[] args) {
        AmbiguousSumCalculator calculator = new AmbiguousSumCalculator();
        System.out.println(calculator.add(5, 5));
        System.out.println(calculator.add(5, 4));
    }
}
