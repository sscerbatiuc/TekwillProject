/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.initialization;

/**
 *
 * @author sscerbatiuc
 */
public class DefaultValues {

    int varInt;
    float varFloat;
    boolean varBool;
    long varLong;
    byte varByte;
    short varShort;
    double varDouble;
    char charValue;
    String stringValue;
    
    void useDefaultValues(){
        this.varInt += 2;
        System.out.println("New value for varInt:" + varInt);
    }
    
    void useLocalVariables(){
        int x;
//        System.out.println("2+x=" + (2+x)); // no default value
    }
}

class DefaultValuesDemo {

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        System.out.println("Default int value ::" + obj.varInt);
        System.out.println("Default float value ::" + obj.varFloat);
        System.out.println("Default boolean value ::" + obj.varBool);
        System.out.println("Default long value ::" + obj.varLong);
        System.out.println("Default byte value ::" + obj.varByte);
        System.out.println("Default short value ::" + obj.varShort);
        System.out.println("Default double value ::" + obj.varDouble);
        System.out.println("Default char value ::" + obj.charValue);
        System.out.println("Default String value ::" + obj.stringValue);
        obj.useDefaultValues();
        obj.useLocalVariables();
    }
}
