package arrays;

/**
 *
 * @author sscerbatiuc
 */
public class DontDoThisDemo {

    public int[] intArray;
    public int[][] chessBoard;
    public int[][][] computerScreen;

    public DontDoThisDemo() {
    }

    public DontDoThisDemo(int[] intArray) {
        this.intArray = intArray;
    }

    public DontDoThisDemo(int[] intArray, int[][] chessBoard, int[][][] computerScreen) {
        this.intArray = intArray;
        this.chessBoard = chessBoard;
        this.computerScreen = computerScreen;
    }
    


    
    
    
    public void show() {
        for (int index = 0; index < computerScreen.length; index++) {
            for(int index2 = 0; index2< computerScreen[index].length; index2++){
                for(int index3 = 0; index3<computerScreen[index][index2].length; index3++){
                    System.out.print(computerScreen[index][index2][index3] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public void cloneArr() {
        intArray.clone();
    }
}

class ChessFigure{
    
}

class MainClass {

    public static void main(String[] args) {
        DontDoThisDemo obj = new DontDoThisDemo();

        obj.show();

    }
}
