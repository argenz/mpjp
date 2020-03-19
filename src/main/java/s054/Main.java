package s054;

public class Main {
    public static void main(String[] args) {
        Barker[] barkers = new Barker[2];
        
        barkers[0] = new Fox();  //classe degli oggetti creati deve implemetare l'interfaccia del type di array.
        barkers[1] = new Dog();

        for(Barker barker: barkers) {
            System.out.println(barker.bark());  // solo accesso al metodo bark() perchè è l'unico metodo implementato nell'interfaccia barker. 
        }
        //madre di tutte le classi si chiama Object. 
        
        BarkAndWag baw = new Dog();
        System.out.println(baw.tailWaggingSpeed());

        Dog dog = new Dog();
        System.out.println(dog.bark(3));
        
    }
    void interact(Barker dog){ 		//usando un input del tipo Barker:
    		dog.bark();				//1. Si possono mettere due tipi di input: Dog e Fox, perchè Barker è implementato dalle classi Dog e Fox.  
    								//2. Si limitano i metodi usati dentro a interact (definiti nell'interface Barker), ovvero solo il metodo bark. 
    }
    
}
