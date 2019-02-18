package root.initialization;

/**
 *
 * @author sscerbatiuc
 */
public class ClassWithInstanceInitializationBlocks {

    private int x;

    {
        System.out.println("Instance initialization block #1");
        x = 1;
    }

    {
        System.out.println("Instance initialization block #1");
        x = 2;
    }

    {
        System.out.println("Instance initialization block #1");
        x = 3;
    }
    
    public void printX(){
        System.out.println("X =" + this.x);
    }

}

class InstanceInitializationDemo {

    public static void main(String[] args) {
        ClassWithInstanceInitializationBlocks obj = new ClassWithInstanceInitializationBlocks();
        obj.printX();
    }
}
