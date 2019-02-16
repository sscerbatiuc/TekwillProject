package person;

/**
 *
 * @author sscerbatiuc
 */
public class PersonDemo {

    public static void main(String[] args) {
        Person jake = new Person();
        Person peter = new Person();
        System.out.println(peter.counter);
        System.out.println("jake == peter?");
        System.out.println(jake == peter);
    }
}
