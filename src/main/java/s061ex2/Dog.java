package s061ex2;

public class Dog extends Pet {
	final static int PRICE = 10;

	public Dog(int lengthStay) {
		super(lengthStay);	
	}
	
	@Override
	public int housingProfit(){
		return getDays()*PRICE;
		
	}

}