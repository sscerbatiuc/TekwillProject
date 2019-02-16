/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author sscerbatiuc
 */
public class StringDemo {
    
    public static void main(String[] args){
        String greet1 = "Hello";
        String greet2 = "Hello";
        String greet3 = new String("Hello");
        String greet4 = new String("Hello");
        System.out.println("greet1 == greet2?");
        System.out.println(greet1 == greet2);
        System.out.println("greet3 == greet4?");
        System.out.println(greet3 == greet4);
        System.out.println("greet3.equals(greet4)?");
        System.out.println(greet3.equals(greet4));
        
    }
    
}
