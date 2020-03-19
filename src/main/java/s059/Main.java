package s059;

public class Main {
	public static void main(String[] args) {
		Poodle poodle = new Poodle("Jim");
		Poodle p2 = new Poodle();

		System.out.println(poodle);  //il metodo println se ha come parametro l'oggetto stampa direattamente il toString dell'oggetto. 
		System.out.println(p2);
	}
}
