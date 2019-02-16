package object.operations.modifiers.def;

/**
 *
 * @author sscerbatiuc
 */
public class DefaultDemo {
    
    public static void main(String[] args) {
        PublicPerson person = new PublicPerson();
        person.name = "Jake";
        person.surname = "Peterson";
        person.presentYourself();
    }
}
