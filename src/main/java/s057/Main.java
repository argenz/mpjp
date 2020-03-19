package s057;

public class Main {
    public static void main(String[] args) {
        Mammal[] mammals = new Mammal[2];    
        mammals[0] = new Dog(63, 40);        //si possono aggiungere dog e cat in mammals perchè sono subclassi. 
        mammals[1] = new Cat(63, 20);		 //quindi le interfacce servono a collegare classi che non sono gerarchicamente collegate. 	

        for (Mammal mammal : mammals) {
            System.out.println(mammal.toString());
        }
    }
}
