package root.initialization.overload.ambiguity;

/**
 *
 * @author sscerbatiuc
 */
public class Person {

    String name, surname;
    int age;

    public Person() {
        System.out.println("Default constructor");
    }

    public Person(String name, String surname) {
        System.out.println("Constructor with 2 params");
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, int age, String surname) {
        System.out.println("Constructor with 3 params");
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void show() {
        System.out.println(name + " " + surname + " " + age);
    }
}

class PersonDemo {
    public static void main(String[] args){
        Person person = new Person();
        person.name = "Jake";
        person.surname = "Peterson";
        person.age = 25;
        
        
        Person persWithNameSurnameAndAge = new Person("Peterson", 25, "Jake");
        
        
        persWithNameSurnameAndAge.show();
    }
}
