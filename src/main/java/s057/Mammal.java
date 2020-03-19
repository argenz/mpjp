package s057;

public abstract class Mammal {
    protected int gestation;          //proprietà di istanza.

    //costruttore
    public Mammal(int gestation) {
    	
    	//passando il parametro del costruttore alla proprietà d'istanza della classe (linea 4).
    	
        this.gestation = gestation;   //this si referisce a "questa classe".
        						      
    }

    @Override
    public String toString() {
        return "Mammal [gestation=" + gestation + "]";
    }
    
    public static void main(String[] args) {
    	
    	
    
    //	Object o = new Mammal(12);  //se non fosse una classe astratta funzionerebbe.
    	//polimorfismo, si può fare perchè Object è una superclasse di mammal. 
    	//ex. utile se voglio usare il metodo .toString di object (originale).
    	
    	
    }
}
