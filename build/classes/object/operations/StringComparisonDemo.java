package object.operations;

/**
 *
 * @author sscerbatiuc
 */
public class StringComparisonDemo {

    public static void main(String[] args) {
        String greet1 = "Hello";
        String greet2 = "Hello";
        System.out.println("greet1 == greet2 ->" + (greet1 == greet2));
        System.out.println("greet1 == 'Hello' ->" + (greet1 == "Hello"));

        String greetOOP1 = new String("Hello");
        String greetOOP2 = new String("Hello");
        System.out.println("greetOOP1 == greetOOP2 ->" + (greetOOP1 == greetOOP2));
        System.out.println("greetOOP1 == 'Hello' ->" + (greetOOP1 == "Hello"));

    }

}
