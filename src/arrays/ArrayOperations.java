package arrays;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author sscerbatiuc
 */
public class ArrayOperations {

    private int[] tenRadomNumbers;

    // Instance initialization block
    {
        tenRadomNumbers = new int[10];
        Random rand = new Random();
        for (int index=0; index<10; index++){
            tenRadomNumbers[index] = rand.nextInt(1566);
        }
    }

    public int[] getTenRadomNumbers() {
        return tenRadomNumbers;
    }

}

class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] randNumbers = arrayOperations.getTenRadomNumbers();
        String arrayAsString = Arrays.toString(randNumbers);
        System.out.println(arrayAsString);
    }
}
