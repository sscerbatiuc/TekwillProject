package person;

/**
 *
 * @author sscerbatiuc
 */
public class Person {

    public String name;
    public String surname;
    public static int counter = 0;

    public Person() {
        counter++;
    }
}
