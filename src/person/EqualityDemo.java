package person;

/**
 *
 * @author sscerbatiuc
 */
public class EqualityDemo {

    public static void main(String[] args) {
        ComparableObject comp1 = new ComparableObject();
        comp1.id = 0;
        ComparableObject comp2 = new ComparableObject();
        comp2.id = 0;
        System.out.println("comp1 == comp2?");
        System.out.println(comp1 == comp2);
        System.out.println("comp1.equals(comp2)?");
        System.out.println(comp1.equals(comp2));
        System.out.println(comp1);
        System.out.println(comp2);
    }
}

class ComparableObject {

    int id;

    public boolean equals(ComparableObject obj) {
        if (obj.id == id) {
            return true;
        } else {
            return false;
        }
    }
}
