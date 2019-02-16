package person;

/**
 *
 * @author sscerbatiuc
 */
public class Countable {
    
    String objectName;
    static int counter = 0;
    
    // Count the amount of objects of type Countable 
    public Countable(){
        counter++;
        objectName = "Countable " + counter;
//        System.out.println(objectName);
    }
}
