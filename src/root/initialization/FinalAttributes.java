package root.initialization;

/**
 *
 * @author sscerbatiuc
 */
public class FinalAttributes {
    private final int finalAttr = 0;
    
    public void changeFinal(final int x){
//        finalAttr = 2;
        System.out.println("2+"+x+"="+(x+2));
//        x+=2;
    }
}
