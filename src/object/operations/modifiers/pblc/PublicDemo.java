package object.operations.modifiers.pblc;

import object.operations.modifiers.def.PublicPerson;
import object.operations.modifiers.def.prvate.PrivatePerson;

/**
 *
 * @author sscerbatiuc
 */
public class PublicDemo {
    
    public static void main(String[] args) {
        PublicPerson publicPerson = new PublicPerson();
        PrivatePerson privatePerson = new PrivatePerson();
//        PersonWithDefaultAccess pers = new PersonWithDefaultAccess();
//        privatePerson.presentYourself();
        publicPerson.name = "Jake";
        publicPerson.surname = "Peterson";
        publicPerson.presentYourself();
    }
    
}