package object.operations;

import person.Person;

/**
 *
 * @author sscerbatiuc
 */
public class ComparingObjectsDemo {
    public static void main(String[] args) {
        Person person = new Person();
        System.gc();
        System.runFinalization();
        person = new Person();
        person = new Person();
    }
}
