/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object.operations.modifiers.def.prvate;

/**
 *
 * @author sscerbatiuc
 */
public class PrivateDemo {
    
    public static void main(String[] args){
        PersonWithDefaultAccess defaultPerson = new PersonWithDefaultAccess();
        defaultPerson.name = "John";
        defaultPerson.surname = "Prick";
        defaultPerson.presentYourself();
    }
}
