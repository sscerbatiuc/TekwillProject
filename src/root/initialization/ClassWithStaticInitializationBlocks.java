package root.initialization;

/**
 *
 * @author sscerbatiuc
 */
public class ClassWithStaticInitializationBlocks {

    private static int x;

    static {
        System.out.println("Static initialization block #1");
        x = 1;
    }

    static {
        System.out.println("Static initialization block #1");
        x = 2;
    }

    static {
        System.out.println("Static initialization block #1");
        x = 3;
    }
    
    public void printX(){
        System.out.println("X =" + ClassWithStaticInitializationBlocks.x);
    }

}

class StaticInitializationDemo {

    public static void main(String[] args) {
        ClassWithStaticInitializationBlocks obj = new ClassWithStaticInitializationBlocks();
        obj.printX();
    }
}
