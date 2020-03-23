package s061ex2;

public abstract class Pet{
	private int lengthStay;
	
	public Pet(int lengthStay) {
		this.lengthStay = lengthStay;
	}
	
	public abstract int housingProfit();
	
	public int getDays() {
		return lengthStay;
	}
	
}

//Questa classe serve perchè definisce il parametro generale lenghtStay che value per tutti i pets. 
//Il metodo housingProfit vale per tutti i pets, però varia a seconda del pet. Perc'ò ha senso definire il metodo astratto qui e poi definirlo nelle subclassi.
//Ho bisogno del metodo getDays per ottenere la proprietà PRIVATA lengthDays nelle subclassi. 









//alternatively
//	public Pet(int lengthStay) {
//		this.lengthStay = lengthStay;
//	}
//	
//	public abstract int housing();
//	
//	public 