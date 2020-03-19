package s061;

public class Main {
    public static void main(String[] args) {
//		Cat cat = (Cat) new Dog();

        Pet pet = new Dog("Bob");  //upcast

        // risky                  
        Dog dog = (Dog) pet;       //downcast - fine because pet was originally a Dog. 
        dog.bark();

        // next line leads to a ClassCastException
        Cat cat = (Cat) pet;       //downcast - NOT FINE because pet was originally a Dog.
        
        // next line is just not to have a warning for unused cat on the previous line
        System.out.println(System.identityHashCode(cat));

        if (pet instanceof Cat) {  //SAFE DOWNCASTING - do the casting only if cat was originally created as Cat
            Cat tom = (Cat) pet;
            tom.meow();
        } else {
            System.out.println("This pet is not a cat!");
        }
    }
}
