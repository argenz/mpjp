package s061ex2;

public class Main {

	public static void main(String[] args) {
		
		Pet[] pets = new Pet[6];
		pets[0] = new Cat(1);
		pets[1] = new Cat(2);
		pets[2] = new Cat(3);
		pets[3] = new Dog(1);
		pets[4] = new Dog(2);
		pets[5] = new Dog(3);
		
		int profit = 0;
		
		
		
	//PRIMA
//		for (Pet pet : pets) {				
//			if (pet instanceof Cat) {
//				Cat cat = (Cat) pet;
//				profit += cat.housingProfit(cat.PRICE, cat.lengthStay);
//			}else {
//				Dog dog = (Dog) pet;
//				profit += dog.housingProfit(dog.PRICE, dog.lengthStay);
//			}	
//		}
		
		//DOPO
		
		for( Pet pet : pets) {
			profit += pet.housingProfit();
		}
		
	System.out.println("The total profit for the 3 days is " + profit + " euros");
		
	}
}



//Pet - abstract int housing()
//  |  \
// Dog Cat

// ctor(int)

// cane x 1 giorno -> 10
// gatto           -> 6

// Pet[] = new Dog, Cat, ...

// bob = new Dog(3);
// tom = new Cat(1);
// bob.housing() -> 30

// for each -> calcolare housing complessivo = 36



		