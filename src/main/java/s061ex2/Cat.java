package s061ex2;

public class Cat extends Pet {
	final static int PRICE = 6;

	public Cat(int lengthStay) {
		super(lengthStay);	
	}
	
	@Override
	public int housingProfit(){
		return getDays()*PRICE;
		
	}

}

//ctor cat(length stay)